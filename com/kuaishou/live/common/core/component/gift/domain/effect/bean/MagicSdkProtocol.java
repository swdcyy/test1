package com.kuaishou.live.common.core.component.gift.domain.effect.bean.MagicSdkProtocol;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import nsd.u;
import kotlin.jvm.internal.a;
import java.lang.System;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import fg6.a;
import com.google.gson.Gson;

public final class MagicSdkProtocol implements Serializable	// class@0011a8
{
    public final Object data;
    public final int reqType;
    public final String seqId;
    public final long timestamp;

    public void MagicSdkProtocol(){
       super(null, 0, null, 0, 15, null);
    }
    public void MagicSdkProtocol(String p0,int p1,Object p2,long p3){
       a.p(p0, "seqId");
       super();
       this.seqId = p0;
       this.reqType = p1;
       this.data = p2;
       this.timestamp = p3;
    }
    public void MagicSdkProtocol(String p0,int p1,Object p2,long p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = "";
       }
       int i = (p4 & 0x02)? 0: p1;
       if (p4 & 0x04) {
          p2 = null;
       }
       Object obj = p2;
       if (p4 & 0x08) {
          p3 = System.currentTimeMillis();
       }
       super(p0, i, obj, p3);
       return;
    }
    public static MagicSdkProtocol copy$default(MagicSdkProtocol p0,String p1,int p2,Object p3,long p4,int p5,Object p6){
       MagicSdkProtocol seqId;
       MagicSdkProtocol reqType;
       MagicSdkProtocol timestamp;
       if (p5 & 0x01) {
          seqId = p0.seqId;
       }
       if (p5 & 0x02) {
          reqType = p0.reqType;
       }
       p6 = reqType;
       if (p5 & 0x04) {
          p3 = p0.data;
       }
       MagicSdkProtocol magicSdkProt = p3;
       if (p5 & 0x08) {
          timestamp = p0.timestamp;
       }
       return p0.copy(seqId, p6, magicSdkProt, timestamp);
    }
    public final String component1(){
       return this.seqId;
    }
    public final int component2(){
       return this.reqType;
    }
    public final Object component3(){
       return this.data;
    }
    public final long component4(){
       return this.timestamp;
    }
    public final MagicSdkProtocol copy(String p0,int p1,Object p2,long p3){
       Object obj;
       if (PatchProxy.isSupport(MagicSdkProtocol.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, Long.valueOf(p3), this, MagicSdkProtocol.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "seqId");
       MagicSdkProtocol magicSdkProt = new MagicSdkProtocol(p0, p1, p2, p3);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicSdkProtocol.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MagicSdkProtocol && (a.g(this.seqId, p0.seqId) && (this.reqType == p0.reqType && (a.g(this.data, p0.data) && !this.timestamp - p0.timestamp))))) {
          return true;
       }
       return false;
    }
    public final Object getData(){
       return this.data;
    }
    public final int getReqType(){
       return this.reqType;
    }
    public final String getSeqId(){
       return this.seqId;
    }
    public final long getTimestamp(){
       return this.timestamp;
    }
    public int hashCode(){
       MagicSdkProtocol obj = PatchProxy.apply(null, this, MagicSdkProtocol.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.seqId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.reqType) * 31;
       MagicSdkProtocol tdata = this.data;
       if (tdata != null) {
          i = tdata.hashCode();
       }
       MagicSdkProtocol ttimestamp = this.timestamp;
       return (((i1 + i) * 31) + (int)(ttimestamp ^ (ttimestamp >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicSdkProtocol.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
