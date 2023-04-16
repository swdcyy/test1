package zsd.d;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class d	// class@00296b
{
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;
    public static Charset g;
    public static Charset h;
    public static Charset i;
    public static final d j;

    static {
       d.j = new d();
       Charset uCharset = Charset.forName("UTF-8");
       a.o(uCharset, "Charset.forName\(\"UTF-8\"\)");
       d.a = uCharset;
       uCharset = Charset.forName("UTF-16");
       a.o(uCharset, "Charset.forName\(\"UTF-16\"\)");
       d.b = uCharset;
       uCharset = Charset.forName("UTF-16BE");
       a.o(uCharset, "Charset.forName\(\"UTF-16BE\"\)");
       d.c = uCharset;
       uCharset = Charset.forName("UTF-16LE");
       a.o(uCharset, "Charset.forName\(\"UTF-16LE\"\)");
       d.d = uCharset;
       uCharset = Charset.forName("US-ASCII");
       a.o(uCharset, "Charset.forName\(\"US-ASCII\"\)");
       d.e = uCharset;
       uCharset = Charset.forName("ISO-8859-1");
       a.o(uCharset, "Charset.forName\(\"ISO-8859-1\"\)");
       d.f = uCharset;
    }
    public void d(){
       super();
    }
    public final Charset a(){
       Charset g = d.g;
       if (g != null) {
       }else {
          g = Charset.forName("UTF-32");
          a.o(g, "Charset.forName\(\"UTF-32\"\)");
          d.g = g;
       }
       return g;
    }
    public final Charset b(){
       Charset i = d.i;
       if (i != null) {
       }else {
          i = Charset.forName("UTF-32BE");
          a.o(i, "Charset.forName\(\"UTF-32BE\"\)");
          d.i = i;
       }
       return i;
    }
    public final Charset c(){
       Charset h = d.h;
       if (h != null) {
       }else {
          h = Charset.forName("UTF-32LE");
          a.o(h, "Charset.forName\(\"UTF-32LE\"\)");
          d.h = h;
       }
       return h;
    }
}
