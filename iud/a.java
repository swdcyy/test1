package iud.a;
import java.lang.String;
import java.nio.charset.Charset;

public class a	// class@00198c
{
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;

    static {
       a.a = Charset.forName("ISO-8859-1");
       a.b = Charset.forName("US-ASCII");
       a.c = Charset.forName("UTF-16");
       a.d = Charset.forName("UTF-16BE");
       a.e = Charset.forName("UTF-16LE");
       a.f = Charset.forName("UTF-8");
    }
    public static Charset a(String p0){
       Charset uCharset = (p0 == null)? Charset.defaultCharset(): Charset.forName(p0);
       return uCharset;
    }
    public static Charset b(Charset p0){
       if (p0 == null) {
          p0 = Charset.defaultCharset();
       }
       return p0;
    }
}
