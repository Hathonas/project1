package com.adminpanel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adminpanel.domain.TestItem;
import com.adminpanel.service.TestItemService;

@Controller
public class TestItemController {
	@Autowired
	private TestItemService testItemService;

	@RequestMapping("/itemList")
	public String testItemList(Model model) {
		List<TestItem> itemList = testItemService.findAll();
		model.addAttribute("itemList", itemList);
		return "itemList";
	}

}
