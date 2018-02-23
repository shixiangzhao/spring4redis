package com.shixzh.spring.spring4redis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.shixzh.spring.spring4redis.bean.MyTestBean;

@SuppressWarnings("deprecation")
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
        assertEquals("testStr", bean.getTestStr());
    }

    @Test
    public void testApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
        MyTestBean bean = (MyTestBean) context.getBean("myTestBean");
        assertEquals("testStr", bean.getTestStr());
    }
}
