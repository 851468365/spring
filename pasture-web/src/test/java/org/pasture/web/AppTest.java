package org.pasture.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nxyhj.pasture.student.service.interfaces.IStudentSV;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-mvc.xml","classpath:config/applicationContext.xml","classpath:config/spring-mybatis.xml"})
public class AppTest{
	@Autowired
	private IStudentSV iStudentSV;
	
	@Test
    public void test(){
        //分页参数
        Page page = PageHelper.startPage(1, 3);
        //查询参数
        HashMap hashMap = new HashMap();
        hashMap.put("sno", "001");
        //查询结果
        List<Map> selectStudentScore = iStudentSV.selectStudentScore(hashMap);
        //遍历结果集
        for (Map map : selectStudentScore) {
            System.out.println(map);
        }
    }
}
