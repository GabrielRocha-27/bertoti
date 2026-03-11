package com.thehecklers.sburrestdemo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class SburRestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SburRestDemoApplication.class, args);
    }

}


// link front: http://localhost:8080/index.html (inclui no bd e edita por ele)
// link banco Supabase: https://supabase.com/dashboard/project/zpnjqauzwaletryniwzu/editor/17497?schema=public
// link postman: https://gabrielhenrique-1738035.postman.co/workspace/769de87d-958b-4699-8451-17b97a975015/request/create?requestId=bb47cc2a-3b09-4b3c-8729-d96c87aea8e1