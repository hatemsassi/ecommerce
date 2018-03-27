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
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer idClient;
	
	private String codeClient;
	private String nomClient;
	private String prenomClient;
	
	private String emailClient;
	private String telClient;
	private String adresseClient;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	private String loginClient;
	private String pswClient;
	
	private Boolean editable;
	private Integer etat;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModification;
	
	@OneToOne
	@JoinColumn(name="idCarteFidelite")
	private CarteFidelite carteFidelite;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Client(String codeClient, String nomClient, String prenomClient, String emailClient, String telClient,
			String adresseClient, Date dateNaissance, String loginClient, String pswClient, Boolean editable,
			Integer etat, Date dateCreation, Date dateModification, CarteFidelite carteFidelite) {
		super();
		this.codeClient = codeClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.emailClient = emailClient;
		this.telClient = telClient;
		this.adresseClient = adresseClient;
		this.dateNaissance = dateNaissance;
		this.loginClient = loginClient;
		this.pswClient = pswClient;
		this.editable = editable;
		this.etat = etat;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.carteFidelite = carteFidelite;
	}


	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public String getTelClient() {
		return telClient;
	}

	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getLoginClient() {
		return loginClient;
	}

	public void setLoginClient(String loginClient) {
		this.loginClient = loginClient;
	}

	public String getPswClient() {
		return pswClient;
	}

	public void setPswClient(String pswClient) {
		this.pswClient = pswClient;
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

	public CarteFidelite getCarteFidelite() {
		return carteFidelite;
	}

	public void setCarteFidelite(CarteFidelite carteFidelite) {
		this.carteFidelite = carteFidelite;
	}


	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", codeClient=" + codeClient + ", nomClient=" + nomClient
				+ ", prenomClient=" + prenomClient + ", emailClient=" + emailClient + ", telClient=" + telClient
				+ ", adresseClient=" + adresseClient + ", dateNaissance=" + dateNaissance + ", loginClient="
				+ loginClient + ", pswClient=" + pswClient + ", editable=" + editable + ", etat=" + etat
				+ ", dateCreation=" + dateCreation + ", dateModification=" + dateModification + ", carteFidelite="
				+ carteFidelite + "]";
	}
	
	
}
