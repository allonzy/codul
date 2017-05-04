package fr.neykas.codul.Xuml;

import java.util.List;

public class XumlFunction {
	private XumlDoc documentation;
	private List<XumlAnnotation> annotations;
	private Scope scope;
	private List<Modifier> functionModifier;
	private XumlType returnType;
	private List<XumlVariable> variables;
	private String functionBody;
}
