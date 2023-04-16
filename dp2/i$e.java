package dp2.i$e;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import dp2.i;
import java.lang.Object;
import zo2.n0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dp2.a;
import kotlin.jvm.internal.a;
import qrd.l1;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import java.util.Set;

public final class i$e implements RtcManager$c	// class@002577
{
    public final i b;

    public void i$e(i p0){
       this.b = p0;
       super();
    }
    public void H(){
       n0.f(this);
    }
    public void I(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$e.class, "1")) {
          return;
       }
       if (a.g(p0, a.a)) {
          this.b.b.onNext(l1.a);
       }
       return;
    }
    public void N(Object p0,Map p1){
       n0.e(this, p0, p1);
    }
    public void X(LiveAryaBroadcastProto$LiveAryaBroadcastMessage p0){
       n0.g(this, p0);
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
