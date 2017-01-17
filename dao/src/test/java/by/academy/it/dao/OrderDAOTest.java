package by.academy.it.dao;

import by.academy.it.pojos.Order;
import junit.framework.TestCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Asus on 16.01.2017.
 */
public class OrderDAOTest extends TestCase {
    private OrderDAO ordDao;

    @Test
    public void testRead() throws Exception {

    }

    @BeforeClass
    public void testCreate() throws Exception {
        Order ord=new Order("test","MP2569888",123656666,"econom",889632,889636,"cash",1);

    }
    @Test
    public void testUpdate() throws Exception {

    }

    public void testDelete() throws Exception {

    }
}