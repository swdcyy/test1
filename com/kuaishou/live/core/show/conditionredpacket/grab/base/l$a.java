package com.kuaishou.live.core.show.conditionredpacket.grab.base.l$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.l;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketRollUserDialogFragment$a;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import b62.j0;
import u52.t;
import j62.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import i62.t$c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import k2b.e0;
import u52.u;

public class l$a extends m	// class@000a90
{
    public final l c;

    public void l$a(l p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, str)) {
          return;
       }
       l m = this.c.M;
       Objects.requireNonNull(m);
       if (!PatchProxy.applyVoid(null, m, LiveConditionRedPacketRollUserDialogFragment$a.class, str) && m.a.isAdded()) {
          m.a.dismissAllowingStateLoss();
       }
       l$a tc = this.c;
       j0 q = tc.q;
       LiveConditionRedPacketInfo liveConditio = tc.p.c.l(q.a, q.b);
       BaseFragment uBaseFragmen = this.c.r.b();
       ClientContent$LiveStreamPackage liveStreamPa = this.c.p.a.a();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.c.r.y();
       j0 q1 = this.c.q;
       a b = q1.b;
       a a = q1.a;
       long l = (liveConditio == null)? 0: liveConditio.j / 0xea60;
       int i = (liveConditio == null)? 0: liveConditio.v.getValue().intValue();
       u.g(uBaseFragmen, liveStreamPa, liveVoicePar, b, a, l, i, 1);
       return;
    }
}
