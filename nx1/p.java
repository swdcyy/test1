package nx1.p;
import erd.g;
import nx1.q;
import nx1.j;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import java.lang.Object;
import sx4.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import px1.a;
import java.lang.Iterable;
import qk.m;
import nx1.k;
import ok.o;
import com.google.common.base.Optional;
import com.google.protobuf.nano.MessageNano;
import java.util.Collections;
import lx1.c;

public final class p implements g	// class@003419
{
    public final q b;
    public final j c;
    public final LiveInteractiveWidgetProto$LiveInteractiveWidget d;

    public void p(q p0,j p1,LiveInteractiveWidgetProto$LiveInteractiveWidget p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       p op = this;
       p b = op.b;
       p c = op.c;
       p d = op.d;
       e uoe = p0;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidThreeRefs(c, d, uoe, b, q.class, "5")) {
       }else {
          b.d0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "onKDSLoadSuccess", "taskKey", c.a(), "originWidgetId", d.widgetId);
          b.b.remove(c);
          a uoa = new a(uoe, d, c);
          LiveInteractiveWidgetProto$LiveInteractiveWidget liveInteract = m.s(b.a).r(new k(b, c)).orNull();
          if (liveInteract == null) {
             uoa.g();
          }else if(!MessageNano.messageNanoEquals(liveInteract, d)){
             uoa.c();
             uoa.k(liveInteract);
          }
          b.a.remove(liveInteract);
          b.c.add(uoa);
          Collections.sort(b.c);
          b.f.E();
       }
       return;
    }
}
