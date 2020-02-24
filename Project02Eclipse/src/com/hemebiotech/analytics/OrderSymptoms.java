package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Implementation of the sorting method
 */
public class OrderSymptoms implements ISymptomOrder {

	@Override
	public TreeMap<String, Integer> orderedSymptoms(HashMap<String, Integer> hmap) {

		TreeMap<String, Integer> treemap = new TreeMap<>(hmap);

		return treemap;
	}
}