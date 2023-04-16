package knd.h$b;
import com.kwai.video.stannis.observers.AudioBufferPlayObserver;
import knd.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import faa.a;
import q87.c;
import knd.j$a;

public final class h$b extends AudioBufferPlayObserver	// class@0017e3
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public void onCompleted(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
          return;
       }
       a.p(p0, "s");
       h$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, h.class, "4")) {
          Object[] objArray = new Object[0];
          a.D().w("TTSAuditionManagerV2", "auditionFinished: ", objArray);
          h l = ta.l;
          if (l != null) {
             l.c();
          }
          ta.k = false;
       }
       return;
    }
}
