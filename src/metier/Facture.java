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
	private boolean reglementfacture;
	private Client client;
	
	public Facture() {}
	
	public Facture(int montant, boolean reglee, Client client) throws IllegalArgumentException
	{
		this.date= LocalDate.now();
		if(montant<0) 
		{
			throw new IllegalArgumentException("null") ;
		}
		else 
		{
			this.montant=montant;
		}
		this.reglementfacture=reglee;
		this.client=client;
	}

	public Facture(int montant, Client client)  throws IllegalArgumentException
	{
		if(montant<0) 
		{
			throw new IllegalArgumentException("null") ;
		}
		else 
		{
			this.montant=montant;
		}
		this.date= LocalDate.now();
		this.reglementfacture = false;
		this.client=client;

	}
	
	public Facture(LocalDate date,int montant,boolean reglement,Client client )  throws IllegalArgumentException
	{
		this.date= date;
		if(montant<0) 
		{
			throw new IllegalArgumentException() ;
		}
		else 
		{
			this.montant=montant;
		}
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
		client.getFac().remove(this);
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