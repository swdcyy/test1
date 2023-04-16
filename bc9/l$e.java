package bc9.l$e;
import cc9.i;
import bc9.l;
import java.lang.Object;
import cc9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import com.yxcorp.gifshow.camera.record.assistant.a;
import java.util.List;
import bc9.r;
import bc9.s;
import z3b.t0;
import com.yxcorp.gifshow.util.resource.f$c;
import com.yxcorp.gifshow.camera.record.base.d;

public final class l$e implements i	// class@0003f7
{
    public final l a;

    public void l$e(l p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$e.class, "1")) {
       }else {
          a.p(p0, "newState");
          if (p0.e() && p0.e != null) {
             p0 = this.a;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, l.class, "20") && p0.q == null) {
                Object[] objArray = new Object[0];
                a.D().w("CameraAssistant", "showDownloadDialogIfResourceMiss", objArray);
                p0.q = true;
                List list = p0.J.d().E();
                if (!list.isEmpty()) {
                   p0.d2(list, null, new r(p0), new s(p0));
                }
             }
          }
       }
       return;
    }
}
