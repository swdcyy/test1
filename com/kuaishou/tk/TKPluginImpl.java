package com.kuaishou.tk.TKPluginImpl;
import rx4.i;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.view.ViewGroup;
import brd.a0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.tachikoma.api.g;
import java.util.Objects;
import fx4.b;
import com.kuaishou.tk.a;
import erd.o;
import zu6.b;
import com.kuaishou.tachikoma.api.TachikomaBundleApi;
import java.lang.Number;
import lp8.b;
import lp8.c;
import km8.b;
import android.content.SharedPreferences;
import java.lang.Throwable;
import tx4.w;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import a00.a;
import bx4.b;
import sx4.d;
import i00.e;
import qx4.f;
import tw4.t;
import java.util.List;
import tx4.f;
import com.kuaishou.commercial.tach.container.KwaiTKContainer;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$b;
import kotlin.jvm.internal.a;
import zp8.a;
import java.util.Iterator;
import java.lang.Integer;
import com.kuaishou.commercial.tach.container.a;
import tw4.o;
import wp8.a;
import android.graphics.drawable.BitmapDrawable;
import qo8.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import com.tachikoma.core.debug.c;
import java.lang.reflect.Method;
import dx4.a;
import java.util.HashMap;
import qx4.a;
import com.kwai.component.logging.controller.KsLogConfig;
import hc5.a;
import xz.a;
import xz.a$a;
import zb6.d;
import java.util.Map;
import tkd.b;
import com.tachikoma.core.utility.f;
import android.app.Activity;
import rx4.a;
import qx4.e;
import android.widget.TextView;
import wo8.b;

public class TKPluginImpl implements i	// class@000f87
{
    public boolean b;
    public WeakReference c;

