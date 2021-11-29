package metier;

import java.time.LocalDate;

public class Facture
{
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	private	LocalDate date;
	private int montant;
	private boolean reglementfacture = false;
	private Client client;
	
	public Facture() {}
	
	public Facture(int montant, boolean reglee, Client nom) 
	{
		this.date= LocalDate.now();
		this.montant=montant;
		this.reglementfacture=reglee;
		this.client=nom;
	}

	public Facture(int Montant, Client nom) 
	{
		this.montant=Montant;
		this.date= LocalDate.now();
		this.client=nom;

	}
	
	public Facture(LocalDate Date,int Montant,boolean reglement,Client client ) 
	{
		this.date= LocalDate.now();
		this.montant=Montant;
		this.reglementfacture=reglement;
		this.client=client;
	}
	
	
	public Client getClient()
	{	
		return this.client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return this.montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return this.reglementfacture;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return this.date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		Facture f = new Facture(this.date,this.montant,this.reglementfacture,this.client);
		return f;
	}
}