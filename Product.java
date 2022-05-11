package OneToMany;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

@Entity
@Table(name ="Product")
public class Product {
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<Price> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<Price> priceList) {
		this.priceList = priceList;
	}

	@Id
	@Column(name ="PRODID")
	private int productId;
	
	@Column(name ="DESCRIP")
	private String productDescription;
	
	@ManyToOne
	@JoinColumn(name ="PRODID")
	private Item item;
	
	@OneToMany(mappedBy ="Product", fetch =FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Price> priceList;
	
	
	
}
