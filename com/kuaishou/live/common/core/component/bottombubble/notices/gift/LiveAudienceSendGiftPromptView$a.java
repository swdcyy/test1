package com.kuaishou.live.common.core.component.bottombubble.notices.gift.LiveAudienceSendGiftPromptView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.bottombubble.notices.gift.LiveAudienceSendGiftPromptView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.a;
import qrd.l1;

public final class LiveAudienceSendGiftPromptView$a extends m	// class@000fbe
{
    public final LiveAudienceSendGiftPromptView c;

    public void LiveAudienceSendGiftPromptView$a(LiveAudienceSendGiftPromptView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSendGiftPromptView$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       LiveAudienceSendGiftPromptView g = this.c.g;
       if (g != null) {
          g.invoke();
       }
       return;
    }
}
