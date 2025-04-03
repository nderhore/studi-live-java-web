package fr.studi.live.ws;

import fr.studi.live.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public List<String> helloWorld() {
        return helloWorldService.getHelloWorldList();
    }

    @GetMapping("{name}")
    public String hello(@PathVariable String name){
        return "Hello " + name;
    }

    @PostMapping("{name}")
    public void createPost(@PathVariable String name){
        helloWorldService.createPost(name);
    }


}
