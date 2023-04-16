package com.yxcorp.gifshow.ad.response.SplashEarnCoinResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.SplashEarnCoinResponse$a;
import nsd.u;
import com.yxcorp.gifshow.ad.response.SplashCoinTips;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SplashEarnCoinResponse implements Serializable	// class@0017ea
{
    public final long mCoinCode;
    public final SplashCoinTips mSplashCoinTips;
    public static final SplashEarnCoinResponse$a Companion;

    static {
       SplashEarnCoinResponse.Companion = new SplashEarnCoinResponse$a(null);
    }
    public void SplashEarnCoinResponse(long p0,SplashCoinTips p1){
       super();
       this.mCoinCode = p0;
       this.mSplashCoinTips = p1;
    }
    public static SplashEarnCoinResponse copy$default(SplashEarnCoinResponse p0,long p1,SplashCoinTips p2,int p3,Object p4){
       SplashEarnCoinResponse mCoinCode;
       SplashEarnCoinResponse mSplashCoinT;
       if (p3 & 0x01) {
          mCoinCode = p0.mCoinCode;
       }
       if (p3 & 0x02) {
          mSplashCoinT = p0.mSplashCoinTips;
       }
       return p0.copy(mCoinCode, mSplashCoinT);
    }
    public final long component1(){
       return this.mCoinCode;
    }
    public final SplashCoinTips component2(){
       return this.mSplashCoinTips;
    }
    public final SplashEarnCoinResponse copy(long p0,SplashCoinTips p1){
       if (PatchProxy.isSupport(SplashEarnCoinResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, SplashEarnCoinResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SplashEarnCoinResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SplashEarnCoinResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SplashEarnCoinResponse && (!this.mCoinCode - p0.mCoinCode && a.g(this.mSplashCoinTips, p0.mSplashCoinTips)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       SplashEarnCoinResponse obj = PatchProxy.apply(null, this, SplashEarnCoinResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mCoinCode;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.mSplashCoinTips;
       int i1 = (obj != null)? obj.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SplashEarnCoinResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SplashEarnCoinResponse\(mCoinCode="+this.mCoinCode+", mSplashCoinTips="+this.mSplashCoinTips+"\)";
    }
}
