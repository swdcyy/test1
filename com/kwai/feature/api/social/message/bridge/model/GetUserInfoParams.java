package com.kwai.feature.api.social.message.bridge.model.GetUserInfoParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GetUserInfoParams implements Serializable	// class@00111e
{
    public final String subBiz;
    public final String targetId;
    public final int type;

    public void GetUserInfoParams(String p0,int p1,String p2){
       super();
       this.subBiz = p0;
       this.type = p1;
       this.targetId = p2;
    }
    public static GetUserInfoParams copy$default(GetUserInfoParams p0,String p1,int p2,String p3,int p4,Object p5){
       GetUserInfoParams subBiz;
       GetUserInfoParams type;
       GetUserInfoParams targetId;
       if (p4 & 0x01) {
          subBiz = p0.subBiz;
       }
       if (p4 & 0x02) {
          type = p0.type;
       }
       if (p4 & 0x04) {
          targetId = p0.targetId;
       }
       return p0.copy(subBiz, type, targetId);
    }
    public final String component1(){
       return this.subBiz;
    }
    public final int component2(){
       return this.type;
    }
    public final String component3(){
       return this.targetId;
    }
    public final GetUserInfoParams copy(String p0,int p1,String p2){
       if (PatchProxy.isSupport(GetUserInfoParams.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, GetUserInfoParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new GetUserInfoParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GetUserInfoParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GetUserInfoParams && (a.g(this.subBiz, p0.subBiz) && (this.type == p0.type && a.g(this.targetId, p0.targetId))))) {
          return true;
       }
       return false;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public final String getTargetId(){
       return this.targetId;
    }
    public final int getType(){
       return this.type;
    }
    public int hashCode(){
       GetUserInfoParams obj = PatchProxy.apply(null, this, GetUserInfoParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subBiz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.type) * 31;
       GetUserInfoParams ttargetId = this.targetId;
       if (ttargetId != null) {
          i = ttargetId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GetUserInfoParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GetUserInfoParams\(subBiz="+this.subBiz+", type="+this.type+", targetId="+this.targetId+"\)";
    }
}
