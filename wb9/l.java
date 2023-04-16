package wb9.l;
import java.lang.String;
import java.util.regex.Pattern;
import brd.t;

public interface abstract l	// class@003d38
{
    public static final Pattern a;

    static {
       l.a = Pattern.compile(".+/Screenshots/.*", 2);
    }
    t a();
}
