package com.cases;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cases.entity.Site;
import com.cases.mapper.SiteMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: young
 * @Description: mybatis-plus测试类
 * @Date: 2019/8/20
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class MybatisQueryTest {

    @Autowired
    private SiteMapper siteMapper;

    @Test
    public void testQuery1() {
        QueryWrapper query = new QueryWrapper();
        query.eq("id", 1);
        Site site = siteMapper.selectOne(query);
        System.out.println(site.getName());
    }

    /**
     * 根据主键查询
     */
    @Test
    public void testQuery2() {
        QueryWrapper query = new QueryWrapper();
        Site site = siteMapper.selectById(1);
        System.out.println(site.getName());
    }

    /**
     * 查询单个实体
     */
    @Test
    public void testQuery3() {
        Site site = siteMapper.selectOne(new QueryWrapper<Site>().select("id", "name").eq("id", 1));
        System.out.println(site.toString());
    }

    /**
     * 根据ids返回集合
     */
    @Test
    public void testQuery4() {
        List<Integer> ids = Arrays.asList(1,2,3);
        List<Site> siteList = siteMapper.selectBatchIds(ids);
        for (Site site : siteList) {
            System.out.println(site.toString());
        }
    }

    /**
     * 查询符合条件总条数
     */
    @Test
    public void testQuery5() {
        Integer count = siteMapper.selectCount(new QueryWrapper<Site>().eq("status", 0));
        System.out.printf("查询总条数： %d%n", count);
    }

    /**
     * 查询列表
     */
    @Test
    public void testQuery6() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.select("id","name").eq("status",1);
        wrapper.like("name","站");
        List<Site> siteList = siteMapper.selectList(wrapper);
        for (Site site : siteList) {
            System.out.println(site.toString());
        }
    }

    /**
     * 分页查询
     */
    @Test
    public void testQuery7() {
        Page page = new Page(1,3);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("status",1);
        IPage<Site> sitePage = siteMapper.selectPage(page, wrapper);
        System.out.println("总页数： " + sitePage.getPages());
        System.out.println("总条数 ： " + sitePage.getTotal());
        for (Site site : sitePage.getRecords()) {
            System.out.println(site.toString());
        }
    }

    /**
     *condition： 根据boolean值确定此条sql语句是否加入最后查询语句
     */
    @Test
    public void testCondition1() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("status",1);
        String name = "站";
        wrapper.like(StrUtil.isNotEmpty(name),"name", name);
        List<Site>siteList = siteMapper.selectList(wrapper);
        for (Site site : siteList) {
            System.out.println(site.toString());
        }
    }

    /**
     * 测试区间段和非空条件构造
     */
    @Test
    public void testQuery8() {
        QueryWrapper<Site> wrapper = new QueryWrapper<Site>();
        wrapper.like("name","站");
        wrapper.between("status",1,2);
        wrapper.isNotNull("domain");
        List siteList = siteMapper.selectList(wrapper);
        for (Object o : siteList) {
            System.out.println(o.toString());
        }
    }

    /**
     * or条件构造
     */
    @Test
    public void testQuery9() {
        QueryWrapper<Site> wrapper = new QueryWrapper<>();
        wrapper.select("id","name","status").nested(s -> s.eq("status",1).or().eq("status",0));
        String name = "站";
        wrapper.like(StrUtil.isNotEmpty(name),"name", name);
        List<Site> siteList = siteMapper.selectList(wrapper);
        for (Site site : siteList) {
            System.out.println(site.toString());
        }
    }


    /**
     *更新方法
     */
    @Test
    public void testUpdate1() {

    }


}
