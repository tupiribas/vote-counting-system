package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import entities.Candidate;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\pastaarquivo\\conf\\votos.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<Candidate, Integer> votes = new LinkedHashMap<>();
			String line = br.readLine();

			while (line != null) {
				String[] i = line.split(",");

				String name = i[0];
				int numberOfVotes = Integer.parseInt(i[1]);

				Candidate candidate = new Candidate(name, numberOfVotes);

				if (votes.containsKey(candidate)) {
					votes.put(candidate, votes.get(candidate) + numberOfVotes);
				} 
				else {
					votes.put(candidate, numberOfVotes);
				}

				line = br.readLine();
			}

			for (Candidate key : votes.keySet()) {
				System.out.println(key.getName() + ": " + votes.get(key));
			}

		} 
		catch (IOException e) {
			System.out.println("ERROR >>> " + e.getMessage());
		}

	}
}
