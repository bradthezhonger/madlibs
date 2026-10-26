public class madlib {
  public static String createMadlib(String a, String noun, String verb, String adj, int num) {
// Make a base string from the given madlib
    String base = a;
// Go through the string and replace each symbol with the corresponding word
    String withNoun = base.replace("$", noun);
    String withVerb = withNoun.replace("^", verb);
    String withAdj = withVerb.replace("@", adj);
    String completed = withAdj.replace("#", Integer.toString(num));

    return completed;
  }
}
