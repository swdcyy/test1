package com.kuaishou.live.basic.ability.LiveRtcAbility$Params;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveRtcAbility$Params	// class@000c7e
{
    public final String bizId;
    public final String data;

    public void LiveRtcAbility$Params(String p0,String p1){
       super();
       this.bizId = p0;
       this.data = p1;
    }
    public static LiveRtcAbility$Params copy$default(LiveRtcAbility$Params p0,String p1,String p2,int p3,Object p4){
       LiveRtcAbility$Params bizId;
       LiveRtcAbility$Params data;
       if (p3 & 0x01) {
          bizId = p0.bizId;
       }
       if (p3 & 0x02) {
          data = p0.data;
       }
       return p0.copy(bizId, data);
    }
    public final String component1(){
       return this.bizId;
    }
    public final String component2(){
       return this.data;
    }
    public final LiveRtcAbility$Params copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveRtcAbility$Params.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveRtcAbility$Params(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRtcAbility$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveRtcAbility$Params && (a.g(this.bizId, p0.bizId) && a.g(this.data, p0.data)))) {
          return true;
       }
       return false;
    }
    public final String getBizId(){
       return this.bizId;
    }
    public final String getData(){
       return this.data;
    }
    public int hashCode(){
       LiveRtcAbility$Params obj = PatchProxy.apply(null, this, LiveRtcAbility$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.bizId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveRtcAbility$Params tdata = this.data;
       if (tdata != null) {
          i = tdata.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRtcAbility$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(bizId="+this.bizId+", data="+this.data+"\)";
    }
}
