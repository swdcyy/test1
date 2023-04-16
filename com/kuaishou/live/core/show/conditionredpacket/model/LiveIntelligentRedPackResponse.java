package com.kuaishou.live.core.show.conditionredpacket.model.LiveIntelligentRedPackResponse;
import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveIntelligentRedPackResponse implements Serializable	// class@000aba
{
    public final String panelUrl;
    public final String popUpTipsText;
    public final Integer redPackType;
    public final String title;

    public void LiveIntelligentRedPackResponse(String p0,String p1,String p2,Integer p3){
       super();
       this.panelUrl = p0;
       this.title = p1;
       this.popUpTipsText = p2;
       this.redPackType = p3;
    }
    public static LiveIntelligentRedPackResponse copy$default(LiveIntelligentRedPackResponse p0,String p1,String p2,String p3,Integer p4,int p5,Object p6){
       LiveIntelligentRedPackResponse panelUrl;
       LiveIntelligentRedPackResponse title;
       LiveIntelligentRedPackResponse popUpTipsTex;
       LiveIntelligentRedPackResponse redPackType;
       if (p5 & 0x01) {
          panelUrl = p0.panelUrl;
       }
       if (p5 & 0x02) {
          title = p0.title;
       }
       if (p5 & 0x04) {
          popUpTipsTex = p0.popUpTipsText;
       }
       if (p5 & 0x08) {
          redPackType = p0.redPackType;
       }
       return p0.copy(panelUrl, title, popUpTipsTex, redPackType);
    }
    public final String component1(){
       return this.panelUrl;
    }
    public final String component2(){
       return this.title;
    }
    public final String component3(){
       return this.popUpTipsText;
    }
    public final Integer component4(){
       return this.redPackType;
    }
    public final LiveIntelligentRedPackResponse copy(String p0,String p1,String p2,Integer p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LiveIntelligentRedPackResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveIntelligentRedPackResponse(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveIntelligentRedPackResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveIntelligentRedPackResponse && (a.g(this.panelUrl, p0.panelUrl) && (a.g(this.title, p0.title) && (a.g(this.popUpTipsText, p0.popUpTipsText) && a.g(this.redPackType, p0.redPackType)))))) {
          return true;
       }
       return false;
    }
    public final String getPanelUrl(){
       return this.panelUrl;
    }
    public final String getPopUpTipsText(){
       return this.popUpTipsText;
    }
    public final Integer getRedPackType(){
       return this.redPackType;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       LiveIntelligentRedPackResponse obj = PatchProxy.apply(null, this, LiveIntelligentRedPackResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.panelUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveIntelligentRedPackResponse ttitle = this.title;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.popUpTipsText;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.redPackType;
       if (ttitle != null) {
          i = ttitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveIntelligentRedPackResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveIntelligentRedPackResponse\(panelUrl="+this.panelUrl+", title="+this.title+", popUpTipsText="+this.popUpTipsText+", redPackType="+this.redPackType+"\)";
    }
}
