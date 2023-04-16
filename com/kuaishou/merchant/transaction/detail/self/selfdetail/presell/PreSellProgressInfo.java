package com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.PreSellProgressInfo;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.PreSellProgressInfo$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PreSellProgressInfo implements Serializable	// class@00075c
{
    public final String mBgColor;
    public final long mEndTime;
    public final List mItemInfos;
    public final String mProcessLineColor;
    public final String mTextColor;
    public static final PreSellProgressInfo$a Companion;
    public static final long serialVersionUID;

    static {
       PreSellProgressInfo.Companion = new PreSellProgressInfo$a(null);
    }
    public void PreSellProgressInfo(String p0,String p1,String p2,List p3,long p4){
       super();
       this.mBgColor = p0;
       this.mProcessLineColor = p1;
       this.mTextColor = p2;
       this.mItemInfos = p3;
       this.mEndTime = p4;
    }
    public void PreSellProgressInfo(String p0,String p1,String p2,List p3,long p4,int p5,u p6){
       String str = (p5 & 0x01)? "": p0;
       String str1 = (p5 & 0x02)? "": p1;
       String str2 = (p5 & 0x04)? "": p2;
       List list = (p5 & 0x08)? null: p3;
       super(str, str1, str2, list, p4);
       return;
    }
    public static PreSellProgressInfo copy$default(PreSellProgressInfo p0,String p1,String p2,String p3,List p4,long p5,int p6,Object p7){
       PreSellProgressInfo mBgColor;
       PreSellProgressInfo mProcessLine;
       PreSellProgressInfo mTextColor;
       PreSellProgressInfo mItemInfos;
       PreSellProgressInfo mEndTime;
       if (p6 & 0x01) {
          mBgColor = p0.mBgColor;
       }
       if (p6 & 0x02) {
          mProcessLine = p0.mProcessLineColor;
       }
       p7 = mProcessLine;
       if (p6 & 0x04) {
          mTextColor = p0.mTextColor;
       }
       PreSellProgressInfo preSellProgr = mTextColor;
       if (p6 & 0x08) {
          mItemInfos = p0.mItemInfos;
       }
       PreSellProgressInfo preSellProgr1 = mItemInfos;
       if (p6 & 0x10) {
          mEndTime = p0.mEndTime;
       }
       return p0.copy(mBgColor, p7, preSellProgr, preSellProgr1, mEndTime);
    }
    public final String component1(){
       return this.mBgColor;
    }
    public final String component2(){
       return this.mProcessLineColor;
    }
    public final String component3(){
       return this.mTextColor;
    }
    public final List component4(){
       return this.mItemInfos;
    }
    public final long component5(){
       return this.mEndTime;
    }
    public final PreSellProgressInfo copy(String p0,String p1,String p2,List p3,long p4){
       Object obj;
       if (PatchProxy.isSupport(PreSellProgressInfo.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Long.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, PreSellProgressInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PreSellProgressInfo preSellProgr = new PreSellProgressInfo(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PreSellProgressInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PreSellProgressInfo && (a.g(this.mBgColor, p0.mBgColor) && (a.g(this.mProcessLineColor, p0.mProcessLineColor) && (a.g(this.mTextColor, p0.mTextColor) && (a.g(this.mItemInfos, p0.mItemInfos) && !this.mEndTime - p0.mEndTime)))))) {
          return true;
       }
       return false;
    }
    public final String getMBgColor(){
       return this.mBgColor;
    }
    public final long getMEndTime(){
       return this.mEndTime;
    }
    public final List getMItemInfos(){
       return this.mItemInfos;
    }
    public final String getMProcessLineColor(){
       return this.mProcessLineColor;
    }
    public final String getMTextColor(){
       return this.mTextColor;
    }
    public int hashCode(){
       PreSellProgressInfo obj = PatchProxy.apply(null, this, PreSellProgressInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mBgColor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PreSellProgressInfo tmProcessLin = this.mProcessLineColor;
       int i2 = (tmProcessLin != null)? tmProcessLin.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmProcessLin = this.mTextColor;
       i2 = (tmProcessLin != null)? tmProcessLin.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmProcessLin = this.mItemInfos;
       if (tmProcessLin != null) {
          i = tmProcessLin.hashCode();
       }
       PreSellProgressInfo tmEndTime = this.mEndTime;
       return (((i1 + i) * 31) + (int)(tmEndTime ^ (tmEndTime >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PreSellProgressInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PreSellProgressInfo\(mBgColor="+this.mBgColor+", mProcessLineColor="+this.mProcessLineColor+", mTextColor="+this.mTextColor+", mItemInfos="+this.mItemInfos+", mEndTime="+this.mEndTime+"\)";
    }
}
