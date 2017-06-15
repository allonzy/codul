package fr.neykas.codul.java.impl;

import fr.neykas.codul.Xuml.Xuml;
import fr.neykas.codul.Xuml.XumlClass;
import fr.neykas.codul.Xuml.XumlInterface;
import fr.neykas.codul.java.JavaToXuml;
import fr.neykas.codul.java.UnvalidParsingException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaToXumlImpl implements JavaToXuml{
    private BufferedReader fileReader;

    private String readPackage() throws UnvalidParsingException, IOException {
        Pattern pattern = Pattern.compile("package (?<name>.*);");
        Pattern endPointPattern = Pattern.compile("import .*");
        Matcher matcher;
        String line;
        while ((line = fileReader.readLine()) != null                    //the next line exist
                && !endPointPattern.matcher(line).find())        //and we dont find the endPoint
        {
            matcher = pattern.matcher(line);
            if (matcher.find()) {
                return matcher.group("name");
            }
        }
        //line == null or we have reach the endPoint without finding package
        throw new UnvalidParsingException("Java parsing error : fail to read package");

    }

    private List<String> readImports() throws UnvalidParsingException, IOException {
        Pattern pattern = Pattern.compile("import (?<name>.*);");
        Pattern endPointPattern = Pattern.compile("(class|interface|trait|enum)");

        Matcher matcher;
        String line;
        fileReader.mark(0);
        while ((line = fileReader.readLine()) != null
                && !endPointPattern.matcher(line).find()
                ) {
            matcher = pattern.matcher(line);
            if (matcher.find()) {
                List<String> importsList = new ArrayList<>();
                do {
                    importsList.add(matcher.group("name"));
                } while ((line = fileReader.readLine()) != null
                        && (matcher = pattern.matcher(line)).find()
                        );
                return importsList;
            }
        }
        //line == null or we have reached the endpoint, so no import has been found
        // therefore we reset the reader to the previous value and return an empty list
        fileReader.reset();
        return new ArrayList<>();
    }

	public XumlClass readClass(String text) {

        return null;
    }

	public XumlInterface readInterface(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	public Xuml create(File javaFile) {
		// TODO Auto-generated method stub
		return null;
	}

	public Xuml update(Xuml oldXuml, File javaFile) {
		// TODO Auto-generated method stub
		return null;
	}
}
