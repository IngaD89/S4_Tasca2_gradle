package cat.itacademy.s04.t01.n02.S04T01N02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @GetMapping("/helloWorld")
    public String greeting(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name){
        return "Hola " + name + ", estas ejecutando proyecto gradle!";
    }

    @GetMapping({"/helloWorld2", "/helloWorld2/{name:.*}"})
    public String greeting2(@PathVariable(value = "name", required = false) String name){
        if(name == null || name.isEmpty()){
            name = "UNKNOWN";
        }
        return "Hola, "  + name + ". Estàs executant un projecte Maven";
    }
}
