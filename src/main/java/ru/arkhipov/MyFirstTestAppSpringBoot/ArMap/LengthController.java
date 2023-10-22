package ru.arkhipov.MyFirstTestAppSpringBoot.ArMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class LengthController {
    private ArrayList<String> stringArrayList;
    private HashMap<Integer, String> stringHashMap;

    @Autowired
    public LengthController(ArrayController arrayController, MapController mapController) {
        this.stringArrayList = arrayController.showArrayList();
        this.stringHashMap = mapController.showHashMap();
    }

    @GetMapping("/show-all-length")
    public String showAllLength() {
        int arrayListLength = stringArrayList.size();
        int hashMapLength = stringHashMap.size();

        return "Length of ArrayList: " + arrayListLength + ", Length of HashMap: " + hashMapLength;
    }
}
