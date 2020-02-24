package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * The implementation will sort the list alphabetically
 *
 * This method will recover the hasmap of the counting method, put it in
 * alphabetical order and return a treemap
 *
 * @author ludovic.tuccio
 * @version 1.2
 */
public interface ISymptomOrder {
	/**
	 *
	 * @return returns a treemap obtained from the hashmap of the counting method,
	 *         in alphabetical order
	 */
	public TreeMap<String, Integer> orderedSymptoms(HashMap<String, Integer> hmap);

}