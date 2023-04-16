package com.kwai.social.startup.relation.model.EntranceConfig;
import java.io.Serializable;
import com.kwai.social.startup.relation.model.SocialShakeMutilLanguage;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class EntranceConfig implements Serializable	// class@0018ae
{
    public final String iconUrl;
    public final String jumpUrl;
    public final SocialShakeMutilLanguage subTitle;
    public final SocialShakeMutilLanguage title;

    public void EntranceConfig(SocialShakeMutilLanguage p0,SocialShakeMutilLanguage p1,String p2,String p3){
       super();
       this.title = p0;
       this.subTitle = p1;
       this.iconUrl = p2;
       this.jumpUrl = p3;
    }
    public static EntranceConfig copy$default(EntranceConfig p0,SocialShakeMutilLanguage p1,SocialShakeMutilLanguage p2,String p3,String p4,int p5,Object p6){
       EntranceConfig title;
       EntranceConfig subTitle;
       EntranceConfig iconUrl;
       EntranceConfig jumpUrl;
       if (p5 & 0x01) {
          title = p0.title;
       }
       if (p5 & 0x02) {
          subTitle = p0.subTitle;
       }
       if (p5 & 0x04) {
          iconUrl = p0.iconUrl;
       }
       if (p5 & 0x08) {
          jumpUrl = p0.jumpUrl;
       }
       return p0.copy(title, subTitle, iconUrl, jumpUrl);
    }
    public final SocialShakeMutilLanguage component1(){
       return this.title;
    }
    public final SocialShakeMutilLanguage component2(){
       return this.subTitle;
    }
    public final String component3(){
       return this.iconUrl;
    }
    public final String component4(){
       return this.jumpUrl;
    }
    public final EntranceConfig copy(SocialShakeMutilLanguage p0,SocialShakeMutilLanguage p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, EntranceConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EntranceConfig(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EntranceConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof EntranceConfig && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.iconUrl, p0.iconUrl) && a.g(this.jumpUrl, p0.jumpUrl)))))) {
          return true;
       }
       return false;
    }
    public final String getIconUrl(){
       return this.iconUrl;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final SocialShakeMutilLanguage getSubTitle(){
       return this.subTitle;
    }
    public final SocialShakeMutilLanguage getTitle(){
       return this.title;
    }
    public int hashCode(){
       EntranceConfig obj = PatchProxy.apply(null, this, EntranceConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       EntranceConfig tsubTitle = this.subTitle;
       int i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.iconUrl;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.jumpUrl;
       if (tsubTitle != null) {
          i = tsubTitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EntranceConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EntranceConfig\(title="+this.title+", subTitle="+this.subTitle+", iconUrl="+this.iconUrl+", jumpUrl="+this.jumpUrl+"\)";
    }
}
