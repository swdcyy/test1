package rkd.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Float;
import java.lang.Integer;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.app.Application;
import android.content.res.Configuration;
import tkd.b;
import tkd.d;
import rkd.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.RomUtils;
import android.view.View;

public final class b	// class@00239a
{
    public static final boolean a;
    public static String b;
    public static final b c;

    static {
       b.c = new b();
       b.a = a.t().d("isWxPadLogiFix", false);
       b.b = "";
    }
    public void b(){
       super();
    }
    public static Integer[] a(int[] p0,int p1,Float[] p2,int[] p3,int p4,Object p5){
       Configuration orientation;
       if (p4 & 0x02) {
          Application b = a.B;
          a.o(b, "AppEnv.APP");
          Resources resources = b.getResources();
          a.o(resources, "AppEnv.APP.resources");
          orientation = resources.getConfiguration().orientation;
       }
       if (p4 & 0x04) {
          p2 = new Float[]{Float.valueOf(0x3f800000),Float.valueOf(0x3f800000)};
       }
       if (p4 & 0x08) {
          p3 = new int[0];
       }
       a.p(p0, "imageSize");
       a.p(p2, "scaleRatios");
       a.p(p3, "outerSize");
       return d.a(-1691978415).LT(p0, orientation, p2, p3);
    }
    public static final boolean b(){
       return b.g();
    }
    public static final boolean c(){
       return b.g();
    }
    public static final boolean d(){
       boolean b;
       if (TextUtils.x(b.b)) {
          b = (RomUtils.n() && b.g())? true: false;
          b.b = String.valueOf(b);
       }
       return TextUtils.n("true", b.b);
    }
    public static final boolean e(){
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       Resources resources = uApplication.getResources();
       a.o(resources, "AppEnv.getAppContext\(\).resources");
       boolean b = (resources.getConfiguration().orientation == 2)? true: false;
       return b;
    }
    public static final boolean f(){
       return d.a(-1691978415).g1();
    }
    public static final boolean g(){
       return d.a(-1691978415).tS();
    }
    public static final boolean h(){
       boolean b = (b.g() && b.a)? true: false;
       return b;
    }
    public static void i(View p0,int p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          p2 = -1;
       }
       a.p(p0, "view");
       d.a(-1691978415).h7(p0, p1, p2);
       return;
    }
}
