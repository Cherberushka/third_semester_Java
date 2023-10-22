package ru.arkhipov.MyFirstTestAppSpringBoot.ArMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MapController {

    protected HashMap<Integer, String> stringHashMap = new HashMap<>();

    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam(value = "s") String s) {
        if (stringHashMap.isEmpty()) {
            stringHashMap.put(1, s);
        } else {
            stringHashMap.put(stringHashMap.size() + 1, s);
        }

        return "Value updated: " + s;
    }

    @GetMapping("/show-map")
    public HashMap<Integer, String> showHashMap() {
        return stringHashMap;
    }
}
