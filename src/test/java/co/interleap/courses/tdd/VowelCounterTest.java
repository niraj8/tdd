package co.interleap.courses.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelCounterTest {

  @Test
  public void shouldCountZeroWithAnEmptyString() {
    assertEquals(0, new VowelCounter().count(""));
  }

  @Test
  public void shouldCountSingleVowel() {
    assertEquals(1, new VowelCounter().count("a"));
  }

  @Test
  public void shouldCountZeroForStringWithNoVowels() {
    assertEquals(0, new VowelCounter().count("xyzzy"));
  }

  @Test
  public void shouldCountAllVowelsForStringWithOnlyVowels() {
    assertEquals(5, new VowelCounter().count("aeiou"));
  }

  @Test
  public void shouldCountVowelsInAStringWithVowelsAndConsonants() {
    assertEquals(3, new VowelCounter().count("hello world"));
  }

  @Test
  public void shouldCountAllVowelsForStringWithUppercaseAndLowercaseCharacters() {
    assertEquals(11, new VowelCounter().count("The Quick BrOwn Fox Jumps over thE lazy doG."));
  }
}