package com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$f;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.i;
import aq5.d;
import lp3.c;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;

public final class BaseLiveAudienceSingleChatPresenter$f implements Runnable	// class@000a89
{
    public final BaseLiveAudienceSingleChatPresenter b;

    public void BaseLiveAudienceSingleChatPresenter$f(BaseLiveAudienceSingleChatPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceSingleChatPresenter$f.class, "1")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW};
       this.b.S8().a(d.class).L8(uoaArray);
       return;
    }
}
