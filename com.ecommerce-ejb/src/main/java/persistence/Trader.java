package persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trader implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer idTrader;
	
	private String codeCommerce;
	private String libelleCommerce;
	private String firstnameTrader;
	private String lastnameTrader;
	private String emailTrader;
	private String telTrader;
	private String adressTrader;
	private String loginTrader;
	private String pswTrader;
	
	private Boolean editable;
	private Integer etat;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModification;

	public Trader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trader(String codeCommerce, String libelleCommerce, String firstnameTrader, String lastnameTrader,
			String emailTrader, String telTrader, String adressTrader, String loginTrader, String pswTrader,
			Boolean editable, Integer etat, Date dateCreation, Date dateModification) {
		super();
		this.codeCommerce = codeCommerce;
		this.libelleCommerce = libelleCommerce;
		this.firstnameTrader = firstnameTrader;
		this.lastnameTrader = lastnameTrader;
		this.emailTrader = emailTrader;
		this.telTrader = telTrader;
		this.adressTrader = adressTrader;
		this.loginTrader = loginTrader;
		this.pswTrader = pswTrader;
		this.editable = editable;
		this.etat = etat;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}

	public Integer getIdTrader() {
		return idTrader;
	}

	public void setIdTrader(Integer idTrader) {
		this.idTrader = idTrader;
	}

	public String getCodeCommerce() {
		return codeCommerce;
	}

	public void setCodeCommerce(String codeCommerce) {
		this.codeCommerce = codeCommerce;
	}

	public String getLibelleCommerce() {
		return libelleCommerce;
	}

	public void setLibelleCommerce(String libelleCommerce) {
		this.libelleCommerce = libelleCommerce;
	}

	public String getFirstnameTrader() {
		return firstnameTrader;
	}

	public void setFirstnameTrader(String firstnameTrader) {
		this.firstnameTrader = firstnameTrader;
	}

	public String getLastnameTrader() {
		return lastnameTrader;
	}

	public void setLastnameTrader(String lastnameTrader) {
		this.lastnameTrader = lastnameTrader;
	}

	public String getEmailTrader() {
		return emailTrader;
	}

	public void setEmailTrader(String emailTrader) {
		this.emailTrader = emailTrader;
	}

	public String getTelTrader() {
		return telTrader;
	}

	public void setTelTrader(String telTrader) {
		this.telTrader = telTrader;
	}

	public String getAdressTrader() {
		return adressTrader;
	}

	public void setAdressTrader(String adressTrader) {
		this.adressTrader = adressTrader;
	}

	public String getLoginTrader() {
		return loginTrader;
	}

	public void setLoginTrader(String loginTrader) {
		this.loginTrader = loginTrader;
	}

	public String getPswTrader() {
		return pswTrader;
	}

	public void setPswTrader(String pswTrader) {
		this.pswTrader = pswTrader;
	}

	public Boolean getEditable() {
		return editable;
	}

	public void setEditable(Boolean editable) {
		this.editable = editable;
	}

	public Integer getEtat() {
		return etat;
	}

	public void setEtat(Integer etat) {
		this.etat = etat;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	@Override
	public String toString() {
		return "Trader [idTrader=" + idTrader + ", codeCommerce=" + codeCommerce + ", libelleCommerce="
				+ libelleCommerce + ", firstnameTrader=" + firstnameTrader + ", lastnameTrader=" + lastnameTrader
				+ ", emailTrader=" + emailTrader + ", telTrader=" + telTrader + ", adressTrader=" + adressTrader
				+ ", loginTrader=" + loginTrader + ", pswTrader=" + pswTrader + ", editable=" + editable + ", etat="
				+ etat + ", dateCreation=" + dateCreation + ", dateModification=" + dateModification + "]";
	}
	
	
	
}
