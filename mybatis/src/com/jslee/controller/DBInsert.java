package com.jslee.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslee.mybatis.Insert;
import com.jslee.userinfo.Info;

public class DBInsert implements Interface {

	static DBInsert dbi = new DBInsert();

	public static DBInsert instance() {
		return dbi;
	}

	@Override
	public String shData(HttpServletRequest rq, HttpServletResponse rs) throws Exception {
		rs.setCharacterEncoding("UTF-8");
		Insert insert = new Insert();
		Info info = new Info();
		info.setId(rq.getParameter("id"));
		info.setPasswd(rq.getParameter("passwd"));
		info.setName(rq.getParameter("name"));
		info.setYear(new Integer(rq.getParameter("year")));
		info.setSnum(rq.getParameter("snum"));
		info.setDepart(rq.getParameter("depart"));
		info.setMobile1(rq.getParameter("mobile1"));
		info.setMobile2(rq.getParameter("mobile2"));
		info.setAddress(rq.getParameter("address"));
		info.setEmail(rq.getParameter("email"));
		insert.dbInsert(info);
		// TODO Auto-generated method stub
		return null;
	}

}
