package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/")
    @ApiOperation(value = "Finds all the topics", response = Topic.class)
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Finds a particular topics", response = Topic.class)
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping("/")
    @ApiOperation(value = "Adds a topic", response = Topic.class)
    public void addTopic(@Valid @RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @PutMapping(value = "/{id}")
    @ApiOperation(value = "Updates a topic", response = Topic.class)
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deletes a topic", response = Topic.class)
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

}
