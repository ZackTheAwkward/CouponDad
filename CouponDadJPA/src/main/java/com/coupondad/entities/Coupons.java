package com.coupondad.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Coupons {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private String title;
	
	private String descriptiojn;
	
	@Column(name = "create_date")
	private LocalDateTime createDate;
	
	@Column(name="update_date")
	private LocalDateTime updateDate;
	
	@Column(name="expiration_date")
	private LocalDateTime expirationDate;
	
	private int rating;
	
	@ManyToOne
	@JoinColumn(name="userr_id")
	private User user;

	public Coupons() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescriptiojn() {
		return descriptiojn;
	}

	public void setDescriptiojn(String descriptiojn) {
		this.descriptiojn = descriptiojn;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Coupons [Id=" + Id + ", title=" + title + ", descriptiojn=" + descriptiojn + ", createDate="
				+ createDate + ", updateDate=" + updateDate + ", expirationDate=" + expirationDate + ", rating="
				+ rating + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coupons other = (Coupons) obj;
		return Id == other.Id;
	}
	
}
