package eib.g;
import erd.g;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import lw5.d;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;

public final class g implements g	// class@0026a9
{
    public final IMMagicEffectPanel b;

    public void g(IMMagicEffectPanel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          g tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, IMMagicEffectPanel.class, "14") || (PanelShowEvent.a(tb.i.a(), p0) && (p0.c == PanelShowEvent$PanelType.MAGIC && p0.a == null))) {
             tb.hide();
          }
       }
       return;
    }
}
