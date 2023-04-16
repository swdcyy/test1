package com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel;
import lw5.c;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel$a;
import nsd.u;
import lw5.d;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import hp.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel$onPanelShowListeners$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel$faceMagicListener$2;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel$faceChangeListener$2;
import lw5.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel$faceChangeListener$2$a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel$faceMagicListener$2$a;
import crd.b;
import lnc.b9;
import java.util.Objects;
import androidx.fragment.app.c;
import android.app.Activity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import java.util.Iterator;
import java.lang.Iterable;
import dc5.c;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import tkd.b;
import tkd.d;
import uyb.c;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$b;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.kwai.video.westeros.models.EffectDescription;
import uyb.c$a;
import uyb.m;
import hka.n;
import eib.e;
import hka.h;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import brd.t;
import t45.d;
import brd.z;
import eib.g;
import erd.g;
import io.reactivex.internal.functions.Functions;
import eib.h;
import erd.r;
import eib.f;
import java.lang.RuntimeException;

public final class IMMagicEffectPanel implements c	// class@001d9a
{
    public BaseFragment a;
    public final p b;
    public View c;
    public b d;
    public b e;
    public final p f;
    public boolean g;
    public final p h;
    public final d i;
    public final IMMagicEffectController j;
    public final f k;
    public static final IMMagicEffectPanel$a l;

