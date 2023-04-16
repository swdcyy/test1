package com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel$faceChangeListener$2$a;
import eib.i;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel$faceChangeListener$2;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel;
import hp.f;

public final class IMMagicEffectPanel$faceChangeListener$2$a implements i	// class@001d95
{
    public final IMMagicEffectPanel$faceChangeListener$2 a;

    public void IMMagicEffectPanel$faceChangeListener$2$a(IMMagicEffectPanel$faceChangeListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(MagicEmoji$MagicFace p0,MagicEmoji$MagicFace p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMMagicEffectPanel$faceChangeListener$2$a.class, "1")) {
          return;
       }
       this.a.this$0.k.c(p1);
       return;
    }
}
