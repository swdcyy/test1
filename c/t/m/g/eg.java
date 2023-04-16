package c.t.m.g.eg;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;

public class eg	// class@000c69
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;

    static {
       Pattern pattern = Pattern.compile("[0-9a-zA-Z+-]*");
       eg.a = pattern;
       eg.b = pattern;
       eg.c = pattern;
       eg.d = Pattern.compile("[A-Z0-9]{12}");
    }
    public static String a(String p0,Pattern p1){
       if (p0 == null) {
          return "";
       }
       if (!p1.matcher(p0).matches()) {
          return "";
       }
       return p0;
    }
}
