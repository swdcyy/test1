package com.kwai.feature.api.social.message.bridge.model.UserOnlineStatus;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UserOnlineStatus implements Serializable	// class@001143
{
    public final boolean isOnline;
    public final long lastOffTime;
    public final String userId;

    public void UserOnlineStatus(String p0,boolean p1,long p2){
       a.p(p0, "userId");
       super();
       this.userId = p0;
       this.isOnline = p1;
       this.lastOffTime = p2;
    }
    public static UserOnlineStatus copy$default(UserOnlineStatus p0,String p1,boolean p2,long p3,int p4,Object p5){
       UserOnlineStatus userId;
       UserOnlineStatus isOnline;
       UserOnlineStatus lastOffTime;
       if (p4 & 0x01) {
          userId = p0.userId;
       }
       if (p4 & 0x02) {
          isOnline = p0.isOnline;
       }
       if (p4 & 0x04) {
          lastOffTime = p0.lastOffTime;
       }
       return p0.copy(userId, isOnline, lastOffTime);
    }
    public final String component1(){
       return this.userId;
    }
    public final boolean component2(){
       return this.isOnline;
    }
    public final long component3(){
       return this.lastOffTime;
    }
    public final UserOnlineStatus copy(String p0,boolean p1,long p2){
       if (PatchProxy.isSupport(UserOnlineStatus.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), this, UserOnlineStatus.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "userId");
       return new UserOnlineStatus(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserOnlineStatus.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UserOnlineStatus && (a.g(this.userId, p0.userId) && (this.isOnline == p0.isOnline && !this.lastOffTime - p0.lastOffTime)))) {
          return true;
       }
       return false;
    }
    public final long getLastOffTime(){
       return this.lastOffTime;
    }
    public final String getUserId(){
       return this.userId;
    }
    public int hashCode(){
       UserOnlineStatus obj = PatchProxy.apply(null, this, UserOnlineStatus.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       UserOnlineStatus tisOnline = this.isOnline;
       if (tisOnline != null) {
          tisOnline = 1;
       }
       tisOnline = this.lastOffTime;
       return (((i + tisOnline) * 31) + (int)(tisOnline ^ (tisOnline >> 32)));
    }
    public final boolean isOnline(){
       return this.isOnline;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UserOnlineStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UserOnlineStatus\(userId="+this.userId+", isOnline="+this.isOnline+", lastOffTime="+this.lastOffTime+"\)";
    }
}
