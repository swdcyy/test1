package com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment$b;
import sfc.a;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.View;
import mkc.b;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import tt2.g;
import android.view.View$OnClickListener;

public class LiveVoicePartyKtvMusicFragment$b extends a	// class@0017c3
{
    public final LiveVoicePartyKtvMusicFragment c;

    public void LiveVoicePartyKtvMusicFragment$b(LiveVoicePartyKtvMusicFragment p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvMusicFragment$b.class, "1")) {
          return;
       }
       super.b(p0);
       LiveVoicePartyKtvMusicFragment$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, LiveVoicePartyKtvMusicFragment.class, "11")) {
          tc.E.setVisibility(0);
          b[] uobArray = new b[]{b.e};
          c.d(tc.E, uobArray);
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.p(new g(tc));
          uoa.a(c.h(tc.E, b.g));
       }
       return;
    }
}
