package com.registration.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Countries {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "player_Sequence")
    @SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
	private int id;
	
	@Column(name="countryKey")
	private String countryKey;
	
	@Column(name="countryValue")
	private String countryValue;

	public Countries() {
		
	}
	
	public Countries(String countryKey, String countryValue) {
		super();
		this.countryKey = countryKey;
		this.countryValue = countryValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryKey() {
		return countryKey;
	}

	public void setCountryKey(String countryKey) {
		this.countryKey = countryKey;
	}

	public String getCountryValue() {
		return countryValue;
	}

	public void setCountryValue(String countryValue) {
		this.countryValue = countryValue;
	}

	@Override
	public String toString() {
		return String.format("Countries [id=%s, countryKey=%s, countryValue=%s]", id, countryKey, countryValue);
	}
	
}
