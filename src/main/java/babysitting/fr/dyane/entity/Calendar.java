package babysitting.fr.dyane.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Calendar")
public class Calendar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Date date;
	
	@OneToOne
	@JoinColumn(name = "availabalityId")
	private Availabality availabality;
	
	@OneToOne
	@JoinColumn(name = "timeSlotId")
	private TimeSlot timeSlot;
	
	@ManyToOne
	private User user;
	
	
	public Calendar() {
		super();
	}
	
	public Calendar(Long id, Date date, Availabality availabality, TimeSlot timeSlot, User user) {
		super();
		this.id = id;
		this.date = date;
		this.availabality = availabality;
		this.timeSlot = timeSlot;
		this.user = user;
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
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
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

	/**
	 * @return the timeSlot
	 */
	public TimeSlot getTimeSlot() {
		return timeSlot;
	}

	/**
	 * @param timeSlot the timeSlot to set
	 */
	public void setTimeSlot(TimeSlot timeSlot) {
		this.timeSlot = timeSlot;
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
	
	

}
