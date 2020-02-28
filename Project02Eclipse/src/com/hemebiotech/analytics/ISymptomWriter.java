package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * The implementation must write the ordered and sorted list to an output
 * results.out file obtained from the treemap from the ISymptomOrder sorting
 * method
 *
 * @author ludovic.tuccio
 * @version 1.2
 *
 */
public interface ISymptomWriter {

	public void writeSymptoms(TreeMap<String, Integer> tmap) throws IOException;

}
