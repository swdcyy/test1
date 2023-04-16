package com.kwai.social.startup.relation.model.SocialShakeMutilLanguage;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SocialShakeMutilLanguage implements Serializable	// class@0018ba
{
    public final String enUs;
    public final String zhCn;
    public final String zhTw;

    public void SocialShakeMutilLanguage(String p0,String p1,String p2){
       super();
       this.zhCn = p0;
       this.zhTw = p1;
       this.enUs = p2;
    }
    public static SocialShakeMutilLanguage copy$default(SocialShakeMutilLanguage p0,String p1,String p2,String p3,int p4,Object p5){
       SocialShakeMutilLanguage zhCn;
       SocialShakeMutilLanguage zhTw;
       SocialShakeMutilLanguage enUs;
       if (p4 & 0x01) {
          zhCn = p0.zhCn;
       }
       if (p4 & 0x02) {
          zhTw = p0.zhTw;
       }
       if (p4 & 0x04) {
          enUs = p0.enUs;
       }
       return p0.copy(zhCn, zhTw, enUs);
    }
    public final String component1(){
       return this.zhCn;
    }
    public final String component2(){
       return this.zhTw;
    }
    public final String component3(){
       return this.enUs;
    }
    public final SocialShakeMutilLanguage copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, SocialShakeMutilLanguage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SocialShakeMutilLanguage(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SocialShakeMutilLanguage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SocialShakeMutilLanguage && (a.g(this.zhCn, p0.zhCn) && (a.g(this.zhTw, p0.zhTw) && a.g(this.enUs, p0.enUs))))) {
          return true;
       }
       return false;
    }
    public final String getEnUs(){
       return this.enUs;
    }
    public final String getZhCn(){
       return this.zhCn;
    }
    public final String getZhTw(){
       return this.zhTw;
    }
    public int hashCode(){
       SocialShakeMutilLanguage obj = PatchProxy.apply(null, this, SocialShakeMutilLanguage.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.zhCn;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SocialShakeMutilLanguage tzhTw = this.zhTw;
       int i2 = (tzhTw != null)? tzhTw.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tzhTw = this.enUs;
       if (tzhTw != null) {
          i = tzhTw.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SocialShakeMutilLanguage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SocialShakeMutilLanguage\(zhCn="+this.zhCn+", zhTw="+this.zhTw+", enUs="+this.enUs+"\)";
    }
}
