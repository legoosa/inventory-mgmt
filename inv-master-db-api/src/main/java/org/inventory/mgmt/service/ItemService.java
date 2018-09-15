package org.inventory.mgmt.service;

import org.inventory.mgmt.dao.ItemDao;
import org.inventory.mgmt.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired
	private ItemDao itemDao;
	
	public Item add(Item item) {
		return itemDao.save(item);
	}
}
