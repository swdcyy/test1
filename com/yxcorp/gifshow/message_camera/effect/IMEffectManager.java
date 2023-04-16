package com.yxcorp.gifshow.message_camera.effect.IMEffectManager;
import lw5.b;
import com.yxcorp.gifshow.message_camera.effect.IMEffectManager$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.message_camera.effect.IMEffectManager$effectStateManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.message_camera.effect.IMEffectManager$magicController$2;
import com.yxcorp.gifshow.message_camera.effect.IMEffectManager$beautyController$2;
import com.yxcorp.gifshow.message_camera.effect.IMEffectManager$makeupController$2;
import com.yxcorp.gifshow.message_camera.effect.IMEffectManager$filterController$2;
import java.util.concurrent.atomic.AtomicBoolean;
import mw5.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import bib.k;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import dib.e;
import ui9.j;
import java.util.Objects;
import cib.a;
import java.lang.StringBuilder;
import java.lang.Thread;
import kotlin.jvm.internal.a;
import lnc.s6;
import java.util.List;
import q0c.a;
import java.util.Collection;
import gib.b;
import r0c.i;
import r0c.h;
import u0c.a;
import h16.n;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import gib.a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController$b;
import h1c.e;
import h1c.c;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import com.yxcorp.gifshow.prettify.makeup.d;
import brd.t;
import t45.d;
import brd.z;
import jib.c;
import erd.g;
import jib.d;
import jib.e;
import crd.b;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import iib.d;
import com.yxcorp.gifshow.prettify.filter.repo.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$sdkAdapter$2$a;
import b1c.e;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import d1c.c;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import lnc.b9;
import iib.a;
import java.util.concurrent.Callable;
import iib.b;
import iib.c;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import java.lang.Boolean;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import pt7.a;
import kib.a;
import com.kwai.video.westeros.models.EffectType;
import eib.b;
import ui9.b;
import eib.c;
import ui9.c;
import eib.d;
import ui9.e;
import n0c.a;
import gib.c;
import gib.d;
import gib.e;
import gib.f;
import erd.o;
import gib.g;
import gib.h;
import gib.i;
import cib.b;
import cib.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import qrd.l1;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import eib.i;

