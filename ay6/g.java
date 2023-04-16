package ay6.g;
import java.lang.String;
import java.lang.Integer;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class g	// class@0003a4
{
    public final boolean a;
    public String b;
    public final String c;
    public long d;
    public String e;
    public Integer f;
    public final long g;
    public boolean h;

    public void g(boolean p0,String p1,String p2,long p3,String p4,Integer p5,long p6,boolean p7,int p8,u p9){
       if (p8 & 0x0080) {
          p7 = false;
       }
       a.p(p2, "traceTag");
       super();
       this.a = p0;
       this.b = null;
       this.c = p2;
       this.d = p3;
       this.e = null;
       this.f = null;
       this.g = p6;
       this.h = p7;
       return;
    }
    public final String a(){
       return this.c;
    }
    public final void b(String p0){
       this.b = p0;
    }
    public final void c(Integer p0){
       this.f = p0;
    }
    public final void d(String p0){
       this.e = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof g && (this.a == p0.a && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (!this.d - p0.d && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && (!this.g - p0.g && this.h == p0.h))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       g ta = this.a;
       int i = 1;
       if (ta != null) {
          ta = 1;
       }
       int i1 = ta * 31;
       g tb = this.b;
       int i2 = 0;
       int i3 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tb = this.c;
       i3 = (tb != null)? tb.hashCode(): 0;
       g td = this.d;
       long l = 32;
       i1 = (((i1 + i3) * 31) + (int)(td ^ (td >> l))) * 31;
       td = this.e;
       int i4 = (td != null)? td.hashCode(): 0;
       i1 = (i1 + i4) * 31;
       td = this.f;
       if (td != null) {
          i2 = td.hashCode();
       }
       g tg = this.g;
       i1 = (((i1 + i2) * 31) + (int)(tg ^ (tg >> l))) * 31;
       tb = this.h;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public String toString(){
       return "GothamTraceReportObj\(isMainThread="+this.a+", className="+this.b+", traceTag="+this.c+", timeCostMs="+this.d+", uuid="+this.e+", kitViewId="+this.f+", startTimeStamp="+this.g+", isAnr="+this.h+"\)";
    }
}
