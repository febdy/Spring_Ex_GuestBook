package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.dao.GuestBookDao;
import com.javaex.vo.GuestVo;

@Controller
public class GuestbookController {

	@Autowired
	private GuestBookDao guestbookDao;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<GuestVo> gList = guestbookDao.getList();
		model.addAttribute("gList", gList);
		
		return "/list";
	}
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute GuestVo guestVo) {
		guestbookDao.insert(guestVo);
		return "redirect:/list";
	}
	
	@RequestMapping("/delete")
	public String delete() {
		
		return "/deleteform";
	}
}
