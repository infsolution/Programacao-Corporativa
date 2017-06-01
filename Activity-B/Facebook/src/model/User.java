package model;

import java.util.ArrayList;

public class User {
	private long id;
	private String name;
	private String datBirth;
	private long[] idsUser;
	private long[] idsFanpage;
	private long[] idsGrupos;
	public User(String name){
		this.name = name;
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
	public String getDatBirth() {
		return datBirth;
	}
	public void setDatBirth(String datBirth) {
		this.datBirth = datBirth;
	}
	public long[] getIdsUser() {
		return idsUser;
	}
	public void setIdsUser(long[] idsUser) {
		this.idsUser = idsUser;
	}
	public long[] getIdsFanpage() {
		return idsFanpage;
	}
	public void setIdsFanpage(long[] idsFanpage) {
		this.idsFanpage = idsFanpage;
	}
	public long[] getIdsGrupos() {
		return idsGrupos;
	}
	public void setIdsGrupos(long[] idsGrupos) {
		this.idsGrupos = idsGrupos;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
}

