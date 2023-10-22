package ru.arkhipov.MyFirstTestAppSpringBoot.ArMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ArrayController {

    protected ArrayList<String> stringArrayList = new ArrayList<>();

    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam(value = "s") String s) {

        stringArrayList.add(s);
        return "Value updated: " + s;

    }


    @GetMapping("/show-array")
    public ArrayList<String> showArrayList() {

        return stringArrayList;

    }

}