    public void TKPluginImpl(){
       super();
       this.b = false;
       this.c = null;
    }
    public void TKPluginImpl(boolean p0){
       super();
       this.b = false;
       this.c = null;
       this.b = p0;
    }
    public a0 Ca(Context p0,boolean p1,String p2,ViewGroup p3){
       object obj;
       a0 uoa0;
       if (PatchProxy.isSupport(TKPluginImpl.class)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, TKPluginImpl.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       g og = g.b();
       obj = null;
       Objects.requireNonNull(og);
       g og1 = g.class;
       if (PatchProxy.isSupport(og1)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,obj};
          uoa0 = PatchProxy.apply(objArray, og, og1, "9");
          if (uoa0 != PatchProxyResult.class) {
          label_005a :
             return uoa0.C(a.b);
          }
       }
       uoa0 = og.a(null, p0, p1, p2, p3, null);
       goto label_005a ;
    }
    public a0 F(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKPluginImpl.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TachikomaBundleApi.c().e(p0);
    }
    public long Hq(){
       Object obj = PatchProxy.apply(null, this, TKPluginImpl.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (g.b().c()) {
          return c.a().L3();
       }
       return b.c("tk_debug.xml", 0).getLong("tk_test_delay_load_tk_plugin", 0);
    }
    public void Jj(Throwable p0,w p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TKPluginImpl.class, "9")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       Log.d("TKPluginImpl", "handleTKNativeException: "+p1.b+", "+Log.f(p0));
       a.e(p0, p1, p2);
       return;
    }
    public boolean LE(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TKPluginImpl.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a().b(p0, p1);
    }
    public d O5(Context p0,boolean p1,String p2,ViewGroup p3){
       if (PatchProxy.isSupport(TKPluginImpl.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, TKPluginImpl.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e.c();
       return new f(g.b().e(p0, p1, p2, p3));
    }
    public void Oz(List p0,boolean p1,f p2){
       if (PatchProxy.isSupport(TKPluginImpl.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, TKPluginImpl.class, "1")) {
          return;
       }
       e.c();
       KwaiTKContainer$b u0 = KwaiTKContainer.U0;
       Objects.requireNonNull(u0);
       if (!PatchProxy.isSupport(KwaiTKContainer$b.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, u0, KwaiTKContainer$b.class, "4")) {
          a.p(p0, "bundleIdList");
          a.i("TKContainer", "asyncCompileBundleList");
          u0.c();
          if (!p0.isEmpty()) {
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                u0.a(iterator.next(), Integer.valueOf(-1), p1, new a(p2));
             }
          }
       }
       return;
    }
    public boolean S(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TachikomaBundleApi obj = PatchProxy.applyOneRefs(p0, this, TKPluginImpl.class, "22");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = TachikomaBundleApi.c();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, TachikomaBundleApi.class, "5");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          TachikomaBundleApi a = obj.a;
          if (a != null) {
             b = a.S(p0);
          }else {
             obj.h();
             b = false;
          }
       }
       return b;
    }
    public void aB(Throwable p0,int p1){
       TKPluginImpl tKPluginImpl = TKPluginImpl.class;
       if (PatchProxy.isSupport(tKPluginImpl) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, tKPluginImpl, "10")) {
          return;
       }
       Log.d("TKPluginImpl", "dispatchJSException: "+Log.f(p0));
       a.b(p0, p1);
       return;
    }
    public int aS(){
       Object obj = PatchProxy.apply(null, this, TKPluginImpl.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.h.a();
    }
    public BitmapDrawable b40(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyOneRefs(p0, this, TKPluginImpl.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = g.b();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, g.class, "16");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = PatchProxy.applyOneRefs(p0, null, f.class, "5");
          if (obj1 != patchProxyRe) {
          }else {
             p0 = f.d(p0);
             obj1 = (!TextUtils.isEmpty(p0))? f.c(p0): null;
          }
       }
       return obj1;
    }
    public JSONObject cy(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, TKPluginImpl.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = null;
       obj = PatchProxy.applyTwoRefs(p0, p1, obj1, c.class, "16");
       if (obj != patchProxyRe) {
          obj1 = obj;
       }else {
          try{
             Method g = c.g;
             if (g != null) {
                obj = new Object[]{p0,p1};
                obj1 = g.invoke(obj1, obj);
             }
          }catch(java.lang.Exception e5){
             e5.toString();
          }
       }
    }
    public long d5(){
       Object obj = PatchProxy.apply(null, this, TKPluginImpl.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.e().d();
    }
    public void ef(String p0,HashMap p1,String[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TKPluginImpl.class, "28")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "4")) {
          a.p(p2, "tags");
          a.d(a.b.a(), p2, p0, null, p1, null);
       }
       return;
    }
    public boolean ei(){
       Object obj = PatchProxy.apply(null, this, TKPluginImpl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.h.d();
    }
    public void g0(){
       if (PatchProxy.applyVoid(null, this, TKPluginImpl.class, "25")) {
          return;
       }
       TachikomaBundleApi.c().b();
       return;
    }
    public void iD(boolean p0){
       TKPluginImpl tKPluginImpl = TKPluginImpl.class;
       if (PatchProxy.isSupport(tKPluginImpl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKPluginImpl, "32")) {
          return;
       }
       c.a().a(p0);
       return;
    }
    public boolean ih(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, TKPluginImpl.class, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, a.class, "3");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.a.a();
       return b;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean isPluginMode(){
       return this.b;
    }
    public String j50(){
       Object obj = PatchProxy.apply(null, this, TKPluginImpl.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a();
    }
    public long k3(){
       Object obj = PatchProxy.apply(null, this, TKPluginImpl.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (g.b().c()) {
          return c.a().k3();
       }
       return b.c("tk_debug.xml", 0).getLong("tk_test_delay_load_v8_so", 0);
    }
    public boolean k4(){
       Object obj = PatchProxy.apply(null, this, TKPluginImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return g.b().c();
    }
    public w n(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TachikomaBundleApi obj = PatchProxy.applyOneRefs(p0, this, TKPluginImpl.class, "21");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = TachikomaBundleApi.c();
       Objects.requireNonNull(obj);
       w ow = PatchProxy.applyOneRefs(p0, obj, TachikomaBundleApi.class, "13");
       if (ow != patchProxyRe) {
       }else {
          TachikomaBundleApi a = obj.a;
          if (a == null) {
             obj.h();
             ow = null;
          }else {
             ow = a.n(p0);
          }
       }
       return ow;
    }
    public String nr(){
       return "0.9.26";
    }
    public void pf(String p0,HashMap p1,String[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TKPluginImpl.class, "27")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "5")) {
          a.p(p2, "tags");
          a.c(a.b.a(), p2, p0, null, p1, null);
       }
       return;
    }
    public a0 q0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKPluginImpl.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TachikomaBundleApi.c().f(p0);
    }
    public Map q6(){
       Object obj = PatchProxy.apply(null, this, TKPluginImpl.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.e().c();
    }
    public void sJ(String p0,Throwable p1,HashMap p2,String[] p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, TKPluginImpl.class, "29")) {
          return;
       }
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "3")) {
          a.p(p3, "tags");
          a.b(a.b.a(), p3, p0, p1, p2, null);
       }
       return;
    }
    public void setImpl(b p0){
    }
    public void vZ(String p0,HashMap p1,String[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TKPluginImpl.class, "26")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "2")) {
          a.p(p2, "tags");
          a.a(a.b.a(), p2, p0, null, p1, null);
       }
       return;
    }
    public int vs(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TKPluginImpl.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.a(p0, p1, p2);
    }
    public void wZ(String p0,int p1,boolean p2,f p3){
       if (PatchProxy.isSupport(TKPluginImpl.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), p3, this, TKPluginImpl.class, "2")) {
          return;
       }
       e.c();
       KwaiTKContainer$b u0 = KwaiTKContainer.U0;
       Integer integer = Integer.valueOf(p1);
       Objects.requireNonNull(u0);
       if (!PatchProxy.isSupport(KwaiTKContainer$b.class) || !PatchProxy.applyVoidFourRefs(p0, integer, Boolean.valueOf(p2), p3, u0, KwaiTKContainer$b.class, "3")) {
          a.p(p0, "bundleId");
          a.i("TKContainer", "asyncCompileBundle: "+p0);
          u0.c();
          u0.a(p0, integer, p2, p3);
       }
       return;
    }
    public a x40(Activity p0,ViewGroup p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, TKPluginImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e.c();
       return new e(p0, p1, p2, p3);
    }
    public long yO(){
       Object obj = PatchProxy.apply(null, this, TKPluginImpl.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.e().b();
    }
    public void yw(TextView p0,String p1,String p2,String p3,String p4){
       TKPluginImpl tKPluginImpl = TKPluginImpl.class;
       if (PatchProxy.isSupport(tKPluginImpl)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, tKPluginImpl, "12")) {
             return;
          }
       }
       b.a(p0, p1, p2, p3, p4);
       return;
    }
}
