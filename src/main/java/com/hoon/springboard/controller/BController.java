package com.hoon.springboard.controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hoon.springboard.command.BCommand;
import com.hoon.springboard.command.BContentCommand;
import com.hoon.springboard.command.BDeleteCommand;
import com.hoon.springboard.command.BListCommand;
import com.hoon.springboard.command.BModifyCommand;
import com.hoon.springboard.command.BReplyCommand;
import com.hoon.springboard.command.BReplyViewCommand;
import com.hoon.springboard.command.BWriteCommand;

@Controller
public class BController {
	
	BCommand command;
	
	@RequestMapping(value = "/write_form")
	public String write_form() {
		
		return "write_form";
	}
	
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BWriteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		command = new BListCommand();
		command.execute(model);//model�� list(ArrayList<BDto> dtos)�� ž��
		
		return "list";
	}
	
	@RequestMapping(value = "/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BContentCommand();
		command.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping(value = "/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BDeleteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/modify")
	public String modify(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BModifyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
		
	@RequestMapping(value = "/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BReplyViewCommand();
		command.execute(model);
		
		return "reply_view";
	}
	
	@RequestMapping(value = "/reply")
	public String reply(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BReplyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
}