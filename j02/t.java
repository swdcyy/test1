package j02.t;
import erd.g;
import java.lang.String;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j02.u;
import java.util.List;
import com.kuaishou.android.live.log.b;
import j02.d;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.HashSet;

public final class t implements g	// class@002a30
{
    public final String b;

    public void t(String p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
       }else {
          b.P(u.a, "reportWatchLiveTaskFinish - success");
          p0 = d.c;
          t tb = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(tb, p0, d.class, "2")) {
             a.p(tb, "taskId");
             d.a.add(tb);
          }
       }
       return;
    }
}
