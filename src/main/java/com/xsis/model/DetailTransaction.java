package com.xsis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detailtransaction")

public class DetailTransaction {
	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nofaktur",nullable=false)
	private Long nofaktur;
	
	@Column(name="idbarang")
	private Long idbarang;
	
	@Column(name="jml")
	private Long jml;

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
	 * @return the nofaktur
	 */
	public Long getNofaktur() {
		return nofaktur;
	}

	/**
	 * @param nofaktur the nofaktur to set
	 */
	public void setNofaktur(Long nofaktur) {
		this.nofaktur = nofaktur;
	}

	/**
	 * @return the idbarang
	 */
	public Long getIdbarang() {
		return idbarang;
	}

	/**
	 * @param idbarang the idbarang to set
	 */
	public void setIdbarang(Long idbarang) {
		this.idbarang = idbarang;
	}

	/**
	 * @return the jml
	 */
	public Long getJml() {
		return jml;
	}

	/**
	 * @param jml the jml to set
	 */
	public void setJml(Long jml) {
		this.jml = jml;
	}
	
	}
