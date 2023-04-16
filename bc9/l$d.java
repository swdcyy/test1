package bc9.l$d;
import erd.g;
import bc9.l;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.assistant.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import ec9.j;
import cc9.c;
import sa6.a;
import bc9.k;
import g9c.a;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import com.yxcorp.gifshow.camera.record.intelligentidentify.a;
import cc9.e;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import nsd.u;

public final class l$d implements g	// class@0003f6
{
    public final l b;

    public void l$d(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$d.class, "1")) {
       }else {
          l$d tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, l.class, "14") && tb.J.D()) {
             String str = "CameraAssistant";
             int i = 0;
             if (p0.a != null) {
                Object[] objArray = new Object[i];
                a.D().w(str, "panel show "+p0.c, objArray);
                tb.J.g().w0(new c(8));
                if (tb.J.p() != null) {
                   k ok = tb.J.p();
                   a.m(ok);
                   if (!ok.R0()) {
                   label_007b :
                      if (p0.c == PanelShowEvent$PanelType.MUSIC) {
                         tb.J.v().a(i);
                      }
                   }
                }
                tb.H = true;
                goto label_007b ;
             }else {
                Object[] objArray1 = new Object[i];
                a.D().w(str, "panel hide", objArray1);
                if (tb.H != null) {
                   tb.H = i;
                   d d = tb.d;
                   a.o(d, "mCallerContext");
                   e uoe = new e(AssistantUtils.d.m(d), 0, false, null, 12, null);
                   tb.J.g().w0(v8);
                }
             }
          }
       }
       return;
    }
}
