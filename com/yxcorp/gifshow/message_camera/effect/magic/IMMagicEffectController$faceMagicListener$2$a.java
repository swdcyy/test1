package com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$faceMagicListener$2$a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicListener;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$faceMagicListener$2;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$a;
import dc5.c;
import com.kwai.video.westeros.models.EffectResource;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import eib.j;
import com.kwai.video.westeros.models.EffectErrorCode;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$faceMagicListener$2$a$a;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.video.westeros.models.EffectHint;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import e17.i;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import i4b.g;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import s3b.a;
import z3b.a;
import z3b.f;
import eib.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kwai.video.westeros.models.EffectError;
import pw7.a;

public final class IMMagicEffectController$faceMagicListener$2$a implements FaceMagicController$FaceMagicListener	// class@001d8c
{
    public final IMMagicEffectController$faceMagicListener$2 b;

    public void IMMagicEffectController$faceMagicListener$2$a(IMMagicEffectController$faceMagicListener$2 p0){
       this.b = p0;
       super();
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMMagicEffectController$faceMagicListener$2$a.class, "2")) {
          return;
       }
       a.p(p1, "effectSlot");
       c.g("IMMagicEffectController", IMMagicEffectController.l.a("onEffectDescriptionUpdated old", p0, p1));
       return;
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMMagicEffectController$faceMagicListener$2$a.class, "1")) {
          return;
       }
       a.p(p1, "effectSlot");
       Iterator iterator = this.b.this$0.f().iterator();
       while (iterator.hasNext()) {
          iterator.next().onEffectDescriptionUpdated(p0, p1, p2);
       }
       IMMagicEffectController c = this.b.this$0.c;
       if (c != null) {
          c.c();
       }
       String str = IMMagicEffectController.l.a("onEffectDescriptionUpdated", p0, p1);
       if (p0 != null && p0.getRenderCode() == EffectErrorCode.kSuccess) {
          c.g("IMMagicEffectController", "success "+str);
          k1.o(new IMMagicEffectController$faceMagicListener$2$a$a(this));
       }else {
          c.g("IMMagicEffectController", "failed "+str);
          IMMagicEffectController c1 = this.b.this$0.c;
          if (c1 != null) {
             c1.b(str);
          }
       }
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMMagicEffectController$faceMagicListener$2$a.class, "4")) {
          return;
       }
       a.p(p1, "slot");
       c.g("IMMagicEffectController", IMMagicEffectController.l.a("onEffectDescriptionUpdatedOnCancel", p0, p1));
       Iterator iterator = this.b.this$0.f().iterator();
       while (iterator.hasNext()) {
          iterator.next().onEffectDescriptionUpdatedOnCancel(p0, p1, p2);
       }
       return;
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       EffectErrorCode this;
       IMMagicEffectController c;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMMagicEffectController$faceMagicListener$2$a.class, "3")) {
          return;
       }
       a.p(p1, "slot");
       String str = IMMagicEffectController.l.a("onEffectDescriptionUpdatedOnError", p0, p1);
       c.g("IMMagicEffectController", str);
       EffectErrorCode uEffectError = null;
       this = (p0 != null)? p0.getRenderCode(): uEffectError;
       if (this == EffectErrorCode.kEffectCountNotEqual) {
          c.g("IMMagicEffectController", "[onEffectDescriptionUpdatedOnError], receive EffectErrorCode.kEffectCountNotEqual");
          return;
       }else {
          Iterator iterator = this.b.this$0.f().iterator();
          while (iterator.hasNext()) {
             iterator.next().onEffectDescriptionUpdatedOnError(p0, p1, p2);
          }
          if (p0 != null) {
             uEffectError = p0.getRenderCode();
          }
          if (uEffectError == EffectErrorCode.kEffectCannotCoexist) {
             c.g("IMMagicEffectController", "[onEffectDescriptionUpdatedOnError][RenderCode == kEffectCannotCoexist]");
             return;
          }else if(p0 == null || p0.getRenderCode() != EffectErrorCode.kSuccess){
             c = this.b.this$0.c;
             if (c != null) {
                c.b(str);
             }
          }
          return;
       }
    }
    public void onEffectHintUpdated(EffectHint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMMagicEffectController$faceMagicListener$2$a.class, "5")) {
          return;
       }
       a.p(p0, "effectHint");
       Iterator iterator = this.b.this$0.f().iterator();
       while (iterator.hasNext()) {
          iterator.next().onEffectHintUpdated(p0);
       }
       return;
    }
    public void onEffectPlayCompleted(EffectSlot p0,int p1){
       IMMagicEffectController$faceMagicListener$2$a uofaceMagicL = IMMagicEffectController$faceMagicListener$2$a.class;
       if (PatchProxy.isSupport(uofaceMagicL) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uofaceMagicL, "6")) {
          return;
       }
       a.p(p0, "effectSlot");
       Iterator iterator = this.b.this$0.f().iterator();
       while (iterator.hasNext()) {
          iterator.next().onEffectPlayCompleted(p0, p1);
       }
       return;
    }
    public void onLoadGroupEffect(EffectDescription p0,EffectSlot p1,String p2){
       Object[] objArray1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMMagicEffectController$faceMagicListener$2$a.class, "7")) {
          return;
       }
       a.p(p1, "effectSlot");
       a.p(p2, "groupName");
       Iterator iterator = this.b.this$0.f().iterator();
       while (iterator.hasNext()) {
          iterator.next().onLoadGroupEffect(p0, p1, p2);
       }
       a.m(p0);
       if (p0.getEffectLoadFailed()) {
          String str = "IMMagicEffectController";
          c.g(str, "[onLoadGroupEffect] error");
          IMMagicEffectController$faceMagicListener$2 this$0 = this.b.this$0;
          Objects.requireNonNull(this$0);
          IMMagicEffectController iMMagicEffec = IMMagicEffectController.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this$0, iMMagicEffec, "14")) {
             StringBuilder str1 = "handleMagicResourceError name ";
             IMMagicEffectController d = this$0.d;
             SimpleMagicFace mName = (d != null)? d.mName: objArray;
             str1 = str1+mName+" id ";
             d = this$0.d;
             mName = (d != null)? d.mId: objArray;
             c.g(str, str1+mName);
             i.a(R.style.arg_RES_7f11066a, 0x7f102684);
             IMMagicEffectController d1 = this$0.d;
             if (d1 != null) {
                g.C(d1);
                a uoa = PatchProxy.apply(objArray, this$0, iMMagicEffec, "3");
                if (uoa == PatchProxyResult.class) {
                   uoa = this$0.h.getValue();
                }
                a.o(uoa, "magicFaceController");
                f[] uofArray = new f[]{new a(this$0, d1)};
                uoa.H0().h(d1, uofArray);
             }
          }
       }
       return;
    }
    public void onSetEffectFailed(EffectResource p0,EffectSlot p1,EffectError p2){
       a.e(this, p0, p1, p2);
    }
}
