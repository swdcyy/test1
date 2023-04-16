package eib.e;
import hka.h;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import dc5.c;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;

public final class e implements h	// class@0026a7
{
    public final IMMagicEffectPanel b;

    public void e(IMMagicEffectPanel p0){
       this.b = p0;
       super();
    }
    public void a(Object p0){
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          c.g("IMMagicEffectPanel", "onItemSelect "+p0);
          this.b.j.c(p0);
       }
       return;
    }
}
