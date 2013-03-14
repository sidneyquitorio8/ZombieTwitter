package com.richardhoppes.example.model;

/**
 * Created with IntelliJ IDEA.
 * User: squitorio
 * Date: 3/12/13
 * Time: 5:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Post {

    private Integer id;
    private String username;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent() {
        this.content = content;
    }

    public String toString() {
        return "" + username + " said: " + content;
    }



}
