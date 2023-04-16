package dl2.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.subscribe.subscribelist.a;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedAnchorInfo$LiveSubscribedAnchor;
import com.kuaishou.live.core.basic.model.LiveSubscribeBookStatus;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import wk2.s;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class b implements View$OnClickListener	// class@00253d
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, a.class, "5")) {
       }else {
          a t = tb.t;
          LiveSubscribedAnchorInfo$LiveSubscribedAnchor mBookStatus = t.mBookStatus;
          if (mBookStatus == LiveSubscribeBookStatus.BOOKED) {
             tb.W8(t);
          }else if(mBookStatus == LiveSubscribeBookStatus.NOT_BOOK){
             tb.V8(t);
          }else {
             tb.V8(t);
          }
          ClientEvent$ElementPackage uElementPack = s.c(tb.P8(), tb.t);
          ClientContent$ContentPackage uContentPack = s.b(tb.t);
          if (!PatchProxy.applyVoidTwoRefs(uElementPack, uContentPack, objArray, s.class, "4")) {
             uElementPack.action2 = "LIVE_APPOINTMENT_SUBCARD";
             u1.u(1, uElementPack, uContentPack);
          }
       }
       return;
    }
}
