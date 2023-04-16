package e62.h;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.e;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.b;
import p91.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.google.common.base.Optional;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.c;
import ok.h;
import tw1.d;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.LiveConditionRedPacketNormalCurrentInfoDialogFragment$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import u52.t;
import z52.c;

public final class h implements View$OnClickListener	// class@00263a
{
    public final e b;
    public final LiveConditionRedPacketInfo c;

    public void h(e p0,LiveConditionRedPacketInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       h tb = this.b;
       h tc = this.c;
       if (!tb.t.e()) {
       }else {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, e.class, "8")) {
             d.h(tb.t.a(), Optional.fromNullable(tb.F).transform(c.b).or(""), 16);
          }
          e h = tb.H;
          if (h != null) {
             objArray = h.c;
          }
          d.g(tb.t.b(), tb.t.a(), null, tc.c, tc.b, "ADD_MONEY", LiveConditionRedPacketInfo.a(tc), objArray);
          tb.p.b.c(tc);
       }
       return;
    }
}
