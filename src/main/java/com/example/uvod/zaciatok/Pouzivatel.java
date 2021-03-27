package com.example.uvod.zaciatok;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Pouzivatel {

	@Id
	private Integer idPouzivatela;
	private String meno;
	private String priezvisko;
	private String login;
	private String email;
	
	public Pouzivatel() {}
	
	public Pouzivatel(Integer idPouzivatela, String meno, String priezvisko, String login, String email) {
		this.idPouzivatela = idPouzivatela;
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.login = login;
		this.email = email;
	}
	
	public Integer getIdPouzivatela() {
		return idPouzivatela;
	}
	public void setIdPouzivatela(Integer idPouzivatela) {
		this.idPouzivatela = idPouzivatela;
	}
	public String getMeno() {
		return meno;
	}
	public void setMeno(String meno) {
		this.meno = meno;
	}
	public String getPriezvisko() {
		return priezvisko;
	}
	public void setPriezvisko(String priezvisko) {
		this.priezvisko = priezvisko;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Pouzivatel [idPouzivatela=" + idPouzivatela + ", meno=" + meno + ", priezvisko=" + priezvisko
				+ ", login=" + login + ", email=" + email + "]";
	}
	
}
