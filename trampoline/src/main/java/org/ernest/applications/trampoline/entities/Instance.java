package org.ernest.applications.trampoline.entities;

public class Instance {

	private String id;
	private String name;
	private String pomLocation;
	private String port;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPomLocation() {
		return pomLocation;
	}
	public void setPomLocation(String pomLocation) {
		this.pomLocation = pomLocation;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
}