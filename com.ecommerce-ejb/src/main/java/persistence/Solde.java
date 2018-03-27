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
public class Solde implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer idSolde;
	
	private Integer pourcentage;
	private Integer qte;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private Boolean editable;
	private Integer etat;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModification;
	
	@ManyToOne
	private Produit produit;

	public Solde() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Solde(Integer pourcentage, Integer qte, Date dateDebut, Date dateFin, Boolean editable, Integer etat,
			Date dateCreation, Date dateModification, Produit produit) {
		super();
		this.pourcentage = pourcentage;
		this.qte = qte;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.editable = editable;
		this.etat = etat;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.produit = produit;
	}

	public Integer getIdSolde() {
		return idSolde;
	}

	public void setIdSolde(Integer idSolde) {
		this.idSolde = idSolde;
	}

	public Integer getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Integer pourcentage) {
		this.pourcentage = pourcentage;
	}

	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
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

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "Solde [idSolde=" + idSolde + ", pourcentage=" + pourcentage + ", qte=" + qte + ", dateDebut="
				+ dateDebut + ", dateFin=" + dateFin + ", editable=" + editable + ", etat=" + etat + ", dateCreation="
				+ dateCreation + ", dateModification=" + dateModification + ", produit=" + produit + "]";
	}
	
	
}
