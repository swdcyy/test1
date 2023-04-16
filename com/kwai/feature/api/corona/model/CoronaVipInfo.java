package com.kwai.feature.api.corona.model.CoronaVipInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CoronaVipInfo implements Serializable	// class@000e12
{
    public CoronaVipInfo$CoronaVipCouponInfo coupon;
    public long rightExpireTime;
    public long timestamp;
    public int userVipStatus;
    public static CoronaVipInfo NO_LOGIN_VIP_INFO;
    public static final long serialVersionUID;

    static {
       CoronaVipInfo uCoronaVipIn = new CoronaVipInfo(-1, 0, 0);
       CoronaVipInfo.NO_LOGIN_VIP_INFO = v6;
    }
    public void CoronaVipInfo(){
       super();
    }
    public void CoronaVipInfo(int p0,long p1,long p2){
       super();
       this.userVipStatus = p0;
       this.rightExpireTime = p1;
       this.timestamp = p2;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CoronaVipInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CoronaVipInfo{userVipStatus="+this.userVipStatus+", rightExpireTime="+this.rightExpireTime+", timestamp="+this.timestamp+'}';
    }
}
