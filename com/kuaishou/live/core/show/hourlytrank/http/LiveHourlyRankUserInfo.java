package com.kuaishou.live.core.show.hourlytrank.http.LiveHourlyRankUserInfo;
import java.io.Serializable;
import it5.b;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import va1.k0;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.robust.PatchProxyResult;

public class LiveHourlyRankUserInfo implements Serializable, b, a	// class@000c1e
{
    public boolean b;
    public String mBase64Segments;
    public String mDisablePkInvitationMessage;
    public String mDisplayKsCoin;
    public boolean mFollowing;
    public LiveHourlyRankHighValueUserInfo mHighValueUserInfo;
    public List mIconSegments;
    public String mLiveStreamId;
    public int mPkButtonStatus;
    public UserInfo mUserInfo;
    public static final long serialVersionUID = 0xd2a9e146bdc72a2c;

    public void LiveHourlyRankUserInfo(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankUserInfo.class, "2")) {
          return;
       }
       this.mIconSegments = k0.a(this.mBase64Segments);
       return;
    }
    public boolean enablePkButtonShow(){
       LiveHourlyRankUserInfo tmPkButtonSt = this.mPkButtonStatus;
       boolean b = (tmPkButtonSt == 2 || tmPkButtonSt == 3)? true: false;
       return b;
    }
    public String getLiveStreamId(){
       return this.mLiveStreamId;
    }
    public UserInfo getUserInfo(){
       LiveHourlyRankUserInfo obj = PatchProxy.apply(null, this, LiveHourlyRankUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mUserInfo;
       if (obj == null) {
          UserInfo userInfo = new UserInfo();
       }
       return obj;
    }
    public boolean isFollowing(){
       return this.mFollowing;
    }
    public boolean isPkButtonValid(){
       boolean b = (this.mPkButtonStatus == 2)? true: false;
       return b;
    }
    public boolean isShowed(){
       return this.b;
    }
    public void setShowed(boolean p0){
       this.b = p0;
    }
}
