package com.yxcorp.gifshow.webview.yoda.utils.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kwai.framework.location.k;
import java.lang.System;
import java.lang.Integer;
import android.app.Activity;
import u07.u;
import lnc.a1;
import ryc.d;
import java.lang.Runnable;
import ekd.k1;

public class a	// class@0017c9
{
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;
    public static int d = 65136;
    public static int e = 65135;
    public static int f = 65134;

    public void a(){
       super();
    }
    public static String a(String p0,String p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          p0 = "default";
       }else {
          obj = new Object[]{p0,p1};
          p0 = String.format("yoda_bridge_authorization_%s_%s", obj);
       }
       return p0;
    }
    public static boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k.a(p0);
    }
    public static boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((System.currentTimeMillis() - k.b(p0)) - 0xa4cb800 < 0)? true: false;
       return b;
    }
    public static boolean d(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (a.b(p0)) {
          return false;
       }else if(p1 == a.a){
          return true;
       }else if(p1 == a.c){
          return false;
       }else if(p1 == a.b){
          return (a.c(p0) ^ true);
       }else {
          return false;
       }
    }
    public static void e(Activity p0,String p1,String p2,u p3,u p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoa, "3")) {
             return;
          }
       }
       if (TextUtils.x(p1)) {
          p1 = PatchProxy.apply(null, null, k.class, "7");
          if (p1 != PatchProxyResult.class) {
          }else {
             p1 = a1.p(k.a);
          }
       }
       Object obj = p1;
       if (TextUtils.x(p2)) {
          p1 = PatchProxy.apply(null, null, k.class, "8");
          if (p1 != PatchProxyResult.class) {
          }else {
             p1 = a1.p(k.b);
          }
          p2 = p1;
       }
       d uod = new d(p0, obj, p2, p4, p3);
       k1.o(p1);
       return;
    }
}
