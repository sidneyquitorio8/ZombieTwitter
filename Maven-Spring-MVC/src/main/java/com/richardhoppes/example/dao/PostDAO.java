package com.richardhoppes.example.dao;

import com.richardhoppes.example.model.Post;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: squitorio
 * Date: 3/12/13
 * Time: 5:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class PostDAO extends SqlMapClientDaoSupport implements PostDAOInterface {

    @Override
    public List getAllPost() {
        SqlMapClientTemplate template = getSqlMapClientTemplate();
        return (List)template.queryForList("Post.getAllPost");

    }

    @Override
    public Post getPostByID(Integer id) {
        SqlMapClientTemplate template = getSqlMapClientTemplate();
        return (Post)template.queryForList("Post.getPostByID", id);
    }

    @Override
    public void insertPost(Post post) {
        SqlMapClientTemplate template = getSqlMapClientTemplate();
        template.insert("Post.insertPost", post);
    }


}
