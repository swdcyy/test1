package com.yxcorp.gifshow.nearby.model.FestivalIcon;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.nearby.model.RoamingPanelConfigs;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zf6.k;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FestivalIcon implements Serializable	// class@002147
{
    public final String darkUrl;
    public final String lightUrl;
    public final RoamingPanelConfigs roamingPanelConfigs;

    public void FestivalIcon(String p0,String p1,RoamingPanelConfigs p2){
       a.p(p0, "lightUrl");
       a.p(p1, "darkUrl");
       a.p(p2, "roamingPanelConfigs");
       super();
       this.lightUrl = p0;
       this.darkUrl = p1;
       this.roamingPanelConfigs = p2;
    }
    public static FestivalIcon copy$default(FestivalIcon p0,String p1,String p2,RoamingPanelConfigs p3,int p4,Object p5){
       FestivalIcon lightUrl;
       FestivalIcon darkUrl;
       FestivalIcon roamingPanel;
       if (p4 & 0x01) {
          lightUrl = p0.lightUrl;
       }
       if (p4 & 0x02) {
          darkUrl = p0.darkUrl;
       }
       if (p4 & 0x04) {
          roamingPanel = p0.roamingPanelConfigs;
       }
       return p0.copy(lightUrl, darkUrl, roamingPanel);
    }
    public final String component1(){
       return this.lightUrl;
    }
    public final String component2(){
       return this.darkUrl;
    }
    public final RoamingPanelConfigs component3(){
       return this.roamingPanelConfigs;
    }
    public final FestivalIcon copy(String p0,String p1,RoamingPanelConfigs p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, FestivalIcon.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "lightUrl");
       a.p(p1, "darkUrl");
       a.p(p2, "roamingPanelConfigs");
       return new FestivalIcon(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FestivalIcon.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FestivalIcon && (a.g(this.lightUrl, p0.lightUrl) && (a.g(this.darkUrl, p0.darkUrl) && a.g(this.roamingPanelConfigs, p0.roamingPanelConfigs))))) {
          return true;
       }
       return false;
    }
    public final String getDarkUrl(){
       return this.darkUrl;
    }
    public final String getLightUrl(){
       return this.lightUrl;
    }
    public final RoamingPanelConfigs getRoamingPanelConfigs(){
       return this.roamingPanelConfigs;
    }
    public final String getUrl(){
       FestivalIcon obj = PatchProxy.apply(null, this, FestivalIcon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (k.d())? this.darkUrl: this.lightUrl;
       return obj;
    }
    public int hashCode(){
       FestivalIcon obj = PatchProxy.apply(null, this, FestivalIcon.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.lightUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FestivalIcon tdarkUrl = this.darkUrl;
       int i2 = (tdarkUrl != null)? tdarkUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdarkUrl = this.roamingPanelConfigs;
       if (tdarkUrl != null) {
          i = tdarkUrl.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FestivalIcon.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FestivalIcon\(lightUrl="+this.lightUrl+", darkUrl="+this.darkUrl+", roamingPanelConfigs="+this.roamingPanelConfigs+"\)";
    }
}
