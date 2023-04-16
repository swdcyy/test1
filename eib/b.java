package eib.b;
import ui9.b;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$faceMagicListener$2$a;

public final class b implements b	// class@0026a4
{
    public final IMMagicEffectController b;

    public void b(IMMagicEffectController p0){
       this.b = p0;
       super();
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, b.class, "1")) {
          return;
       }
       a.p(p1, "slot");
       if (p3) {
          this.b.d().onEffectDescriptionUpdatedOnCancel(p0, p1, p2);
       }else {
          this.b.d().onEffectDescriptionUpdated(p0, p1, p2);
       }
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "3")) {
          return;
       }
       a.p(p1, "slot");
       this.b.d().onEffectDescriptionUpdatedOnCancel(p0, p1, p2);
       return;
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "2")) {
          return;
       }
       a.p(p1, "slot");
       this.b.d().onEffectDescriptionUpdatedOnError(p0, p1, p2);
       return;
    }
}
