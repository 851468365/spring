package org.pasture.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.nxyhj.pasture.student.service.interfaces.IStudentSV;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-mvc.xml","classpath:config/applicationContext.xml","classpath:config/spring-mybatis.xml"})
public class AppTest{
	@Autowired
	private IStudentSV iStudentSV;
	
	@Test
    public void test(){
		HashMap hashMap = new HashMap();
		hashMap.put("sno", "001");
		List<Map> selectStudentScore = 	iStudentSV.selectStudentScore(hashMap);
		PageHelper.startPage(1, 2);
		System.out.println("selectStudentScore:"+selectStudentScore);
    }
}
