package com.kwai.social.startup.holdout.model.SocialHoldoutConfig;
import java.io.Serializable;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class SocialHoldoutConfig implements Serializable	// class@000f49
{
    public boolean enableSocialHoldout;

    public void SocialHoldoutConfig(){
       super(false, 1, null);
    }
    public void SocialHoldoutConfig(boolean p0){
       super();
       this.enableSocialHoldout = p0;
    }
    public void SocialHoldoutConfig(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public static SocialHoldoutConfig copy$default(SocialHoldoutConfig p0,boolean p1,int p2,Object p3){
       SocialHoldoutConfig enableSocial;
       if (p2 & 0x01) {
          enableSocial = p0.enableSocialHoldout;
       }
       return p0.copy(enableSocial);
    }
    public final boolean component1(){
       return this.enableSocialHoldout;
    }
    public final SocialHoldoutConfig copy(boolean p0){
       if (PatchProxy.isSupport(SocialHoldoutConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, SocialHoldoutConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SocialHoldoutConfig(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof SocialHoldoutConfig && this.enableSocialHoldout == p0.enableSocialHoldout)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       SocialHoldoutConfig tenableSocia = this.enableSocialHoldout;
       if (tenableSocia != null) {
          tenableSocia = 1;
       }
       return tenableSocia;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SocialHoldoutConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SocialHoldoutConfig\(enableSocialHoldout="+this.enableSocialHoldout+"\)";
    }
}
