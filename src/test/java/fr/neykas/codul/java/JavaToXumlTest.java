package fr.neykas.codul.java;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fr.neykas.codul.Xuml.Xuml;
import fr.neykas.codul.Xuml.XumlClass;
import fr.neykas.codul.Xuml.XumlInterface;
import junit.framework.TestCase;

public class JavaToXumlTest extends TestCase {
	private JavaToXuml xumlConvertor;
	
	public void readPackageTestStandardCase() {
		assertEquals(xumlConvertor.readPackage("package fr.neykas.codul;"),"fr.neykas.codul");
	}
	public void readPackageTestStandardCaseUnvalidParsingException() {
		xumlConvertor.readPackage("packagefr.neas.codul");
	}

	public void readImportsTestStandardCase() {
		List<String> imports = new ArrayList<String>();
		imports.add("imports.import1");
		imports.add("imports.import2");
		imports.add("imports.import3.*");
		imports.add("import4");
		assertEquals(xumlConvertor.readImports(
				  "imports.import1;\n"
				+ "imports.import2; \n"
				+ "\n\n"
				+ "imports.import3.*;"
				+ "import4;"),imports);
	}
	public void readImportsUnvalidParsingException() {
		List<String> imports = new ArrayList<String>();
		imports.add("imports.import1");
		imports.add("imports.import2");
		imports.add("imports.import3.*");
		imports.add("import4");
		assertEquals(xumlConvertor.readImports(
				  "imports.import1;\n"
				+ "imports.import2; \n"
				+ "\n\n"
				+ "imports.import3.*;"
				+ "import4;"),imports);
	}
	public void readClassTest() {
		
	}

	public void readInterfaceTest() {
	}

	public void createTest() {
	}

	public void updateTest() {

	}
	
}
