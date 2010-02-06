package org.biojava3.core.sequence.compound;

/**
 *
 * @author Andy Yates
 */
public class AmbiguityDNACompoundSet extends DNACompoundSet {

  private static class InitaliseOnDemand {
    public static final AmbiguityDNACompoundSet INSTANCE = new AmbiguityDNACompoundSet();
  }

  public static AmbiguityDNACompoundSet getDNACompoundSet() {
    return InitaliseOnDemand.INSTANCE;
  }

  public AmbiguityDNACompoundSet() {

    addNucleotideCompound("A", "T");
    addNucleotideCompound("T", "A");
    addNucleotideCompound("G", "C");
    addNucleotideCompound("C", "G");

    addNucleotideCompound("M", "K",
        "A", "C");
    addNucleotideCompound("R", "Y",
        "A", "G");
    addNucleotideCompound("W", "W",
        "A", "T");
    addNucleotideCompound("S", "S",
        "C", "G");
    addNucleotideCompound("Y", "R",
        "C", "T");
    addNucleotideCompound("K", "M",
        "G", "T");
    addNucleotideCompound("V", "B",
        "A", "C", "G");
    addNucleotideCompound("H", "D",
        "A", "C", "T");
    addNucleotideCompound("D", "H",
        "A", "G", "T");
    addNucleotideCompound("B", "V",
        "C", "G", "T");
    addNucleotideCompound("N", "N",
        "A", "C", "G", "T", "M", "R", "W", "S", "Y", "K", "V", "H", "D", "B");
  }

}
