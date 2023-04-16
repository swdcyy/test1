package com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController;
import fib.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController$a;
import nsd.u;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import h1c.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController$effectFailedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController$downloadListener$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import ui9.j;
import crd.b;
import lnc.b9;
import cib.a;
import dc5.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController$b;
import h1c.e;
import com.yxcorp.gifshow.prettify.makeup.d;
import brd.t;
import t45.d;
import brd.z;
import jib.c;
import erd.g;
import jib.d;
import jib.e;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import com.kwai.robust.PatchProxyResult;
import h1c.a;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.prettify.makeup.m;
import xi9.r;

public final class IMMakeupController implements c	// class@001dd3
{
    public b a;
    public j b;
    public final p c;
    public final p d;
    public final c e;
    public static final MakeupKey f;
    public static final IMMakeupController$a g;

    static {
       IMMakeupController.g = new IMMakeupController$a(null);
       IMMakeupController.f = MakeupKey.IM_CHAT;
    }
    public void IMMakeupController(c p0){
       a.p(p0, "stateManager");
       super();
       this.e = p0;
       this.c = s.c(new IMMakeupController$effectFailedListener$2(this));
       this.d = s.c(new IMMakeupController$downloadListener$2(this));
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, IMMakeupController.class, "4")) {
          return;
       }
       n.w(this.e());
       IMMakeupController tb = this.b;
       if (tb != null) {
          tb.n0(this.f());
       }
       b9.a(this.a);
       this.b = null;
       return;
    }
    public void b(j p0){
       IMMakeupController iMMakeupCont = IMMakeupController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, iMMakeupCont, "3")) {
          return;
       }
       if (!a.d()) {
          c.g("IMMakeupController", "bindImageHelper isMakeupEnabled false ");
          return;
       }else {
          this.b = p0;
          this.e.k(new IMMakeupController$b(this, p0));
          MakeupKey f = IMMakeupController.f;
          this.e.i(f);
          n.a(this.e());
          IMMakeupController tb = this.b;
          if (tb != null) {
             tb.A0(this.f());
          }
          if (!PatchProxy.applyVoid(null, this, iMMakeupCont, "7")) {
             this.a = d.a().c(f, false, false, false).observeOn(d.c).doOnNext(c.b).observeOn(d.a).subscribe(new d(this), e.b);
          }
          return;
       }
    }
    public final void c(MakeupSuite p0,MakeupPart p1,MakeupMaterial p2,boolean p3,int p4){
       IMMakeupController iMMakeupCont = IMMakeupController.class;
       if (PatchProxy.isSupport(iMMakeupCont)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, iMMakeupCont, "13")) {
             return;
          }
       }
       c.g("IMMakeupController", "change to "+p0.mId+", "+p1+", "+p2);
       this.e.g(p0, p1, p2, p3, p4);
       return;
    }
    public final a d(){
       Object obj = PatchProxy.apply(null, this, IMMakeupController.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.d().a();
    }
    public final n$c e(){
       Object obj = PatchProxy.apply(null, this, IMMakeupController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final FaceMagicController$FaceMagicLoadEffectFailedListener f(){
       Object obj = PatchProxy.apply(null, this, IMMakeupController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final void g(List p0,boolean p1){
       boolean b2;
       IMMakeupController iMMakeupCont = IMMakeupController.class;
       if (PatchProxy.isSupport(iMMakeupCont) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, iMMakeupCont, "10")) {
          return;
       }
       boolean b = false;
       boolean b1 = (p0 == null || p0.isEmpty())? true: false;
       String str = null;
       if (b1) {
          p0 = str;
       }
       if (!b1) {
          m obj = PatchProxy.apply(str, this, iMMakeupCont, "9");
          if (obj != PatchProxyResult.class) {
             b2 = obj.booleanValue();
          }else {
             obj = d.a().b(IMMakeupController.f);
             a.o(obj, "MakeupConfigManager.getI¡­etMakeupModule\(makeupKey\)");
             b2 = obj.m();
          }
          b = b2;
       }
       c.g("IMMakeupController", "setEffect2Sdk res "+p0+" empty "+b1+" isMaleMakeupOn "+b);
       iMMakeupCont = this.b;
       if (iMMakeupCont != null) {
          iMMakeupCont.s0(p0, b, p1);
       }
       return;
    }
    public final void h(MakeupSuite p0,MakeupPart p1,MakeupMaterial p2,boolean p3){
       if (PatchProxy.isSupport(IMMakeupController.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, IMMakeupController.class, "5")) {
          return;
       }
       a.p(p0, "suite");
       int i = (p3)? 3: 2;
       this.c(p0, p1, p2, p3, i);
       return;
    }
}
