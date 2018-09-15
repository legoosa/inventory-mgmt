package org.inventory.mgmt.api;

import org.inventory.mgmt.model.Item;
import org.inventory.mgmt.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/item/")
public class ItemApi {
	
	@Autowired
	private ItemService itemService;
	
	@PostMapping(value = "/add")
	public Item add(@RequestBody Item item) {
		return itemService.add(item);
	}

}
