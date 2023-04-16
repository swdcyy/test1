package com.yxcorp.gifshow.HomeSpeedInitModule;
import com.kwai.framework.init.HomeCreateInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import fs7.a;
import com.yxcorp.gifshow.q;
import java.lang.Runnable;
import t45.c;
import android.app.Activity;
import lwb.b;
import wkd.b;
import sa5.b;
import java.util.Objects;
import java.util.Map;
import ea5.d;
import android.util.SparseArray;
import lwb.a;
import xf7.a;
import java.util.concurrent.ConcurrentHashMap;
import android.os.Bundle;
import uv8.s0;
import java.lang.ref.WeakReference;
import uv8.t0;
import com.kwai.framework.init.e;
import uv8.u0;
import com.kwai.framework.init.c;
import uv8.v0;
import uv8.w0;
import ekd.k1;
import com.yxcorp.gifshow.p;

public class HomeSpeedInitModule extends HomeCreateInitModule	// class@0012ef
{
    public boolean q;
    public WeakReference r;
    public static final int s;

    public void HomeSpeedInitModule(){
       super();
    }
    public boolean C(){
       return false;
    }
    public int f0(){
       return 5;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, HomeSpeedInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, HomeSpeedInitModule.class, "3")) {
          return;
       }
       if (a.a && a.b == 1) {
          c.a(q.b);
       }
       return;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeSpeedInitModule.class, "8")) {
          return;
       }
       Object[] objArray = null;
       String str = "2";
       if (!PatchProxy.applyVoid(objArray, objArray, b.class, str)) {
          b uob = b.a(-1519540672);
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoid(objArray, uob, b.class, str)) {
             uob.a.clear();
          }
          d uod = b.a(0x15ea63e);
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoid(objArray, uod, d.class, "6")) {
             uod.a.clear();
             d.c.clear();
             d.d.clear();
          }
       }
       a.b();
       a.a.clear();
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeSpeedInitModule.class, "2")) {
          return;
       }
       if (this.q == null) {
          this.q = true;
          a.a(new s0(p0));
       }
       this.r = new WeakReference(p0);
       if (!PatchProxy.applyVoid(null, this, HomeSpeedInitModule.class, "4")) {
          String str = "HomeSpeedInitModule";
          e.d(new t0(this), str);
          c.c(new u0(this));
          HomeSpeedInitModule tr = this.r;
          if (!PatchProxy.applyVoidOneRefs(tr, this, HomeSpeedInitModule.class, "7")) {
             e.d(new v0(tr), str);
          }
          tr = this.r;
          if (!PatchProxy.applyVoidOneRefs(tr, this, HomeSpeedInitModule.class, "5")) {
             k1.o(new w0(tr));
          }
       }
       if (a.a && a.b == 2) {
          c.a(p.b);
       }
       return;
    }
    public void n(){
    }
}
