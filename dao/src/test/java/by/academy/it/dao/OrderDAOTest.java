package by.academy.it.dao;

import by.academy.it.pojos.Order;
import by.academy.it.pojos.User;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Asus on 16.01.2017.
 */
public class OrderDAOTest extends TestCase {
    private OrderDAO ordDao= new OrderDAO();
    Order ord=new Order("test","MP2569888",123656666,"econom",889632,889636,"cash",1);
    int id = ord.getId();
    @Test
    public void testRead() throws Exception {
        assertNotNull(ordDao.read(7));
        return;
    }

    @BeforeClass
    public void testCreate() throws Exception {
        Order ord=new Order("test","MP2569888",123656666,"econom",889632,889636,"cash",1);
        ordDao.create(ord);
//        Assert.assertNotNull(id);
        Assert.assertEquals("test", ord.getFio());
        Assert.assertEquals("MP2569888", ord.getPassport());
        Assert.assertEquals(123656666, ord.getPhone());
        Assert.assertEquals("econom", ord.getCategory());
        Assert.assertEquals("cash", ord.getPayment());
        Assert.assertEquals(889632, ord.getArrive());
        Assert.assertEquals(889636, ord.getLeave());
        Assert.assertEquals(1, ord.getFK_status());
        return;
    }
    @Test
    public void testUpdate() throws Exception {
        Order ord2=new Order("newtest","MP2569888",123656666,"econom",889632,889636,"cash",1);
        assertNotNull(ordDao.update(ord2));
        return;
    }

    @AfterClass
    public void testDelete() throws Exception {
        assertNotNull(ordDao.delete(ord));
        return;
    }
}