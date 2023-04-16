package com.kuaishou.live.bridge.commands.LiveJsCmdSwitchEffectRenderBannedBizBit$a;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdSwitchEffectRenderBannedBizBit$a	// class@000e00
{
    public final Integer banBiz;
    public final Boolean isBannedBizEnabled;
    public final Long timeoutMs;

    public final Integer a(){
       return this.banBiz;
    }
    public final Long b(){
       return this.timeoutMs;
    }
    public final Boolean c(){
       return this.isBannedBizEnabled;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdSwitchEffectRenderBannedBizBit$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdSwitchEffectRenderBannedBizBit$a && (a.g(this.banBiz, p0.banBiz) && (a.g(this.isBannedBizEnabled, p0.isBannedBizEnabled) && a.g(this.timeoutMs, p0.timeoutMs))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdSwitchEffectRenderBannedBizBit$a obj = PatchProxy.apply(null, this, LiveJsCmdSwitchEffectRenderBannedBizBit$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.banBiz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCmdSwitchEffectRenderBannedBizBit$a tisBannedBiz = this.isBannedBizEnabled;
       int i2 = (tisBannedBiz != null)? tisBannedBiz.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tisBannedBiz = this.timeoutMs;
       if (tisBannedBiz != null) {
          i = tisBannedBiz.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdSwitchEffectRenderBannedBizBit$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Parameters\(banBiz="+this.banBiz+", isBannedBizEnabled="+this.isBannedBizEnabled+", timeoutMs="+this.timeoutMs+"\)";
    }
}
