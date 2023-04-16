package com.yxcorp.gifshow.photoad.IpdxResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.photoad.IpdxResponse$a;
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

public final class IpdxResponse implements Serializable	// class@000f63
{
    public final long mExpTime;
    public final String mIp;
    public static final IpdxResponse$a Companion;
    public static final long serialVersionUID;

    static {
       IpdxResponse.Companion = new IpdxResponse$a(null);
    }
    public void IpdxResponse(long p0,String p1){
       a.p(p1, "mIp");
       super();
       this.mExpTime = p0;
       this.mIp = p1;
    }
    public static IpdxResponse copy$default(IpdxResponse p0,long p1,String p2,int p3,Object p4){
       IpdxResponse mExpTime;
       IpdxResponse mIp;
       if (p3 & 0x01) {
          mExpTime = p0.mExpTime;
       }
       if (p3 & 0x02) {
          mIp = p0.mIp;
       }
       return p0.copy(mExpTime, mIp);
    }
    public final long component1(){
       return this.mExpTime;
    }
    public final String component2(){
       return this.mIp;
    }
    public final IpdxResponse copy(long p0,String p1){
       if (PatchProxy.isSupport(IpdxResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, IpdxResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "mIp");
       return new IpdxResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IpdxResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof IpdxResponse && (!this.mExpTime - p0.mExpTime && a.g(this.mIp, p0.mIp)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       IpdxResponse obj = PatchProxy.apply(null, this, IpdxResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mExpTime;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.mIp;
       int i1 = (obj != null)? obj.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, IpdxResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "IpdxResponse\(mExpTime="+this.mExpTime+", mIp="+this.mIp+"\)";
    }
}
