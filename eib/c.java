package eib.c;
import ui9.c;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectHint;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$faceMagicListener$2$a;
import kotlin.jvm.internal.a;

public final class c implements c	// class@0026a5
{
    public final IMMagicEffectController b;

    public void c(IMMagicEffectController p0){
       this.b = p0;
       super();
    }
    public final void onEffectHintUpdated(EffectHint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.o(p0, "it");
       this.b.d().onEffectHintUpdated(p0);
       return;
    }
}
