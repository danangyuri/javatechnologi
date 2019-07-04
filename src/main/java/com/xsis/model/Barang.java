package com.xsis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="barang")
public class Barang {

	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="namabarang",nullable=false, length = 50)
	private String namabarang;
	
	@Column(name="jenisbarang", length = 30)
	private String jenisbarang;
	
	@Column(name="kotapembuat", length = 30)
	private String kotapembuat;
	
	@Column(name="jmlbarang")
	private int jmlbarang;
	
	@Column(name="hargabarang")
	private int hargabarang;

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
	 * @return the namabarang
	 */
	public String getNamabarang() {
		return namabarang;
	}

	/**
	 * @param namabarang the namabarang to set
	 */
	public void setNamabarang(String namabarang) {
		this.namabarang = namabarang;
	}

	/**
	 * @return the jenisbarang
	 */
	public String getJenisbarang() {
		return jenisbarang;
	}

	/**
	 * @param jenisbarang the jenisbarang to set
	 */
	public void setJenisbarang(String jenisbarang) {
		this.jenisbarang = jenisbarang;
	}

	/**
	 * @return the kotapembuat
	 */
	public String getKotapembuat() {
		return kotapembuat;
	}

	/**
	 * @param kotapembuat the kotapembuat to set
	 */
	public void setKotapembuat(String kotapembuat) {
		this.kotapembuat = kotapembuat;
	}

	/**
	 * @return the jmlbarang
	 */
	public int getJmlbarang() {
		return jmlbarang;
	}

	/**
	 * @param jmlbarang the jmlbarang to set
	 */
	public void setJmlbarang(int jmlbarang) {
		this.jmlbarang = jmlbarang;
	}

	/**
	 * @return the hargabarang
	 */
	public int getHargabarang() {
		return hargabarang;
	}

	/**
	 * @param hargabarang the hargabarang to set
	 */
	public void setHargabarang(int hargabarang) {
		this.hargabarang = hargabarang;
	}

	
}
