package bn6.a;
import dn6.a;
import android.content.Context;
import lnc.a1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;

public final class a	// class@0004f5
{
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final float j;
    public static final float k;
    public static final a l;

    static {
       a.l = new a();
       a b = a.b;
       a.a = b.b(0x7f070448);
       a.b = b.b(0x7f07034b);
       a.c = b.b(0x7f07031b);
       a.d = b.b(0x7f07031f);
       a.e = b.d(88.00f);
       a.f = b.d(110.00f);
       a.g = b.b(0x7f070cae);
       a.h = b.b(0x7f070cad);
       a.i = b.d(128.00f);
       Context uContext = a1.c();
       a.o(uContext, "CommonUtil.context\(\)");
       Resources resources = uContext.getResources();
       a.o(resources, "CommonUtil.context\(\).resources");
       float f = c.c(resources).density / 3.00f;
       a.j = f;
       a.k = f * 0x3f5c71c7;
    }
    public void a(){
       super();
    }
    public final int a(){
       return a.b;
    }
    public final int b(){
       return a.c;
    }
    public final int c(){
       return a.i;
    }
}
