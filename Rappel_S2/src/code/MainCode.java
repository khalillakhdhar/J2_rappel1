package code;

public class MainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Verification v=new Verification();
int jour=31;
int vannee=0;
int mois =12;
String annee="2020";
try
{
 vannee=v.convertAnnee(annee);
}
catch(Exception ex)
{
System.out.println("l'année doit être numérique");	

}
if(v.verifJour(jour)==false)
{
	
System.out.println("le jour doit être entre 1 et 31");

}
else if(v.verifmois(mois)==false)
{
	
System.out.println("le mois doit être entre 1 et 12");
}
else if(v.verifAnne(annee)==false)
{
System.out.println("l'année doit être logique");	
}

else if(v.verifjours(jour, mois, vannee))
{
System.out.println("date valide");
	}
else
{
System.out.print("date invalide");	
}

}
	}
