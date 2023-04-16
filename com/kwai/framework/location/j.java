package com.kwai.framework.location.j;
import com.kwai.framework.location.c;
import ok.x;
import com.google.common.base.Suppliers;
import com.kwai.framework.location.e;
import java.lang.Object;
import o96.f0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.ConcurrentHashMap;
import t96.a;
import p96.a;
import q87.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import o96.g0;
import java.lang.reflect.Type;
import e66.e;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kwai.framework.location.k;
import android.app.Activity;
import android.content.Intent;
import java.lang.StringBuilder;
import com.kwai.framework.location.d;
import java.lang.Runnable;
import ekd.k1;
import u07.u;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import o96.x;

public final class j	// class@000b82
{
    public static final x a;
    public static final x b;

    static {
       j.a = Suppliers.a(c.b);
       j.b = Suppliers.a(e.b);
    }
    public void j(){
       super();
    }
    public static f0 a(boolean p0,int p1){
       f0 obj;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), null, oj, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new f0("android.permission.ACCESS_FINE_LOCATION", p0);
       obj.d = p1;
       return obj;
    }
    public static a b(String p0,ConcurrentHashMap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, j.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          a uoa = p1.get(p0);
          if (uoa != null) {
             return uoa;
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.C().w("ks.location.log:SDK:Dialog", "[getDialogShowModel] get show model error!!!", objArray);
       }
       return new a();
    }
    public static boolean c(String p0){
       a uoa = null;
       ConcurrentHashMap obj = PatchProxy.applyOneRefs(p0, uoa, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          p0 = "IGNORE_FEATURE_KEY";
       }
       obj = e.b(g0.e);
       if (obj != null) {
          uoa = j.b(p0, obj);
       }
       if (uoa != null) {
          return uoa.a;
       }else {
          return false;
       }
    }
    public static boolean d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (PermissionUtils.a(p0, "android.permission.ACCESS_FINE_LOCATION") || PermissionUtils.a(p0, "android.permission.ACCESS_COARSE_LOCATION"))? true: false;
       return b;
    }
    public static boolean e(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, oj, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object obj1 = PatchProxy.apply(objArray, objArray, oj, "16");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(j.a.get().booleanValue() || j.b.get().booleanValue()){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1 && !k.f()) {
          b = true;
       }
       return b;
    }
    public static void f(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, j.class, "12")) {
          return;
       }
       try{
          p0.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
       }catch(android.content.ActivityNotFoundException e0){
          Object[] objArray = new Object[0];
          a.C().w("ks.location.log:SDK:Dialog", "[openGPSSettings] location service request activity not found!!!", objArray);
       }
       return;
    }
    public static void g(String p0,ConcurrentHashMap p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, j.class, "3")) {
          return;
       }
       p1.put(p0, p2);
       e.d(p1);
       Object[] objArray = new Object[0];
       a.C().w("ks.location.log:SDK:Dialog", "[saveDialogModel] alert save featureKey :"+p0+" "+p2.toString(), objArray);
       return;
    }
    public static void h(Activity p0,String p1,String p2,boolean p3,String p4,String p5){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, null, oj, "14")) {
             return;
          }
       }
       j.i(p0, p1, p2, p3, p4, p5, -1);
       return;
    }
    public static void i(Activity p0,String p1,String p2,boolean p3,String p4,String p5,int p6){
       j oj = j.class;
       int i = 0;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4,p5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, oj, "15")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       a.C().w("ks.location.log:SDK:Dialog", "[gps dialog] jump GPSSetting  | featureKey = "+p1, objArray1);
       d uod = new d(p1, p2, p4, p5, p6, p0);
       k1.o(v7);
       return;
    }
    public static void j(Activity p0,String p1,String p2,String p3,String p4,String p5,u p6,u p7,PopupInterface$h p8){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, oj, "4")) {
             return;
          }
       }
       x ox = new x(p0, p2, p3, p4, p5, p7, p6, p1, p8);
       k1.o(oj);
       return;
    }
}
