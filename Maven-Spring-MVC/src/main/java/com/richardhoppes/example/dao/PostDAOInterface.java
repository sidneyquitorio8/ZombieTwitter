package com.richardhoppes.example.dao;

import java.util.List;
import com.richardhoppes.example.model.Post;

/**
 * Created with IntelliJ IDEA.
 * User: squitorio
 * Date: 3/12/13
 * Time: 5:38 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PostDAOInterface {

    public List getAllPost();
    public Post getPostByID(Integer id);
    public void insertPost(Post post);

}
