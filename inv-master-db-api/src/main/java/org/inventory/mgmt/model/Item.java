package org.inventory.mgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "inv_item")
public class Item extends AuditLog {

	@Id
	@Column(name = "item_id")
	@GeneratedValue(generator = "ITEM_NBR")
	@SequenceGenerator(
			name = "ITEM_NBR",
			sequenceName = "ITEM_NBR",
			initialValue = 1
			)
	private Long id;
	
	@Column(name = "item_name", nullable = false)
	private String itemName;
	
	@Column(name = "price", nullable = false)
	private double price;
	
	public Item(Long id, String itemName, double price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}	
}
