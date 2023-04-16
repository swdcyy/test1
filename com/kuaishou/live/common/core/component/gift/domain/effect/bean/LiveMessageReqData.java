package com.kuaishou.live.common.core.component.gift.domain.effect.bean.LiveMessageReqData;
import java.io.Serializable;
import com.kuaishou.live.common.core.component.gift.domain.effect.bean.AudienceData;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveMessageReqData implements Serializable	// class@0011a7
{
    public final Object action;
    public final AudienceData audience;

    public void LiveMessageReqData(AudienceData p0,Object p1){
       super();
       this.audience = p0;
       this.action = p1;
    }
    public void LiveMessageReqData(AudienceData p0,Object p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static LiveMessageReqData copy$default(LiveMessageReqData p0,AudienceData p1,Object p2,int p3,Object p4){
       LiveMessageReqData audience;
       if (p3 & 0x01) {
          audience = p0.audience;
       }
       if (p3 & 0x02) {
          p2 = p0.action;
       }
       return p0.copy(audience, p2);
    }
    public final AudienceData component1(){
       return this.audience;
    }
    public final Object component2(){
       return this.action;
    }
    public final LiveMessageReqData copy(AudienceData p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMessageReqData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMessageReqData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMessageReqData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMessageReqData && (a.g(this.audience, p0.audience) && a.g(this.action, p0.action)))) {
          return true;
       }
       return false;
    }
    public final Object getAction(){
       return this.action;
    }
    public final AudienceData getAudience(){
       return this.audience;
    }
    public int hashCode(){
       LiveMessageReqData obj = PatchProxy.apply(null, this, LiveMessageReqData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.audience;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveMessageReqData taction = this.action;
       if (taction != null) {
          i = taction.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMessageReqData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMessageReqData\(audience="+this.audience+", action="+this.action+"\)";
    }
}
