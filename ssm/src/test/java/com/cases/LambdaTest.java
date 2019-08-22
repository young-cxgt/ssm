package com.cases;

import com.cases.mapper.SiteMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Author: young
 * @Description: lambda测试类
 * @Date: 2019/8/20
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class LambdaTest {

    @Autowired
    private SiteMapper siteMapper;

    /**
     * lambda表达式的本质就是 对接口的实现
     * 1.接口中的抽象方法：无参数 无返回值
     */
    @Test
    public void testLambda1(){
        int num = 10;
        Runnable runnable = () -> System.out.println("hello world" + num);
        runnable.run();
    }

    /**
     * lambda表达式的本质就是 对接口的实现
     * 1.接口中的抽象方法：1个参数 无返回值 只有一个参数的情况下 参数小括号()可以省略不写
     */
    @Test
    public void testLambda2(){
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Lambda忒儿好嘞！");
    }

    /**
     * lambda表达式的本质就是 对接口的实现
     * 1.接口中的抽象方法：两个参数  并且有返回值： 需要用大括号括起来， 而且要写return
     */
    @Test
    public void testLambda3(){
       Comparator<Integer> comparator = (x, y) ->{
           System.out.println("函数式接口");
           return Integer.compare(y,x); //降序
       };
       Integer[] nums = {1,5,3,7,2};
       Arrays.sort(nums,comparator);
       System.out.println(Arrays.toString(nums));
    }

    /**
     * lambda表达式的本质就是 对接口的实现
     * 1.接口中的抽象方法：两个参数  有返回值但是只有一条语句， {} 和 return 都可以省略(必须同时使用或者省略)
     */
    @Test
    public void testLambda4(){
        Comparator<Integer> comparator = (x, y) ->Integer.compare(x,y); //降序
        Integer[] nums = {1,5,3,7,2};
        Arrays.sort(nums,comparator);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void testLambda5() {


    }


}
