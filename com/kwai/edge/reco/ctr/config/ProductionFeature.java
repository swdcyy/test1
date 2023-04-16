package com.kwai.edge.reco.ctr.config.ProductionFeature;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProductionFeature	// class@000d50
{
    public int count_in_N_minutes;

    public void ProductionFeature(){
       super(0, 1, null);
    }
    public void ProductionFeature(int p0){
       super();
       this.count_in_N_minutes = p0;
    }
    public void ProductionFeature(int p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = 0;
       }
       super(p0);
       return;
    }
    public final int a(){
       return this.count_in_N_minutes;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ProductionFeature && this.count_in_N_minutes == p0.count_in_N_minutes)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ProductionFeature.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.count_in_N_minutes;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProductionFeature.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProductionFeature\(count_in_N_minutes="+this.count_in_N_minutes+"\)";
    }
}
