package com.adminpanel.repository;

import org.springframework.data.repository.CrudRepository;

import com.adminpanel.domain.TestItem;

public interface TestItemRepostory extends CrudRepository<TestItem, Long> {
	TestItem findByItemName(String itemName);
}
