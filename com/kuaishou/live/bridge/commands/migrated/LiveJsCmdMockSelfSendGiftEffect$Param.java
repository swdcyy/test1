package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdMockSelfSendGiftEffect$Param;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdMockSelfSendGiftEffect$Param	// class@000e0f
{
    public final Integer comboCount;
    public final String comboKey;
    public final String giftSentInfo;
    public final String liveStreamId;

    public void LiveJsCmdMockSelfSendGiftEffect$Param(){
       super();
       this.liveStreamId = null;
       this.comboKey = null;
       this.comboCount = Integer.valueOf(0);
       this.giftSentInfo = null;
    }
    public final Integer a(){
       return this.comboCount;
    }
    public final String b(){
       return this.comboKey;
    }
    public final String c(){
       return this.giftSentInfo;
    }
    public final String d(){
       return this.liveStreamId;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdMockSelfSendGiftEffect$Param.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdMockSelfSendGiftEffect$Param && (a.g(this.liveStreamId, p0.liveStreamId) && (a.g(this.comboKey, p0.comboKey) && (a.g(this.comboCount, p0.comboCount) && a.g(this.giftSentInfo, p0.giftSentInfo)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdMockSelfSendGiftEffect$Param obj = PatchProxy.apply(null, this, LiveJsCmdMockSelfSendGiftEffect$Param.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveStreamId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCmdMockSelfSendGiftEffect$Param tcomboKey = this.comboKey;
       int i2 = (tcomboKey != null)? tcomboKey.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcomboKey = this.comboCount;
       i2 = (tcomboKey != null)? tcomboKey.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcomboKey = this.giftSentInfo;
       if (tcomboKey != null) {
          i = tcomboKey.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdMockSelfSendGiftEffect$Param.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Param\(liveStreamId="+this.liveStreamId+", comboKey="+this.comboKey+", comboCount="+this.comboCount+", giftSentInfo="+this.giftSentInfo+"\)";
    }
}
