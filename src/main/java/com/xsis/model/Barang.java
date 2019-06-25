package com.xsis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.id;
import javax.persistence.Table;

@Entity
@Table(name="barang")
public class Barang {
	@id
	@Column (name="id", nullable=false)
	@generatedValue(Strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column("'namaBarang", nullable = false, length = 50)
	private String namaBarang;
}
