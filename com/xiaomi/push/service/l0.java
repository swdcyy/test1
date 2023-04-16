package com.xiaomi.push.service.l0;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import ws8.m6;
import java.lang.Class;
import ws8.f7;
import java.lang.reflect.Field;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg$b;
import com.xiaomi.push.service.g0;
import ws8.g7$a;
import java.lang.Integer;
import ys8.b;
import com.xiaomi.push.g;
import android.os.Build$VERSION;
import ys8.n;
import java.lang.Boolean;
import java.util.Locale;

public class l0	// class@00117f
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    public void l0(String p0,String p1,String p2,String p3,String p4,String p5,int p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public static String c(Context p0){
       CharSequence uCharSequenc = null;
       if (("com.xiaomi.xmsf").equals(p0)) {
          if (TextUtils.isEmpty(uCharSequenc)) {
             uCharSequenc = m6.g("ro.miui.region");
             if (TextUtils.isEmpty(uCharSequenc)) {
                uCharSequenc = m6.g("ro.product.locale.region");
             }
          }
       }else {
          uCharSequenc = m6.n();
       }
       return uCharSequenc;
    }
    public static boolean d(){
       try{
          return f7.c(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public static boolean e(Context p0){
       boolean b = (("com.xiaomi.xmsf").equals(p0.getPackageName()) && l0.d())? true: false;
       return b;
    }
    public static boolean f(Context p0){
       return (p0.getPackageName()).equals("com.xiaomi.xmsf");
    }
    public bg$b a(XMPushService p0){
       bg$b uob = new bg$b(p0);
       this.b(uob, p0, p0.b(), "c");
       return uob;
    }
    public bg$b b(bg$b p0,Context p1,g0 p2,String p3){
       p0.a = p1.getPackageName();
       p0.b = this.a;
       p0.i = this.c;
       p0.c = this.b;
       p0.h = "5";
       p0.d = "XMPUSH-PASS";
       p0.e = false;
       g7$a uoa = new g7$a();
       uoa.a("sdk_ver", Integer.valueOf(48));
       uoa.a("cpvn", "5_0_8-C");
       uoa.a("cpvc", Integer.valueOf(0xc358));
       uoa.a("country_code", b.c(p1).f());
       uoa.a("region", b.c(p1).a());
       uoa.a("miui_vn", m6.q());
       uoa.a("miui_vc", Integer.valueOf(m6.b(p1)));
       uoa.a("xmsf_vc", Integer.valueOf(g.b(p1, "com.xiaomi.xmsf")));
       uoa.a("android_ver", Integer.valueOf(Build$VERSION.SDK_INT));
       uoa.a("n_belong_to_app", Boolean.valueOf(n.t(p1)));
       uoa.a("systemui_vc", Integer.valueOf(g.a(p1)));
       String str = l0.c(p1);
       if (!TextUtils.isEmpty(str)) {
          uoa.a("latest_country_code", str);
       }
       str = m6.s();
       if (!TextUtils.isEmpty(str)) {
          uoa.a("device_ch", str);
       }
       str = m6.u();
       if (!TextUtils.isEmpty(str)) {
          uoa.a("device_mfr", str);
       }
       p0.f = uoa.toString();
       String str1 = (l0.f(p1))? "1000271": this.d;
       g7$a uoa1 = new g7$a();
       uoa1.a("appid", str1);
       uoa1.a("locale", Locale.getDefault().toString());
       uoa1.a("sync", Integer.valueOf(1));
       if (l0.e(p1)) {
          uoa1.a("ab", p3);
       }
       p0.g = uoa1.toString();
       p0.k = p2;
       return p0;
    }
}
