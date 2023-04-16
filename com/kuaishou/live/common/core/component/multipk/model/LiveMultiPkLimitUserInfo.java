package com.kuaishou.live.common.core.component.multipk.model.LiveMultiPkLimitUserInfo;
import java.io.Serializable;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveMultiPkLimitUserInfo implements Serializable	// class@00164c
{
    public final int availablePkTimes;
    public final UserInfo userInfo;

    public void LiveMultiPkLimitUserInfo(UserInfo p0,int p1){
       a.p(p0, "userInfo");
       super();
       this.userInfo = p0;
       this.availablePkTimes = p1;
    }
    public static LiveMultiPkLimitUserInfo copy$default(LiveMultiPkLimitUserInfo p0,UserInfo p1,int p2,int p3,Object p4){
       LiveMultiPkLimitUserInfo userInfo;
       LiveMultiPkLimitUserInfo availablePkT;
       if (p3 & 0x01) {
          userInfo = p0.userInfo;
       }
       if (p3 & 0x02) {
          availablePkT = p0.availablePkTimes;
       }
       return p0.copy(userInfo, availablePkT);
    }
    public final UserInfo component1(){
       return this.userInfo;
    }
    public final int component2(){
       return this.availablePkTimes;
    }
    public final LiveMultiPkLimitUserInfo copy(UserInfo p0,int p1){
       if (PatchProxy.isSupport(LiveMultiPkLimitUserInfo.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, LiveMultiPkLimitUserInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "userInfo");
       return new LiveMultiPkLimitUserInfo(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkLimitUserInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMultiPkLimitUserInfo && (a.g(this.userInfo, p0.userInfo) && this.availablePkTimes == p0.availablePkTimes))) {
          return true;
       }
       return false;
    }
    public final int getAvailablePkTimes(){
       return this.availablePkTimes;
    }
    public final UserInfo getUserInfo(){
       return this.userInfo;
    }
    public int hashCode(){
       LiveMultiPkLimitUserInfo obj = PatchProxy.apply(null, this, LiveMultiPkLimitUserInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userInfo;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.availablePkTimes);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkLimitUserInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiPkLimitUserInfo\(userInfo="+this.userInfo+", availablePkTimes="+this.availablePkTimes+"\)";
    }
}
