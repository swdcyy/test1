package com.yxcorp.gifshow.commercial.response.NeoFeedTabInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.commercial.response.NeoFeedTabInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NeoFeedTabInfo implements Serializable	// class@001159
{
    public final String mExtData;
    public final long mTabId;
    public final String mTabName;
    public static final NeoFeedTabInfo$a Companion;
    public static final long serialVersionUID;

    static {
       NeoFeedTabInfo.Companion = new NeoFeedTabInfo$a(null);
    }
    public void NeoFeedTabInfo(){
       super(0, null, null, 7, null);
    }
    public void NeoFeedTabInfo(long p0,String p1,String p2){
       a.p(p1, "mTabName");
       super();
       this.mTabId = p0;
       this.mTabName = p1;
       this.mExtData = p2;
    }
    public void NeoFeedTabInfo(long p0,String p1,String p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x02) {
          p1 = "";
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public static NeoFeedTabInfo copy$default(NeoFeedTabInfo p0,long p1,String p2,String p3,int p4,Object p5){
       NeoFeedTabInfo mTabId;
       NeoFeedTabInfo mTabName;
       NeoFeedTabInfo mExtData;
       if (p4 & 0x01) {
          mTabId = p0.mTabId;
       }
       if (p4 & 0x02) {
          mTabName = p0.mTabName;
       }
       if (p4 & 0x04) {
          mExtData = p0.mExtData;
       }
       return p0.copy(mTabId, mTabName, mExtData);
    }
    public final long component1(){
       return this.mTabId;
    }
    public final String component2(){
       return this.mTabName;
    }
    public final String component3(){
       return this.mExtData;
    }
    public final NeoFeedTabInfo copy(long p0,String p1,String p2){
       if (PatchProxy.isSupport(NeoFeedTabInfo.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), p1, p2, this, NeoFeedTabInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "mTabName");
       return new NeoFeedTabInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NeoFeedTabInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NeoFeedTabInfo && (!this.mTabId - p0.mTabId && (a.g(this.mTabName, p0.mTabName) && a.g(this.mExtData, p0.mExtData))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       NeoFeedTabInfo obj = PatchProxy.apply(null, this, NeoFeedTabInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTabId;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.mTabName;
       int i1 = 0;
       int i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.mExtData;
       if (obj != null) {
          i1 = obj.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NeoFeedTabInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NeoFeedTabInfo\(mTabId="+this.mTabId+", mTabName="+this.mTabName+", mExtData="+this.mExtData+"\)";
    }
}
