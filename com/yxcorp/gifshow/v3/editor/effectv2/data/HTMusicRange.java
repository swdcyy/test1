package com.yxcorp.gifshow.v3.editor.effectv2.data.HTMusicRange;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Number;
import java.lang.StringBuilder;

public final class HTMusicRange	// class@000f47
{
    public final double duration;
    public final double start;

    public void HTMusicRange(){
       super(0, 0, 3, null);
    }
    public void HTMusicRange(double p0,double p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = 0xbff0000000000000;
       }
       super();
       this.duration = p0;
       this.start = p1;
       return;
    }
    public final double a(){
       return this.duration;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HTMusicRange.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof HTMusicRange && (!Double.compare(this.duration, p0.duration) && !Double.compare(this.start, p0.start)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, HTMusicRange.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = Double.doubleToLongBits(this.duration);
       long l1 = Double.doubleToLongBits(this.start);
       return (((int)(l ^ (l >> 32)) * 31) + (int)(l1 ^ (l1 >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HTMusicRange.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HTMusicRange\(duration="+this.duration+", start="+this.start+')';
    }
}
