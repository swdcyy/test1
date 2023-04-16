package com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam$b$a;
import ok.h;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam$b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;

public class LiveSlidePlayFeedFlowParam$b$a implements h	// class@001010
{
    public final LiveSlidePlayFeedFlowParam$b b;

    public void LiveSlidePlayFeedFlowParam$b$a(LiveSlidePlayFeedFlowParam$b p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       BaseFeed uBaseFeed = PatchProxy.applyOneRefs(p0, this, LiveSlidePlayFeedFlowParam$b$a.class, "1");
       if (uBaseFeed != PatchProxyResult.class) {
       }else {
          uBaseFeed = p0.getEntity();
       }
       return uBaseFeed;
    }
}
