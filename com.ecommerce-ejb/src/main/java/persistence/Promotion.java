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
public class Promotion implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer idPromotion;
	private String codePromotion;	
	private Integer pourcentage;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateUtilisation;
	
	private Boolean editable;
	private Integer etat;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModification;
	
	@ManyToOne
	private Client client;

	public Promotion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promotion(String codePromotion, Integer pourcentage, Date dateDebut, Date dateFin, Date dateUtilisation,
			Boolean editable, Integer etat, Date dateCreation, Date dateModification, Client client) {
		super();
		this.codePromotion = codePromotion;
		this.pourcentage = pourcentage;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.dateUtilisation = dateUtilisation;
		this.editable = editable;
		this.etat = etat;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.client = client;
	}
	
	public Promotion(String codePromotion, Integer pourcentage, Date dateDebut, Date dateFin, Date dateUtilisation,
			Boolean editable, Integer etat, Date dateCreation, Date dateModification) {
		super();
		this.codePromotion = codePromotion;
		this.pourcentage = pourcentage;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.dateUtilisation = dateUtilisation;
		this.editable = editable;
		this.etat = etat;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}

	public Integer getIdPromotion() {
		return idPromotion;
	}

	public void setIdPromotion(Integer idPromotion) {
		this.idPromotion = idPromotion;
	}

	public String getCodePromotion() {
		return codePromotion;
	}

	public void setCodePromotion(String codePromotion) {
		this.codePromotion = codePromotion;
	}

	public Integer getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Integer pourcentage) {
		this.pourcentage = pourcentage;
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

	public Date getDateUtilisation() {
		return dateUtilisation;
	}

	public void setDateUtilisation(Date dateUtilisation) {
		this.dateUtilisation = dateUtilisation;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Promotion [idPromotion=" + idPromotion + ", codePromotion=" + codePromotion + ", pourcentage="
				+ pourcentage + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", dateUtilisation="
				+ dateUtilisation + ", editable=" + editable + ", etat=" + etat + ", dateCreation=" + dateCreation
				+ ", dateModification=" + dateModification + ", client=" + client + "]";
	}	
	
	
	
}
