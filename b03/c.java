package b03.c;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@0002e3
{
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;

    public void c(){
       super(0, 0, 0, false, false, 0, 0, 127, null);
    }
    public void c(long p0,long p1,long p2,boolean p3,boolean p4,long p5,long p6,int p7,u p8){
       int i = this;
       long l = Long.MAX_VALUE;
       long l1 = (p7 & 0x01)? l: p0;
       long l2 = (p7 & 0x02)? l: p1;
       if (!(p7 & 0x04)) {
          l = p2;
       }
       boolean b = false;
       boolean b1 = (p7 & 0x08)? false: p3;
       if (!(p7 & 0x10)) {
          b = p4;
       }
       long l3 = (p7 & 0x20)? 0: p5;
       long l4 = (p7 & 0x40)? 14: p6;
       super();
       i.a = l1;
       i.b = l2;
       i.c = l;
       i.d = b1;
       i.e = b;
       i.f = l3;
       i.g = l4;
       return;
    }
    public final boolean a(){
       return this.e;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof c && (!this.a - p0.a && (!this.b - p0.b && (!this.c - p0.c && (this.d == p0.d && (this.e == p0.e && (!this.f - p0.f && !this.g - p0.g)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i2;
       c obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       long l = 32;
       c tb = this.b;
       tb = this.c;
       int i = (((((int)(obj ^ (obj >> l)) * 31) + (int)(tb ^ (tb >> l))) * 31) + (int)(tb ^ (tb >> l))) * 31;
       obj = this.d;
       int i1 = 1;
       if (obj != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       obj = this.e;
       if (obj == null) {
          i1 = obj;
       }
       tb = this.f;
       tb = this.g;
       return (((((i + i1) * 31) + (int)(tb ^ (tb >> l))) * 31) + (int)(tb ^ (tb >> l)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveEffectDownloadCleanConfig\(sendByOtherCleanPeriod="+this.a+", preloadCleanPeriod="+this.b+", sendByMeCleanPeriod="+this.c+", enableClean="+this.d+", enableCleanPreload="+this.e+", disablePreloadPeriod="+this.f+", preloadStatusPeriod="+this.g+"\)";
    }
}
