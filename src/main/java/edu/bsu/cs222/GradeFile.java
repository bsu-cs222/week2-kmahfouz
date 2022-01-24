package edu.bsu.cs222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Parses a stream of grades.
 * Each line of the stream is expected to be a single numeric value
 * in the range [0,1].
 */
public class GradeFile {
    static final class ParseException extends RuntimeException {}

    /**
     * Parse the input stream into a list of floats.
     * @return the list of floats resulting from parsing the input stream
     */
    public List<Float> parse(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream must not be null.");
        }
        List<Float> gradeFloatList = new ArrayList<>();
        BufferedReader gradeFloatListReader = new BufferedReader(new InputStreamReader(inputStream));
        String listLine;
        while ((listLine = gradeFloatListReader.readLine()) != null) {
            try {
                float gradeFloat = Float.parseFloat(listLine);
                gradeFloatList.add(gradeFloat);
            } catch (NumberFormatException numberFormatException) {
                throw new ParseException();
            }
        }
        return gradeFloatList;
    }
}
