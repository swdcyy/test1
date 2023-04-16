package com.kwai.framework.deviceid.h;
import java.lang.Object;
import android.content.Context;
import h30.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.deviceid.i;
import t30.d;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.StringBuilder;
import android.net.Uri;
import com.kuaishou.dfp.c.d;
import t30.e;
import java.util.List;
import android.content.ContentResolver;
import android.database.ContentObserver;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.Boolean;
import km8.b;
import android.content.SharedPreferences;
import i30.c0;
import qe6.b;
import com.kwai.framework.deviceid.h$c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.r;
import android.content.SharedPreferences$Editor;
import oe6.g;
import i66.a;
import e66.c;
import q87.c;
import o56.d;
import com.kwai.framework.deviceid.b;
import com.kwai.framework.deviceid.c;
import com.kwai.framework.deviceid.d;
import com.kuaishou.dfp.hostproxy.DfpDidProxy;
import com.kuaishou.dfp.hostproxy.DfpDidTagProxy;
import com.kuaishou.dfp.hostproxy.DfpODidProxy;
import com.kwai.framework.deviceid.h$a;
import i30.t;
import r30.d;
import i30.w;
import com.kuaishou.dfp.ResponseDidCallback;
import r30.a;
import java.lang.Throwable;
import o56.c;
import com.kwai.framework.deviceid.i$a;
import a35.a;
import oe6.a;
import android.os.Build;
import rkd.b;
import android.os.Build$VERSION;
import java.lang.System;
import com.google.protobuf.nano.MessageNano;
import com.kwai.framework.deviceid.h$b;
import h30.b;
import java.lang.Number;
import ekd.a0;

public class h	// class@000b3d
{
    public static long a = 0xff;

