package com.kuaishou.live.common.core.component.bottombubble.notices.highfrequencybehavior.LiveHighFrequencyBehaviorNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Class;
import com.kuaishou.live.common.core.component.bottombubble.notices.highfrequencybehavior.LiveHighFrequencyBehaviorNoticeInfo$ExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo$ContainerInfo;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.ClickCommentNoticeEvent;
import qrd.l1;

public final class LiveHighFrequencyBehaviorNoticeInfo extends LiveGenericCommentNoticeInfo	// class@000fce
{
    public LiveRouterNoticeInfo$ContainerInfo mContainerClickInfo;

    public void LiveHighFrequencyBehaviorNoticeInfo(){
       super();
    }
    public Class getExtraInfoClass(){
       return LiveHighFrequencyBehaviorNoticeInfo$ExtraInfo.class;
    }
    public final LiveRouterNoticeInfo$ContainerInfo getMContainerClickInfo(){
       return this.mContainerClickInfo;
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHighFrequencyBehaviorNoticeInfo.class, "1")) {
          return;
       }
       super.parsePbRemains(p0);
       SCCommentNotice clickEvent = (p0 != null)? p0.clickEvent: null;
       if (clickEvent != null) {
          LiveRouterNoticeInfo$ContainerInfo uContainerIn = new LiveRouterNoticeInfo$ContainerInfo();
          uContainerIn.mRouterUrl = p0.clickEvent.url;
          this.mContainerClickInfo = uContainerIn;
       }
       return;
    }
    public final void setMContainerClickInfo(LiveRouterNoticeInfo$ContainerInfo p0){
       this.mContainerClickInfo = p0;
    }
}
