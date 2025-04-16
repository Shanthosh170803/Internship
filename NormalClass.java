package com.practice.records;

import java.util.Objects;

public class NormalClass {

	private int id;
	private String name;
	
	public NormalClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "NormalClass [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NormalClass other = (NormalClass) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
