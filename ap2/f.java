package ap2.f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class f implements g	// class@0002aa
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          a.p(p0, "error");
          b.k0(LiveLogTag.LIVE_VOICE_PARTY, "updateWallClockTime", p0);
       }
       return;
    }
}
