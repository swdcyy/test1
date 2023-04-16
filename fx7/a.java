package fx7.a;
import fx7.e;
import fx7.a$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.wake.pojo.PkgModel;
import gx7.k;
import java.util.Objects;
import com.google.gson.JsonObject;
import java.lang.System;
import dx7.a;
import zw7.b;
import zw7.b$a;
import com.kwai.wake.pojo.Element;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import gx7.g;
import com.google.gson.JsonElement;
import java.util.List;
import java.util.HashMap;
import gx7.a;
import fx7.c;
import java.util.Map;
import java.lang.Runnable;
import f97.d;
import fx7.b;
import java.lang.StringBuilder;
import fx7.a$b;
import android.net.Uri;
import android.net.Uri$Builder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import android.content.Intent;
import fx7.a$c;
import android.content.pm.ProviderInfo;
import com.k.p.MSProviderF;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.StringsKt__StringsKt;
import fx7.d;
import android.os.Build$VERSION;
import wwd.h;
import android.app.ActivityManager;
import java.lang.Class;
import gx7.h;
import android.content.ContentResolver;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Throwable;
import android.util.Log;
import fx7.a$d;
import fx7.a$e;

public abstract class a implements e	// class@001f7e
{
    public int a;
    public boolean b;
    public final Context c;
    public static final a$a d;

