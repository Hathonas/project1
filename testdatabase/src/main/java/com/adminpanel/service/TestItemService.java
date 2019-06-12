package com.adminpanel.service;

import java.util.List;

import com.adminpanel.domain.TestItem;

public interface TestItemService {
	TestItem findByItemName(String itemName);

	TestItem save(TestItem testItem);

	List<TestItem> findAll();
}
