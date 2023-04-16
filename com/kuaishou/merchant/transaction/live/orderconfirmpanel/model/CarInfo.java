package com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.CarInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CarInfo	// class@000800
{
    public final String mCarFullName;
    public final String mCarId;

    public final String a(){
       return this.mCarFullName;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CarInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CarInfo && (a.g(this.mCarId, p0.mCarId) && a.g(this.mCarFullName, p0.mCarFullName)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       CarInfo obj = PatchProxy.apply(null, this, CarInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mCarId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CarInfo tmCarFullNam = this.mCarFullName;
       if (tmCarFullNam != null) {
          i = tmCarFullNam.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CarInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CarInfo\(mCarId="+this.mCarId+", mCarFullName="+this.mCarFullName+"\)";
    }
}
