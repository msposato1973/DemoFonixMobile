package com.fonix.demo.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS")
public class Items {

	@Id
	private Long id;
	
	@Column(name="description")
	private String descrption;
	 
	
	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	

	public Items() { }

	public Items(Long id, String nombreUsuario, String nombreCompleto) {
		super();
		this.id = id;
		this.descrption = nombreCompleto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Items(Long id, String descrption) {
		super();
		this.id = id;
		this.descrption = descrption;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", descrption=" + descrption + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrption == null) ? 0 : descrption.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		if (descrption == null) {
			if (other.descrption != null)
				return false;
		} else if (!descrption.equals(other.descrption))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}