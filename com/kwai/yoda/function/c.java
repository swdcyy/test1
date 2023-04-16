package com.kwai.yoda.function.c;
import com.kwai.yoda.function.a;
import ny7.a;
import java.lang.String;
import com.kwai.yoda.kernel.container.YodaWebView;
import ny7.c;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import yz7.e;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import com.kwai.yoda.bridge.InvokeContextCompatHelper;
import rx7.a;
import rx7.a$a;
import ty7.c;
import ty7.g;
import ty7.d;
import nz7.e;
import java.lang.Integer;
import ca7.u;
import erd.g;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import ca7.f;
import com.google.gson.Gson;
import brd.z;
import io.reactivex.android.schedulers.a;
import lrd.b;
import ay7.b;
import ay7.c;

public abstract class c extends a implements a	// class@0011cc
{
    public long c;
    public String d;
    public a e;

    public void c(){
       super();
    }
    public void b(long p0){
       this.c = p0;
    }
    public String c(){
       return "";
    }
    public String d(){
       return "";
    }
    public Object e(YodaWebView p0,c p1){
       return null;
    }
    public boolean h(){
       return false;
    }
    public void k(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c te = this.e;
       if (te == null || te.isDisposed()) {
          this.e = new a();
       }
       this.e.c(p0);
       return;
    }
    public void l(YodaBaseWebView p0,FunctionResultParams p1,String p2,String p3,String p4,String p5){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             return;
          }
       }
       this.m(p0, e.f(p1), p2, p3, p4, p5);
       return;
    }
    public void m(YodaBaseWebView p0,String p1,String p2,String p3,String p4,String p5){
       c uoc = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       c uoc1 = c.class;
       if (PatchProxy.isSupport(uoc1)) {
          Object[] objArray = new Object[]{p0,oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, this, uoc1, "6")) {
             return;
          }
       }
       a uoa = p0.getJavascriptBridge().t().a(oobject4);
       if (uoa == null) {
          uoa = a.r.a(p2, p3, "", p5, uoc.c);
       }
       if (p0.getDebugKit() != null) {
          p0.getDebugKit().a(new g(oobject1, oobject2, uoc.d, oobject));
       }
       p0.getJavascriptBridge().q(oobject4, oobject, uoa);
       p0.getSessionLogger().t(uoa, Integer.valueOf(1), oobject3, null);
       uoa.d();
       this.n();
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c te = this.e;
       if (te != null && !te.isDisposed()) {
          this.e.dispose();
       }
       return;
    }
    public void o(YodaBaseWebView p0,String p1,String p2,int p3,String p4,String p5){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
             return;
          }
       }
       FunctionResultParams uFunctionRes = new FunctionResultParams();
       uFunctionRes.mResult = p3;
       uFunctionRes.mMessage = p4;
       this.l(p0, uFunctionRes, p1, p2, u.a(p4), p5);
       return;
    }
    public void p(YodaBaseWebView p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "3")) {
          return;
       }
       FunctionResultParams uFunctionRes = new FunctionResultParams();
       uFunctionRes.mResult = 1;
       this.l(p0, uFunctionRes, p1, p2, null, p3);
       return;
    }
    public t q(YodaBaseWebView p0,String p1,Class p2,g p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return t.just(f.b.h(p1, p2)).doOnNext(p3).subscribeOn(a.c()).observeOn(b.c());
    }
    public b r(YodaBaseWebView p0,String p1,String p2,String p3,t p4){
       Object obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, uoc, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       c uoc1 = this;
       YodaBaseWebView yodaBaseWebV = p0;
       String str = p1;
       String str1 = p2;
       String str2 = p3;
       b uob = new b(uoc1, yodaBaseWebV, str, str1, str2);
       c uoc2 = new c(uoc1, yodaBaseWebV, str, str1, str2);
       return p4.subscribe(obj, v7);
    }
}
