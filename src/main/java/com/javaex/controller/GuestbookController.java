package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.dao.GuestBookDao;
import com.javaex.vo.GuestVo;

@Controller
public class GuestbookController {

	@Autowired
	private GuestBookDao guestbookDao;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<GuestVo> gList = guestbookDao.getList();
		model.addAttribute("gList", gList); // Controller -> Dispatcher :: Model 사용
		
		return "/list";
	}
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute GuestVo guestVo) { // Dispatcher -> Controller :: 객체로 받아올때는 ModelAttribute.
		guestbookDao.insert(guestVo);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/deleteform")
	public String deleteform(@RequestParam int no, Model model) { // Dispatcher -> Controller :: url의 parameter 가져올 때는 RequestParam.
		model.addAttribute("no", no);
		
		return "/deleteform";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int no, @RequestParam String password) {
		guestbookDao.delete(no, password);
		
		return "redirect:/list";
	}
	
}
