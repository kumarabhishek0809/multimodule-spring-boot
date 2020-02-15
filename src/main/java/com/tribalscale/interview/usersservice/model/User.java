package com.tribalscale.interview.usersservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String firstName = "";
    private String lastName = "";

    private String getFullName(){
        return firstName+lastName;
    }

    @Override
    public String toString(){
        return getFullName();
    }

}
