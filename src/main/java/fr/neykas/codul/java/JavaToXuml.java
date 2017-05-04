package fr.neykas.codul.java;

import java.io.File;

import fr.neykas.codul.CodeToXuml;
import fr.neykas.codul.Xuml.Xuml;
import fr.neykas.codul.Xuml.XumlClass;
/**
 * The purpose of this class is to {@link #create(File)} or {@link #update(Xuml, File)} {@link Xuml} from a java file
 * @author Allonzo
 *
 */
public interface JavaToXuml extends CodeToXuml {
	/**
	 * Create an {@link Xuml} from a java file, this file can contain object, interface, annotation, traits enum ...
	 * @param javaFile the File to parse
	 * @return A {@link Xuml} containing all the info from the class to generate UML diagrams 
	 */
	public Xuml create(File javaFile);
	/**
	 * Update an {@link Xuml} from a java file, this file can contain object, interface, annotation, traits enum ...
	 * @param oldXuml the {@link Xuml} to update
	 * @param javaFile the File to parse
	 * @return Xuml the new Xuml
	 */
	public Xuml update(Xuml oldXuml,File javaFile);

}
