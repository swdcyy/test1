package com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$faceMagicListener$2$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$faceMagicListener$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$faceMagicListener$2;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import eib.j;

public final class IMMagicEffectController$faceMagicListener$2$a$a implements Runnable	// class@001d8b
{
    public final IMMagicEffectController$faceMagicListener$2$a b;

    public void IMMagicEffectController$faceMagicListener$2$a$a(IMMagicEffectController$faceMagicListener$2$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, IMMagicEffectController$faceMagicListener$2$a$a.class, "1")) {
          return;
       }
       IMMagicEffectController c = this.b.b.this$0.c;
       if (c != null) {
          c.a();
       }
       return;
    }
}
