package com.kwai.edge.reco.ctr.config.RedDotFeature;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RedDotFeature	// class@000d51
{
    public int last_N_count;

    public void RedDotFeature(){
       super(0, 1, null);
    }
    public void RedDotFeature(int p0){
       super();
       this.last_N_count = p0;
    }
    public void RedDotFeature(int p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = 0;
       }
       super(p0);
       return;
    }
    public final int a(){
       return this.last_N_count;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof RedDotFeature && this.last_N_count == p0.last_N_count)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, RedDotFeature.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.last_N_count;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RedDotFeature.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RedDotFeature\(last_N_count="+this.last_N_count+"\)";
    }
}
