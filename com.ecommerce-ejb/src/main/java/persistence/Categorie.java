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
public class Categorie implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer idCategorie;
	
	private String libelleCategorie;
	
	private Integer etat;
	private Boolean editable;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModification;

	@ManyToOne
	private Trader trader;
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(String libelleCategorie, Integer etat, Boolean editable, Date dateCreation,
			Date dateModification) {
		super();
		this.libelleCategorie = libelleCategorie;
		this.etat = etat;
		this.editable = editable;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}

	public Integer getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getLibelleCategorie() {
		return libelleCategorie;
	}

	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
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

	
	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", libelleCategorie=" + libelleCategorie + ", etat=" + etat
				+ ", editable=" + editable + ", dateCreation=" + dateCreation + ", dateModification=" + dateModification
				+ "]";
	}
	
	
}
