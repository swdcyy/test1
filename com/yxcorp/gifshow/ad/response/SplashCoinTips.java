package com.yxcorp.gifshow.ad.response.SplashCoinTips;
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

public final class SplashCoinTips implements Serializable	// class@0017e8
{
    public final int mCoinNum;
    public final String mTipsPrefix;
    public final String mTipsSuffix;

    public void SplashCoinTips(int p0,String p1,String p2){
       super();
       this.mCoinNum = p0;
       this.mTipsPrefix = p1;
       this.mTipsSuffix = p2;
    }
    public static SplashCoinTips copy$default(SplashCoinTips p0,int p1,String p2,String p3,int p4,Object p5){
       SplashCoinTips mCoinNum;
       SplashCoinTips mTipsPrefix;
       SplashCoinTips mTipsSuffix;
       if (p4 & 0x01) {
          mCoinNum = p0.mCoinNum;
       }
       if (p4 & 0x02) {
          mTipsPrefix = p0.mTipsPrefix;
       }
       if (p4 & 0x04) {
          mTipsSuffix = p0.mTipsSuffix;
       }
       return p0.copy(mCoinNum, mTipsPrefix, mTipsSuffix);
    }
    public final int component1(){
       return this.mCoinNum;
    }
    public final String component2(){
       return this.mTipsPrefix;
    }
    public final String component3(){
       return this.mTipsSuffix;
    }
    public final SplashCoinTips copy(int p0,String p1,String p2){
       if (PatchProxy.isSupport(SplashCoinTips.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, SplashCoinTips.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SplashCoinTips(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SplashCoinTips.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SplashCoinTips && (this.mCoinNum == p0.mCoinNum && (a.g(this.mTipsPrefix, p0.mTipsPrefix) && a.g(this.mTipsSuffix, p0.mTipsSuffix))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, SplashCoinTips.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.mCoinNum * 31;
       SplashCoinTips tmTipsPrefix = this.mTipsPrefix;
       int i1 = 0;
       int i2 = (tmTipsPrefix != null)? tmTipsPrefix.hashCode(): 0;
       i = (i + i2) * 31;
       tmTipsPrefix = this.mTipsSuffix;
       if (tmTipsPrefix != null) {
          i1 = tmTipsPrefix.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SplashCoinTips.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SplashCoinTips\(mCoinNum="+this.mCoinNum+", mTipsPrefix="+this.mTipsPrefix+", mTipsSuffix="+this.mTipsSuffix+"\)";
    }
}
