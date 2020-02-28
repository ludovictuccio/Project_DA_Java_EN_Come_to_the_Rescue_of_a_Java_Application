package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String args[]) {

		try {
			ISymptomReader reader = new ReadSymptomDataFromFile("./Project02Eclipse/symptoms.txt");

			ISymptomCounter counter = new CounterSymptoms();
			List<String> list = reader.GetSymptoms();

			ISymptomOrder order = new OrderSymptoms();
			HashMap<String, Integer> hmap = (HashMap<String, Integer>) counter.symptomsCounter(list);

			ISymptomWriter writer = new WriteSymptomsOutFile("results.out");
			TreeMap<String, Integer> tmap = order.orderedSymptoms(hmap);
			writer.writeSymptoms(tmap);

		} catch (IOException e) {
			System.err.println("An error was occured. Please check the filepath root.");
			e.printStackTrace();
		}
	}
}
