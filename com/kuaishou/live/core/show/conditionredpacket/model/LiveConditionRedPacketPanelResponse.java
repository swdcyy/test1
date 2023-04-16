package com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketPanelResponse;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.redpacket.model.RedPacketGradesResponse;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveIntelligentRedPackResponse;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveConditionRedPacketPanelResponse implements Serializable	// class@000ab6
{
    public final List conditionRedPacks;
    public final LiveIntelligentRedPackResponse intelligentRedPackResponse;
    public final RedPacketGradesResponse redPacketGradesResponse;

    public void LiveConditionRedPacketPanelResponse(RedPacketGradesResponse p0,LiveIntelligentRedPackResponse p1,List p2){
       super();
       this.redPacketGradesResponse = p0;
       this.intelligentRedPackResponse = p1;
       this.conditionRedPacks = p2;
    }
    public static LiveConditionRedPacketPanelResponse copy$default(LiveConditionRedPacketPanelResponse p0,RedPacketGradesResponse p1,LiveIntelligentRedPackResponse p2,List p3,int p4,Object p5){
       LiveConditionRedPacketPanelResponse redPacketGra;
       LiveConditionRedPacketPanelResponse intelligentR;
       LiveConditionRedPacketPanelResponse conditionRed;
       if (p4 & 0x01) {
          redPacketGra = p0.redPacketGradesResponse;
       }
       if (p4 & 0x02) {
          intelligentR = p0.intelligentRedPackResponse;
       }
       if (p4 & 0x04) {
          conditionRed = p0.conditionRedPacks;
       }
       return p0.copy(redPacketGra, intelligentR, conditionRed);
    }
    public final RedPacketGradesResponse component1(){
       return this.redPacketGradesResponse;
    }
    public final LiveIntelligentRedPackResponse component2(){
       return this.intelligentRedPackResponse;
    }
    public final List component3(){
       return this.conditionRedPacks;
    }
    public final LiveConditionRedPacketPanelResponse copy(RedPacketGradesResponse p0,LiveIntelligentRedPackResponse p1,List p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveConditionRedPacketPanelResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveConditionRedPacketPanelResponse(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveConditionRedPacketPanelResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveConditionRedPacketPanelResponse && (a.g(this.redPacketGradesResponse, p0.redPacketGradesResponse) && (a.g(this.intelligentRedPackResponse, p0.intelligentRedPackResponse) && a.g(this.conditionRedPacks, p0.conditionRedPacks))))) {
          return true;
       }
       return false;
    }
    public final List getConditionRedPacks(){
       return this.conditionRedPacks;
    }
    public final LiveIntelligentRedPackResponse getIntelligentRedPackResponse(){
       return this.intelligentRedPackResponse;
    }
    public final RedPacketGradesResponse getRedPacketGradesResponse(){
       return this.redPacketGradesResponse;
    }
    public int hashCode(){
       LiveConditionRedPacketPanelResponse obj = PatchProxy.apply(null, this, LiveConditionRedPacketPanelResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.redPacketGradesResponse;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveConditionRedPacketPanelResponse tintelligent = this.intelligentRedPackResponse;
       int i2 = (tintelligent != null)? tintelligent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tintelligent = this.conditionRedPacks;
       if (tintelligent != null) {
          i = tintelligent.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketPanelResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveConditionRedPacketPanelResponse\(redPacketGradesResponse="+this.redPacketGradesResponse+", intelligentRedPackResponse="+this.intelligentRedPackResponse+", conditionRedPacks="+this.conditionRedPacks+"\)";
    }
}
