package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Implementation of the writing method
 */
public class WriteSymptomsOutFile implements ISymptomWriter {

	public String resultsOut;

	/**
	 * @param resultsOut a full or partial path to the output file that will be
	 *                   created with the list of symptoms sorted
	 */
	public WriteSymptomsOutFile(String resultsOut) {
		this.resultsOut = resultsOut;
	}

	@Override
	public void writeSymptoms(TreeMap<String, Integer> tmap) throws IOException {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultsOut))) {

			for (Map.Entry<String, Integer> entry : tmap.entrySet()) {

				// Write capitalizing the first letter
				writer.write(entry.getKey().substring(0, 1).toUpperCase() + entry.getKey().substring(1) + " : "
						+ entry.getValue() + "\r\n");
			}
		}
	}
}
