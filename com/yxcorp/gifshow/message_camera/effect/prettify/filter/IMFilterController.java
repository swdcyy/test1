package com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import fib.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$a;
import nsd.u;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$sdkAdapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$faceMagicLoadEffectFailedListener$2;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$filterDataManager$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import ui9.j;
import crd.b;
import lnc.b9;
import cib.a;
import dc5.c;
import iib.d;
import com.yxcorp.gifshow.prettify.filter.repo.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$sdkAdapter$2$a;
import b1c.e;
import d1c.c;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import iib.a;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import iib.b;
import iib.c;
import erd.g;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Boolean;
import b1c.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import java.lang.System;
import t16.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$b;
import j16.b;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$c;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$d;

public class IMFilterController implements c	// class@001dcc
{
    public j a;
    public b b;
    public b c;
    public final p d;
    public final p e;
    public final p f;
    public final FilterStateManager g;
    public static final FilterVideoPlugin$FilterEntranceType h;
    public static final IMFilterController$a i;

    static {
       IMFilterController.i = new IMFilterController$a(null);
       IMFilterController.h = FilterVideoPlugin$FilterEntranceType.IM_CHAT;
    }
    public void IMFilterController(FilterStateManager p0){
       a.p(p0, "stateManager");
       super();
       this.g = p0;
       this.d = s.c(new IMFilterController$sdkAdapter$2(this));
       this.e = s.c(new IMFilterController$faceMagicLoadEffectFailedListener$2(this));
       this.f = s.c(IMFilterController$filterDataManager$2.INSTANCE);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, IMFilterController.class, "5")) {
          return;
       }
       IMFilterController ta = this.a;
       if (ta != null) {
          ta.n0(this.c());
       }
       b9.a(this.b);
       b9.a(this.c);
       this.a = null;
       return;
    }
    public void b(j p0){
       IMFilterController iMFilterCont = IMFilterController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, iMFilterCont, "4")) {
          return;
       }
       if (!a.c()) {
          c.g("IMFilterController", "bindImageHelper isFilterEnabled false ");
          return;
       }else {
          this.a = p0;
          this.d().init();
          IMFilterController ta = this.a;
          if (ta != null) {
             ta.A0(this.c());
          }
          ta = this.g;
          Object[] objArray = null;
          IMFilterController$sdkAdapter$2$a osdkAdapter$ = PatchProxy.apply(objArray, this, iMFilterCont, "1");
          if (osdkAdapter$ == PatchProxyResult.class) {
             osdkAdapter$ = this.d.getValue();
          }
          ta.p(osdkAdapter$);
          this.g.o(this.d());
          if (!PatchProxy.applyVoid(objArray, this, iMFilterCont, "9")) {
             if (Filters.hasFilterConfigs(IMFilterController.h)) {
                if (!PatchProxy.applyVoid(objArray, this, iMFilterCont, "10")) {
                   b9.a(this.b);
                   b9.a(this.c);
                   this.b = t.fromCallable(new a(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new b(this), c.b);
                }
             }else {
                this.g();
             }
          }
          return;
       }
    }
    public final FaceMagicController$FaceMagicLoadEffectFailedListener c(){
       Object obj = PatchProxy.apply(null, this, IMFilterController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final d d(){
       Object obj = PatchProxy.apply(null, this, IMFilterController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final void e(FilterConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMFilterController.class, "14")) {
          return;
       }
       this.g.j(p0);
       return;
    }
    public final void f(){
       IMFilterController iMFilterCont = IMFilterController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, iMFilterCont, "12")) {
          return;
       }
       String str = "IMFilterController";
       if (this.a == null) {
          c.g(str, "helper not ready");
          return;
       }else {
          FilterConfig obj = PatchProxy.apply(objArray, this, iMFilterCont, "16");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): this.g.f().d();
          if (b) {
             c.g(str, "restoreLastFilterConfig isFeatureDisable true");
             return;
          }else {
             c.g(str, "[filter][keypath][data]  did receive data");
             obj = (this.d().w() && this.d().f() != null)? this.d().f(): this.d().p();
             StringBuilder str1 = "[filter][keypath][userSettings]  ";
             if (obj != null) {
                objArray = obj.toSimpleString();
             }
             c.g(str, str1+objArray);
             if (obj != null && !n.l(obj)) {
                c.g(str, "FilterResExist is not exist 无法直接应用返回");
                n.f(new a("record", "inner_resource"), obj, new IMFilterController$b(obj, System.currentTimeMillis(), this));
                return;
             }else if(obj != null){
                obj = FilterConfig.getEmpty();
             }
             a.o(obj, "userFilter ?: FilterConfig.getEmpty\(\)");
             this.e(obj);
             return;
          }
       }
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, IMFilterController.class, "11")) {
          return;
       }
       c.g("IMFilterController", "updateFilterConfigAndRestore");
       this.c = Filters.updateFilterConfig(IMFilterController.h).subscribeOn(d.c).observeOn(d.a).subscribe(new IMFilterController$c(this), IMFilterController$d.b);
       return;
    }
}
