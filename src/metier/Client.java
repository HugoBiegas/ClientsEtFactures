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
	
	/**
	 * Créé une facture en précisant si elle est reglée.
	 * @param montant Le montant de la facture.
	 * @param reglée Vrai si la facture est reglée.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant, boolean reglee) throws IllegalArgumentException 
	{
		Facture f = new Facture(montant,reglee, this);
		listedesfacture.add(f);
		return f;
	}	
	
	/**
	 * Créé une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant) throws IllegalArgumentException
	{
		Facture f = new Facture(montant, this);
		listedesfacture.add(f);
		return f;
	}
		
	public Client(String nom)
	{
		this.nom=nom;
		listedesclient.add(this);
	}
	
	public void gesterreurilegal(String s) 
	{
		System.out.println("Le montant d'une facture ne peut pas Ãªtre nÃ©gatif.");
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
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures()
	{
		List<Facture> fac = new ArrayList<>();
		Client cli;
		Facture f;
		for (int i = 0; i <listedesfacture.size() ; i++) 
		{
			f = listedesfacture.get(i);
			cli = listedesclient.get(i);
			if(cli.getNom() == this.nom) 
			{
				fac.add(f);
			}
		}
		return fac;
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
	 * Retourne la liste des factures reglées. 
	 * @return la liste des factures reglées.
	 */

	public List<Facture> facturesReglees()
	{
		List<Facture> fac = new ArrayList<>();
		Facture f;
		for(int i=0;i<listedesfacture.size();i++) 
		{
			f =listedesfacture.get(i);
			if(f.estReglee()) 
			{
				fac.add(f);
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
