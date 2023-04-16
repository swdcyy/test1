package com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$unbindMagicEffectRunnable$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import dc5.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import xi9.n;

public final class IMMagicEffectController$unbindMagicEffectRunnable$1 extends Lambda implements a	// class@001d91
{
    public final IMMagicEffectController this$0;

    public void IMMagicEffectController$unbindMagicEffectRunnable$1(IMMagicEffectController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, IMMagicEffectController$unbindMagicEffectRunnable$1.class, "1")) {
          return;
       }
       IMMagicEffectController$unbindMagicEffectRunnable$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(null, tthis$0, IMMagicEffectController.class, "16")) {
          c.g("IMMagicEffectController", "unbindMagicEffect");
          tthis$0.d = null;
          IMMagicEffectController f = tthis$0.f;
          if (f != null) {
             f.j(null, "");
          }
       }
       return;
    }
}
