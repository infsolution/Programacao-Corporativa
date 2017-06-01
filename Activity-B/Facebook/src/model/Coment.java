package model;

import java.util.ArrayList;

public class Coment {
	private long idComent;
	private long idUser;
	private String content;
	private ArrayList <Reaction> reactions = new ArrayList<>();
	private ArrayList<Coment> answer = new ArrayList<>();
	public Coment(String content){
		this.content=content;
	}
	public long getIdComent() {
		return idComent;
	}
	public void setIdComent(long idComent) {
		this.idComent = idComent;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ArrayList<Reaction> getReactions() {
		return reactions;
	}
	public void setReactions(ArrayList<Reaction> reactions) {
		this.reactions = reactions;
	}
	public ArrayList<Coment> getAnswer() {
		return answer;
	}
	public void setAnswer(ArrayList<Coment> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.content;
	}
}
