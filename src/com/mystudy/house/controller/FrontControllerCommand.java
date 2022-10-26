package com.mystudy.house.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.house.model.command.Command;
import com.mystudy.house.model.command.CommunityCommand;
import com.mystudy.house.model.command.GoIdFindCommand;
import com.mystudy.house.model.command.GoInfoConfirmCommand;
import com.mystudy.house.model.command.GoInfoEditCommand;
import com.mystudy.house.model.command.GoKnowhowEditCommand;
import com.mystudy.house.model.command.GoKnowhowWriteCommand;
import com.mystudy.house.model.command.GoLoginCommand;
import com.mystudy.house.model.command.GoPartnerRegisterCommand;
import com.mystudy.house.model.command.GoPictureWriteCommand;
import com.mystudy.house.model.command.GoPwChangeCommand;
import com.mystudy.house.model.command.GoPwResetCommand;
import com.mystudy.house.model.command.GoSignupCommand;
import com.mystudy.house.model.command.GoWithdrawCommand;
import com.mystudy.house.model.command.IdFindCommand;
import com.mystudy.house.model.command.InfoConfirmCommand;
import com.mystudy.house.model.command.InfoEditCommand;
import com.mystudy.house.model.command.KnowhowCommand;
import com.mystudy.house.model.command.KnowhowComment2DeleteCommand;
import com.mystudy.house.model.command.KnowhowComment2WriteCommand;
import com.mystudy.house.model.command.KnowhowCommentDeleteCommand;
import com.mystudy.house.model.command.KnowhowCommentWriteCommand;
import com.mystudy.house.model.command.KnowhowDeleteCommand;
import com.mystudy.house.model.command.KnowhowDetailCommand;
import com.mystudy.house.model.command.KnowhowEditCommand;
import com.mystudy.house.model.command.KnowhowLikeCommand;
import com.mystudy.house.model.command.KnowhowScrapCommand;
import com.mystudy.house.model.command.KnowhowSearchCommand;
import com.mystudy.house.model.command.KnowhowWriteCommand;
import com.mystudy.house.model.command.LoginCommand;
import com.mystudy.house.model.command.LogoutCommand;
import com.mystudy.house.model.command.PartnerRegisterCommand;
import com.mystudy.house.model.command.PictureCommand;
import com.mystudy.house.model.command.PictureDetailCommand;
import com.mystudy.house.model.command.PictureWriteCommand;
import com.mystudy.house.model.command.PrivacyPolicyCommand;
import com.mystudy.house.model.command.ProfileImgChangeCommand;
import com.mystudy.house.model.command.PwChangeCommand;
import com.mystudy.house.model.command.SignupCommand;
import com.mystudy.house.model.command.UsePolicyCommand;
import com.mystudy.house.model.command.WithdrawCommand;

@WebServlet("*.do")
public class FrontControllerCommand extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		Command command = null;
		
		// Member
		if(com.equals("/community.do")) {
			command = new CommunityCommand();
		} else if(com.equals("/login.do")) {
			command = new LoginCommand();
		} else if(com.equals("/goLogin.do")) {	
			command = new GoLoginCommand();
		} else if(com.equals("/logout.do")) {	
			command = new LogoutCommand();		
		} else if(com.equals("/idFind.do")) {	
			command = new IdFindCommand();
		} else if(com.equals("/goIdFind.do")) {	
			command = new GoIdFindCommand();
		} else if(com.equals("/infoConfirm.do")) {	
			command = new InfoConfirmCommand();
		} else if(com.equals("/goInfoConfirm.do")) {	
			command = new GoInfoConfirmCommand();
		} else if(com.equals("/goPwReset.do")) {	
			command = new GoPwResetCommand();
		} else if(com.equals("/signup.do")) {	
			command = new SignupCommand();
		} else if(com.equals("/usePolicy.do")) {	
			command = new UsePolicyCommand();			
		} else if(com.equals("/privacyPolicy.do")) {	
			command = new PrivacyPolicyCommand();			
		} else if(com.equals("/goSignup.do")) {	
			command = new GoSignupCommand();
		} else if(com.equals("/partnerRegister.do")) {
			command = new PartnerRegisterCommand();
		} else if(com.equals("/goPartnerRegister.do")) {
			command = new GoPartnerRegisterCommand();
		// Mypage 
		} else if(com.equals("/infoEdit.do")) {
			command = new InfoEditCommand();
		} else if(com.equals("/goInfoEdit.do")) {
			command = new GoInfoEditCommand();
		} else if(com.equals("/pwChange.do")) {
			command = new PwChangeCommand();
		} else if(com.equals("/goPwChange.do")) {
			command = new GoPwChangeCommand();
		} else if(com.equals("/withdraw.do")) {
			command = new WithdrawCommand();
		} else if(com.equals("/goWithdraw.do")) {
			command = new GoWithdrawCommand();
		} else if(com.equals("/profileImgChange.do")) {	
			command = new ProfileImgChangeCommand();
		// Knowhow
		} else if(com.equals("/knowhow.do")) {
			command = new KnowhowCommand();
		} else if(com.equals("/knowhowWrite.do")) {
			command = new KnowhowWriteCommand();
		} else if(com.equals("/goKnowhowWrite.do")) {
			command = new GoKnowhowWriteCommand();
		} else if(com.equals("/knowhowDetail.do")) {
			command = new KnowhowDetailCommand();
		} else if(com.equals("/knowhowLike.do")) {
			command = new KnowhowLikeCommand();
		} else if(com.equals("/knowhowScrap.do")) {
			command = new KnowhowScrapCommand();
		} else if(com.equals("/knowhowDelete.do")) {
			command = new KnowhowDeleteCommand();
		} else if(com.equals("/knowhowEdit.do")) {
			command = new KnowhowEditCommand();
		} else if(com.equals("/goKnowhowEdit.do")) {
			command = new GoKnowhowEditCommand();	
		} else if(com.equals("/knowhowCommentWrite.do")) {
			command = new KnowhowCommentWriteCommand();
		} else if(com.equals("/knowhowComment2Write.do")) {
			command = new KnowhowComment2WriteCommand();			
		} else if(com.equals("/knowhowCommentDelete.do")) {
			command = new KnowhowCommentDeleteCommand();	
		} else if(com.equals("/knowhowComment2Delete.do")) {
			command = new KnowhowComment2DeleteCommand();	
		} else if(com.equals("/knowhowSearch.do")) {
			command = new KnowhowSearchCommand();	
		// Picture
		} else if(com.equals("/picture.do")) {
			command = new PictureCommand();
		} else if(com.equals("/pictureWrite.do")) {
			command = new PictureWriteCommand();
		} else if(com.equals("/goPictureWrite.do")) {
			command = new GoPictureWriteCommand();
		} else if(com.equals("/pictureDetail.do")) {
			command = new PictureDetailCommand();
		}
		String path = command.exec(request, response);
		try {
			request.getRequestDispatcher(path).forward(request, response);
		} catch(Exception e) {
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
