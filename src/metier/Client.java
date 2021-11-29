package metier;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	/** 
	 * Cr�e un client.
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
	 * Cr�� une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture cr��e.
	 */
	
	public Facture createFacture(int montant)
	{
		Facture f = new Facture(montant, this);
		listedesfacture.add(f);
		return f;
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
		Facture f;
		for(int i=0;i<listedesfacture.size();i++) 
		{
			f =listedesfacture.get(i);
			cpt = cpt + f.getMontant();
		}
		return cpt;
	}

	/**
	 * Cr�� une facture en pr�cisant si elle est regl�e.
	 * @param montant Le montant de la facture.
	 * @param regl�e Vrai si la facture est regl�e.
	 * @return la facture cr��e.
	 */
	
	public Facture createFacture(int montant, boolean reglee)
	{
		Facture f = new Facture(montant,reglee, this);
		return f;
	}	
	
	/**
	 * Retourne la liste des factures regl�es. 
	 * @return la liste des factures regl�es.
	 */

	public List<Facture> facturesReglees()
	{
		List<Facture> fac = new ArrayList<>();
		Facture f;
		for(int i=0;i<listedesfacture.size();i++) 
		{
			f =listedesfacture.get(i);
			if(f.estReglee() == true) 
			{
				fac.add(f);
			}
		}
		return fac;
	}
	

	/**
	 * Retourne tous les clients cr��s.
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
