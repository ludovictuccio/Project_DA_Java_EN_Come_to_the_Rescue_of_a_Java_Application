package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of the counting method
 */
public class CounterSymptoms implements ISymptomCounter {

	@Override
	public Map<String, Integer> symptomsCounter(List<String> list) {

		Map<String, Integer> map = new HashMap<>();

		// Display the list to organize it in the map
		for (String line : list) {

			// Capitalize the first letter
			String uppercaseLine = line.substring(0, 1).toUpperCase() + line.substring(1);

			if (!map.containsKey(uppercaseLine)) {
				map.put(uppercaseLine, 1);
			} else {
				map.put(uppercaseLine, map.get(uppercaseLine) + 1);
			}
		}
		return map;
	}
}