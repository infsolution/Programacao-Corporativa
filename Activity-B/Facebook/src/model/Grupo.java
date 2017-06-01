package model;

import java.util.ArrayList;

public class Grupo {
	private long id;
	private String name;
	private String description;
	private long[] idusers;
	private ArrayList<Post> posts = new ArrayList<>();
	public Grupo(String name){
		this.name=name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long[] getIdusers() {
		return idusers;
	}
	public void setIdusers(long[] idusers) {
		this.idusers = idusers;
	}
	public ArrayList<Post> getPosts() {
		return posts;
	}
	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}
	

}