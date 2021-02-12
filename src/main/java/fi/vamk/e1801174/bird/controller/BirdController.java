package fi.vamk.e1801174.bird.controller;

import java.io.FileReader;
import java.util.Iterator;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.domain.Sort;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fi.vamk.e1801174.bird.entity.Bird;
import fi.vamk.e1801174.bird.repository.BirdRepository;

@RestController
public class BirdController {
    @Autowired
    private BirdRepository repository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/birds")
    public Iterable<Bird> getAll(){
        return repository.findAllBirds(Sort.by(("finnish")));   
    }



    /** Import file bird.json content to database */
    @GetMapping("/importBirds")
    public String importBirds() {
        JSONParser parser = new JSONParser();
        try {
            Object jsonBirdData = parser.parse(new FileReader("bird.json"));
            JSONArray birdsArray = (JSONArray) jsonBirdData;
            @SuppressWarnings("unchecked")
            Iterator<JSONObject> iterator = birdsArray.iterator();
            while (iterator.hasNext()) {
                Object obj2 = (JSONObject) iterator.next();
                // System.out.println(obj2.toString());
                ObjectMapper objectMapper = new ObjectMapper();
                Bird bird = objectMapper.readValue(obj2.toString(), Bird.class);
                repository.save(bird);
            }
            return "Import successful";
        } catch (Exception e) {
            return "Import failed " + e.toString();
        }
    }
}
