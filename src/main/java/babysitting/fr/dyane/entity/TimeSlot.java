package babysitting.fr.dyane.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TimeSlot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String time;

	private User user;

	private Availabality availabality;
	
	public TimeSlot() {
		super();
	}
	
	public TimeSlot(Integer id, String time, User user, Availabality availabality){
		super();
		this.id = id;
		this.time = time;
		this.user = user;
		this.availabality = availabality;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the availabality
	 */
	public Availabality getAvailabality() {
		return availabality;
	}

	/**
	 * @param availabality the availabality to set
	 */
	public void setAvailabality(Availabality availabality) {
		this.availabality = availabality;
	}

}
