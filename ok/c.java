package ok.c;
import java.lang.String;
import java.nio.charset.Charset;

public final class c	// class@0027e5
{
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;

    static {
       c.a = Charset.forName("US-ASCII");
       c.b = Charset.forName("ISO-8859-1");
       c.c = Charset.forName("UTF-8");
       c.d = Charset.forName("UTF-16BE");
       c.e = Charset.forName("UTF-16LE");
       c.f = Charset.forName("UTF-16");
    }
}
