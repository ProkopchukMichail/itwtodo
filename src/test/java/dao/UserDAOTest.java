package dao;

import model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;

/**
 * Created by comp on 14.09.2017.
 */
@ContextConfiguration("classpath:app.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDAOTest {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void getAll(){
        Assert.assertEquals(userDAO.getAll(), Collections.<User>emptyList());
    }
}
