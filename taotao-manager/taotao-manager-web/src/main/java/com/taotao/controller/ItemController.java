package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

/**
 * 
 * @author Administrator
 *
 */

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	private TbItem getItemByid(@PathVariable Long itemId) {
		
		TbItem item = null;
		item = itemService.getItemById(itemId);
		
		return item;
	}
}
