package com.kuaishou.live.bridge.channels.LiveJsInteractBizChange$BizInfo;
import java.io.Serializable;
import com.kuaishou.live.bridge.channels.LiveJsInteractBizChange$BizInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsInteractBizChange$BizInfo implements Serializable	// class@000ddd
{
    public final String bizExtraInfo;
    public final boolean bizIntent;
    public final int bizType;
    public static final LiveJsInteractBizChange$BizInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveJsInteractBizChange$BizInfo.Companion = new LiveJsInteractBizChange$BizInfo$a(null);
    }
    public void LiveJsInteractBizChange$BizInfo(int p0,String p1,boolean p2){
       super();
       this.bizType = p0;
       this.bizExtraInfo = p1;
       this.bizIntent = p2;
    }
    public static LiveJsInteractBizChange$BizInfo copy$default(LiveJsInteractBizChange$BizInfo p0,int p1,String p2,boolean p3,int p4,Object p5){
       LiveJsInteractBizChange$BizInfo bizType;
       LiveJsInteractBizChange$BizInfo bizExtraInfo;
       LiveJsInteractBizChange$BizInfo bizIntent;
       if (p4 & 0x01) {
          bizType = p0.bizType;
       }
       if (p4 & 0x02) {
          bizExtraInfo = p0.bizExtraInfo;
       }
       if (p4 & 0x04) {
          bizIntent = p0.bizIntent;
       }
       return p0.copy(bizType, bizExtraInfo, bizIntent);
    }
    public final int component1(){
       return this.bizType;
    }
    public final String component2(){
       return this.bizExtraInfo;
    }
    public final boolean component3(){
       return this.bizIntent;
    }
    public final LiveJsInteractBizChange$BizInfo copy(int p0,String p1,boolean p2){
       if (PatchProxy.isSupport(LiveJsInteractBizChange$BizInfo.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, LiveJsInteractBizChange$BizInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveJsInteractBizChange$BizInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsInteractBizChange$BizInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsInteractBizChange$BizInfo && (this.bizType == p0.bizType && (a.g(this.bizExtraInfo, p0.bizExtraInfo) && this.bizIntent == p0.bizIntent)))) {
          return true;
       }
       return false;
    }
    public final String getBizExtraInfo(){
       return this.bizExtraInfo;
    }
    public final boolean getBizIntent(){
       return this.bizIntent;
    }
    public final int getBizType(){
       return this.bizType;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveJsInteractBizChange$BizInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.bizType * 31;
       LiveJsInteractBizChange$BizInfo tbizExtraInf = this.bizExtraInfo;
       int i1 = (tbizExtraInf != null)? tbizExtraInf.hashCode(): 0;
       i = (i + i1) * 31;
       tbizExtraInf = this.bizIntent;
       if (tbizExtraInf != null) {
          i1 = 1;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsInteractBizChange$BizInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BizInfo\(bizType="+this.bizType+", bizExtraInfo="+this.bizExtraInfo+", bizIntent="+this.bizIntent+"\)";
    }
}
