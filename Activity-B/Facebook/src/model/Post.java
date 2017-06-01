package model;

import java.util.ArrayList;

public class Post {
	private long id;
	private long idUser;
	private long idUserAutor;
	private String Content;
	private ArrayList<String> urlMidia = new ArrayList<>();
	private ArrayList <Reaction> reactions = new ArrayList<>();
	private ArrayList <Coment> coments = new ArrayList<>();
	public Post(String content){
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public long getIdUserAutor() {
		return idUserAutor;
	}
	public void setIdUserAutor(long idUserAutor) {
		this.idUserAutor = idUserAutor;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public ArrayList<String> getUrlMidia() {
		return urlMidia;
	}
	public void setUrlMidia(ArrayList<String> urlMidia) {
		this.urlMidia = urlMidia;
	}
	public ArrayList<Reaction> getReactions() {
		return reactions;
	}
	public void setReactions(ArrayList<Reaction> reactions) {
		this.reactions = reactions;
	}
	public ArrayList<Coment> getComents() {
		return coments;
	}
	public void setComents(ArrayList<Coment> coments) {
		this.coments = coments;
	}
	
}