public final class IMEffectManager implements b	// class@001d88
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public boolean f;
    public final AtomicBoolean g;
    public j h;
    public b i;
    public static final IMEffectManager$a j;

    static {
       IMEffectManager.j = new IMEffectManager$a(null);
    }
    public void IMEffectManager(){
       super();
       this.a = s.c(IMEffectManager$effectStateManager$2.INSTANCE);
       this.b = s.c(IMEffectManager$magicController$2.INSTANCE);
       this.c = s.c(new IMEffectManager$beautyController$2(this));
       this.d = s.c(new IMEffectManager$makeupController$2(this));
       this.e = s.c(new IMEffectManager$filterController$2(this));
       this.g = new AtomicBoolean(false);
    }
    public void a(e p0){
       e uoe;
       IMFilterController$sdkAdapter$2$a obj;
       IMFilterController a;
       List list;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "7";
       if (PatchProxy.applyVoidOneRefs(p0, this, IMEffectManager.class, str)) {
          return;
       }
       String str1 = "IMEffectManager";
       if (this.h != null) {
          c.g(str1, "bindEffect imageHelper has bind");
          return;
       }else if(this.g.get()){
          c.g(str1, "bindEffect is destroyed");
       }
       if (!p0 instanceof k) {
          p0 = null;
       }
       k e = (p0 != null)? p0.e: null;
       this.b().e = e;
       if (e != null) {
          uoe = PatchProxy.apply(null, e, e.class, str);
          if (uoe != patchProxyRe) {
          }else if(e.q != null){
             c.c("IMMagicSDK", "getImageHelper is invoked but has released, return null");
          label_0056 :
             uoe = null;
          }else {
             uoe = e.c;
          }
       }else {
          goto label_0056 ;
       }
       this.h = uoe;
       IMBeautyController iMBeautyCont = this.b();
       IMEffectManager th = this.h;
       Objects.requireNonNull(iMBeautyCont);
       IMBeautyController iMBeautyCont1 = IMBeautyController.class;
       String str2 = "3";
       if (!PatchProxy.applyVoidOneRefs(th, iMBeautyCont, iMBeautyCont1, str2)) {
          String str3 = "IMBeautyController";
          if (!a.a()) {
             c.g(str3, "bindImageHelper isBeautyEnabled false ");
          }else {
             Thread thread = Thread.currentThread();
             a.o(thread, "Thread.currentThread\(\)");
             c.g(str3, "bindImageHelper thread "+thread.getName());
             iMBeautyCont.a = th;
             if (!PatchProxy.applyVoid(null, iMBeautyCont, iMBeautyCont1, "9")) {
                if (s6.f()) {
                   list = a.d();
                   a.o(list, "BeautifyConfigHelper.getBeautifyBaseResourceList\(\)");
                   iMBeautyCont.h.addAll(list);
                   list = a.e();
                   a.o(list, "BeautifyConfigHelper.get¡­utifyExtendResourceList\(\)");
                   iMBeautyCont.i.addAll(list);
                   iMBeautyCont.g.addAll(iMBeautyCont.h);
                   iMBeautyCont.g.addAll(iMBeautyCont.i);
                }else {
                   list = a.c();
                   str3 = "BeautifyConfigHelper.getBeauifyResourceList\(\)";
                   a.o(list, str3);
                   iMBeautyCont.g.addAll(list);
                   list = a.c();
                   a.o(list, str3);
                   iMBeautyCont.h.addAll(list);
                }
                iMBeautyCont.k.g(new b(iMBeautyCont));
                a uoa = new a(iMBeautyCont.d());
                iMBeautyCont.f = uoa;
                iMBeautyCont.k.f(uoa);
             }
             n.a(iMBeautyCont.e());
             iMBeautyCont.i();
             if (!PatchProxy.applyVoid(null, iMBeautyCont, iMBeautyCont1, "15")) {
                c.k(new a(iMBeautyCont));
             }
             iMBeautyCont.k(true);
          }
       }
       IMMakeupController iMMakeupCont = this.f();
       th = this.h;
       Objects.requireNonNull(iMMakeupCont);
       IMMakeupController iMMakeupCont1 = IMMakeupController.class;
       boolean b = false;
       if (!PatchProxy.applyVoidOneRefs(th, iMMakeupCont, iMMakeupCont1, str2)) {
          if (!a.d()) {
             c.g("IMMakeupController", "bindImageHelper isMakeupEnabled false ");
          }else {
             iMMakeupCont.b = th;
             iMMakeupCont.e.k(new IMMakeupController$b(iMMakeupCont, th));
             MakeupKey f1 = IMMakeupController.f;
             iMMakeupCont.e.i(f1);
             n.a(iMMakeupCont.e());
             IMMakeupController b1 = iMMakeupCont.b;
             if (b1 != null) {
                b1.A0(iMMakeupCont.f());
             }
             if (!PatchProxy.applyVoid(null, iMMakeupCont, iMMakeupCont1, str)) {
                iMMakeupCont.a = d.a().c(f1, b, b, b).observeOn(d.c).doOnNext(c.b).observeOn(d.a).subscribe(new d(iMMakeupCont), e.b);
             }
          }
       }
       IMFilterController iMFilterCont = this.d();
       th = this.h;
       Objects.requireNonNull(iMFilterCont);
       IMFilterController iMFilterCont1 = IMFilterController.class;
       if (!PatchProxy.applyVoidOneRefs(th, iMFilterCont, iMFilterCont1, "4")) {
          if (!a.c()) {
             c.g("IMFilterController", "bindImageHelper isFilterEnabled false ");
          }else {
             iMFilterCont.a = th;
             iMFilterCont.d().init();
             a = iMFilterCont.a;
             if (a != null) {
                a.A0(iMFilterCont.c());
             }
             a = iMFilterCont.g;
             obj = PatchProxy.apply(null, iMFilterCont, iMFilterCont1, "1");
             if (obj == patchProxyRe) {
                obj = iMFilterCont.d.getValue();
             }
             a.p(obj);
             iMFilterCont.g.o(iMFilterCont.d());
             if (!PatchProxy.applyVoid(null, iMFilterCont, iMFilterCont1, "9")) {
                if (Filters.hasFilterConfigs(IMFilterController.h)) {
                   if (!PatchProxy.applyVoid(null, iMFilterCont, iMFilterCont1, "10")) {
                      b9.a(iMFilterCont.b);
                      b9.a(iMFilterCont.c);
                      iMFilterCont.b = t.fromCallable(new a(iMFilterCont)).subscribeOn(d.c).observeOn(d.a).subscribe(new b(iMFilterCont), c.b);
                   }
                }else {
                   iMFilterCont.g();
                }
             }
          }
       }
       IMMagicEffectController iMMagicEffec = this.e();
       th = this.h;
       Objects.requireNonNull(iMMagicEffec);
       IMMagicEffectController iMMagicEffec1 = IMMagicEffectController.class;
       if (!PatchProxy.applyVoidOneRefs(th, iMMagicEffec, iMMagicEffec1, "18")) {
          obj = PatchProxy.apply(null, null, a.class, "1");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             IMConfigInfo iMConfigInfo = a.b();
             if (iMConfigInfo != null) {
                b = iMConfigInfo.mEnableImVideoChatMagicFace;
             }
          }
          if (b == null) {
             c.g("IMMagicEffectController", "bindImageHelper isMagicFaceEnabled false ");
          }else {
             iMMagicEffec.f = th;
             iMMagicEffec.g().start();
             if (th != null) {
                th.Q0(EffectType.kEffectTypeFaceMagic, true);
             }
             if (!PatchProxy.applyVoid(null, iMMagicEffec, iMMagicEffec1, "15")) {
                IMMagicEffectController f = iMMagicEffec.f;
                if (f != null) {
                   f.Y0(new b(iMMagicEffec));
                }
                f = iMMagicEffec.f;
                if (f != null) {
                   f.Z0(new c(iMMagicEffec));
                }
                f = iMMagicEffec.f;
                if (f != null) {
                   f.G0(new d(iMMagicEffec));
                }
             }
             c.g("IMMagicEffectController", "bindImageHelper");
          }
       }
       return;
    }
    public final IMBeautyController b(){
       Object obj = PatchProxy.apply(null, this, IMEffectManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final a c(){
       Object obj = PatchProxy.apply(null, this, IMEffectManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final IMFilterController d(){
       Object obj = PatchProxy.apply(null, this, IMEffectManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final IMMagicEffectController e(){
       Object obj = PatchProxy.apply(null, this, IMEffectManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final IMMakeupController f(){
       Object obj = PatchProxy.apply(null, this, IMEffectManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public void init(){
       z c;
       z a;
       IMEffectManager iMEffectMana = IMEffectManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, iMEffectMana, "6")) {
          return;
       }
       String str = "IMEffectManager";
       if (this.f != null) {
          c.g(str, "has init");
          return;
       }else {
          c.g(str, "init start");
          this.f = true;
          this.c().a();
          this.c().i();
          this.c().g();
          if (!PatchProxy.applyVoid(objArray, this, iMEffectMana, "9")) {
             if (!a.a()) {
                c.g(str, "preloadBeautyData isBeautyEnabled false");
             }else {
                b9.a(this.i);
                t ot = PatchProxy.apply(objArray, objArray, c.class, "1");
                if (ot != PatchProxyResult.class) {
                }else {
                   String str1 = "IMBeautyDataStore";
                   if (c.b != null) {
                      c.g(str1, "syncBeautifyData has fetched");
                      ot = t.just(c.b);
                      a.o(ot, "Observable.just\(beautifyResponseFromNet\)");
                   }else {
                      c.g(str1, "syncBeautifyData start");
                      c = d.c;
                      a = d.a;
                      ot = t.fromCallable(d.b).subscribeOn(c).observeOn(a).doOnNext(e.b).observeOn(c).flatMap(f.b).observeOn(c).doOnNext(g.b).observeOn(a);
                      ot = ot.doOnNext(h.b).observeOn(c);
                      ot = ot.onErrorReturn(i.b);
                      a.o(ot, "Observable.fromCallable ¡­getBeautifyData\(\)\n      }");
                   }
                }
                this.i = ot.subscribe(b.b, c.b);
             }
          }
          return;
       }
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, IMEffectManager.class, "8")) {
          return;
       }
       c.g("IMEffectManager", "release");
       this.f = false;
       this.g.set(true);
       b9.a(this.i);
       IMMagicEffectController iMMagicEffec = this.e();
       Objects.requireNonNull(iMMagicEffec);
       IMMagicEffectController iMMagicEffec1 = IMMagicEffectController.class;
       if (!PatchProxy.applyVoid(null, iMMagicEffec, iMMagicEffec1, "19")) {
          iMMagicEffec.f = null;
          if (!PatchProxy.applyVoid(null, iMMagicEffec, iMMagicEffec1, "12")) {
             iMMagicEffec.h(null);
             Iterator k = IMMagicEffectController.k;
             _monitor_enter(k);
             iMMagicEffec.g().cancelAll();
             iMMagicEffec.g().stop();
             _monitor_exit(k);
             k = iMMagicEffec.e().iterator();
             while (k.hasNext()) {
                k.next().a(iMMagicEffec.d, null);
             }
             iMMagicEffec.d = null;
             iMMagicEffec.e().clear();
             iMMagicEffec.f().clear();
             iMMagicEffec.c = null;
             b9.a(iMMagicEffec.e);
          }
       }
       IMBeautyController iMBeautyCont = this.b();
       Objects.requireNonNull(iMBeautyCont);
       if (!PatchProxy.applyVoid(null, iMBeautyCont, IMBeautyController.class, "4")) {
          n.w(iMBeautyCont.e());
          iMBeautyCont.a = null;
          b9.a(iMBeautyCont.c);
          b9.a(iMBeautyCont.b);
       }
       IMMakeupController iMMakeupCont = this.f();
       Objects.requireNonNull(iMMakeupCont);
       if (!PatchProxy.applyVoid(null, iMMakeupCont, IMMakeupController.class, "4")) {
          n.w(iMMakeupCont.e());
          IMMakeupController b = iMMakeupCont.b;
          if (b != null) {
             b.n0(iMMakeupCont.f());
          }
          b9.a(iMMakeupCont.a);
          iMMakeupCont.b = null;
       }
       IMFilterController iMFilterCont = this.d();
       Objects.requireNonNull(iMFilterCont);
       if (!PatchProxy.applyVoid(null, iMFilterCont, IMFilterController.class, "5")) {
          IMFilterController a = iMFilterCont.a;
          if (a != null) {
             a.n0(iMFilterCont.c());
          }
          b9.a(iMFilterCont.b);
          b9.a(iMFilterCont.c);
          iMFilterCont.a = null;
       }
       this.c().a();
       this.h = null;
       return;
    }
}
