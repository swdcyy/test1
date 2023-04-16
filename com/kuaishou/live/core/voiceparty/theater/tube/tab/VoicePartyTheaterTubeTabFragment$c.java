package com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment$c;
import erd.g;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mkc.b;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.a;
import android.view.View$OnClickListener;

public final class VoicePartyTheaterTubeTabFragment$c implements g	// class@001a3b
{
    public final VoicePartyTheaterTubeTabFragment b;
    public final View c;

    public void VoicePartyTheaterTubeTabFragment$c(VoicePartyTheaterTubeTabFragment p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeTabFragment$c.class, "1")) {
       }else {
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.b();
          uoa.p(new a(this));
          uoa.a(c.h(this.c, b.g));
       }
       return;
    }
}
