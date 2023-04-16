package at6.a;
import java.lang.Object;
import android.net.Uri;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kuaishou.krn.instance.JsFramework;
import java.util.Set;
import ekd.x0;
import trd.d1;
import java.util.Iterator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import js6.b;
import java.lang.StringBuilder;
import q87.c;
import android.app.Activity;
import com.kwai.kds.krn.api.page.KrnFloatingConfig;
import com.yxcorp.utility.n;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import android.os.Bundle;
import com.kwai.kds.krn.api.page.KrnFloatingConfig$b;
import android.content.Context;
import android.text.TextUtils;
import zsd.u;
import java.lang.Float;
import lnc.a1;

public final class a	// class@0003aa
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final LaunchModel a(Uri p0){
       LaunchModel$b obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "uri");
       obj = new LaunchModel$b();
       obj.e("krnUri", p0.toString());
       if (a.g("kds", p0.getHost()) && a.g("/vue", p0.getPath())) {
          obj.f = JsFramework.VUE;
       }
       Set set = x0.c(p0);
       if (set == null) {
          set = d1.k();
       }
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          String str1 = x0.a(p0, str);
          if (str != null) {
             switch (str.hashCode()){
                 case 0xb2d5213d:
                   if (str.equals("bundleId")) {
                      obj.i(str1);
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      obj.m(str1);
                   }
                   break;
                 case 0x28dcf4fb:
                   if (str.equals("autoPageShow")) {
                      obj.g(Boolean.parseBoolean(str1));
                   }
                   break;
                 case 0x65b34528:
                   if (str.equals("componentName")) {
                      obj.j(str1);
                   }
                   break;
                 default:
             }
          }
          obj.e(str, str1);
       }
       LaunchModel launchModel = obj.h();
       a.o(launchModel, "builder.build\(\)");
       return launchModel;
    }
    public static final int b(Uri p0,String p1,int p2){
       Object[] obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "uri");
       a.p(p1, "key");
       String queryParamet = p0.getQueryParameter(p1);
       if (queryParamet != null) {
          try{
             a.o(queryParamet, "uri.getQueryParameter\(key\) ?: return default");
             return Integer.parseInt(queryParamet);
          }catch(java.lang.Exception e0){
             obj = new Object[0];
             b.c.w("Krn-UriUtil", "parseIntError for "+queryParamet, obj);
          }
          return p2;
       }else {
          goto label_0057 ;
       }
    }
    public static final KrnFloatingConfig c(Activity p0,Uri p1){
       a a;
       LaunchModel obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "uri");
       obj = a.a(p1);
       int i = n.j(p0) / 3;
       String path = p1.getPath();
       a.m(path);
       a.o(path, "uri.path!!");
       int i1 = (StringsKt__StringsKt.O2(path, "dialog", false, 2, null))? (int)((double)n.k(p0) * 0x3fe999999999999a): -1;
       obj.g().putBoolean("enableBackBtnHandler", false);
       KrnFloatingConfig$b uob = new KrnFloatingConfig$b();
       uob.a = obj;
       a = a.a;
       uob.b = a.d(p1, "width", i1, n.k(p0), p0);
       uob.c = a.d(p1, "height", i, (n.j(p0) - n.A(p0)), p0);
       uob.d = a.d(p1, "cornerRadius", 0, 1, p0);
       int i2 = 1;
       boolean b = (a.b(p1, "enableAnimation", i2) == i2)? true: false;
       uob.e = b;
       String str = "";
       uob.f = x0.b(p1, "in", str);
       uob.g = x0.b(p1, "out", str);
       uob.h = x0.b(p1, "gravity", str);
       uob.i = x0.b(p1, "maskOpacity", str);
       b = (a.b(p1, "dismissOnTouchMask", i2) == i2)? true: false;
       uob.j = b;
       uob.l = x0.b(p1, "slideOffThreshold", "0.5");
       uob.n = x0.b(p1, "foldRatio", "0");
       if (a.b(p1, "dismissOnBackKey", i2) != i2) {
          i2 = false;
       }
       uob.k = i2;
       uob.m = a.b(p1, "useBottomSheetV2", false);
       uob.o = a.b(p1, "slideFastToClose", false);
       uob.p = a.b(p1, "fitsSystemWindows", false);
       KrnFloatingConfig krnFloatingC = PatchProxy.apply(null, uob, KrnFloatingConfig$b.class, "1");
       if (krnFloatingC != PatchProxyResult.class) {
       }else {
          krnFloatingC = new KrnFloatingConfig(uob);
       }
       a.o(krnFloatingC, "KrnFloatingConfig.Builde¡­INDOW, 0\)\)\n      .build\(\)");
       return krnFloatingC;
    }
    public final int d(Uri p0,String p1,int p2,int p3,Activity p4){
       int i;
       float f;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "uri");
       a.p(p1, "key");
       String queryParamet = p0.getQueryParameter(p1);
       if (TextUtils.isEmpty(queryParamet)) {
          return p2;
       }else {
          try{
             a.m(queryParamet);
             if (u.H1(queryParamet, "px", 0, 2, null)) {
                p1 = queryParamet.substring(0, (queryParamet.length() - 2));
                a.o(p1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                i = Integer.parseInt(p1);
             }else if(u.H1(queryParamet, "dp", 0, 2, null) || u.H1(queryParamet, "pt", 0, 2, null)){
                p1 = queryParamet.substring(0, (queryParamet.length() - 2));
                a.o(p1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                i = a1.e(Float.parseFloat(p1));
             }else if(u.H1(queryParamet, "w", 0, 2, null)){
                p1 = queryParamet.substring(0, (queryParamet.length() - 1));
                a.o(p1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                f = Float.parseFloat(p1);
                i = n.k(p4);
             }else if(u.H1(queryParamet, "h", 0, 2, null)){
                p1 = queryParamet.substring(0, (queryParamet.length() - 1));
                a.o(p1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                f = Float.parseFloat(p1);
                i = n.j(p4);
             }else if(StringsKt__StringsKt.O2(queryParamet, ".", 0, 2, null)){
                return (int)(Float.parseFloat(queryParamet) * (float)p3);
             }else if(a.g("1", queryParamet)){
                return p3;
             }else {
                i = a1.e(Float.parseFloat(queryParamet));
             }
             i = (int)(f * (float)i);
          }catch(java.lang.Exception e0){
             Object[] objArray1 = new Object[0];
             b.c.w("Krn-UriUtil", "parse size error for "+queryParamet, objArray1);
             return p2;
          }
             return i;
       }
    }
}
