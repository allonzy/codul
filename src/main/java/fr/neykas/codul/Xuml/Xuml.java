package fr.neykas.codul.Xuml;

import java.util.List;

/**
 * POJO 
 * the Xuml is a standart xml format containing all 
 * @author Allonzo
 *
 */
public class Xuml {
	private String packageName;
	private List<String> imports; 
	private List<XumlClass> classes;
	private List<XumlInterface> interfaces;
	private List<XumlEnum> enums;
}
