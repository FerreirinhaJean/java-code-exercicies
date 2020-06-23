package applicantion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import entities.Itens;

public class Program {

	public static void main(String[] args) {

		List<Itens> item = new ArrayList<>();

		File path = new File("dados.csv");

		try (BufferedReader bw = new BufferedReader(new FileReader(path))) {
			String linha = bw.readLine();

			while (linha != null) {
				String[] itens = linha.split(",");

				String nome = itens[1];
				double preco = Double.parseDouble(itens[2]);
				int quantidade = Integer.parseInt(itens[3]);

				item.add(new Itens(nome, preco, quantidade));

				linha = bw.readLine();

			}
		}
	}

}
