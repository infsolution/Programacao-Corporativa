package model;

import java.awt.List;
import java.util.ArrayList;

public class FanPage {
	private long id;
	private String Name;
	private long[] idUserAdmin;
	private ArrayList<User> fas = new ArrayList<>();
	private ArrayList <Post> posts = new ArrayList<>();
	public FanPage(String name){
		this.Name=name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long[] getIdUserAdmin() {
		return idUserAdmin;
	}
	public void setIdUserAdmin(long[] idUserAdmin) {
		this.idUserAdmin = idUserAdmin;
	}
	public ArrayList<User> getFas() {
		return fas;
	}
	public void setFas(ArrayList<User> fas) {
		this.fas = fas;
	}
	public ArrayList<Post> getPosts() {
		return posts;
	}
	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}
	
}
