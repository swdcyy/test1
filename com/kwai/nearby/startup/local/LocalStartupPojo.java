package com.kwai.nearby.startup.local.LocalStartupPojo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LocalStartupPojo implements Serializable	// class@001019
{
    public FestivalBubbleConfig mFestivalBubbleConfig;
    public NearbyPreLoadInfo mNearbyFeedPreLoadConfig;
    public FilterBubbleConfig mNearbyFilterBoxBubbleConfig;
    public NearbyInnerLocationGuide mNearbyInnerLocationGuide;
    public NearbyInnerSlideGuide mNearbyInnerSlideGuide;
    public LivePlayConfig mNearbyLivePlayConfig;
    public NearbyLocationWindowShowConfig mNearbyLocationWindowShowConfig;
    public NearbyMapConfig mNearbyMapConfig;
    public NearbyPoiInterceptConfig mNearbyPoiInterceptConfig;
    public NearbyRedDot mNearbyRedDot;
    public NearbyTabNameChangeConfig mNearbyTabNameChangeConfig;
    public NearbyTabNameExpConfig mNearbyTabNameConfig;
    public String mNearbyWireMagicFaceId;
    public List mSubcategories;

    public void LocalStartupPojo(){
       super();
       this.mNearbyWireMagicFaceId = "4980";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LocalStartupPojo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Í¬³ÇStartup{mNearbyLivePlayConfig="+this.mNearbyLivePlayConfig+", mFestivalBubbleConfig="+this.mFestivalBubbleConfig+", mNearbyWireMagicFaceId=\'"+this.mNearbyWireMagicFaceId+'''+", nearbyFilterBoxBubbleConfig=\'"+this.mNearbyFilterBoxBubbleConfig+'''+", nearbyTabNameChangeConfig=\'"+this.mNearbyTabNameChangeConfig+'''+", nearbyFeedPreloadConfig=\'"+this.mNearbyFeedPreLoadConfig+'''+", nearbyMapConfig=\'"+this.mNearbyMapConfig+'''+", nearbyInnerSlideGuide=\'"+this.mNearbyInnerSlideGuide+'''+", nearbyLocationWindowShowConfig=\'"+this.mNearbyLocationWindowShowConfig+'''+", nearbyPoiTagConfig=\'"+this.mNearbyPoiInterceptConfig+'''+", nearbyTabNameConfig=\'"+this.mNearbyTabNameConfig+'''+'}';
    }
}
