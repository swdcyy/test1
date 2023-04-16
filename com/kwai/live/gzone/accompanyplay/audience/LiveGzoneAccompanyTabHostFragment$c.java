package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$c;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.live.gzone.accompanyplay.audience.o;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kwai.live.gzone.accompanyplay.audience.p0$e;

public class LiveGzoneAccompanyTabHostFragment$c extends b	// class@000b5e
{
    public final LiveGzoneAccompanyTabHostFragment d;

    public void LiveGzoneAccompanyTabHostFragment$c(LiveGzoneAccompanyTabHostFragment p0,PagerSlidingTabStrip$d p1,Class p2,Bundle p3){
       this.d = p0;
       super(p1, p2, null);
    }
    public void d(int p0,Fragment p1){
       LiveGzoneAccompanyTabHostFragment$c uoc = LiveGzoneAccompanyTabHostFragment$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "1")) {
          return;
       }
       if (p1 instanceof o) {
          p1.W5(this.d.J);
          LiveGzoneAccompanyTabHostFragment$c td = this.d;
          p1.R2(td.B, td.C);
       }
       return;
    }
}
