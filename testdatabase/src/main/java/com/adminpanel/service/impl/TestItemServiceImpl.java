package com.adminpanel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminpanel.domain.TestItem;
import com.adminpanel.repository.TestItemRepostory;
import com.adminpanel.service.TestItemService;

@Service
public class TestItemServiceImpl implements TestItemService {

	@Autowired
	private TestItemRepostory testItemRepostory;

	@Override
	public TestItem findByItemName(String itemName) {
		return testItemRepostory.findByItemName(itemName);
	}

	@Override
	public TestItem save(TestItem testItem) {
		return testItemRepostory.save(testItem);
	}

	@Override
	public List<TestItem> findAll() {
		return (List<TestItem>) testItemRepostory.findAll();
	}

}