    public void h(){
       super();
    }
    public static void a(Context p0){
       int i;
       boolean b;
       d obj1;
       String str2;
       h$c uoc;
       h$c b3;
       boolean b4;
       Object obj = p0;
       h oh = h.class;
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(obj, null, oh, str)) {
          return;
       }
       i oi = i.class;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoidOneRefs(obj, null, oh, "3")) {
          String str1 = "23";
          i = 1;
          if (!PatchProxy.applyVoidOneRefs(obj, null, a.class, str1)) {
             obj1 = d.b();
             Objects.requireNonNull(obj1);
             if (!PatchProxy.applyVoidOneRefs(obj, obj1, uod, "1")) {
                obj1.a = obj;
                obj1.c = Uri.parse("content://"+obj1.a.getPackageName()+".DfpBridgeContentProvider");
             }
             obj1 = d.b();
             Objects.requireNonNull(obj1);
             if (!PatchProxy.applyVoid(null, obj1, uod, str) && !(obj1.a.getPackageName()).equals(d.b())) {
                obj1.a.getContentResolver().registerContentObserver(obj1.c, i, new e(obj1.b));
             }
          }
       label_0090 :
          b = SystemUtil.L(a.B);
          if (PatchProxy.isSupport(oh) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, oh, "13") && b)) {
             c0.c = b.b("DefaultPreferenceHelper");
          }
          obj1 = PatchProxy.applyOneRefs(obj, null, a.class, "25");
          int b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): d.F(p0);
          b1 = b1 ^ i;
          boolean b2 = b.a();
          h.e(b, b2, b1);
          if (PatchProxy.isSupport(oh)) {
             str2 = PatchProxy.applyTwoRefs(Boolean.valueOf(b), Boolean.valueOf(b1), null, oh, "14");
             if (str2 != patchProxyRe) {
             }else if(!b){
                str2 = i.h();
             }else if(b1){
                str2 = i.h();
             }else {
                str1 = PatchProxy.apply(null, null, oi, str1);
                if (str1 != patchProxyRe) {
                }else {
                   str1 = "ANDROID_"+i.a();
                }
                str2 = str1;
             }
          }else {
             goto label_00eb ;
          }
          a.f = str2;
          if (PatchProxy.isSupport(oh)) {
             uoc = PatchProxy.applyThreeRefs(Boolean.valueOf(b), Boolean.valueOf(b2), Boolean.valueOf(b1), null, h.class, "15");
             if (uoc != patchProxyRe) {
             label_01b6 :
                a.a = uoc.a;
                b3 = uoc.b;
                a.c = b3;
                r.b(a.a, b3);
                if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), Boolean.valueOf(b2), Boolean.valueOf(b1), null, h.class, "16")) {
                   if (b) {
                      i.r(a.a, a.c);
                      String f = a.f;
                      if (!PatchProxy.applyVoidOneRefs(f, null, oi, "13") && !TextUtils.x(f)) {
                         if (f.startsWith("ANDROID_")) {
                            f = f.substring(8);
                         }
                         b4 = 0;
                         g.a(b.c("gifshow", b4).edit().putString("random_android_id", f));
                      }else {
                         b4 = false;
                      }
                      h.g(b4);
                   }else {
                      a uoa1 = new a(b1);
                      if (!PatchProxy.applyVoidOneRefs(uoa1, null, a.class, "24")) {
                         d uod1 = d.b();
                         Objects.requireNonNull(uod1);
                         if (!PatchProxy.applyVoidOneRefs(uoa1, uod1, uod, "2")) {
                            uod1 = uod1.b;
                            if (uod1 != null) {
                               uod1.add(uoa1);
                            }
                         }
                      }
                   }
                }
                h.d(b, b2, b1);
             }
          }
          b3 = new h$c(a.a, a.c);
          if (b) {
             str1 = -1;
             if (b2 && b1) {
                b3 = h.f();
                if (TextUtils.x(b3.a) || b3.b == str1) {
                   b3.a = i.f();
                   b3.b = 1;
                }
             }else if(b2){
                b3.a = i.f();
                b3.b = 6;
             }else if(b1){
                b3 = h.f();
                if (TextUtils.x(b3.a)) {
                   b3.a = a.f;
                   b3.b = str1;
                }
             }else {
                b3.a = a.f;
                b3.b = str1;
             }
          }else {
             b3 = h.f();
             if (b2) {
                if (TextUtils.x(b3.a)) {
                   b3.a = i.f();
                   b3.b = -3;
                }
             }else if(TextUtils.x(b3.a)){
                b3.a = a.f;
                b3.b = -4;
             }
          }
          uoc = b3;
          goto label_01b6 ;
       }
       a.d = a.c;
       a.e = a.a;
       if (SystemUtil.L(a.B)) {
          if (h.h()) {
             Object[] objArray = new Object[0];
             c.C().w("CloudUtil", "xiaomi channel ComplianceMode", objArray);
             a.h();
          }
          a.a = d.h;
          a.e(p0, a.x, b.a, c.a, d.a, a.f, b.a());
          h$a uoa = new h$a();
          if (!PatchProxy.applyVoidOneRefs(uoa, null, a.class, "16")) {
             t ot = t.c();
             Objects.requireNonNull(ot);
             if (!PatchProxy.applyVoidOneRefs(uoa, ot, t.class, "9")) {
                d.a().b(new w(ot, uoa));
             }
          }
       }
    label_02c4 :
       return;
    }
    public static boolean b(Context p0){
       p0 = PatchProxy.applyOneRefs(p0, null, h.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (a.a().c() && !TextUtils.x(i$a.a())) {
          return false;
       }
       return true;
    }
    public static void c(String p0){
       Object[] objArray = new Object[0];
       c.C().w("CloudUtil", "cloud sendIdMappingData start", objArray);
       a uoa = new a();
       uoa.a = TextUtils.k(a.a);
       uoa.b = TextUtils.k(String.valueOf(a.c));
       uoa.c = TextUtils.k(a.e);
       uoa.d = TextUtils.k(String.valueOf(a.d));
       uoa.e = TextUtils.k(a.f);
       uoa.f = TextUtils.k(a.b);
       if (!TextUtils.x(p0)) {
          uoa.g = TextUtils.k(a.b(p0));
       }
       uoa.h = TextUtils.k(a.x);
       uoa.i = TextUtils.k(a.j());
       uoa.j = TextUtils.k(a.m);
       uoa.k = TextUtils.k(Build.BRAND);
       uoa.l = TextUtils.k(Build.MODEL);
       p0 = (b.f())? "ANDROID_PAD": "ANDROID_PHONE";
       uoa.m = p0;
       uoa.n = TextUtils.k(String.valueOf(Build$VERSION.SDK_INT));
       uoa.o = System.currentTimeMillis();
       a.g(MessageNano.toByteArray(uoa), new h$b(), true);
       return;
    }
    public static void d(boolean p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), null, h.class, "12")) {
          return;
       }
       h.e(p0, p1, p2);
       Object[] objArray = new Object[0];
       c.C().w("CloudUtil", "AppEnv.DEVICE_ID="+a.a+" AppEnv.CLOUD_ID_TAG="+a.c+" AppEnv.RANDOM_DEVICE_ID="+a.f+" AppEnv.O_DID="+a.b, objArray);
       return;
    }
    public static void e(boolean p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), null, h.class, "11")) {
          return;
       }
       c uoc = c.C();
       StringBuilder str = "进程：";
       String str1 = (p0)? "主进程": "子进程";
       str1 = ", ";
       str = str+str1+str1;
       String str2 = (p1)? "同意隐私条款": "不同意隐私条款";
       str = str+str2+str1;
       str1 = (p2)? "正常设备": "克隆设备";
       Object[] objArray = new Object[0];
       uoc.w("CloudUtil", str+str1, objArray);
       return;
    }
    public static h$c f(){
       int i;
       int i1;
       i oi = i.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, h.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = PatchProxy.apply(objArray, objArray, oi, "17");
       i = 0;
       String str1 = "gifshow";
       if (str != patchProxyRe) {
       }else {
          str = b.c(str1, i).getString("android_c_id_10560", "");
          Object[] objArray2 = new Object[i];
          c.C().w("DeviceIdManager", "readCloundAndroidId cloudDid = "+str, objArray2);
       }
       Object obj1 = PatchProxy.apply(objArray, objArray, oi, "19");
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else {
          i1 = b.c(str1, i).getInt("android_c_id_tag_10560", -1);
          Object[] objArray1 = new Object[i];
          c.C().w("DeviceIdManager", "readCloundDidTag cloudDidTag = "+i1, objArray1);
       }
       return new h$c(str, i1);
    }
    public static void g(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, oh, "5")) {
          return;
       }
       if (p0 || TextUtils.x(a.i)) {
          a.i = a0.c(a.a+"kwai.com");
       }
       return;
    }
    public static boolean h(){
       Object obj = PatchProxy.apply(null, null, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!b.a() && (a.k).equalsIgnoreCase("xiaomi")) {
          return true;
       }
       return false;
    }
}
