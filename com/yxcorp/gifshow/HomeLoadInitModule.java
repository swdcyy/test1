package com.yxcorp.gifshow.HomeLoadInitModule;
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
import com.yxcorp.gifshow.l;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import android.app.Activity;
import mta.b;
import wkd.b;
import gg5.c;
import kta.f;
import java.util.Objects;
import crd.b;
import lnc.b9;
import b76.a;
import u9a.m;
import android.os.Bundle;
import java.lang.Boolean;
import android.content.Intent;
import ekd.j0;
import o56.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import tra.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import com.yxcorp.gifshow.util.rx.RxBus;
import fa5.f;
import brd.t;
import kta.a;
import erd.g;
import fa5.d;
import kta.b;
import fa5.e;
import kta.c;
import fa5.c;
import kta.d;
import fa5.b;
import kta.e;
import jb5.a;
import o56.d;
import com.yxcorp.gifshow.HomeLoadInitModule$a;
import hg5.a;
import nvb.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.component.realtime.tab.RealtimeTabRequester;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import jg5.c;
import xl9.a;
import cta.e;
import u9a.i;
import oua.a;
import fw8.r;
import com.yxcorp.gifshow.HomeLoadInitModule$b;
import fw8.r$a;
import vta.c;
import jsa.c;
import t45.d;
import brd.z;
import vta.b;
import com.yxcorp.gifshow.HomeLoadInitModule$c;
import oh5.a;
import oh5.a$a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import uv8.k0;
import com.yxcorp.gifshow.w;

public class HomeLoadInitModule extends HomeCreateInitModule	// class@0012ee
{

    public void HomeLoadInitModule(){
       super();
    }
    public boolean H7(){
       return true;
    }
    public int f0(){
       return 14;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, HomeLoadInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, HomeLoadInitModule.class, "7")) {
          return;
       }
       c.k(l.b);
       return;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLoadInitModule.class, "8")) {
          return;
       }
       b.a = false;
       b.a(-1471653231).reset();
       f uof = f.a();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(null, uof, f.class, "2")) {
          f a = uof.a;
          if (a != null) {
             b9.a(a);
             uof.a = null;
             b9.a(uof.b);
             uof.b = null;
             b9.a(uof.c);
             uof.c = null;
             b9.a(uof.d);
             uof.d = null;
             b9.a(uof.e);
             uof.e = null;
          }
       }
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLoadInitModule.class, "2")) {
          return;
       }
       b.a(0x3d51c18c).init();
       return;
    }
    public void l0(Activity p0,Bundle p1){
       boolean b;
       RxBus f;
       SharedPreferences a;
       Intent intent;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeLoadInitModule.class, "4")) {
          return;
       }
       p1 = PatchProxy.applyOneRefs(p0, this, HomeLoadInitModule.class, "5");
       String str = 1;
       if (p1 != PatchProxyResult.class) {
          b = p1.booleanValue();
       }else {
          intent = p0.getIntent();
          b = (intent != null && j0.a(intent, "EXTRA_KEY_START_FROM_CLEAR", false))? true: false;
       }
       if (b) {
          return;
       }else if(!PatchProxy.applyVoidOneRefs(p0, this, HomeLoadInitModule.class, "6") && TextUtils.equals(a.k, "TENCENTFEED_XJC")){
          a = a.a;
          String str1 = "xjc_opened";
          if (!a.getInt(str1, false)) {
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putInt(str1, str);
             g.a(uEditor);
             intent = b.a(0x66dce92a).a(p0, w0.f("kwai://tube/square"));
             if (intent != null) {
                p0.startActivity(intent);
             }
          }
       }
       f uof = f.a();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(null, uof, f.class, "1") && uof.a == null) {
          f = RxBus.f;
          uof.a = f.f(f.class).subscribe(new a(uof));
          uof.b = f.f(d.class).subscribe(new b(uof));
          uof.c = f.f(e.class).subscribe(new c(uof));
          uof.d = f.f(c.class).subscribe(new d(uof));
          uof.e = f.f(b.class).subscribe(new e(uof));
       }
       a.q = false;
       return;
    }
    public void n(){
       c a;
       FeedWolverinePerformanceHolder c;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, HomeLoadInitModule.class, str)) {
          return;
       }
       if (d.i) {
          int i = -1471653231;
          b.a(i).b(new HomeLoadInitModule$a(this));
          if (!a.a() || QCurrentUser.ME.isLogined()) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(new RealtimeTabRequester());
             RequestTiming cOLD_START = RequestTiming.COLD_START;
             uArrayList.add(d.a(-536296199).dS(cOLD_START));
             d.a(-1650306540).gW();
             b.a(i).e(cOLD_START, uArrayList, true);
          }
          b.a(-920422449).init();
          b.a(0x4c07ed1c).init();
          Objects.requireNonNull(a.a);
          r.c().a(new HomeLoadInitModule$b(this));
          a = c.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(objArray, a, c.class, str)) {
             RxBus.f.f(c.class).observeOn(d.a).subscribe(new b(a));
          }
          HomeLoadInitModule$c uoc = new HomeLoadInitModule$c(this);
          if (!PatchProxy.applyVoidOneRefs(uoc, objArray, a.class, "5")) {
             a$a c1 = a.c;
             Objects.requireNonNull(c1);
             if (!PatchProxy.applyVoidOneRefs(uoc, c1, a$a.class, str)) {
                a.p(uoc, "globalToastListener");
                a.b = uoc;
             }
          }
          c = FeedWolverinePerformanceHolder.c;
          Objects.requireNonNull(c);
          c.a(new k0(c));
          b.a(-1343064608).b0(b.a(i).a());
       }
       return;
    }
    public int priority(){
       return 0;
    }
}
