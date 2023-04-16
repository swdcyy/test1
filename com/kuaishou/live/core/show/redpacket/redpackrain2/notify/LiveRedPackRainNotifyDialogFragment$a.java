package com.kuaishou.live.core.show.redpacket.redpackrain2.notify.LiveRedPackRainNotifyDialogFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.LiveRedPackRainNotifyDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ih2.n;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.g;
import crd.b;
import ok.h;
import lnc.b9;

public class LiveRedPackRainNotifyDialogFragment$a extends m	// class@000f0b
{
    public final LiveRedPackRainNotifyDialogFragment c;

    public void LiveRedPackRainNotifyDialogFragment$a(LiveRedPackRainNotifyDialogFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPackRainNotifyDialogFragment$a.class, "1")) {
          return;
       }
       LiveRedPackRainNotifyDialogFragment$a tc = this.c;
       n.c(tc.C, "ORDER", tc.B.a());
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, LiveRedPackRainNotifyDialogFragment.class, "4")) {
          tc.A = b9.c(tc.A, new g(tc));
       }
       return;
    }
}
