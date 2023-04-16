package eib.d;
import ui9.e;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectSlot;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$faceMagicListener$2$a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectResource;
import com.kwai.video.westeros.models.EffectError;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicListener;

public final class d implements e	// class@0026a6
{
    public final IMMagicEffectController a;

    public void d(IMMagicEffectController p0){
       this.a = p0;
       super();
    }
    public void onEffectPlayCompleted(EffectSlot p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       a.p(p0, "slot");
       this.a.d().onEffectPlayCompleted(p0, p1);
       return;
    }
    public void onLoadGroupEffect(EffectDescription p0,EffectSlot p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "2")) {
          return;
       }
       a.p(p1, "slot");
       a.p(p2, "groupName");
       this.a.d().onLoadGroupEffect(p0, p1, p2);
       return;
    }
    public void onSetEffectFailed(EffectResource p0,EffectSlot p1,EffectError p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "3")) {
          return;
       }
       this.a.d().onSetEffectFailed(p0, p1, p2);
       return;
    }
}
