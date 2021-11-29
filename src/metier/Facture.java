package metier;

import java.time.LocalDate;

public class Facture
{
	/**
	 * Retourne le client � qui est adress�e la facture..
	 * @return le client.
	 */
	private	LocalDate date;
	private int montant;
	private boolean reglementfacture;
	private Client client;
	
	public Facture() {}
	
	public Facture(int montant, boolean reglee, Client client) 
	{
		this.date= LocalDate.now();
		this.montant=montant;
		this.reglementfacture=reglee;
		this.client=client;
	}

	public Facture(int montant, Client client)  
	{
		this.montant=montant;
		this.date= LocalDate.now();
		this.reglementfacture = false;
		this.client=client;

	}
	
	public Facture(LocalDate date,int montant,boolean reglement,Client client )  
	{
		this.date= date;
		this.montant=montant;
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
	 * Retourne vrai si la facture est regl�e.
	 * @return vrai ssi la facture est regl�e.
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
		return client.createFacture(this.montant,this.reglementfacture);
	}
}