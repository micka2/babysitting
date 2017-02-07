package babysitting.fr.dyane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TimeSlot")
public class TimeSlot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "timeSlotId")
	private Long id;

	@Column(name = "time", nullable = false)
	private String time;

	
	public TimeSlot() {
		super();
	}
	
	public TimeSlot(Long id, String time){
		super();
		this.id = id;
		this.time = time;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
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

	
}
