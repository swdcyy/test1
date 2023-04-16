package ekd.t0;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;

public class t0	// class@000d7a
{
    public static Pattern a;
    public static Pattern b;

    static {
       t0.a = Pattern.compile("[0-9]*");
       t0.b = Pattern.compile("^\([0-9A-Fa-f]{2}[:-]\){5}\([0-9A-Fa-f]{2}\)$");
    }
    public static boolean a(String p0){
       return t0.a.matcher(p0).matches();
    }
}
