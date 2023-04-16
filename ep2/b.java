package ep2.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import ep2.c;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Object;
import zo2.n0;
import java.util.Map;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jp2.c;
import qrd.l1;
import io.reactivex.subjects.PublishSubject;
import java.util.Set;

public final class b implements RtcManager$c	// class@0027ab
{
    public final c b;
    public final KtvMusicOrderInfo c;

    public void b(c p0,KtvMusicOrderInfo p1){
       this.b = p0;
       this.c = p1;
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
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "broadcast");
       if (p0.type == 2 && (a.g(p0.bizId, this.b.g.a()) && a.g(p0.senderId, String.valueOf(this.c.userId)))) {
          this.b.a.onNext(l1.a);
       }
    label_003e :
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
