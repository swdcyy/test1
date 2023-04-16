package com.kwai.edge.reco.ctr.config.BubbleFeature;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class BubbleFeature	// class@000d4a
{
    public int last_N_count;

    public void BubbleFeature(){
       super(0, 1, null);
    }
    public void BubbleFeature(int p0){
       super();
       this.last_N_count = p0;
    }
    public void BubbleFeature(int p0,int p1,u p2){
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
       if (this == p0 || (p0 instanceof BubbleFeature && this.last_N_count == p0.last_N_count)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, BubbleFeature.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.last_N_count;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BubbleFeature.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BubbleFeature\(last_N_count="+this.last_N_count+"\)";
    }
}
