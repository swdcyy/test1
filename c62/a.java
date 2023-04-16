package c62.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.conditionredpacket.grab.fansgroup.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import tw1.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import u52.t;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import z52.c;

public final class a implements View$OnClickListener	// class@0004d4
{
    public final a b;
    public final LiveConditionRedPacketInfo c;

    public void a(a p0,LiveConditionRedPacketInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, a.class, "4")) {
       }else {
          d.h(tb.u.a(), tc.c, 9);
       }
       d.g(tb.u.b(), tb.u.a(), null, tc.c, tc.b, "ADD_MONEY", LiveConditionRedPacketInfo.a(tc), tb.p.i);
       tb.p.b.c(tc);
       return;
    }
}
