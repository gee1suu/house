package com.mystudy.house.model.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.house.model.dao.ProductDAO;
import com.mystudy.house.model.vo.CartviewVO;
import com.mystudy.house.model.vo.ProductVO;

public class MyquestionsCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//페이지 전환 - 응답할 페이지(questions.jsp)
		
		return "/WEB-INF/mypage/questions.jsp";
	}

}









