package com.kuaishou.live.core.basic.model.LiveAnchorPayBulletConfig;
import java.io.Serializable;
import com.kuaishou.live.core.basic.model.LiveAnchorPayBulletConfig$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveAnchorPayBulletConfig implements Serializable	// class@00084f
{
    public final String configLink;
    public final boolean enableConfig;
    public static final LiveAnchorPayBulletConfig$a Companion;
    public static final long serialVersionUID;

    static {
       LiveAnchorPayBulletConfig.Companion = new LiveAnchorPayBulletConfig$a(null);
    }
    public void LiveAnchorPayBulletConfig(boolean p0,String p1){
       a.p(p1, "configLink");
       super();
       this.enableConfig = p0;
       this.configLink = p1;
    }
    public static LiveAnchorPayBulletConfig copy$default(LiveAnchorPayBulletConfig p0,boolean p1,String p2,int p3,Object p4){
       LiveAnchorPayBulletConfig enableConfig;
       LiveAnchorPayBulletConfig configLink;
       if (p3 & 0x01) {
          enableConfig = p0.enableConfig;
       }
       if (p3 & 0x02) {
          configLink = p0.configLink;
       }
       return p0.copy(enableConfig, configLink);
    }
    public final boolean component1(){
       return this.enableConfig;
    }
    public final String component2(){
       return this.configLink;
    }
    public final LiveAnchorPayBulletConfig copy(boolean p0,String p1){
       if (PatchProxy.isSupport(LiveAnchorPayBulletConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, LiveAnchorPayBulletConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "configLink");
       return new LiveAnchorPayBulletConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorPayBulletConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveAnchorPayBulletConfig && (this.enableConfig == p0.enableConfig && a.g(this.configLink, p0.configLink)))) {
          return true;
       }
       return false;
    }
    public final String getConfigLink(){
       return this.configLink;
    }
    public final boolean getEnableConfig(){
       return this.enableConfig;
    }
    public int hashCode(){
       int i;
       LiveAnchorPayBulletConfig obj = PatchProxy.apply(null, this, LiveAnchorPayBulletConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enableConfig;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       LiveAnchorPayBulletConfig tconfigLink = this.configLink;
       int i1 = (tconfigLink != null)? tconfigLink.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorPayBulletConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAnchorPayBulletConfig\(enableConfig="+this.enableConfig+", configLink="+this.configLink+"\)";
    }
}
