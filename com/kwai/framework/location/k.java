package com.kwai.framework.location.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.location.j;
import java.lang.Number;
import o96.g0;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import e66.e;
import t96.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o56.c;
import com.yxcorp.utility.SystemUtil;
import android.location.LocationManager;
import vb6.a;
import java.lang.Long;

public class k	// class@000b83
{
    public static final int a = 2131774092;
    public static final int b = 2131767380;
    public static final int c = 2131757026;
    public static final int d = 2131767369;

    public void k(){
       super();
    }
    public static boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return j.c(p0);
    }
    public static long b(String p0){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = null;
       Object obj = PatchProxy.applyOneRefs(p0, uoa, k.class, "4");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = PatchProxy.applyOneRefs(p0, uoa, j.class, "7");
       if (obj != patchProxyRe) {
          l = obj.longValue();
       }else {
          ConcurrentHashMap uConcurrentH = e.b(g0.e);
          if (uConcurrentH != null) {
             uoa = j.b(p0, uConcurrentH);
          }
          if (uoa != null) {
             l = uoa.b;
          }else {
             l = 0;
          }
       }
       return l;
    }
    public static boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (j.c(p0) && j.d(a.b()))? true: false;
       return b;
    }
    public static boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          boolean b1 = (!TextUtils.x(p0))? k.c(p0): k.e(a.a().f());
          if (SystemUtil.a(21)) {
             if (k.f() && b1) {
                b = true;
             }
             return b;
          }else {
             return b1;
          }
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static boolean e(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return j.d(p0);
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, k.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          LocationManager systemServic = a.a().f().getSystemService("location");
          if (systemServic != null && systemServic.isProviderEnabled("gps")) {
             b = true;
          }
       label_0030 :
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static void g(String p0,boolean p1){
       a uoa;
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ok, "3")) {
          return;
       }
       a.a(p0, p1);
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oj, "10")) {
          ConcurrentHashMap uConcurrentH = e.b(g0.e);
          if (uConcurrentH != null) {
             uoa = j.b(p0, uConcurrentH);
          }else {
             uConcurrentH = new ConcurrentHashMap();
             uoa = new a();
          }
          uoa.a = p1;
          j.g(p0, uConcurrentH, uoa);
       }
       return;
    }
    public static void h(String p0,long p1){
       a uoa;
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, ok, "5")) {
          return;
       }
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, oj, "8")) {
          ConcurrentHashMap uConcurrentH = e.b(g0.e);
          if (uConcurrentH != null) {
             uoa = j.b(p0, uConcurrentH);
          }else {
             uConcurrentH = new ConcurrentHashMap();
             uoa = new a();
          }
          uoa.b = p1;
          j.g(p0, uConcurrentH, uoa);
       }
       return;
    }
}
