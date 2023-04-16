package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantPollingInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DetailPendantPollingInfo	// class@00074a
{
    public long mPeriod;

    public void DetailPendantPollingInfo(){
       super(0);
    }
    public void DetailPendantPollingInfo(long p0){
       super();
       this.mPeriod = p0;
    }
    public final long a(){
       return this.mPeriod;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof DetailPendantPollingInfo && !this.mPeriod - p0.mPeriod)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       DetailPendantPollingInfo obj = PatchProxy.apply(null, this, DetailPendantPollingInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mPeriod;
       return (int)(obj ^ (obj >> 32));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DetailPendantPollingInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DetailPendantPollingInfo\(mPeriod="+this.mPeriod+"\)";
    }
}
