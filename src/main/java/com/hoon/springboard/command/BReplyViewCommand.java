package com.hoon.springboard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.hoon.springboard.dao.BDao;
import com.hoon.springboard.dto.BDto;

public class BReplyViewCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bid = request.getParameter("bid");
		
		BDao dao = new BDao();
		BDto dto = dao.replyView(bid);
		
		model.addAttribute("dto", dto);
		
	}

}
