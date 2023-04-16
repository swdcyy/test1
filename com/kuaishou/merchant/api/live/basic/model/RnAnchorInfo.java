package com.kuaishou.merchant.api.live.basic.model.RnAnchorInfo;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class RnAnchorInfo implements Serializable	// class@001565
{
    public final CDNUrl[] avatars;
    public final Boolean following;
    public final String userId;
    public final String userName;

    public void RnAnchorInfo(String p0,String p1,CDNUrl[] p2,Boolean p3){
       super();
       this.userId = p0;
       this.userName = p1;
       this.avatars = p2;
       this.following = p3;
    }
    public static RnAnchorInfo copy$default(RnAnchorInfo p0,String p1,String p2,CDNUrl[] p3,Boolean p4,int p5,Object p6){
       RnAnchorInfo userId;
       RnAnchorInfo userName;
       RnAnchorInfo avatars;
       RnAnchorInfo following;
       if (p5 & 0x01) {
          userId = p0.userId;
       }
       if (p5 & 0x02) {
          userName = p0.userName;
       }
       if (p5 & 0x04) {
          avatars = p0.avatars;
       }
       if (p5 & 0x08) {
          following = p0.following;
       }
       return p0.copy(userId, userName, avatars, following);
    }
    public final String component1(){
       return this.userId;
    }
    public final String component2(){
       return this.userName;
    }
    public final CDNUrl[] component3(){
       return this.avatars;
    }
    public final Boolean component4(){
       return this.following;
    }
    public final RnAnchorInfo copy(String p0,String p1,CDNUrl[] p2,Boolean p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, RnAnchorInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RnAnchorInfo(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RnAnchorInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RnAnchorInfo && (a.g(this.userId, p0.userId) && (a.g(this.userName, p0.userName) && (a.g(this.avatars, p0.avatars) && a.g(this.following, p0.following)))))) {
          return true;
       }
       return false;
    }
    public final CDNUrl[] getAvatars(){
       return this.avatars;
    }
    public final Boolean getFollowing(){
       return this.following;
    }
    public final String getUserId(){
       return this.userId;
    }
    public final String getUserName(){
       return this.userName;
    }
    public int hashCode(){
       RnAnchorInfo obj = PatchProxy.apply(null, this, RnAnchorInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RnAnchorInfo tuserName = this.userName;
       int i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.avatars;
       i2 = (tuserName != null)? Arrays.hashCode(tuserName): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.following;
       if (tuserName != null) {
          i = tuserName.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RnAnchorInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RnAnchorInfo\(userId="+this.userId+", userName="+this.userName+", avatars="+Arrays.toString(this.avatars)+", following="+this.following+"\)";
    }
}
