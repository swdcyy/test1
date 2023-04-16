package com.kuaishou.live.lite.square.LiveLiteRecommendSideBarEntryInfo;
import java.io.Serializable;
import com.kuaishou.live.lite.square.LiveLiteRecommendSideBarEntryInfo$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Integer;
import java.lang.Object;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendPanelItemType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class LiveLiteRecommendSideBarEntryInfo implements Serializable	// class@000b5f
{
    public CDNUrl[] liveSideIconUrl;
    public String sideBarText;
    public Integer type;
    public static final LiveLiteRecommendSideBarEntryInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveLiteRecommendSideBarEntryInfo.Companion = new LiveLiteRecommendSideBarEntryInfo$a(null);
    }
    public void LiveLiteRecommendSideBarEntryInfo(){
       super(null, null, null, 7, null);
    }
    public void LiveLiteRecommendSideBarEntryInfo(String p0,CDNUrl[] p1,Integer p2){
       super();
       this.sideBarText = p0;
       this.liveSideIconUrl = p1;
       this.type = p2;
    }
    public void LiveLiteRecommendSideBarEntryInfo(String p0,CDNUrl[] p1,Integer p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = null;
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = Integer.valueOf(LiveLiteRecommendPanelItemType.Recommend.mType);
       }
       super(p0, p1, p2);
       return;
    }
    public static LiveLiteRecommendSideBarEntryInfo copy$default(LiveLiteRecommendSideBarEntryInfo p0,String p1,CDNUrl[] p2,Integer p3,int p4,Object p5){
       LiveLiteRecommendSideBarEntryInfo sideBarText;
       LiveLiteRecommendSideBarEntryInfo liveSideIcon;
       LiveLiteRecommendSideBarEntryInfo type;
       if (p4 & 0x01) {
          sideBarText = p0.sideBarText;
       }
       if (p4 & 0x02) {
          liveSideIcon = p0.liveSideIconUrl;
       }
       if (p4 & 0x04) {
          type = p0.type;
       }
       return p0.copy(sideBarText, liveSideIcon, type);
    }
    public final String component1(){
       return this.sideBarText;
    }
    public final CDNUrl[] component2(){
       return this.liveSideIconUrl;
    }
    public final Integer component3(){
       return this.type;
    }
    public final LiveLiteRecommendSideBarEntryInfo copy(String p0,CDNUrl[] p1,Integer p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLiteRecommendSideBarEntryInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteRecommendSideBarEntryInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteRecommendSideBarEntryInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveLiteRecommendSideBarEntryInfo && (a.g(this.sideBarText, p0.sideBarText) && (a.g(this.liveSideIconUrl, p0.liveSideIconUrl) && a.g(this.type, p0.type))))) {
          return true;
       }
       return false;
    }
    public final CDNUrl[] getLiveSideIconUrl(){
       return this.liveSideIconUrl;
    }
    public final String getSideBarText(){
       return this.sideBarText;
    }
    public final Integer getType(){
       return this.type;
    }
    public int hashCode(){
       LiveLiteRecommendSideBarEntryInfo obj = PatchProxy.apply(null, this, LiveLiteRecommendSideBarEntryInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.sideBarText;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveLiteRecommendSideBarEntryInfo tliveSideIco = this.liveSideIconUrl;
       int i2 = (tliveSideIco != null)? Arrays.hashCode(tliveSideIco): 0;
       i1 = (i1 + i2) * 31;
       tliveSideIco = this.type;
       if (tliveSideIco != null) {
          i = tliveSideIco.hashCode();
       }
       return (i1 + i);
    }
    public final void setLiveSideIconUrl(CDNUrl[] p0){
       this.liveSideIconUrl = p0;
    }
    public final void setSideBarText(String p0){
       this.sideBarText = p0;
    }
    public final void setType(Integer p0){
       this.type = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecommendSideBarEntryInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLiteRecommendSideBarEntryInfo\(sideBarText="+this.sideBarText+", liveSideIconUrl="+Arrays.toString(this.liveSideIconUrl)+", type="+this.type+"\)";
    }
}
