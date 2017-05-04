package fr.neykas.codul.Xuml;
import java.util.List;
public class XumlClass {
	private Scope scope; 
	private List<Modifier> classModifier;
	private String parent;
	private List<String> interfaces;
	private List<XumlProperties> properties;
	private List<XumlFunction> methods;
	private String classDoc;
}
