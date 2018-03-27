package persistence;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CarteFidelite implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer idCarteFidelite;
	
	private String codeFidelite;	
	private Integer miles;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModification;
	
	@OneToOne
	@JoinColumn(name="idClient")
	private Client client;

	
	public CarteFidelite() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CarteFidelite(String codeFidelite, Integer miles, Date dateCreation, Date dateModification, Client client) {
		super();
		this.codeFidelite = codeFidelite;
		this.miles = miles;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.client = client;
	}
	
	public CarteFidelite(String codeFidelite, Integer miles, Date dateCreation, Date dateModification) {
		super();
		this.codeFidelite = codeFidelite;
		this.miles = miles;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}


	public Integer getIdCarteFidelite() {
		return idCarteFidelite;
	}


	public void setIdCarteFidelite(Integer idCarteFidelite) {
		this.idCarteFidelite = idCarteFidelite;
	}


	public String getCodeFidelite() {
		return codeFidelite;
	}


	public void setCodeFidelite(String codeFidelite) {
		this.codeFidelite = codeFidelite;
	}


	public Integer getMiles() {
		return miles;
	}


	public void setMiles(Integer miles) {
		this.miles = miles;
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


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	@Override
	public String toString() {
		return "CarteFidelite [idCarteFidelite=" + idCarteFidelite + ", codeFidelite=" + codeFidelite + ", miles="
				+ miles + ", dateCreation=" + dateCreation + ", dateModification=" + dateModification + ", client="
				+ client + "]";
	}	
	
	
	
}
