package fr.studi.live.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloWorldService {

    public  static List<String> helloWorldList = new ArrayList<>();

    public void createPost(String nom){
        helloWorldList.add(nom);
    }

    public List<String> getHelloWorldList(){
        return helloWorldList;
    }
}
