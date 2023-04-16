package com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import fib.c;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$magicFaceChangeListeners$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$magicFaceMagicListeners$2;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$unbindMagicEffectRunnable$1;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$magicFaceController$2;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$worker$2;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$faceMagicListener$2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import kib.a;
import qrd.l1;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import eib.i;
import crd.b;
import lnc.b9;
import ui9.j;
import cib.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import pt7.a;
import dc5.c;
import com.kwai.video.westeros.models.EffectType;
import eib.b;
import ui9.b;
import eib.c;
import ui9.c;
import eib.d;
import ui9.e;
import java.lang.Long;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import i4b.g;
import java.io.File;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$bindMagicEffect$1;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$faceMagicListener$2$a;
import tkd.b;
import tkd.d;
import uyb.c;

public final class IMMagicEffectController implements c	// class@001d93
{
    public final p a;
    public final p b;
    public j c;
    public MagicEmoji$MagicFace d;
    public b e;
    public j f;
    public final a g;
    public final p h;
    public final p i;
    public final p j;
    public static final Object k;
    public static final IMMagicEffectController$a l;

    static {
       IMMagicEffectController.l = new IMMagicEffectController$a(null);
       IMMagicEffectController.k = new Object();
    }
    public void IMMagicEffectController(){
       super();
       this.a = s.c(IMMagicEffectController$magicFaceChangeListeners$2.INSTANCE);
       this.b = s.c(IMMagicEffectController$magicFaceMagicListeners$2.INSTANCE);
       this.g = new IMMagicEffectController$unbindMagicEffectRunnable$1(this);
       this.h = s.c(IMMagicEffectController$magicFaceController$2.INSTANCE);
       this.i = s.c(IMMagicEffectController$worker$2.INSTANCE);
       this.j = s.c(new IMMagicEffectController$faceMagicListener$2(this));
    }
    public void a(){
       IMMagicEffectController iMMagicEffec = IMMagicEffectController.class;
       if (PatchProxy.applyVoid(null, this, iMMagicEffec, "19")) {
          return;
       }
       this.f = null;
       if (!PatchProxy.applyVoid(null, this, iMMagicEffec, "12")) {
          this.h(null);
          Iterator k = IMMagicEffectController.k;
          _monitor_enter(k);
          this.g().cancelAll();
          this.g().stop();
          _monitor_exit(k);
          k = this.e().iterator();
          while (k.hasNext()) {
             k.next().a(this.d, null);
          }
          this.d = null;
          this.e().clear();
          this.f().clear();
          this.c = null;
          b9.a(this.e);
       }
       return;
    }
    public void b(j p0){
       boolean b;
       IMMagicEffectController iMMagicEffec = IMMagicEffectController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, iMMagicEffec, "18")) {
          return;
       }
       IMConfigInfo obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = a.b();
          b = (obj != null)? obj.mEnableImVideoChatMagicFace: null;
       }
       if (b == null) {
          c.g("IMMagicEffectController", "bindImageHelper isMagicFaceEnabled false ");
          return;
       }else {
          this.f = p0;
          this.g().start();
          if (p0 != null) {
             p0.Q0(EffectType.kEffectTypeFaceMagic, true);
          }
          if (!PatchProxy.applyVoid(null, this, iMMagicEffec, "15")) {
             IMMagicEffectController tf = this.f;
             if (tf != null) {
                tf.Y0(new b(this));
             }
             tf = this.f;
             if (tf != null) {
                tf.Z0(new c(this));
             }
             tf = this.f;
             if (tf != null) {
                tf.G0(new d(this));
             }
          }
          c.g("IMMagicEffectController", "bindImageHelper");
          return;
       }
    }
    public final void c(MagicEmoji$MagicFace p0){
       IMMagicEffectController iMMagicEffec = IMMagicEffectController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, iMMagicEffec, "6")) {
          return;
       }
       if (this.f == null) {
          c.g("IMMagicEffectController", "imageHelper is null");
          return;
       }else if(p0 == null){
          c.g("IMMagicEffectController", "bindMagicFace clean");
          if (!PatchProxy.applyVoid(null, this, iMMagicEffec, "13")) {
             p0 = IMMagicEffectController.k;
             _monitor_enter(p0);
             this.g().a(this.g);
             this.g().c(this.g, Long.valueOf(0));
             _monitor_exit(p0);
          }
          return;
       }else if(g.y(p0)){
          c.g("IMMagicEffectController", "bindMagicFace magicFace need download");
          return;
       }else {
          File uFile = g.j(p0);
          if (uFile == null || !uFile.exists()) {
             c.g("IMMagicEffectController", "bindMagicFace magicFace file not exit");
             return;
          }else {
             IMMagicEffectController$bindMagicEffect$1 uobindMagicE = new IMMagicEffectController$bindMagicEffect$1(this, p0);
             if (!PatchProxy.applyVoidOneRefs(uobindMagicE, this, iMMagicEffec, "17")) {
                p0 = IMMagicEffectController.k;
                _monitor_enter(p0);
                this.g().a(this.g);
                this.g().b(uobindMagicE);
                _monitor_exit(p0);
             }
             return;
          }
       }
    }
    public final IMMagicEffectController$faceMagicListener$2$a d(){
       Object obj = PatchProxy.apply(null, this, IMMagicEffectController.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final CopyOnWriteArrayList e(){
       Object obj = PatchProxy.apply(null, this, IMMagicEffectController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final CopyOnWriteArrayList f(){
       Object obj = PatchProxy.apply(null, this, IMMagicEffectController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final a g(){
       Object obj = PatchProxy.apply(null, this, IMMagicEffectController.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final void h(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMMagicEffectController.class, "7")) {
          return;
       }
       d.a(-314635782).Di("im_chat_video", p0);
       return;
    }
}
