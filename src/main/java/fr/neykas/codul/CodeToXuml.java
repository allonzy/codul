package fr.neykas.codul;

import java.io.File;
import java.util.List;

import fr.neykas.codul.Xuml.XumlClass;
import fr.neykas.codul.Xuml.XumlInterface;

public interface CodeToXuml {
	/**
	 * 
	 * @param text
	 * @return
	 */
	String readPackage(String text);
	List<String> readImports(String text);
	XumlClass readClass(String text);
	XumlInterface readInterface(String text);
}
