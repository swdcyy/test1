package com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;
import java.io.Serializable;
import ln1.b;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.model.mix.CommonMeta;

public class LiveHotSpotLiveViewData implements Serializable, b	// class@0013ce
{
    public String mDisplayWatchingCount;
    public boolean mHasReportShowEvent;
    public LiveStreamFeed mLiveStreamView;

    public void LiveHotSpotLiveViewData(){
       super();
    }
    public String getAuthorId(){
       LiveHotSpotLiveViewData tmLiveStream = this.mLiveStreamView;
       if (tmLiveStream != null) {
          return tmLiveStream.mUser.mId;
       }
       return null;
    }
    public BaseFeed getBaseFeed(){
       LiveHotSpotLiveViewData tmLiveStream = this.mLiveStreamView;
       if (tmLiveStream != null) {
          return tmLiveStream;
       }
       return null;
    }
    public boolean getHasReportShowEvent(){
       return this.mHasReportShowEvent;
    }
    public String getRelatedId(){
       LiveHotSpotLiveViewData tmLiveStream = this.mLiveStreamView;
       if (tmLiveStream != null) {
          return tmLiveStream.mLiveStreamModel.mLiveStreamId;
       }
       return null;
    }
    public String getServerExpTag(){
       LiveHotSpotLiveViewData tmLiveStream = this.mLiveStreamView;
       if (tmLiveStream != null) {
          return tmLiveStream.mCommonMeta.mServerExpTag;
       }
       return null;
    }
    public void setHasReportShowEvent(boolean p0){
       this.mHasReportShowEvent = p0;
    }
}
