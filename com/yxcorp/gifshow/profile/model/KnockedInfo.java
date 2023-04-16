package com.yxcorp.gifshow.profile.model.KnockedInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KnockedInfo implements Serializable	// class@00138c
{
    public final int followFansPublicSetting;

    public void KnockedInfo(int p0){
       super();
       this.followFansPublicSetting = p0;
    }
    public static KnockedInfo copy$default(KnockedInfo p0,int p1,int p2,Object p3){
       KnockedInfo followFansPu;
       if (p2 & 0x01) {
          followFansPu = p0.followFansPublicSetting;
       }
       return p0.copy(followFansPu);
    }
    public final int component1(){
       return this.followFansPublicSetting;
    }
    public final KnockedInfo copy(int p0){
       if (PatchProxy.isSupport(KnockedInfo.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KnockedInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new KnockedInfo(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof KnockedInfo && this.followFansPublicSetting == p0.followFansPublicSetting)) {
          return true;
       }
       return false;
    }
    public final int getFollowFansPublicSetting(){
       return this.followFansPublicSetting;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, KnockedInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.followFansPublicSetting;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KnockedInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KnockedInfo\(followFansPublicSetting="+this.followFansPublicSetting+"\)";
    }
}
