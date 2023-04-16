package com.kwai.wake.strategy.BackgroundWake;
import fx7.a;
import com.kwai.wake.strategy.BackgroundWake$Companion;
import nsd.u;
import android.content.Context;
import kotlin.LazyThreadSafetyMode;
import com.kwai.wake.strategy.BackgroundWake$pkgModelMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.wake.sp.SubProcessSp;
import java.lang.Object;
import gx7.j;
import java.lang.String;
import android.content.SharedPreferences;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import dx7.f;
import java.util.Objects;
import ax7.a;
import gx7.g;
import com.google.gson.JsonObject;
import java.util.UUID;
import java.lang.System;
import com.google.gson.JsonElement;
import java.util.Map;
import com.kwai.wake.pojo.PkgModel;
import gx7.k;
import dx7.a;
import zw7.b;
import zw7.b$a;
import com.kwai.wake.pojo.Element;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.util.List;
import java.util.HashMap;
import gx7.a;
import fx7.c;
import java.lang.Runnable;
import f97.d;
import fx7.b;
import java.lang.StringBuilder;

public final class BackgroundWake extends a	// class@001128
{
    public String e;
    public final p f;
    public static final BackgroundWake$Companion g;

    static {
       BackgroundWake.g = new BackgroundWake$Companion(null);
    }
    public void BackgroundWake(Context p0){
       super(p0);
       this.f = s.b(LazyThreadSafetyMode.NONE, new BackgroundWake$pkgModelMap$2(p0));
    }
    public boolean a(int p0){
       return SubProcessSp.f.a(this.g()).a.getBoolean("is_background", false);
    }
    public void b(String p0){
       a a;
       String obj1;
       String pkg;
       boolean b;
       JsonObject jsonObject2;
       a c2;
       JsonObject jsonObject3;
       List elements;
       int i;
       String packageName1;
       HashMap hashMap;
       int i1;
       Object obj2;
       HashMap hashMap1;
       int i2;
       JsonObject jsonObject4;
       List list;
       Object obj3;
       int i3;
       Object obj4;
       k ok;
       a uoa;
       HashMap hashMap2;
       b uob;
       int this;
       long l;
       c uoc;
       BackgroundWake uBackgroundW = this;
       String obj = p0;
       String str = "pkg";
       a.p(obj, str);
       String str1 = "";
       if (TextUtils.isEmpty(uBackgroundW.e)) {
          Objects.requireNonNull(f.d);
          a = f.a;
          if (a != null) {
             a = a.b;
             if (a != null) {
             label_0022 :
                uBackgroundW.e = a;
             }
          }
          obj1 = str1;
          goto label_0022 ;
       }
       String packageName = this.g().getPackageName();
       String str2 = "appContext.packageName";
       a.o(packageName, str2);
       BackgroundWake e = uBackgroundW.e;
       Objects.requireNonNull(g.a);
       a.p(packageName, str);
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0(str, packageName);
       packageName = (e == null || !e.length())? 1: null;
       if (packageName) {
          e = str1;
       }
       jsonObject.c0("did", e);
       jsonObject.c0("uuid", UUID.randomUUID().toString());
       String str3 = "timestamp";
       jsonObject.c0(str3, String.valueOf(System.currentTimeMillis()));
       packageName = jsonObject.toString();
       a.o(packageName, "JsonObject\(\).apply {\n   ¡­llis\(\)\)\)\n    }.toString\(\)");
       obj1 = uBackgroundW.f.getValue().get(obj);
       if (obj1 != null) {
          obj = "sessionId";
          a.p(packageName, obj);
          String str4 = "pkgModel";
          a.p(obj1, str4);
          k a1 = k.a;
          a c = uBackgroundW.c;
          Objects.requireNonNull(a1);
          a.p(packageName, obj);
          JsonObject jsonObject1 = new JsonObject();
          String str5 = "unknown";
          pkg = obj1.getPkg();
          if (pkg == null) {
             pkg = str5;
          }
          jsonObject1.c0(str, pkg);
          jsonObject1.c0("session_id", packageName);
          String str6 = "20002";
          jsonObject1.c0("sdk_version_code", str6);
          String str7 = "sdk_version_name";
          String str8 = str2;
          jsonObject1.c0(str7, "2.0.2");
          jsonObject1.c0(str3, String.valueOf(System.currentTimeMillis()));
          String str9 = str3;
          str3 = "sdk_version_code";
          p0 = "2.0.2";
          str2 = "session_id";
          b$a.a(a.b.a(), c, "MATRIX_DO_START_V2", jsonObject1, 0, 8, null);
          if (!obj1.getEnable()) {
             a1.b(uBackgroundW.c, packageName, null, obj1, null, "app not enabled", "app not enabled");
          }else {
             a c1 = uBackgroundW.c;
             pkg = obj1.getPkg();
             if (pkg == null || str1.equals(pkg)) {
                b = false;
             }else {
                try{
                   c1.getPackageManager().getPackageInfo(pkg, 0);
                   b = true;
                }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                }catch(java.lang.RuntimeException e0){
                }
             }
          }
       }
    }
}
