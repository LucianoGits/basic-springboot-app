package com.lndev.minibackendapp.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


//@RestController  // uncomment to work
public class HelloWorld {

    private final String helloResponseString = String.
            join("\n", "<h1>Hello World</h1>","<div style = 'color: red; text-align: center;'> Designed by LN04 </div>");
    @GetMapping("/helloworld")
    HelloResponse helloWorld(){
        return new HelloResponse(helloResponseString);
    }

    @GetMapping("/jsonresponse")
    JsonResponse jsonResponse(){
        Person user = new Person("Luciano", 20);
        List<String> favProgrammingLanguages = List.of("Java","JavaScript");

        return new JsonResponse(user,favProgrammingLanguages);
    }


    //when using classes with a request mapping method, it returns a json as a response
    record HelloResponse(String string){};
    record JsonResponse (Person person, List<String> favoriteProgrammingLanguages){}

    @Getter
    @Setter
    class Person{

        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

}
