package com.richardhoppes.example.controller;

import com.richardhoppes.example.dao.PostDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.html.ListView;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: squitorio
 * Date: 3/13/13
 * Time: 2:57 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping(value="/post")
public class PostController {

    @Autowired
    private PostDAO postDAO;

    @RequestMapping(value="/")
    public @ResponseBody
    List getAllPost() {
        return postDAO.getAllPost();
    }


}
