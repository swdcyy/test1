package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$h;
import androidx.fragment.app.c$b;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;

public final class LiveRichCardCoreManager$h extends c$b	// class@000f48
{
    public final LiveRichCardCoreManager a;

    public void LiveRichCardCoreManager$h(LiveRichCardCoreManager p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRichCardCoreManager$h.class, "2")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       b.P(LiveRichCardStateManager.h.f().appendTag(this.a.m()), "[onLiveFragmentPaused] ÔÝÍ£");
       this.a.u();
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRichCardCoreManager$h.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       b.S(LiveRichCardStateManager.h.f().appendTag(this.a.m()), "[onLiveFragmentResumed] »Ö¸´", "hasInit", Boolean.valueOf(this.a.s));
       this.a.n();
       return;
    }
}
