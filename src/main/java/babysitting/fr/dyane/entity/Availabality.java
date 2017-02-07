package babysitting.fr.dyane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Availabality")
public class Availabality {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "availabalityId")
	private Long id;
	
	@Column(name = "category", nullable = false)
	private int category;
	
	@Column(name = "color", nullable = false)
	private String color;
	
	
	public Availabality() {
		super();
	}
	
	public Availabality(Long id, int category, String color){
		super();
		this.id = id;
		this.category = category;
		this.color = color;			
	}
	

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the category
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(int category) {
		this.category = category;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	

}
