package Solution;

/**
 * En esta clase se encuentra el método que resuelve el ejercicio "Valid Parentheses".
 * 
 * @author antonio
 * 
 */
public class Solution {

	/**
	 * Este método contiene el algoritmo que resuelve el ejercicio.
	 * 
	 * El algoritmo se basa en  recorrer la cadena s y eliminar  aquellos 
	 * caracteres que correspondan a una apertura y cierre del mismo tipo 
	 * de símbolo y además sus posiciones sean consecutivas, de esta forma 
	 * la cadena s irá reduciendo su longitud cada que se encuentre esta
	 * coincidencia. 
	 * 
	 * Si la cadena s llega a tener longitud igual a cero significa que todos
	 * sus símbolos cumplian con los requisitos del ejercicio y se retorna true.
	 * 
	 * Si la cadena ha sido recorrida hasta el final y se lanza la excepción
	 * significa que no cumplía con el formato de una cadena válida y retorna false.
	 * 
	 * @param s
	 * @return
	 */
	public boolean isValid(String s) {
		int i = 1;
		boolean flag;

		s = s.replace(" ", "");

		if (s.length() % 2 != 0) {
			return false;
		}

		do {
			flag = false;

			try {
				String s1 = s.substring(i - 1, i);
				String s2 = s.substring(i, i + 1);

				if (s1.equals("(") && s2.equals(")")) {
					flag = true;
				} else if (s1.equals("[") && s2.equals("]")) {
					flag = true;
				} else if (s1.equals("{") && s2.equals("}")) {
					flag = true;
				}

				if (flag) {
					s = s.substring(0, i - 1) + s.substring(i + 1, s.length());
					i = 1;
				} else {
					i++;
				}
				
			} catch (Exception e) {
				return false;
			}

		} while (s.length() > 0);

		return true;
	}
}
