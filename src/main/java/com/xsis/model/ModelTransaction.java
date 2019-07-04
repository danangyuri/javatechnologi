package com.xsis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mastertransaction")
public class ModelTransaction {
	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nofaktur",nullable=false)
	private Long nofaktur;
	
	@Column(name="tglpenjualan")
	private String tglpenjualan;
	
	@Column(name="namakasir", length = 30)
	private String namakasir;
	
	@Column(name="total")
	private Long total;
	
	@Column(name="returncash")
	private Long returncash;

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
	 * @return the tglpenjualan
	 */
	public String getTglpenjualan() {
		return tglpenjualan;
	}

	/**
	 * @param tglpenjualan the tglpenjualan to set
	 */
	public void setTglpenjualan(String tglpenjualan) {
		this.tglpenjualan = tglpenjualan;
	}

	/**
	 * @return the namakasir
	 */
	public String getNamakasir() {
		return namakasir;
	}

	/**
	 * @param namakasir the namakasir to set
	 */
	public void setNamakasir(String namakasir) {
		this.namakasir = namakasir;
	}

	/**
	 * @return the total
	 */
	public Long getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Long total) {
		this.total = total;
	}

	/**
	 * @return the returncash
	 */
	public Long getReturncash() {
		return returncash;
	}

	/**
	 * @param returncash the returncash to set
	 */
	public void setReturncash(Long returncash) {
		this.returncash = returncash;
	}

}
