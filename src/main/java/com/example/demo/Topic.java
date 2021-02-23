package com.example.demo;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModelProperty;
import org.apache.logging.log4j.message.Message;
import org.hibernate.annotations.NotFound;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.PrimitiveIterator;

@Entity
public class Topic {

    @Id
    @ApiModelProperty(notes = "This is the ID for the topic")
    private String id;
    @ApiModelProperty(notes = "This is the name of the topic")
    @NotBlank(message="Name cannot be null")
    @Pattern(regexp = "([a-zA-Z_ ]*)")
    private String name;
    @ApiModelProperty(notes = "This is the description of the topic")
    private String description;

    public Topic() {
    }
    public Topic(String id , String name , String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}
