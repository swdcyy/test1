package fyd.a;
import fyd.a$c;
import java.util.ArrayList;
import fyd.a$a;
import java.lang.String;
import java.lang.Object;
import java.lang.ThreadLocal;

public final class a	// class@000ef7
{
    public static final a$c[] a;
    public static final List b;
    public static a$c[] c;
    public static final a$c d;

    static {
       a$c[] uocArray = new a$c[0];
       a.a = uocArray;
       a.b = new ArrayList();
       a.c = uocArray;
       a.d = new a$a();
    }
    public static a$c a(String p0){
       a$c[] c = a.c;
       int len = c.length;
       for (int i = 0; i < len; i = i + 1) {
          c[i].a.set(p0);
       }
       return a.d;
    }
}
