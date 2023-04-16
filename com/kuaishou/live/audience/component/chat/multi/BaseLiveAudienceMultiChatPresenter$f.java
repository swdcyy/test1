package com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$f;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.i;
import aq5.d;
import lp3.c;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;

public final class BaseLiveAudienceMultiChatPresenter$f implements Runnable	// class@000a7e
{
    public final BaseLiveAudienceMultiChatPresenter b;

    public void BaseLiveAudienceMultiChatPresenter$f(BaseLiveAudienceMultiChatPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceMultiChatPresenter$f.class, "1")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW};
       this.b.V8().a(d.class).L8(uoaArray);
       return;
    }
}
