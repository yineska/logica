package logic;

public class clase2 {
	String funcTres(int x, String mod2, String c, String result2[], String rrr[], String nrrr[], String 
			ppp[], String nppp[], String qqq[], String nqqq[]) {
			String[] result3 = new String[8];
			if (mod2.contentEquals("and") && c.contentEquals("r")) {
			if (result2[x].contentEquals("T") && rrr[x].contentEquals("T")) {result3[x]="T";} 
			else {result3[x]="F";}
			}
			else if (mod2.contentEquals("and") && c.contentEquals("~r")) {
			if (result2[x].contentEquals("T") && nrrr[x].contentEquals("T")) {result3[x]="T";} 
			else {result3[x]="F";}
			}
			else if (mod2.contentEquals("and") && c.contentEquals("p")) {
			if (result2[x].contentEquals("T") && ppp[x].contentEquals("T")) {result3[x]="T";} 
			else {result3[x]="F";}
			}
			else if (mod2.contentEquals("and") && c.contentEquals("~p")) {
			if (result2[x].contentEquals("T") && nppp[x].contentEquals("T")) {result3[x]="T";} 
			else {result3[x]="F";}
			}
			else if (mod2.contentEquals("and") && c.contentEquals("q")) {
			if (result2[x].contentEquals("T") && qqq[x].contentEquals("T")) {result3[x]="T";} 
			else {result3[x]="F";}
			}
			else if (mod2.contentEquals("and") && c.contentEquals("~q")) {
			if (result2[x].contentEquals("T") && nqqq[x].contentEquals("T")) {result3[x]="T";} 
			else {result3[x]="F";}
			}
			else if (mod2.contentEquals("or") && c.contentEquals("r")) {
			if (result2[x].contentEquals("F") && rrr[x].contentEquals("F")) {result3[x]="F";} 
			else {result3[x]="T";}
			}
			else if (mod2.contentEquals("or") && c.contentEquals("~r")) {
			if (result2[x].contentEquals("F") && nrrr[x].contentEquals("F")) {result3[x]="F";} 
			else {result3[x]="T";}
			}
			else if (mod2.contentEquals("or") && c.contentEquals("p")) {
			if (result2[x].contentEquals("F") && ppp[x].contentEquals("F")) {result3[x]="F";} 
			else {result3[x]="T";}
			}
			else if (mod2.contentEquals("or") && c.contentEquals("~p")) {
			if (result2[x].contentEquals("F") && nppp[x].contentEquals("F")) {result3[x]="F";} 
			else {result3[x]="T";}}
			else if (mod2.contentEquals("or") && c.contentEquals("q")) {
			if (result2[x].contentEquals("F") && qqq[x].contentEquals("F")) {result3[x]="F";} 
			else {result3[x]="T";}
			}
			else if (mod2.contentEquals("or") && c.contentEquals("~q")) {
			if (result2[x].contentEquals("F") && nqqq[x].contentEquals("F")) {result3[x]="F";} 
			else {result3[x]="T";}
			}
			else if (mod2.contentEquals("->") && c.contentEquals("r")) {
			if (result2[x].contentEquals("F") && rrr[x].contentEquals("T")) {result3[x]="F";} 
			else {result3[x]="T";}
			}
			else if (mod2.contentEquals("->") && c.contentEquals("~r")) {
			if (result2[x].contentEquals("F") && nrrr[x].contentEquals("T")) {result3[x]="F";} 
			else {result3[x]="T";}
			}
			else if (mod2.contentEquals("->") && c.contentEquals("p")) {
			if (result2[x].contentEquals("F") && ppp[x].contentEquals("T")) {result3[x]="F";} 
			else {result3[x]="T";}
			}
			else if (mod2.contentEquals("->") && c.contentEquals("~p")) {
			if (result2[x].contentEquals("F") && nppp[x].contentEquals("T")) {result3[x]="F";} 
			else {result3[x]="T";}
			}
			else if (mod2.contentEquals("->") && c.contentEquals("q")) {
			if (result2[x].contentEquals("F") && qqq[x].contentEquals("T")) {result3[x]="F";} 
			else {result3[x]="T";}
			}
			else if (mod2.contentEquals("->") && c.contentEquals("~q")) {
			if (result2[x].contentEquals("F") && nqqq[x].contentEquals("T")) {result3[x]="F";} 
			else {result3[x]="T";}
			}
			return result3[x];
			}
			}


