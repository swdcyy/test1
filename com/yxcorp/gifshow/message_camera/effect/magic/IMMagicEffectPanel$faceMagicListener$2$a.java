package com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel$faceMagicListener$2$a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicListener;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel$faceMagicListener$2;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pw7.a;
import dc5.c;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel;
import hp.c;
import w3b.l;
import hp.f;
import com.kwai.video.westeros.models.EffectHint;
import com.kwai.video.westeros.models.EffectError;

public final class IMMagicEffectPanel$faceMagicListener$2$a implements FaceMagicController$FaceMagicListener	// class@001d97
{
    public final IMMagicEffectPanel$faceMagicListener$2 b;

    public void IMMagicEffectPanel$faceMagicListener$2$a(IMMagicEffectPanel$faceMagicListener$2 p0){
       this.b = p0;
       super();
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1){
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMMagicEffectPanel$faceMagicListener$2$a.class, "1")) {
          return;
       }
       a.a(this, p0, p1, p2);
       c.g("IMMagicEffectPanel", "onEffectDescriptionUpdated:");
       this.b.this$0.k.b(l.b(p0));
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMMagicEffectPanel$faceMagicListener$2$a.class, "2")) {
          return;
       }
       a.b(this, p0, p1, p2);
       c.g("IMMagicEffectPanel", "onEffectDescriptionUpdatedOnCancel:");
       this.b.this$0.k.b(l.b(p0));
       return;
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectHintUpdated(EffectHint p0){
    }
    public void onEffectPlayCompleted(EffectSlot p0,int p1){
    }
    public void onLoadGroupEffect(EffectDescription p0,EffectSlot p1,String p2){
       a.d(this, p0, p1, p2);
    }
    public void onSetEffectFailed(EffectResource p0,EffectSlot p1,EffectError p2){
       a.e(this, p0, p1, p2);
    }
}
