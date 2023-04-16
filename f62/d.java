package f62.d;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.conditionredpacket.grab.share.c;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import tw1.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import u52.t;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import z52.c;

public final class d implements View$OnClickListener	// class@0028b0
{
    public final c b;
    public final LiveConditionRedPacketInfo c;

    public void d(c p0,LiveConditionRedPacketInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, c.class, "25")) {
       }else {
          d.h(tb.s.a(), tc.c, 2);
       }
       d.g(tb.s.b(), tb.s.a(), null, tc.c, tc.b, "ADD_MONEY", LiveConditionRedPacketInfo.a(tc), tb.r.i);
       tb.r.b.c(tc);
       return;
    }
}
