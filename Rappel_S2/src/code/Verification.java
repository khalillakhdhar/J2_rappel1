package code;

public class Verification {
public boolean verifJour(int jour)
{
	if((jour<=31)&&(jour>0))
		return true;
	else
		return false;
}
public boolean verifmois(int mois)
{
return (mois<=12)&&(mois>=1);	

}
public boolean verifAnne(String annee)
{
	
return annee.length()==4;
}
public int convertAnnee(String annee)
{
return Integer.parseInt(annee);
}
public boolean verifjours(int jour,int mois,int annee)
{
if((mois==4)||(mois==6)||(mois==9)||(mois==11))
{
if((jour<31)&&(jour>0))
{
return true	;
}
else
	return false;


}
else if(mois==2)
{
return	verifFev(jour, annee);
}
else
	return verifJour(jour);

}

public boolean verifFev(int jours,int annee)
{
	if(annee%4==0)
	{
		if( (jours<=29)&&(jours>=0) )
		{
			
			return true;
		}
		else
			return false;
		
		
		
	}
	else
	{
		if( (jours<=28)&&(jours>=0) )
		{
			
			return true;
		}
		else
			return false;
		
		
		
		
		
	}
		
}

}
