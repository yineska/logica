package logic;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class clase1 {
	public static void main (String[] args) throws IOException {
		Scanner objScn = new Scanner(System.in);
		String NUM;
		clase2 calc = new clase2();
		String a=(""), b=(""), c=(""), mod1=(""), mod2=("");
		String[] pp = {"T","T","F","F"};
		String[] npp = {"F","F","T","T"};
		String[] qq = {"T","F","T","F"};
		String[] nqq = {"F","T","F","T"};
		String[] ppp = {"T","T","T","T","F","F","F","F"};
		String[] nppp = {"F","F","F","F","T","T","T","T"};
		String[] qqq = {"T","T","F","F","T","T","F","F"};
		String[] nqqq = {"F","F","T","T","F","F","T","T"};
		String[] rrr = {"T","F","T","F","T","F","T","F"};
		String[] nrrr = {"F","T","F","T","F","T","F","T"};
		String[] result2 = new String[8];
		String[] result3 = new String[8];
		int nv, x;
		NUM=JOptionPane.showInputDialog("Ingrese el numero de variables que desea analizar");
		nv =Integer.parseInt(NUM);
		switch (nv)  {
		case 2:
			System.out.print("\n Ingrese primera variable (p, q, ~p, ~q): ");
			a = String.valueOf(objScn.nextLine());
			System.out.print("\n Ingrese modificador (and, or, ->): ");
			mod1 = String.valueOf(objScn.nextLine());
			System.out.print("\n Ingrese segunda variable (p, q, ~p, ~q): ");
			b = String.valueOf(objScn.nextLine());
			if (a.contentEquals("p")) {
			if (mod1.contentEquals("and") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && qq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && nqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && pp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~p")) {for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && npp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("F") && qq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("F") && nqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("F") && pp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("F") && npp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && qq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && nqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && pp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && npp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			}
			else if (a.contentEquals("~p")) {
			if (mod1.contentEquals("and") && b.contentEquals("~q")) {for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && nqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && qq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && npp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && pp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~q")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("F") && nqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("F") && qq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("F") && npp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("F") && pp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~q")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && nqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && qq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && npp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && pp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			}
			else if (a.contentEquals("q")) {
			if (mod1.contentEquals("and") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && qq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && nqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && pp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && npp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("F") && qq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("F") && nqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("F") && pp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("F") && npp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && qq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && nqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && pp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~q")) {
			for (x=0; x < 4; x++) {
			if (pp[x].contentEquals("T") && npp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			}
			else if (a.contentEquals("~q")) {
			if (mod1.contentEquals("and") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && nqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && qq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~q")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && npp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && pp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("F") && nqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("F") && qq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~q")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("F") && npp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("F") && pp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && nqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("p")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && qq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~q")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && npp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("q")) {
			for (x=0; x < 4; x++) {
			if (npp[x].contentEquals("T") && pp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			}
			}
			else
			{System.out.println("\n ERROR. FORMATO NO VÁLIDO.");}
			System.out.print("\n"+ a +": ");
			if (a.contentEquals("p"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ pp[x] +" ");else if (a.contentEquals("~p"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ npp[x] +" ");
			else if (a.contentEquals("q"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ pp[x] +" ");
			else if (a.contentEquals("~q"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ npp[x] +" ");
			System.out.print("\n\n"+ b +": ");
			if (a.contentEquals("q") && b.contentEquals("p"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ qq[x] +" ");
			else if (a.contentEquals("q") && b.contentEquals("~p"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ nqq[x] +" ");
			else if (a.contentEquals("~q") && b.contentEquals("p"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ qq[x] +" ");
			else if (a.contentEquals("~q") && b.contentEquals("~p"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ nqq[x] +" ");
			else if (a.contentEquals("p") && b.contentEquals("p"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ pp[x] +" ");
			else if (a.contentEquals("p") && b.contentEquals("~p"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ npp[x] +" ");
			else if (a.contentEquals("~p") && b.contentEquals("p"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ pp[x] +" ");
			else if (a.contentEquals("~p") && b.contentEquals("~p"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ npp[x] +" ");
			else if (a.contentEquals("p") && b.contentEquals("q"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ qq[x] +" ");
			else if (a.contentEquals("p") && b.contentEquals("~q"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ nqq[x] +" ");
			else if (a.contentEquals("~p") && b.contentEquals("q"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ qq[x] +" ");
			else if (a.contentEquals("~p") && b.contentEquals("~q"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ nqq[x] +" ");
			else if (a.contentEquals("q") && b.contentEquals("q"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ pp[x] +" ");
			else if (a.contentEquals("q") && b.contentEquals("~q"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ npp[x] +" ");
			else if (a.contentEquals("~q") && b.contentEquals("q"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ pp[x] +" ");
			else if (a.contentEquals("~q") && b.contentEquals("~q"))
			for (x=0; x < 4; x++) 
			System.out.print(""+ npp[x] +" ");
			System.out.print("\n\n"+ a +" "+ mod1 +" "+ b +": ");
			for (x=0; x < 4; x++) 
			System.out.print(""+ result2[x] +" ");
			break;
			case 3:
			System.out.print("\n Ingrese primera variable (p, q, ~p, ~q): ");a = String.valueOf(objScn.nextLine());
			System.out.print("\n Ingrese modificador (and, or, ->): ");
			mod1 = String.valueOf(objScn.nextLine());
			System.out.print("\n Ingrese segunda variable (p, q, ~p, ~q): ");
			b = String.valueOf(objScn.nextLine());
			System.out.print("\n Ingrese modificador (and, or, ->): ");
			mod2 = String.valueOf(objScn.nextLine());
			System.out.print("\n Ingrese segunda variable (p, q, r, ~p, ~q, ~r): ");
			c = String.valueOf(objScn.nextLine());
			if (a.contentEquals("p")) {
			if (mod1.contentEquals("and") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && qqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~q")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && nqqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && ppp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~p")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && nppp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("F") && qqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}else if (mod1.contentEquals("or") && b.contentEquals("~q")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("F") && nqqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("F") && ppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~p")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("F") && nppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && qqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~q")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && nqqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && ppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~p")) {for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && nppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			}
			else if (a.contentEquals("~p")) {
			if (mod1.contentEquals("and") && b.contentEquals("~q")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("T") && nqqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("T") && qqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~p")) {
			for (x=0; x < 4; x++) {
			if (nppp[x].contentEquals("T") && nppp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("T") && ppp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~q")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("F") && nqqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}else if (mod1.contentEquals("or") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("F") && qqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~p")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("F") && nppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("F") && ppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~q")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("T") && nqqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("T") && qqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~p")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("T") && nppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}else if (mod1.contentEquals("->") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("T") && ppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			}
			else if (a.contentEquals("q")) {
			if (mod1.contentEquals("and") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (qqq[x].contentEquals("T") && ppp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~p")) {
			for (x=0; x < 8; x++) {
			if (qqq[x].contentEquals("T") && nppp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (qqq[x].contentEquals("T") && qqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~q")) {
			for (x=0; x < 8; x++) {
			if (qqq[x].contentEquals("T") && nqqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (qqq[x].contentEquals("F") && ppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}}
			else if (mod1.contentEquals("or") && b.contentEquals("~p")) {
			for (x=0; x < 8; x++) {
			if (qqq[x].contentEquals("F") && nppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (qqq[x].contentEquals("F") && qqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~q")) {
			for (x=0; x < 8; x++) {
			if (qqq[x].contentEquals("F") && nqqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && qqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~p")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && nqqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && ppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}else if (mod1.contentEquals("->") && b.contentEquals("~q")) {
			for (x=0; x < 8; x++) {
			if (ppp[x].contentEquals("T") && nppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			}
			else if (a.contentEquals("~q")) {
			if (mod1.contentEquals("and") && b.contentEquals("~p")) {
			for (x=0; x < 8; x++) {
			if (nqqq[x].contentEquals("T") && nppp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (nqqq[x].contentEquals("T") && ppp[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("~q")) {
			for (x=0; x < 8; x++) {
			if (nqqq[x].contentEquals("T") && nqqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("and") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (nqqq[x].contentEquals("T") && qqq[x].contentEquals("T")) 
			{result2[x]="T";} 
			else {result2[x]="F";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("~p")) {
			for (x=0; x < 8; x++) {
			if (nqqq[x].contentEquals("F") && nppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (nqqq[x].contentEquals("F") && ppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("or") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (nqqq[x].contentEquals("F") && qqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~p")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("T") && nqqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++)
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("p")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("T") && qqq[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++) 
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("~q")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("T") && nppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++) 
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, nppp, 
			qqq, nqqq);}
			}
			else if (mod1.contentEquals("->") && b.contentEquals("q")) {
			for (x=0; x < 8; x++) {
			if (nppp[x].contentEquals("T") && ppp[x].contentEquals("F")) 
			{result2[x]="F";} 
			else {result2[x]="T";}
			}
			for (x=0; x < 8; x++) 
			{result3[x] = calc.funcTres(x, mod2, c, result2, rrr, nrrr, ppp, 
			nppp, qqq, nqqq);}}
			}
			else
			{System.out.println("\n ERROR. FORMATO NO VÁLIDO.");}
			System.out.print("\n"+ a +": ");
			if (a.contentEquals("p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ ppp[x] +" ");
			else if (a.contentEquals("~p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nppp[x] +" ");
			else if (a.contentEquals("q"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ ppp[x] +" ");
			else if (a.contentEquals("~q"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nppp[x] +" ");
			else if (a.contentEquals("r"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ ppp[x] +" ");
			else if (a.contentEquals("~r"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nppp[x] +" ");
			System.out.print("\n\n"+ b +": ");
			if (a.contentEquals("q") && b.contentEquals("p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ qqq[x] +" ");
			else if (a.contentEquals("q") && b.contentEquals("~p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nqqq[x] +" ");
			else if (a.contentEquals("~q") && b.contentEquals("p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ qqq[x] +" ");
			else if (a.contentEquals("~q") && b.contentEquals("~p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nqqq[x] +" ");
			else if (a.contentEquals("p") && b.contentEquals("p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ ppp[x] +" ");
			else if (a.contentEquals("p") && b.contentEquals("~p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nppp[x] +" ");
			else if (a.contentEquals("~p") && b.contentEquals("p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ ppp[x] +" ");
			else if (a.contentEquals("~p") && b.contentEquals("~p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nppp[x] +" ");
			else if (a.contentEquals("p") && b.contentEquals("q"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ qqq[x] +" ");
			else if (a.contentEquals("p") && b.contentEquals("~q"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nqqq[x] +" ");
			else if (a.contentEquals("~p") && b.contentEquals("q"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ qqq[x] +" ");
			else if (a.contentEquals("~p") && b.contentEquals("~q"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nqqq[x] +" ");
			else if (a.contentEquals("q") && b.contentEquals("q"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ ppp[x] +" ");
			else if (a.contentEquals("q") && b.contentEquals("~q"))for (x=0; x < 8; x++) 
			System.out.print(""+ nppp[x] +" ");
			else if (a.contentEquals("~q") && b.contentEquals("q"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ ppp[x] +" ");
			else if (a.contentEquals("~q") && b.contentEquals("~q"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nppp[x] +" ");
			System.out.print("\n\n"+ c +": ");
			if (c.contentEquals("p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ ppp[x] +" ");
			else if (c.contentEquals("~p"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nppp[x] +" ");
			else if (c.contentEquals("q"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ qqq[x] +" ");
			else if (c.contentEquals("~q"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nqqq[x] +" ");
			else if (c.contentEquals("r"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ rrr[x] +" ");
			else if (c.contentEquals("~r"))
			for (x=0; x < 8; x++) 
			System.out.print(""+ nrrr[x] +" ");
			System.out.print("\n\n"+ a +" "+ mod1 +" "+ b +" "+ mod2 +" "+ c +": ");
			for (x=0; x < 8; x++) 
			System.out.print(""+ result3[x] +" ");
			break;
			default:
			JOptionPane.showMessageDialog(null," NO DISPONIBLE ");
			break;
			}}}
