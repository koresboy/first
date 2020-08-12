package com.wang.test;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class HomeDao2 {

	@Autowired

	private SqlSessionTemplate sqlSession;

	public List<HomeDto2> sel(){
		return sqlSession.selectList("sql.sel2");
	}

}