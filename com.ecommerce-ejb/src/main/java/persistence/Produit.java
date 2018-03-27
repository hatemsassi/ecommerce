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
public class Produit implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer idProduit;
	private String libelleProduit;
	private String fabricantProduit;
	private float prix;
	private int quantite;
	
	private Integer etat;
	private Boolean editable;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModification;
	
	@ManyToOne
	private Categorie categorie;

	@ManyToOne
	private Trader trader;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Produit(String libelleProduit, String fabricantProduit, float prix, int quantite, Integer etat,
			Boolean editable, Date dateCreation, Date dateModification, Categorie categorie) {
		super();
		this.libelleProduit = libelleProduit;
		this.fabricantProduit = fabricantProduit;
		this.prix = prix;
		this.quantite = quantite;
		this.etat = etat;
		this.editable = editable;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.categorie = categorie;
	}


	public Integer getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}


	public String getLibelleProduit() {
		return libelleProduit;
	}


	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}


	public String getFabricantProduit() {
		return fabricantProduit;
	}


	public void setFabricantProduit(String fabricantProduit) {
		this.fabricantProduit = fabricantProduit;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public Integer getEtat() {
		return etat;
	}


	public void setEtat(Integer etat) {
		this.etat = etat;
	}


	public Boolean getEditable() {
		return editable;
	}


	public void setEditable(Boolean editable) {
		this.editable = editable;
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


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", libelleProduit=" + libelleProduit + ", fabricantProduit="
				+ fabricantProduit + ", prix=" + prix + ", quantite=" + quantite + ", etat=" + etat + ", editable="
				+ editable + ", dateCreation=" + dateCreation + ", dateModification=" + dateModification
				+ ", categorie=" + categorie + "]";
	}
	
	
}
