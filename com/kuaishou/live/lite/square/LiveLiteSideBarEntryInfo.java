package com.kuaishou.live.lite.square.LiveLiteSideBarEntryInfo;
import java.io.Serializable;
import com.kuaishou.live.lite.square.LiveLiteSideBarEntryInfo$a;
import nsd.u;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class LiveLiteSideBarEntryInfo implements Serializable	// class@000b61
{
    public CDNUrl[] liveSideIconUrl;
    public Integer liveSideType;
    public String sideBarText;
    public static final LiveLiteSideBarEntryInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveLiteSideBarEntryInfo.Companion = new LiveLiteSideBarEntryInfo$a(null);
    }
    public void LiveLiteSideBarEntryInfo(){
       super(null, null, null, 7, null);
    }
    public void LiveLiteSideBarEntryInfo(Integer p0,String p1,CDNUrl[] p2){
       super();
       this.liveSideType = p0;
       this.sideBarText = p1;
       this.liveSideIconUrl = p2;
    }
    public void LiveLiteSideBarEntryInfo(Integer p0,String p1,CDNUrl[] p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = Integer.valueOf(0);
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public static LiveLiteSideBarEntryInfo copy$default(LiveLiteSideBarEntryInfo p0,Integer p1,String p2,CDNUrl[] p3,int p4,Object p5){
       LiveLiteSideBarEntryInfo liveSideType;
       LiveLiteSideBarEntryInfo sideBarText;
       LiveLiteSideBarEntryInfo liveSideIcon;
       if (p4 & 0x01) {
          liveSideType = p0.liveSideType;
       }
       if (p4 & 0x02) {
          sideBarText = p0.sideBarText;
       }
       if (p4 & 0x04) {
          liveSideIcon = p0.liveSideIconUrl;
       }
       return p0.copy(liveSideType, sideBarText, liveSideIcon);
    }
    public final Integer component1(){
       return this.liveSideType;
    }
    public final String component2(){
       return this.sideBarText;
    }
    public final CDNUrl[] component3(){
       return this.liveSideIconUrl;
    }
    public final LiveLiteSideBarEntryInfo copy(Integer p0,String p1,CDNUrl[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLiteSideBarEntryInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteSideBarEntryInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteSideBarEntryInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveLiteSideBarEntryInfo && (a.g(this.liveSideType, p0.liveSideType) && (a.g(this.sideBarText, p0.sideBarText) && a.g(this.liveSideIconUrl, p0.liveSideIconUrl))))) {
          return true;
       }
       return false;
    }
    public final CDNUrl[] getLiveSideIconUrl(){
       return this.liveSideIconUrl;
    }
    public final Integer getLiveSideType(){
       return this.liveSideType;
    }
    public final String getSideBarText(){
       return this.sideBarText;
    }
    public int hashCode(){
       LiveLiteSideBarEntryInfo obj = PatchProxy.apply(null, this, LiveLiteSideBarEntryInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveSideType;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveLiteSideBarEntryInfo tsideBarText = this.sideBarText;
       int i2 = (tsideBarText != null)? tsideBarText.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsideBarText = this.liveSideIconUrl;
       if (tsideBarText != null) {
          i = Arrays.hashCode(tsideBarText);
       }
       return (i1 + i);
    }
    public final void setLiveSideIconUrl(CDNUrl[] p0){
       this.liveSideIconUrl = p0;
    }
    public final void setLiveSideType(Integer p0){
       this.liveSideType = p0;
    }
    public final void setSideBarText(String p0){
       this.sideBarText = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideBarEntryInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLiteSideBarEntryInfo\(liveSideType="+this.liveSideType+", sideBarText="+this.sideBarText+", liveSideIconUrl="+Arrays.toString(this.liveSideIconUrl)+"\)";
    }
}
