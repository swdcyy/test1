package com.kuaishou.live.common.core.component.gift.domain.effect.bean.LiveGiftEffectAvatarData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveGiftEffectAvatarData implements Serializable	// class@0011a6
{
    public final String profile;
    public final String username;

    public void LiveGiftEffectAvatarData(String p0,String p1){
       a.p(p0, "profile");
       a.p(p1, "username");
       super();
       this.profile = p0;
       this.username = p1;
    }
    public static LiveGiftEffectAvatarData copy$default(LiveGiftEffectAvatarData p0,String p1,String p2,int p3,Object p4){
       LiveGiftEffectAvatarData profile;
       LiveGiftEffectAvatarData username;
       if (p3 & 0x01) {
          profile = p0.profile;
       }
       if (p3 & 0x02) {
          username = p0.username;
       }
       return p0.copy(profile, username);
    }
    public final String component1(){
       return this.profile;
    }
    public final String component2(){
       return this.username;
    }
    public final LiveGiftEffectAvatarData copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveGiftEffectAvatarData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "profile");
       a.p(p1, "username");
       return new LiveGiftEffectAvatarData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftEffectAvatarData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveGiftEffectAvatarData && (a.g(this.profile, p0.profile) && a.g(this.username, p0.username)))) {
          return true;
       }
       return false;
    }
    public final String getProfile(){
       return this.profile;
    }
    public final String getUsername(){
       return this.username;
    }
    public int hashCode(){
       LiveGiftEffectAvatarData obj = PatchProxy.apply(null, this, LiveGiftEffectAvatarData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.profile;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveGiftEffectAvatarData tusername = this.username;
       if (tusername != null) {
          i = tusername.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGiftEffectAvatarData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftEffectAvatarData\(profile="+this.profile+", username="+this.username+"\)";
    }
}
