package persistence;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Commande implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer idCommande;
	private String codeCommande;
	private String qteCommande;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	private float prix;
	private Boolean editable;
	private Integer etat;
	private String codePromotion;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModification;
	
	@ManyToOne
	private Produit produit;
	
	@ManyToOne
	private Client client;

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(String codeCommande, String qteCommande, Date dateCommande, float prix, Boolean editable,
			Integer etat, String codePromotion, Date dateCreation, Date dateModification, Produit produit,
			Client client) {
		super();
		this.codeCommande = codeCommande;
		this.qteCommande = qteCommande;
		this.dateCommande = dateCommande;
		this.prix = prix;
		this.editable = editable;
		this.etat = etat;
		this.codePromotion = codePromotion;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.produit = produit;
		this.client = client;
	}
	
	public Commande(String codeCommande, String qteCommande, Date dateCommande, float prix, Boolean editable,
			Integer etat, String codePromotion, Date dateCreation, Date dateModification) {
		super();
		this.codeCommande = codeCommande;
		this.qteCommande = qteCommande;
		this.dateCommande = dateCommande;
		this.prix = prix;
		this.editable = editable;
		this.etat = etat;
		this.codePromotion = codePromotion;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}

	public Integer getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}

	public String getCodeCommande() {
		return codeCommande;
	}

	public void setCodeCommande(String codeCommande) {
		this.codeCommande = codeCommande;
	}

	public String getQteCommande() {
		return qteCommande;
	}

	public void setQteCommande(String qteCommande) {
		this.qteCommande = qteCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
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

	public String getCodePromotion() {
		return codePromotion;
	}

	public void setCodePromotion(String codePromotion) {
		this.codePromotion = codePromotion;
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

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", codeCommande=" + codeCommande + ", qteCommande=" + qteCommande
				+ ", dateCommande=" + dateCommande + ", prix=" + prix + ", editable=" + editable + ", etat=" + etat
				+ ", codePromotion=" + codePromotion + ", dateCreation=" + dateCreation + ", dateModification="
				+ dateModification + ", produit=" + produit + ", client=" + client + "]";
	}	
	
	
	
}
