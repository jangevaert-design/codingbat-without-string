public class WithoutString {
  public String withoutString(String base, String remove) {
    int lenb = base.length();
    int lenr = remove.length();
    String lowbase = base.toLowerCase();
    String lowrem = remove.toLowerCase();
    String result = "";

    for (int i = 0; i < lenb; i++) {
      if (i <= lenb - lenr) {
        String temp = lowbase.substring(i, i + lenr);
        if (!temp.equals(lowrem)) {
          result += base.substring(i, i + 1);
        } else {
          i += lenr - 1;
        }
      } else {
        String temp2 = lowbase.substring(i, i + 1);
        if (!temp2.equals(lowrem)) {
          result += base.substring(i, i + 1);
        }
      }
    }
    return result;
  }
}
