package com.example.todoapp2;

public class User{
    private String id, name, email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = this.id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}

