package com.yxcorp.gifshow.commercial.response.NeoFeedTabInfoData;
import java.io.Serializable;
import com.yxcorp.gifshow.commercial.response.NeoFeedTabInfoData$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Collection;
import java.lang.StringBuilder;

public final class NeoFeedTabInfoData implements Serializable	// class@00115b
{
    public final List mTabs;
    public final String mVersionMd5;
    public static final NeoFeedTabInfoData$a Companion;
    public static final long serialVersionUID;

    static {
       NeoFeedTabInfoData.Companion = new NeoFeedTabInfoData$a(null);
    }
    public void NeoFeedTabInfoData(){
       super(null, null, 3, null);
    }
    public void NeoFeedTabInfoData(String p0,List p1){
       super();
       this.mVersionMd5 = p0;
       this.mTabs = p1;
    }
    public void NeoFeedTabInfoData(String p0,List p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = "";
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static NeoFeedTabInfoData copy$default(NeoFeedTabInfoData p0,String p1,List p2,int p3,Object p4){
       NeoFeedTabInfoData mVersionMd5;
       NeoFeedTabInfoData mTabs;
       if (p3 & 0x01) {
          mVersionMd5 = p0.mVersionMd5;
       }
       if (p3 & 0x02) {
          mTabs = p0.mTabs;
       }
       return p0.copy(mVersionMd5, mTabs);
    }
    public final String component1(){
       return this.mVersionMd5;
    }
    public final List component2(){
       return this.mTabs;
    }
    public final NeoFeedTabInfoData copy(String p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, NeoFeedTabInfoData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NeoFeedTabInfoData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NeoFeedTabInfoData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NeoFeedTabInfoData && (a.g(this.mVersionMd5, p0.mVersionMd5) && a.g(this.mTabs, p0.mTabs)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       NeoFeedTabInfoData obj = PatchProxy.apply(null, this, NeoFeedTabInfoData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mVersionMd5;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       NeoFeedTabInfoData tmTabs = this.mTabs;
       if (tmTabs != null) {
          i = tmTabs.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isValid(){
       NeoFeedTabInfoData obj = PatchProxy.apply(null, this, NeoFeedTabInfoData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mTabs;
       int i = (obj == null || obj.isEmpty())? 1: 0;
       return (i ^ 1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NeoFeedTabInfoData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NeoFeedTabInfoData\(mVersionMd5="+this.mVersionMd5+", mTabs="+this.mTabs+"\)";
    }
}
