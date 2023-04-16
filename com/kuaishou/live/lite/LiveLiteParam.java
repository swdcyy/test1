package com.kuaishou.live.lite.LiveLiteParam;
import java.lang.Object;
import com.kuaishou.live.lite.LiveLiteParam$a;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.util.Map;
import com.kuaishou.android.live.model.QLivePlayConfig;

public class LiveLiteParam	// class@001d69
{
    public boolean mAdaptBottomBar;
    public int mInnerCustomSourceType;
    public String mLivePlayPageSessionId;
    public LiveStreamFeed mLiveStreamFeed;
    public String mPage;
    public int mPageType;
    public Map mPageUrlParamMap;
    public int mSourceType;
    public String mSourceUrl;
    public int mStartPlaySourceType;

    public void LiveLiteParam(){
       super();
       this.mAdaptBottomBar = true;
    }
    public void LiveLiteParam(LiveLiteParam$a p0){
       super();
    }
    public int getInnerCustomSourceType(){
       LiveLiteParam tmInnerCusto = this.mInnerCustomSourceType;
       if (tmInnerCusto > null) {
       }else {
          tmInnerCusto = this.mSourceType;
       }
       return tmInnerCusto;
    }
    public String getLivePlayPageSessionId(){
       return this.mLivePlayPageSessionId;
    }
    public LiveStreamFeed getLiveStreamFeed(){
       return this.mLiveStreamFeed;
    }
    public String getPage(){
       return this.mPage;
    }
    public int getPageType(){
       return this.mPageType;
    }
    public Map getPageUrlParamMap(){
       return this.mPageUrlParamMap;
    }
    public QLivePlayConfig getQLivePlayConfig(){
       return this.mLiveStreamFeed.mConfig;
    }
    public int getSourceType(){
       return this.mSourceType;
    }
    public String getSourceUrl(){
       return this.mSourceUrl;
    }
    public int getStartPlaySourceType(){
       return this.mStartPlaySourceType;
    }
    public boolean isAdaptBottomBar(){
       return this.mAdaptBottomBar;
    }
    public void setLivePlayPageSessionId(String p0){
       this.mLivePlayPageSessionId = p0;
    }
}
