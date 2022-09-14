package calculoempresarial;

public class Balanço {

	public static void main(String[] args) {
	double janeiro =20.000 ;
	double fevereiro = 23.000 ; 
	double marco =10.000;
	double mediamensal ;
	double  totaldespesa;
	mediamensal = (janeiro+fevereiro+marco);
	totaldespesa= (mediamensal/3);
	System.out.println("o valor dos gastos de  marco e:"+marco +" mil reais");
	System.out.println("o valor dos gastos de janeiro e:"+janeiro +" mil reais");
	System.out.println("o valor dos gastos de  fevereiro e :"+ fevereiro+" +mil reais");
	System.out.println("valor da media mensal:"+mediamensal+ "mil reais");
	System.out.println("valor da despesa total :"+totaldespesa +"mil reais ");
	
	}

}
