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
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import entities.Transaction;

public class Program {

	public static void main(String[] Arg) throws FileNotFoundException, IOException, ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("ss/MM/yyyy");
		Locale.setDefault(Locale.US);
		List<Transaction> list = new ArrayList<>();
		
		File file = new File("C:\\Users\\Meu nome é Zé\\Desktop\\teste-aml\\202110_CPGF.csv");
		
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
			System.out.printf("A soma total das movimentações utilizando o CPGF é de: R$%.2f\n",totalSum);
			
			totalSum = 0.0;
			for(Transaction att : list) {
				String firstS = new String(att.getTransactionType().replaceAll("\"", ""));
				String secondS = new String("Informações protegidas por sigilo");
				if(firstS.contentEquals(secondS)) {
					totalSum += att.getTransactionValue();
				}
			}
			System.out.printf("A soma das movimentações sigilosas é de R$%.2f", totalSum);
		}
		System.out.println();
		
		
		
		
		
		Map<Integer, String> map = new TreeMap<>();
		
		for (Transaction att : list) {
			String firstS = new String(att.getTransactionType().replaceAll("\"", ""));
			String secondS = new String("Informações protegidas por sigilo");
			if(firstS.contentEquals(secondS)) {
				map.put(att.getAgencyCode(), att.getAgencyName());
			}
		}
		
		int movimentacaoMaior = 0;
		int codeMaior = 0;
		String nameMaior = null;
		Double sumMaior = 0.0;
		
		for(Integer agencyC : map.keySet()) {
			int counter = 0;
			int code = agencyC;
			Double sum = 0.0;
			String name = null;
			for (Transaction trfull : list) {
				if(code == trfull.getAgencyCode()) {
					++counter;
					name = trfull.getAgencyName();
					sum += trfull.getTransactionValue();
				}
			}

			if(counter > movimentacaoMaior) {
				movimentacaoMaior = counter;
				codeMaior = code;
				nameMaior = name;
				sumMaior = sum;
			}
			
		}
		
		System.out.println();
		System.out.printf("O órgao que mais realizou movimentações sigilosas foi: (%d) %s com %d movimentações somando um total de R$%.2f", codeMaior, nameMaior, movimentacaoMaior, sumMaior);
		System.out.println();
		
		
		
		
		
		Map<String, String> carrierMap = new TreeMap<>();
			
		for(Transaction tr : list) {
			String firstS = new String(tr.getTransactionType().replaceAll("\"", ""));
			String secondS = new String("SAQUE CASH/ATM BB");
			if(firstS.contentEquals(secondS)) {
			carrierMap.put(tr.getCarrierCpf(), tr.getCarrierName());
			}
		}
		
		int maiorCounter = 0;
		String maiorName = null;
		Double maiorSumWidrawals = 0.0;
		String maiorCarrierAgency = null;
		int maiorCounterDes = 0;
		String maiorNameDes = null;
		Double maiorSumWidrawalsDes = 0.0;
		String maiorCarrierAgencyDes = null;
		
		for (String cpf : carrierMap.keySet()) {
			int counter = 0;
			int counterDes = 0;
			String code = cpf;
			String name = null;
			Double sumWidrawals = 0.0;
			Double sumWidrawalsDes = 0.0;
			String carrierAgency = null;
			for (Transaction tr : list) {
				if(tr.getCarrierCpf().contentEquals(code)) {
				
					++counter;
					sumWidrawals += tr.getTransactionValue();
					name = tr.getCarrierName();
					carrierAgency = tr.getAgencyName();
				}
			}
			if(counter > maiorCounter) {
				maiorCounter = counter;
				maiorName = name;
				maiorSumWidrawals = sumWidrawals;
				maiorCarrierAgency = carrierAgency;	
			}
			
			String string = new String("Sigiloso");
			String secondString = new String("SEM INFORMACAO");

			for (Transaction tr : list) {
				if(tr.getCarrierCpf().contentEquals(code) && !(tr.getCarrierName().contentEquals(string)) && !(tr.getCarrierName().contentEquals(secondString))) {
				
					++counterDes;
					sumWidrawalsDes += tr.getTransactionValue();
					name = tr.getCarrierName();
					carrierAgency = tr.getAgencyName();
				}
			}
			if(counterDes > maiorCounterDes) {
				maiorCounterDes = counterDes;
				maiorNameDes = name;
				maiorSumWidrawalsDes = sumWidrawalsDes;
				maiorCarrierAgencyDes = carrierAgency;	
			}

		}
		
		System.out.printf("O portador(a) que mais realizou saques foi %s com um total de R$%.2f em %d saques pertencente ao Órgao %s\n", maiorName, maiorSumWidrawals, maiorCounter, maiorCarrierAgency);
		System.out.printf("(DESCONSIDERANDO: Sigiloso e SEM INFORMACAO)O portador(a) que mais realizou saques foi %s com um total de R$%.2f em %d saques pertencente ao Órgao %s\n", maiorNameDes, maiorSumWidrawalsDes, maiorCounterDes, maiorCarrierAgencyDes);
		
		
		
		
		Map<String, String> favoredMap = new TreeMap<>();
		
		for(Transaction tr : list) {
			String firstS = new String(tr.getTransactionType().replaceAll("\"", ""));
			String secondS = new String("COMPRA A/V - R$ - APRES");
			if(firstS.contentEquals(secondS)) {
				favoredMap.put(tr.getFavoredCpfCnpj(), tr.getFavoredName());
			}
		}
		
		int maiorFavoredCounter = 0;
		String maiorFavoredName = null;
		int maiorFavoredCounterDes = 0;
		String maiorFavoredNameDes = null;
		for (String cpfCnpj : favoredMap.keySet()) {
			int counter = 0;
			int counterDes = 0;
			String code = cpfCnpj;
			String name = null;
			for(Transaction tr : list) {
				if(tr.getFavoredCpfCnpj().contentEquals(code)){
					++counter;
					name = tr.getFavoredName();
				}
			}
			if(counter > maiorFavoredCounter) {
				maiorFavoredCounter = counter;
				maiorFavoredName = name;
			}
			
			String string = new String("SEM INFORMACAO");
			for(Transaction tr : list) {
				if(tr.getFavoredCpfCnpj().contentEquals(code) && !(tr.getFavoredName().contentEquals(string))){
					++counterDes;
					name = tr.getFavoredName();
				}
			}
			if(counterDes > maiorFavoredCounterDes) {
				maiorFavoredCounterDes = counterDes;
				maiorFavoredNameDes = name;
			}
		}
		
		System.out.printf("O nome do favorecido que mais teve compras realizadas é %s com %d compras\n", maiorFavoredName, maiorFavoredCounter);
		System.out.printf("(DESCONSIDERANDO: SEM INFORMACAO)O nome do favorecido que mais teve compras realizadas é %s com %d compras\n", maiorFavoredNameDes, maiorFavoredCounterDes);

		sc.close();
	}
	
}