    static {
       IMMagicEffectPanel.l = new IMMagicEffectPanel$a(null);
    }
    public void IMMagicEffectPanel(d p0,IMMagicEffectController p1,f p2){
       a.p(p0, "panelConfig");
       a.p(p1, "effectController");
       a.p(p2, "stateManager");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.b = s.c(IMMagicEffectPanel$onPanelShowListeners$2.INSTANCE);
       this.f = s.c(new IMMagicEffectPanel$faceMagicListener$2(this));
       this.h = s.c(new IMMagicEffectPanel$faceChangeListener$2(this));
    }
    public void a(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMMagicEffectPanel.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       if (this.f().contains(p0)) {
          this.f().remove(p0);
       }
       return;
    }
    public void b(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMMagicEffectPanel.class, "7")) {
          return;
       }
       a.p(p0, "listener");
       if (!this.f().contains(p0)) {
          this.f().add(p0);
       }
       return;
    }
    public final IMMagicEffectPanel$faceChangeListener$2$a c(){
       Object obj = PatchProxy.apply(null, this, IMMagicEffectPanel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final IMMagicEffectPanel$faceMagicListener$2$a d(){
       Object obj = PatchProxy.apply(null, this, IMMagicEffectPanel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public void destroy(){
       IMMagicEffectController iMMagicEffec = IMMagicEffectController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IMMagicEffectPanel.class, "4")) {
          return;
       }
       this.g = true;
       this.g();
       b9.a(this.d);
       b9.a(this.e);
       this.c = objArray;
       this.a = objArray;
       IMMagicEffectPanel tj = this.j;
       IMMagicEffectPanel$faceMagicListener$2$a uofaceMagicL = this.d();
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoidOneRefs(uofaceMagicL, tj, iMMagicEffec, "9")) {
          a.p(uofaceMagicL, "faceMagicListener");
          tj.f().remove(uofaceMagicL);
       }
       tj = this.j;
       IMMagicEffectPanel$faceChangeListener$2$a uofaceChange = this.c();
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoidOneRefs(uofaceChange, tj, iMMagicEffec, "11")) {
          a.p(uofaceChange, "magicFaceChangeListener");
          tj.e().remove(uofaceChange);
       }
       return;
    }
    public final c e(){
       Object[] objArray1;
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, this, IMMagicEffectPanel.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i.a();
       if (!obj instanceof RxFragmentActivity) {
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          objArray = objArray1.getSupportFragmentManager();
       }
       return objArray;
    }
    public final CopyOnWriteArrayList f(){
       Object obj = PatchProxy.apply(null, this, IMMagicEffectPanel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, IMMagicEffectPanel.class, "11")) {
          return;
       }
       c uoc = this.e();
       if (uoc != null) {
          Fragment uFragment = uoc.findFragmentByTag("IMMagicEffectPanel");
          if (uFragment != null) {
             uoc.beginTransaction().u(uFragment).m();
          }
       }
       return;
    }
    public void hide(){
       IMMagicEffectPanel iMMagicEffec = IMMagicEffectPanel.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, iMMagicEffec, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, iMMagicEffec, "10")) {
          iMMagicEffec = this.a;
          if (iMMagicEffec != null && iMMagicEffec.isAdded() == true) {
             iMMagicEffec = this.a;
             if (iMMagicEffec != null && !iMMagicEffec.isHidden()) {
                c uoc = this.e();
                if (uoc != null) {
                   e uoe = uoc.beginTransaction();
                   if (uoe != null) {
                      uoe.y(R.anim.arg_RES_7f0100b0, 0x7f0100b1);
                      IMMagicEffectPanel ta = this.a;
                      a.m(ta);
                      uoe.s(ta);
                      uoe.m();
                   }
                }
             }
          }
       }
       Iterator iterator = this.f().iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void show(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IMMagicEffectPanel iMMagicEffec = IMMagicEffectPanel.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, iMMagicEffec, "5")) {
          return;
       }
       if (this.g != null) {
          c.g("IMMagicEffectPanel", "show:Panel is Destroyed");
          return;
       }else {
          IMMagicEffectController obj = PatchProxy.apply(objArray, this, iMMagicEffec, "12");
          g og = null;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(this.i.a().isDestroyed()){
             c.g("IMMagicEffectPanel", "checkActivity isDestroyed");
             this.destroy();
             b = true;
          }else {
             b = false;
          }
          if (b) {
             return;
          }else {
             obj = IMMagicEffectController.class;
             if (!PatchProxy.applyVoid(objArray, this, iMMagicEffec, "9") && this.c == null) {
                View view = this.i.a().findViewById(this.i.b());
                this.c = view;
                if (view != null) {
                   if (this.a == null) {
                      BaseFragment uBaseFragmen = PatchProxy.apply(objArray, this, iMMagicEffec, "15");
                      if (uBaseFragmen != patchProxyRe) {
                      }else {
                         MagicEmojiPageConfig$b uob = MagicEmojiPageConfig$b.c("im_chat_video");
                         uob.j(CameraPageType.IM_CHAT);
                         uob.k(og);
                         uBaseFragmen = d.a(-314635782).if(uob.a(), objArray, objArray, objArray);
                         Object[] objArray1 = (!uBaseFragmen instanceof n)? objArray: uBaseFragmen;
                         if (objArray1 != null) {
                            objArray1.A4(new e(this));
                         }
                         a.o(uBaseFragmen, "fragment");
                      }
                      this.a = uBaseFragmen;
                   }
                   this.e = RxBus.f.f(PanelShowEvent.class).observeOn(d.a).subscribe(new g(this), Functions.d());
                   IMMagicEffectPanel tj = this.j;
                   IMMagicEffectPanel$faceMagicListener$2$a uofaceMagicL = this.d();
                   Objects.requireNonNull(tj);
                   if (!PatchProxy.applyVoidOneRefs(uofaceMagicL, tj, obj, "8")) {
                      a.p(uofaceMagicL, "faceMagicListener");
                      tj.f().add(uofaceMagicL);
                   }
                   tj = this.j;
                   IMMagicEffectPanel$faceChangeListener$2$a uofaceChange = this.c();
                   Objects.requireNonNull(tj);
                   if (!PatchProxy.applyVoidOneRefs(uofaceChange, tj, obj, "10")) {
                      a.p(uofaceChange, "magicFaceChangeListener");
                      tj.e().add(uofaceChange);
                   }
                   b9.a(this.d);
                   Activity uActivity = this.i.a();
                   if (uActivity instanceof RxFragmentActivity) {
                      objArray = uActivity;
                   }
                   if (objArray != null) {
                      this.d = objArray.m().filter(h.b).subscribe(new f(this), Functions.d());
                   }
                }else {
                   throw new RuntimeException("IMMagicEffectPanel containerView is null");
                }
             }
             if (this.a == null) {
                return;
             }else {
                c uoc = this.e();
                if (uoc != null) {
                   e uoe = uoc.beginTransaction();
                   uoe.y(R.anim.arg_RES_7f0100b0, 0x7f0100b1);
                   iMMagicEffec = this.a;
                   a.m(iMMagicEffec);
                   if (iMMagicEffec.isAdded()) {
                      iMMagicEffec = this.a;
                      a.m(iMMagicEffec);
                      uoe.E(iMMagicEffec).m();
                   }else {
                      this.g();
                      IMMagicEffectPanel ta = this.a;
                      a.m(ta);
                      uoe.g(this.i.b(), ta, "IMMagicEffectPanel");
                      uoe.m();
                   }
                   Iterator iterator = this.f().iterator();
                   while (iterator.hasNext()) {
                      iterator.next().b();
                   }
                }
                return;
             }
          }
       }
    }
}
