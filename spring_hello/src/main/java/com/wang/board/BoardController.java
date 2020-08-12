package com.wang.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String test2(Model model) {
		return "/board/board";
	}
}
