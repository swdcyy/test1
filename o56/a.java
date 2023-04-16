package o56.a;
import java.lang.Object;
import o56.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.b;
import android.app.Application;
import java.lang.Boolean;

public final class a	// class@001fa1
{
    public static String A = "ANDROID_PHONE";
    public static Application B;
    public static e C;
    public static String D;
    public static String E;
    public static Context F;
    public static boolean G;
    public static String a;
    public static String b;
    public static int c;
    public static int d;
    public static String e;
    public static String f;
    public static int g;
    public static int h;
    public static String i;
    public static String j;
    public static String k;
    public static String l;
    public static String m;
    public static String n;
    public static String o;
    public static String p;
    public static int q;
    public static String r;
    public static int s;
    public static String t;
    public static String u;
    public static String v;
    public static String w;
    public static String x;
    public static String y;
    public static String z;

    public void a(){
       super();
    }
    public static c a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.g();
    }
    public static Application b(){
       Object obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a();
    }
    public static boolean c(){
       return a.G;
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a().c();
    }
}
