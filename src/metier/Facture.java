package metier;

import java.time.LocalDate;

public class Facture
{
	/**
	 * Retourne le client � qui est adress�e la facture..
	 * @return le client.
	 */
	private	LocalDate Date;
	private int Montant;
	private boolean reglementfacture;
	private Client client;
	
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
		return this.Montant;
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
		return this.Date;
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
		Facture F = new Facture();
		
		return null;
	}
}