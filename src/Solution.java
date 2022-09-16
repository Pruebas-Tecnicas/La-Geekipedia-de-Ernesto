/**
 * 
 * @author antonio
 * 
 */
class Solution {
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
