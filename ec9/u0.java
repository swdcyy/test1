package ec9.u0;
import erd.g;
import ec9.v0;
import ac9.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ec9.b1;
import ec9.k;
import sa6.b;
import cc9.q;
import com.yxcorp.gifshow.camera.record.assistant.model.MusicAssistantTemplate;
import java.util.HashMap;
import java.util.List;
import j8c.a;
import w46.b;

public final class u0 implements g	// class@00219a
{
    public final v0 b;
    public final g c;
    public final boolean d;

    public void u0(v0 p0,g p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u0.class, "1")) {
       }else {
          b uob = this.b.a().j();
          this.c.setCollection(this.d);
          this.b.a().h(q.a(uob, null, 0, 0, null, false, false, uob.j(), false, 191, null));
          a.D().e("CameraAssistant", "camera assistant magicFace collection status change error", p0);
       }
       return;
    }
}
