package kshark.lite.HeapAnalyzer$c;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class HeapAnalyzer$c	// class@001b80
{
    public final List a;
    public final List b;
    public final List c;

    public void HeapAnalyzer$c(List p0,List p1,List p2){
       a.p(p0, "applicationLeaks");
       a.p(p1, "libraryLeaks");
       a.p(p2, "unreachableObjects");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof HeapAnalyzer$c && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       HeapAnalyzer$c ta = this.a;
       int i = 0;
       int i1 = (ta != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       HeapAnalyzer$c tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "LeaksAndUnreachableObjects\(applicationLeaks="+this.a+", libraryLeaks="+this.b+", unreachableObjects="+this.c+"\)";
    }
}
