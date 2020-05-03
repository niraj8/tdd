package co.interleap.courses.tdd;

public class VowelCounter {

  public int count(String s) {
    final String consonantRegex = "(?i)[^aeiou]+";
    return s.replaceAll(consonantRegex, "").length();
  }

}
