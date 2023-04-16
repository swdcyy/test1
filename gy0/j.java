package gy0.j;
import erd.g;
import com.kuaishou.live.audience.component.comments.send.e;
import java.lang.Object;
import njd.a;
import t02.a0;
import com.kuaishou.live.common.core.component.comments.parser.LiveCommentsMocker;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.comments.model.LiveAudienceMerchantSendCSSuccessMessage;
import java.lang.System;
import com.kuaishou.live.basic.model.QLiveMessage;
import lnc.a1;
import n81.a;

public final class j implements g	// class@0025ad
{
    public final e b;

    public void j(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b.r.X;
       LiveAudienceMerchantSendCSSuccessMessage liveAudience = PatchProxy.apply(null, null, LiveCommentsMocker.class, "5");
       if (liveAudience != PatchProxyResult.class) {
       }else {
          liveAudience = new LiveAudienceMerchantSendCSSuccessMessage();
          long l = System.currentTimeMillis();
          liveAudience.mId = String.valueOf(l);
          liveAudience.mTime = l;
          liveAudience.mContent = a1.p(0x7f103445);
       }
       p0.R0(liveAudience);
       return;
    }
}
