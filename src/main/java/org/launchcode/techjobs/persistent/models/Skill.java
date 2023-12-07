package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.ArrayList;

@Entity
public class    Skill extends AbstractEntity {

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "Description cannot be blank")
    @Size(max = 1000, message = "Description cannot be longer than 1000 characters")
    private String description;

    //public Skill(String description) {
       // this.description = description;
    //}

    public Skill() {
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
