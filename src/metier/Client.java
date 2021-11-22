package metier;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	/** 
	 * Crée un client.
	 * @param nom le nom du client. 
	 */
	private static List<Client> listedesclient = new ArrayList<>();
	private String nom ;
	private List<Facture> listedesfacture = new ArrayList<>();

	
	public Client(String nom)
	{
		this.nom=nom;
		listedesclient.add(this);
	}

	/**
	 * Retourne le nom du client.
	 * @return le nom du client.
	 */
	
	public String getNom()
	{
		return this.nom;
	}
	
	/**
	 * Modifie le nom du client.
	 * @param nom le nom du client.
	 */
	
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	
	/**
	 * Créé une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant)
	{
		Facture F = new Facture(montant, this);
		listedesfacture.add(F);
		return F;
	}
	
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures()
	{
		return this.listedesfacture;
	}
	
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		int cpt=0;
		Facture F;
		for(int i=0;i<listedesfacture.size();i++) {
			F =listedesfacture.get(i);
			cpt = cpt + F.getMontant();
		}
		return cpt;
	}

	/**
	 * Créé une facture en précisant si elle est reglée.
	 * @param montant Le montant de la facture.
	 * @param reglée Vrai si la facture est reglée.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant, boolean reglee)
	{
		Facture F = new Facture(montant,reglee, this);
		return F;
	}	
	
	/**
	 * Retourne la liste des factures reglées. 
	 * @return la liste des factures reglées.
	 */

	public List<Facture> facturesReglees()
	{
		List<Facture> fac = new ArrayList<>();
		Facture F;
		for(int i=0;i<listedesfacture.size();i++) {
			F =listedesfacture.get(i);
			if(F.estReglee() == true) {
				fac.add(F);
			}
		}
		return fac;
	}
	

	/**
	 * Retourne tous les clients créés.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		return listedesclient;
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
	}
}
