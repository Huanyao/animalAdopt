package com.huanyao.animalAdopt;

public class FileInfo {

	private String name;
	private int age;
	/**
	 * @param name
	 * @param age
	 */
	public FileInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FileInfo [name=" + name + ", age=" + age + "]";
	}
	
	
}
