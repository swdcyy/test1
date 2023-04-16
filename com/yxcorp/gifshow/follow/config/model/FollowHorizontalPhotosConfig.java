package com.yxcorp.gifshow.follow.config.model.FollowHorizontalPhotosConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class FollowHorizontalPhotosConfig implements Serializable	// class@001092
{
    public boolean mEnableShow;
    public int mMinFeedCount;
    public int mMinWatchSeconds;
    public static final long serialVersionUID = 0x2403ac99bf2f0fe;

    public void FollowHorizontalPhotosConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowHorizontalPhotosConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FollowHorizontalPhotosConfig{mEnableShow="+this.mEnableShow+", mMinWatchSeconds="+this.mMinWatchSeconds+", mMinFeedCount=\'"+this.mMinFeedCount+'''+'}';
    }
}
