package repository;

import config.RootConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.ProjectService;

import java.lang.reflect.Method;
import java.util.Date;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class ProjectRepositoryTest {

    @Autowired
    private ProjectService projectService;


    @Test
    public void test() {
        projectService
                .listProjects()
                .forEach(e->System.out.println(e));
    }

    @Test
    public void test1(){

       // Class c = Class.forName("java.util.Date");
       // Class c =java.util.Date.class;
        Class<? extends Date>c =new Date().getClass();
        Method[] methods= c.getDeclaredMethods();
        for (Method method : methods)
            System.out.println(method);

        Class<Integer> c1=int.class;//直接.class
        Class<? extends Object> c11=int.class;
        Class<? extends Number> c12=new Integer(1).getClass();
        Class<double[]> c2 =double[].class;//用对象调方法
        System.out.println(Date.class ==new Date().getClass());




    }

}