package com.kuaishou.live.model.LiveBasicInfo$LiveStreamPlayerInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveBasicInfo$LiveStreamPlayerInfo implements Serializable	// class@000ced
{
    public String mClientId;
    public List mLiveAdaptiveManifests;
    public List mLivePolicy;
    public List mMultiResolutionPlayUrls;
    public List mPlayUrls;
    public boolean mShouldUseHardwareDecoding;
    public List mWebRTCAdaptiveManifests;
    public static final long serialVersionUID = 0x9e02e561b1d00201;

    public void LiveBasicInfo$LiveStreamPlayerInfo(){
       super();
       this.mPlayUrls = new ArrayList();
       this.mLiveAdaptiveManifests = new ArrayList();
       this.mWebRTCAdaptiveManifests = new ArrayList();
       this.mMultiResolutionPlayUrls = new ArrayList();
       this.mLivePolicy = new ArrayList();
    }
}
