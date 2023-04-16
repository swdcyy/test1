package b5d.c$a;
import g5d.e;
import java.lang.Object;
import npb.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import b5d.c;
import java.util.Objects;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public final class c$a implements e	// class@0003a6
{

    public void c$a(){
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       a.p(p0, "music");
       c p = c.p;
       String str = p0.b();
       a.o(str, "music.getCacheKey\(\)");
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoidOneRefs(str, p, c.class, "5")) {
          CountDownLatch uCountDownLa = c.l.remove(str);
          if (uCountDownLa != null) {
             uCountDownLa.countDown();
          }
       }
       return;
    }
}
