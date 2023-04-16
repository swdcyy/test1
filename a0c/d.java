package a0c.d;
import android.content.Context;
import lnc.a1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import hn5.b0;

public final class d	// class@00000c
{
    public static final float a;
    public static final float b;
    public static final d c;

    static {
       d.c = new d();
       Context uContext = a1.c();
       a.o(uContext, "CommonUtil.context\(\)");
       Resources resources = uContext.getResources();
       a.o(resources, "CommonUtil.context\(\).resources");
       float f = c.c(resources).density / 3.00f;
       d.a = f;
       d.b = (b0.a.a() * 0x3f5c71c7) * f;
    }
    public void d(){
       super();
    }
    public final float a(){
       return d.b;
    }
}
