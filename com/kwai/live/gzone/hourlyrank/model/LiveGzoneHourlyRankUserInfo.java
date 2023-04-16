package com.kwai.live.gzone.hourlyrank.model.LiveGzoneHourlyRankUserInfo;
import java.io.Serializable;
import it5.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.UserInfo;
import it5.a;

public class LiveGzoneHourlyRankUserInfo implements Serializable, b	// class@000d87
{
    public boolean b;
    public String mLiveStreamId;
    public String mRank;
    public String mRankValue;
    public UserInfo mUserInfo;
    public static final long serialVersionUID = 0xf058c2ddb12ddace;

    public void LiveGzoneHourlyRankUserInfo(){
       super();
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneHourlyRankUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.mLiveStreamId);
    }
    public UserInfo getUserInfo(){
       return this.mUserInfo;
    }
    public boolean isFollowing(){
       return a.a(this);
    }
    public boolean isPkButtonValid(){
       return a.b(this);
    }
    public boolean isShowed(){
       return this.b;
    }
    public void setShowed(boolean p0){
       this.b = p0;
    }
}