    static {
       a.d = new a$a(null);
    }
    public void a(Context p0){
       a.p(p0, "appContext");
       super();
       this.c = p0;
    }
    public boolean c(String p0,PkgModel p1){
       k a;
       String pkg;
       JsonObject jsonObject1;
       JsonObject jsonObject2;
       a c2;
       JsonObject jsonObject3;
       String str9;
       String str10;
       List elements;
       int i1;
       String packageName;
       HashMap hashMap;
       int i2;
       Object obj2;
       HashMap hashMap1;
       JsonObject jsonObject4;
       int i3;
       List list;
       int i4;
       PkgModel obj3;
       String str11;
       a uoa1;
       Object obj4;
       JsonObject jsonObject5;
       b uob;
       boolean this;
       long l;
       c uoc;
       a uoa = this;
       Object obj = p0;
       HashMap obj1 = p1;
       String str = "sessionId";
       a.p(obj, str);
       String str1 = "pkgModel";
       a.p(obj1, str1);
       a = k.a;
       a c = uoa.c;
       Objects.requireNonNull(a);
       a.p(obj, str);
       JsonObject jsonObject = new JsonObject();
       String str2 = "unknown";
       if (obj1 != null) {
          pkg = p1.getPkg();
          if (pkg != null) {
          label_002b :
             String str3 = "pkg";
             jsonObject.c0(str3, pkg);
             pkg = "session_id";
             jsonObject.c0(pkg, obj);
             jsonObject.c0("sdk_version_code", "20002");
             jsonObject.c0("sdk_version_name", "2.0.2");
             jsonObject.c0("timestamp", String.valueOf(System.currentTimeMillis()));
             String str4 = "2.0.2";
             String str5 = "sdk_version_name";
             String str6 = "20002";
             String str7 = str2;
             str2 = "sdk_version_code";
             String str8 = "timestamp";
             b$a.a(a.b.a(), c, "MATRIX_DO_START_V2", jsonObject, null, 8, 0);
             int i = 0;
             if (!p1.getEnable()) {
                a.b(uoa.c, p0, null, p1, null, "app not enabled", "app not enabled");
                return false;
             }else {
                a c1 = uoa.c;
                String pkg1 = p1.getPkg();
                if (pkg1 == null || ("").equals(pkg1)) {
                   a = null;
                }else {
                   try{
                      c1.getPackageManager().getPackageInfo(pkg1, i);
                      a = 1;
                   }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                   }catch(java.lang.RuntimeException e0){
                   }
                }
             }
          }
       }
       pkg = str2;
       goto label_002b ;
    }
    public final void d(PkgModel p0,Element p1,JsonObject p2,String p3,Map p4){
       a$b uob = new a$b(this, p1, p3, p2, p0, p4);
       if (p0.getStrategy() == 1) {
          v7.run();
       }else {
          a ta = this.a;
          this.a = ta + 1;
          d.c(v7, ((long)ta * 2000));
       }
       return;
    }
    public final Uri e(Uri p0,Map p1){
       Uri$Builder uBuilder = p0.buildUpon();
       if (p1.isEmpty() ^ 1) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             String value = uEntry.getValue();
             int i = 0;
             int i1 = (key.length() > 0)? 1: 0;
             if (i1) {
                if (value.length() > 0) {
                   i = 1;
                }
                if (i) {
                   uBuilder.appendQueryParameter(key, value);
                }
             }
          }
       }
       uBuilder = uBuilder.build();
       a.o(uBuilder, "builder.build\(\)");
       return uBuilder;
    }
    public final void f(Intent p0,Map p1){
       if (p0 != null && (p1.isEmpty() ^ 1)) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             String value = uEntry.getValue();
             int i = 0;
             int i1 = (key.length() > 0)? 1: 0;
             if (i1) {
                if (value.length() > 0) {
                   i = 1;
                }
                if (i) {
                   p0.putExtra(key, value);
                }
             }
          }
       }
       return;
    }
    public final Context g(){
       return this.c;
    }
    public final void h(PkgModel p0,Element p1,JsonObject p2,String p3,Map p4){
       a$c uoc = new a$c(this, p1, p3, p2, p0, p4);
       if (p0.getStrategy() == 1) {
          v7.run();
       }else {
          a ta = this.a;
          this.a = ta + 1;
          d.c(v7, ((long)ta * 2000));
       }
       return;
    }
    public final boolean i(Uri p0){
       boolean b = true;
       ProviderInfo providerInfo = g.a.h(this.c, p0, false);
       String str = "androidx.core.content.FileProvider";
       ProviderInfo providerInfo1 = null;
       ProviderInfo name = (providerInfo != null)? providerInfo.name: providerInfo1;
       if (!a.g(str, name)) {
          if (providerInfo != null) {
             providerInfo1 = providerInfo.name;
          }
          if (!a.g("android.support.v4.content.FileProvider", providerInfo1)) {
             b = false;
          }
       }
       return b;
    }
    public final boolean j(Uri p0){
       boolean b = false;
       ProviderInfo providerInfo = g.a.h(this.c, p0, true);
       if (providerInfo != null) {
          providerInfo = providerInfo.name;
          if (providerInfo != null) {
             a.o("MSProviderF", "MSProviderF::class.java.simpleName");
             if (true == StringsKt__StringsKt.L2(providerInfo, StringsKt___StringsKt.g6("MSProviderF", true), b)) {
                b = true;
             }
          }
       }
       return b;
    }
    public final void k(boolean p0,d p1){
       if (p0) {
          p1.c = p1.d() - 1;
          if (p1.d() > 0) {
             this.l(p1, true);
          }else {
             this.l(p1, false);
          }
       }
       return;
    }
    public final void l(d p0,boolean p1){
       Object[] objArray;
       e uoe = this;
       boolean b = p1;
       String str = (b)? p0.e(): p0.h();
       if (!uoe.a(p0.a().getMode())) {
          k.a.b(uoe.c, p0.g(), p0.b(), p0.f(), p0.a(), "condition not satisfied", "condition not satisfied");
          return;
       }else {
          boolean b1 = true;
          if (uoe.b == null && Build$VERSION.SDK_INT >= 28) {
             String[] stringArray = new String[]{"L"};
             h.b(stringArray);
             uoe.b = b1;
          }
          object oobject = null;
          boolean i = 0;
          int sDK_INT = Build$VERSION.SDK_INT;
          int i1 = 6;
          String str1 = "getService";
          int i2 = 4;
          int i3 = 3;
          if (sDK_INT >= 30) {
             objArray = new Object[i];
             objArray = new Object[]{oobject,p0.c(),p0.c().resolveTypeIfNeeded(uoe.c.getContentResolver()),Boolean.TRUE,str,"",Integer.valueOf(i)};
             if (h.b(h.c(ActivityManager.class, str1, objArray), "startService", objArray) == null) {
             label_010a :
                b1 = 0;
             }
          }else if(sDK_INT >= 26){
             objArray = new Object[i];
             objArray = new Object[i1];
             objArray[i] = oobject;
             objArray[b1] = p0.c();
             objArray[2] = p0.c().resolveTypeIfNeeded(uoe.c.getContentResolver());
             objArray[i3] = Boolean.TRUE;
             objArray[i2] = str;
             objArray[5] = Integer.valueOf(i);
             if (h.b(h.c(ActivityManager.class, str1, objArray), "startService", objArray) == null) {
             }
          }else {
             Object[] objArray1 = new Object[i];
             objArray = new Object[]{oobject,p0.c(),p0.c().resolveTypeIfNeeded(uoe.c.getContentResolver()),str,Integer.valueOf(i)};
             if (h.b(h.c(h.d("android.app.ActivityManagerNative"), "getDefault", objArray1), "startService", objArray) == null) {
             }
          }
          i = b1;
          if (i) {
             k.a.h(uoe.c, p0.g(), p0.b(), p0.f(), p0.a());
          }else {
             uoe.k(b, p0);
             k a = k.a;
             a c = uoe.c;
             String str2 = p0.g();
             JsonObject jsonObject = p0.b();
             PkgModel pkgModel = p0.f();
             Element uElement = p0.a();
             if (oobject == null) {
                oobject = "start serve failed";
             }
             a.b(c, str2, jsonObject, pkgModel, uElement, "start serve failed", oobject);
          }
          return;
       }
    }
    public final void m(PkgModel p0,Element p1,JsonObject p2,String p3,Map p4){
       a$d uod = new a$d(this, p1, p3, p2, p0, p4);
       if (p0.getStrategy() == 1) {
          v7.run();
       }else {
          a ta = this.a;
          this.a = ta + 1;
          d.c(v7, ((long)ta * 2000));
       }
       return;
    }
    public final void n(PkgModel p0,Element p1,JsonObject p2,String p3,Map p4){
       a$e uoe = new a$e(this, p1, p3, p2, p0, p4);
       if (p0.getStrategy() == 1) {
          v7.run();
       }else {
          a ta = this.a;
          this.a = ta + 1;
          d.c(v7, ((long)ta * 2000));
       }
       return;
    }
}
