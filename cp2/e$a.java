package cp2.e$a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import msd.l;
import java.lang.Object;
import zo2.n0;
import java.util.Map;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;

public final class e$a implements RtcManager$c	// class@0023be
{
    public final l b;

    public void e$a(l p0){
       this.b = p0;
       super();
    }
    public void H(){
       n0.f(this);
    }
    public void I(Object p0){
       n0.b(this, p0);
    }
    public void N(Object p0,Map p1){
       n0.e(this, p0, p1);
    }
    public void X(LiveAryaBroadcastProto$LiveAryaBroadcastMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       a.p(p0, "broadcast");
       this.b.invoke(p0);
       return;
    }
    public void e(Set p0){
       n0.a(this, p0);
    }
    public void f(Object p0,int p1){
       n0.d(this, p0, p1);
    }
    public void i0(Object p0){
       n0.c(this, p0);
    }
}
