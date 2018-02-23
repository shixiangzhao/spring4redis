package com.shixzh.spring.spring4redis;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.shixzh.spring.spring4redis.bean.MyTestBean;

@SuppressWarnings("deprecation")
public class BeanFactoryTestForDebug {

    public static void main(String[] args) {
        testSimpleLoad();
    }

    public static void testSimpleLoad() {
        Resource resource = new ClassPathResource("beanFactoryTest.xml");
        BeanFactory bf = new XmlBeanFactory(resource);
        MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
        System.out.println(bean.getTestStr());
    }
}
