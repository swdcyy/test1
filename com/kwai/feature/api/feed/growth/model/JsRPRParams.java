package com.kwai.feature.api.feed.growth.model.JsRPRParams;
import java.io.Serializable;
import com.kwai.feature.api.feed.growth.model.JsRPRParams$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsRPRParams implements Serializable	// class@000ed1
{
    public final String activityId;
    public final int roundIndex;
    public static final JsRPRParams$a Companion;
    public static final long serialVersionUID;

    static {
       JsRPRParams.Companion = new JsRPRParams$a(null);
    }
    public void JsRPRParams(String p0,int p1){
       a.p(p0, "activityId");
       super();
       this.activityId = p0;
       this.roundIndex = p1;
    }
    public static JsRPRParams copy$default(JsRPRParams p0,String p1,int p2,int p3,Object p4){
       JsRPRParams activityId;
       JsRPRParams roundIndex;
       if (p3 & 0x01) {
          activityId = p0.activityId;
       }
       if (p3 & 0x02) {
          roundIndex = p0.roundIndex;
       }
       return p0.copy(activityId, roundIndex);
    }
    public final String component1(){
       return this.activityId;
    }
    public final int component2(){
       return this.roundIndex;
    }
    public final JsRPRParams copy(String p0,int p1){
       if (PatchProxy.isSupport(JsRPRParams.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, JsRPRParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activityId");
       return new JsRPRParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsRPRParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsRPRParams && (a.g(this.activityId, p0.activityId) && this.roundIndex == p0.roundIndex))) {
          return true;
       }
       return false;
    }
    public final String getActivityId(){
       return this.activityId;
    }
    public final int getRoundIndex(){
       return this.roundIndex;
    }
    public int hashCode(){
       JsRPRParams obj = PatchProxy.apply(null, this, JsRPRParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.activityId;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.roundIndex);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsRPRParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsRPRParams\(activityId="+this.activityId+", roundIndex="+this.roundIndex+"\)";
    }
}
