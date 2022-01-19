package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Transaction;

public class Program {

	public static void main(String[] Arg) throws FileNotFoundException, IOException, ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("ss/MM/yyyy");
		Locale.setDefault(Locale.US);
		List<Transaction> list = new ArrayList<>();
		
		File file = new File("C:\\Users\\Meu nome � Z�\\Desktop\\teste-aml\\202110_CPGF.csv");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String line = br.readLine();
			while(line != null) {
				String[] att = line.replaceAll("\"", "").split(";");
				Integer superiorCode = Integer.parseInt(att[0]);
				String superiorName = att[1];
				Integer agencyCode = Integer.parseInt(att[2]);
				String agencyName = att[3];
				Integer unityCode = Integer.parseInt(att[4]);
				String unityName = att[5];
				Integer statementYear = Integer.parseInt(att[6]);
				Integer statementMonth = Integer.parseInt(att[7]);
				String carrierCpf = att[8];
				String carrierName = att[9];
				String favoredCpfCnpj = att[10];
				String favoredName = att[11];
				String transactionType = att[12];
				String transactionDateString = att[13];
				Date transactionDate = null;
				if(transactionDateString == "") {
					transactionDate = null;
				}else {
					transactionDate = sdf.parse(att[13]);
				}
				Double transactionValue = Double.parseDouble(att[14].replaceAll("\\,", "\\."));
				
				list.add(new Transaction(superiorCode, superiorName, agencyCode, 
						agencyName, unityCode, unityName, statementYear, 
						statementMonth, carrierCpf, carrierName, favoredCpfCnpj, 
						favoredName, transactionType, transactionDate, transactionValue));
				
				line = br.readLine();
			}
			
			Double totalSum = 0.0;
			for(Transaction att : list) {
				totalSum += att.getTransactionValue();
			}
			System.out.printf("A soma total das movimenta��es utilizando o CPGF foi de: R$%.2f",totalSum);
		}
		
		sc.close();
	}
	
}
