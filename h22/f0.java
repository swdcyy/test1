package h22.f0;
import java.lang.Runnable;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uw1.m;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class f0 implements Runnable	// class@002bf4
{
    public final LiveActivityRedPacketPresenter b;
    public final String c;

    public void f0(LiveActivityRedPacketPresenter p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f0 tb = this.b;
       f0 tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, LiveActivityRedPacketPresenter.class, "14")) {
       }else {
          LiveActivityRedPacketPresenter q = tb.q;
          if (q != null && q.e()) {
             b.P(LiveActivityRedPacketPresenter.I, "doAutoShowRedPacketContainer, cannot auto show");
          }else {
             tb.C.clear();
             tb.C.add(tc);
             tb.y = tb.y + 1;
             LiveActivityRedPacketPresenter q1 = tb.q;
             if (q1 != null) {
                q1.j(tc, null);
             }
             b.P(LiveActivityRedPacketPresenter.I, "doAutoShowRedPacketContainer");
          }
       }
       return;
    }
}
