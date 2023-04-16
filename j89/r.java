package j89.r;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class r	// class@0027bb
{
    public long a;
    public String b;
    public long c;
    public boolean d;

    public void r(long p0,String p1,long p2,boolean p3){
       a.p(p1, "tagName");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final String a(){
       return this.b;
    }
    public final long b(){
       return this.a;
    }
    public final long c(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof r && (!this.a - p0.a && (a.g(this.b, p0.b) && (!this.c - p0.c && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       r obj = PatchProxy.apply(null, this, r.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       long l = 32;
       int i = (int)(obj ^ (obj >> l)) * 31;
       obj = this.b;
       int i1 = (obj != null)? obj.hashCode(): 0;
       r tc = this.c;
       i = (((i + i1) * 31) + (int)(tc ^ (tc >> l))) * 31;
       obj = this.d;
       if (obj != null) {
          i1 = 1;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, r.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "customTraceMark\(threadId="+this.a+", tagName="+this.b+", timestamp="+this.c+", isBeginMark="+this.d+"\)";
    }
}
