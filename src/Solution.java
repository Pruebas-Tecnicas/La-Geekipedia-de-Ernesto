
public class Solution {
	public boolean isValid(String s) {
		s = s.replace(" ", "");
		int i = 1;

		if (s.length() % 2 != 0) {
			return false;
		}

		do {
			try {
				String s1 = s.substring(i - 1, i);
				String s2 = s.substring(i, i + 1);

				if (s1.equals("(") && s2.equals(")")) {
					s = s.substring(0, i - 1) + s.substring(i + 1, s.length());
					i = 1;

				} else if (s1.equals("[") && s2.equals("]")) {
					s = s.substring(0, i - 1) + s.substring(i + 1, s.length());
					i = 1;

				} else if (s1.equals("{") && s2.equals("}")) {
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
