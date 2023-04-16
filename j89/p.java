package j89.p;
import java.lang.Thread;
import java.lang.String;
import java.lang.Number;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class p	// class@0027b9
{
    public Thread a;
    public String b;
    public long c;
    public long d;
    public Number e;
    public List f;

    public void p(Thread p0,String p1,long p2,long p3,Number p4,List p5){
       a.p(p0, "thread");
       a.p(p1, "frameInfo");
       a.p(p4, "systemThreadId");
       a.p(p5, "javaFrameInfo");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final Number a(){
       return this.e;
    }
    public final Thread b(){
       return this.a;
    }
    public final long c(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof p && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (!this.c - p0.c && (!this.d - p0.d && (a.g(this.e, p0.e) && a.g(this.f, p0.f)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       p obj = PatchProxy.apply(null, this, p.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       p tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       tb = this.c;
       tb = this.d;
       i1 = (((((i1 + i2) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32))) * 31;
       tb = this.e;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.f;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, p.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ThreadStackSample\(thread="+this.a+", frameInfo="+this.b+", timestampBegin="+this.c+", timestampEnd="+this.d+", systemThreadId="+this.e+", javaFrameInfo="+this.f+"\)";
    }
}
