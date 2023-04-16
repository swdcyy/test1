package nd9.a0;
import java.lang.Runnable;
import nd9.z;
import vf9.f0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.android.model.music.Music;
import java.util.ArrayList;
import j8c.a;
import q87.c;
import fw8.r;
import kotlin.jvm.internal.a;
import fw8.r$a;
import com.kuaishou.android.model.music.MusicType;

public final class a0 implements Runnable	// class@003130
{
    public final z b;
    public final f0 c;

    public void a0(z p0,f0 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray;
       z z;
       if (PatchProxy.applyVoidWithListener(null, this, a0.class, "1")) {
          return;
       }
       a0 tb = this.b;
       a0 tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(tc, tb, z.class, "6")) {
          int i = 0;
          if (tb.g2()) {
             f0 b = tc.b;
             if (b != null) {
                if (tb.t.contains(b.getId())) {
                   objArray = new Object[i];
                   a.D().w(tb.o, "duplicate query", objArray);
                }else {
                   tb.t.add(tc.b.getId());
                   tb.u = tc.b.getId();
                   z = tb.z;
                   a.m(z);
                   r.c().a(z);
                   String id = tc.b.getId();
                   a.o(id, "event.mMusic.id");
                   Music mType = tc.b.mType;
                   a.o(mType, "event.mMusic.mType");
                   tb.k2(id, mType.getValue());
                }
             }
          }
          objArray = new Object[i];
          a.D().w(tb.o, "popup can\'t show, don\'t request", objArray);
       }
       PatchProxy.onMethodExit(a0.class, "1");
       return;
    }
}
