package p80.v;
import wq.a;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.File;
import kotlin.io.FilesKt__UtilsKt;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.utility.SystemUtil;
import java.lang.Boolean;
import zsd.u;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import fg6.a;
import p80.s;
import nsd.u;
import com.google.gson.Gson;
import k2b.u1;
import com.kuaishou.gifshow.kswebview.KsWebViewSwitches;
import java.lang.Integer;
import java.util.Objects;
import qrd.p;
import kotlin.Pair;
import p80.r;
import java.lang.Number;
import p80.d;
import com.google.gson.JsonElement;
import android.app.Application;
import o56.a;
import com.kwai.framework.exceptionhandler.ExceptionClues;
import p80.v$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import p80.q;
import p80.x;

public final class v	// class@0028e1
{
    public static String a;
    public static String b;
    public static final a c;
    public static final HashMap d;
    public static final ArrayList e;

    static {
       v.c = a.m(10);
       v.d = new HashMap();
       v.e = new ArrayList();
    }
    public static final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, v.class, "21")) {
          return;
       }
       File uFile = new File(p0);
       if (uFile.exists()) {
          if (uFile.isDirectory()) {
             FilesKt__UtilsKt.V(uFile);
          }else {
             uFile.delete();
          }
          Log.g("KsWebView", "delete file:"+p0);
       }
       return;
    }
    public static final String b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, v.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       if (TextUtils.isEmpty(v.a)) {
          v.a = SystemUtil.r(p0);
       }
       return v.a;
    }
    public static final String c(){
       return v.b;
    }
    public static final boolean d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, v.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "context");
       String str = v.b(p0);
       String packageName = p0.getPackageName();
       a.o(packageName, "context.packageName");
       boolean b = false;
       if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(packageName)) {
          a.m(str);
          if (u.q2(str, packageName, b, 2, null)) {
             String[] stringArray = new String[]{":"};
             List list = StringsKt__StringsKt.H4(str, stringArray, false, 0, 6, null);
             if (list.size() == 2 && u.q2(list.get(1), "kwv_", b, 2, null)) {
                b = true;
             }
          }
       }
       return b;
    }
    public static final void e(String p0,String p1,String p2){
       String str;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, v.class, "2")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       p0 = "kswebview_event_"+p0;
       Gson a = a.a;
       if (TextUtils.isEmpty(p2)) {
          str = "";
       }else {
          a.m(p2);
          str = p2;
       }
       String str1 = (p1 != null)? p1: "";
       s os = new s(str1, str, null, null, 12, null);
       p1 = a.q(p2);
       u1.Q(p0, p1);
       Log.b("KsWebView", p0+": "+p1);
       return;
    }
    public static final void f(String p0,int p1,boolean p2){
       int b;
       String str1;
       Gson a;
       Boolean obj4;
       Object obj = p0;
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, v.class, "5")) {
          return;
       }
       String str = (!obj || !p0.length())? 1: null;
       if (!str) {
          KsWebViewSwitches c = KsWebViewSwitches.c;
          Objects.requireNonNull(c);
          Pair obj1 = PatchProxy.apply(null, c, KsWebViewSwitches.class, "17");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else {
             obj4 = PatchProxy.apply(null, c, KsWebViewSwitches.class, "2");
             if (obj4 == PatchProxyResult.class) {
                obj4 = KsWebViewSwitches.b.getValue();
             }
             b = obj4.booleanValue();
          }
          if (b) {
             obj1 = PatchProxy.applyOneRefs(obj, null, ov, "4");
             if (obj1 != PatchProxyResult.class) {
             }else {
                String str2 = "";
                b = StringsKt__StringsKt.h3(p0, '?', 0, false, 6, null);
                if (b > 0) {
                   if (b < (p0.length() - 1)) {
                      str1 = obj.substring((b + 1));
                      a.o(str1, "\(this as java.lang.String\).substring\(startIndex\)");
                      str2 = str1;
                   }
                   str = obj.substring(0, b);
                   a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                }else {
                   str = obj;
                }
                obj1 = new Pair(str, str2);
             }
             str1 = "kswebview_event_page_load";
             a = a.a;
             Object obj2 = obj1.getFirst();
             Object obj3 = obj1.getSecond();
             Objects.requireNonNull(c);
             obj4 = PatchProxy.apply(null, c, KsWebViewSwitches.class, "18");
             float f = (obj4 != PatchProxyResult.class)? obj4.floatValue(): c.c();
             r or = new r(obj2, obj3, p1, p2, f, null, null, 96, null);
             str = a.q(v3);
             u1.Q(str1, str);
             Log.b("KsWebView", str1+": "+str);
          }
       }
       return;
    }
    public static final void g(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, v.class, "17")) {
          return;
       }
       try{
          JsonElement jsonElement = a.a.x(p0);
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          v.b(uApplication);
          Log.b("KsWebView", "kswebview exception info "+jsonElement);
          a.o(jsonElement, "infoJson");
          ExceptionClues.c.c("kswebview_info", jsonElement);
       }catch(java.lang.Exception e4){
          Log.d("KsWebView", "Failed to set kswebview exception info: "+e4);
       }
       return;
    }
    public static final void h(int p0,String p1,String p2,String p3){
       if (PatchProxy.isSupport(v.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, v.class, "18")) {
          return;
       }
       c.k(new v$a(p0, p1, p2, p3));
       return;
    }
    public static final void i(){
       v ov = v.class;
       if (PatchProxy.applyVoid(null, null, ov, "13")) {
          return;
       }
       KsWebViewSwitches c = KsWebViewSwitches.c;
       boolean b = c.d();
       int i = c.a();
       q oq = new q(b, i, c.f());
       if (!PatchProxy.applyVoidOneRefs(oq, null, ov, "11")) {
          c.k(new x(oq));
       }
       return;
    }
}
