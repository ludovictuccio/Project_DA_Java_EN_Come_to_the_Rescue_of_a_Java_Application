package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The implementation will count the list from the reading method.
 *
 * This method will recover the file read, organize it by removing duplicates,
 * putting capital letters and counting the occurrences
 *
 * @author ludovic.tuccio
 * @version 1.2
 */
public interface ISymptomCounter {
	/**
	 * @return an hashmap of symptoms obtained from the list of the reading method
	 *         without duplicates and with the occurrences counted
	 */
	public Map<String, Integer> symptomsCounter(List<String> list);

}
