package com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import fib.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$a;
import nsd.u;
import r0c.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$beautyRepo$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.ArrayList;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$downloadListener$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import crd.b;
import lnc.b9;
import ui9.j;
import cib.a;
import dc5.c;
import java.lang.StringBuilder;
import java.lang.Thread;
import lnc.s6;
import java.util.List;
import q0c.a;
import java.util.Collection;
import gib.b;
import r0c.i;
import u0c.a;
import h16.n;
import gib.a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import k2b.e0;
import com.yxcorp.gifshow.prettify.beauty.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xi9.b;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import dib.e;
import java.util.Iterator;
import java.lang.Iterable;
import boc.b;
import com.yxcorp.gifshow.util.resource.p;
import java.io.File;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import pt7.a;
import r0c.f;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$b;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$c;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$d;
import erd.g;

public final class IMBeautyController implements c	// class@001daa
{
    public j a;
    public b b;
    public b c;
    public final p d;
    public e e;
    public a f;
    public final List g;
    public final List h;
    public final List i;
    public final p j;
    public final h k;
    public static final IMBeautyController$a l;

    static {
       IMBeautyController.l = new IMBeautyController$a(null);
    }
    public void IMBeautyController(h p0){
       a.p(p0, "stateManager");
       super();
       this.k = p0;
       this.d = s.c(IMBeautyController$beautyRepo$2.INSTANCE);
       this.g = new ArrayList();
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.j = s.c(new IMBeautyController$downloadListener$2(this));
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, IMBeautyController.class, "4")) {
          return;
       }
       n.w(this.e());
       this.a = null;
       b9.a(this.c);
       b9.a(this.b);
       return;
    }
    public void b(j p0){
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyController.class, "3")) {
          return;
       }
       String str = "IMBeautyController";
       if (!a.a()) {
          c.g(str, "bindImageHelper isBeautyEnabled false ");
          return;
       }else {
          Thread thread = Thread.currentThread();
          a.o(thread, "Thread.currentThread\(\)");
          c.g(str, "bindImageHelper thread "+thread.getName());
          this.a = p0;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, IMBeautyController.class, "9")) {
             if (s6.f()) {
                list = a.d();
                a.o(list, "BeautifyConfigHelper.getBeautifyBaseResourceList\(\)");
                this.h.addAll(list);
                list = a.e();
                a.o(list, "BeautifyConfigHelper.get¡­utifyExtendResourceList\(\)");
                this.i.addAll(list);
                this.g.addAll(this.h);
                this.g.addAll(this.i);
             }else {
                list = a.c();
                a.o(list, "BeautifyConfigHelper.getBeauifyResourceList\(\)");
                this.g.addAll(list);
                list = a.c();
                a.o(list, "BeautifyConfigHelper.getBeauifyResourceList\(\)");
                this.h.addAll(list);
             }
             this.k.g(new b(this));
             a uoa = new a(this.d());
             this.f = uoa;
             this.k.f(uoa);
          }
          n.a(this.e());
          this.i();
          if (!PatchProxy.applyVoid(objArray, this, IMBeautyController.class, "15")) {
             c.k(new a(this));
          }
          this.k(true);
          return;
       }
    }
    public final void c(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyController.class, "18")) {
          return;
       }
       c.g("IMBeautyController", "applyLastConfig");
       this.k.d(p0);
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (!uActivity instanceof e0) {
          uActivity = null;
       }
       h.i(uActivity, p0);
       return;
    }
    public final n d(){
       Object obj = PatchProxy.apply(null, this, IMBeautyController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final n$c e(){
       Object obj = PatchProxy.apply(null, this, IMBeautyController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final BeautifyConfig f(){
       Object[] objArray = null;
       IMBeautyController obj = PatchProxy.apply(objArray, this, IMBeautyController.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          objArray = obj.f();
       }
       return objArray;
    }
    public final List g(){
       return this.g;
    }
    public final void h(boolean p0){
       IMBeautyController iMBeautyCont = IMBeautyController.class;
       if (PatchProxy.isSupport(iMBeautyCont) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, iMBeautyCont, "8")) {
          return;
       }
       iMBeautyCont = this.a;
       if (iMBeautyCont != null) {
          iMBeautyCont.C0(p0);
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, IMBeautyController.class, "17")) {
          return;
       }
       String str = MagicEmojiResourceHelper.d();
       IMBeautyController ta = this.a;
       if (ta != null) {
          ta.b0(str);
       }
       ta = this.e;
       if (ta != null) {
          ta.b("beautyDeformJson", str);
       }
       str = MagicEmojiResourceHelper.c();
       ta = this.a;
       if (ta != null) {
          ta.q0(str);
       }
       ta = this.e;
       if (ta != null) {
          ta.b("beautyAIDeformJson", str);
       }
       return;
    }
    public final boolean j(){
       Object[] objArray = null;
       Iterator obj = PatchProxy.apply(objArray, this, IMBeautyController.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g().iterator();
       while (true) {
          if (obj.hasNext()) {
             Object obj1 = obj.next();
             int i = p.h(obj1) ^ 0x01;
             if (i) {
                objArray = obj1;
             }
          }
          if (objArray != null) {
             break ;
          }else {
             return new File(MagicEmojiResourceHelper.d()).exists();
          }
       }
       return false;
    }
    public final void k(boolean p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IMBeautyController iMBeautyCont = IMBeautyController.class;
       if (PatchProxy.isSupport(iMBeautyCont) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, iMBeautyCont, "12")) {
          return;
       }
       Object[] objArray = null;
       BeautifyConfig obj = PatchProxy.apply(objArray, objArray, a.class, "6");
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          IMConfigInfo iMConfigInfo = a.b();
          iMConfigInfo = (iMConfigInfo != null)? iMConfigInfo.mDisableImVideoChatRestoreLastBeauty: null;
       }
       if (b != null) {
          c.g("IMBeautyController", "disableRestoreLastBeauty");
          return;
       }else {
          obj = PatchProxy.apply(objArray, this, iMBeautyCont, "10");
          b = (obj != patchProxyRe)? obj.booleanValue(): this.k.b().e();
          if (b) {
             c.g("IMBeautyController", "beautify disabled");
             return;
          }else if(this.a == null){
             c.g("IMBeautyController", "imageHelper is null");
             return;
          }else {
             obj = this.k.b().a();
             if (!p0 && obj != null) {
                c.g("IMBeautyController", "mBeautifyConfig != null");
                this.c(obj);
                return;
             }else {
                BeautifyConfig obj1 = PatchProxy.apply(objArray, this, iMBeautyCont, "14");
                if (obj1 != patchProxyRe) {
                   obj1 = obj1.booleanValue();
                }else {
                   Iterator iterator = this.g().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         Object obj2 = iterator.next();
                         if (p.h(obj2)) {
                            objArray = obj2;
                         }
                      }
                      if (objArray != null) {
                         i = 1;
                      }
                      iterator = i;
                   }
                   c.c("IMBeautyController", "all the resources are not exist.");
                   return;
                }
                if (!obj1) {
                   goto label_00b1 ;
                }else {
                   obj1 = this.f();
                   c.g("IMBeautyController", "restoreLastBeautifyConfig getLastBeautifyConfig");
                   b9.a(this.b);
                   IMBeautyController$c uoc = new IMBeautyController$c(this, obj1);
                   this.b = t.fromCallable(new IMBeautyController$b(this, obj1)).subscribeOn(d.c).observeOn(d.a).subscribe(uoc, IMBeautyController$d.b);
                   return;
                }
             }
          }
       }
    }
}
