package bc9.b0$a;
import erd.g;
import bc9.b0;
import java.lang.Object;
import kob.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.assistant.a;
import ec9.f1;
import cc9.q;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import cc9.h;
import cc9.p;
import com.kuaishou.android.model.music.Music;
import cc9.k;
import sa6.a;

public final class b0$a implements g	// class@0003d8
{
    public final b0 b;

    public void b0$a(b0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$a.class, "1")) {
       }else {
          a.p(p0, "event");
          b0$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, b0.class, "8") && tb.u.D()) {
             Iterator iterator = tb.u.r().v0().i().entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                int i = uEntry.getKey().intValue();
                h value = uEntry.getValue();
                if (value instanceof p && a.g(value.b().getId(), p0.b)) {
                   tb.u.r().w0(new k(51, i));
                   break ;
                }
             }
          }
       }
       return;
    }
}
