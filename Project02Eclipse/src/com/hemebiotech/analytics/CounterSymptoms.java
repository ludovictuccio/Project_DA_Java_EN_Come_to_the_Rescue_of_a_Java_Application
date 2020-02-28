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

			if (!map.containsKey(line)) {
				map.put(line, 1);
			} else {
				map.put(line, map.get(line) + 1);
			}
		}
		return map;
	}
}