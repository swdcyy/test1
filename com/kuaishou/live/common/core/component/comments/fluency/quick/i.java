package com.kuaishou.live.common.core.component.comments.fluency.quick.i;
import vf1.b;
import com.kuaishou.live.common.core.component.comments.fluency.quick.j;
import java.lang.Object;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.comments.fluency.quick.h;
import gf1.k;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened;

public final class i implements b	// class@001092
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void x6(LiveAudienceDelayInfosResponse p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "6")) {
       }else {
          LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened sCLiveQuickC = k0.b(p0, h.a, new k(tb)).orNull();
          if (sCLiveQuickC != null) {
             tb.j(sCLiveQuickC);
          }
       }
       return;
    }
}
