package metier;

import java.time.LocalDate;

public class Facture
{
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	private	LocalDate Date;
	private int Montant;
	private boolean reglementfacture = false;
	private Client client;
	
	public Facture() {}
	
	public Facture(int montant, boolean reglee) {
		this.Date= LocalDate.now();
		this.Montant=montant;
		this.reglementfacture=reglee;
	}

	public Facture(int Montant) {
		this.Montant=Montant;
		this.Date= LocalDate.now();

	}
	
	public Facture(LocalDate Date,int Montant,boolean reglement,Client client ) {
		this.Date= LocalDate.now();
		this.Montant=Montant;
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
		return this.Montant;
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
		Facture f = new Facture(this.Date,this.Montant,this.reglementfacture,this.client);
		return f;
	}
}