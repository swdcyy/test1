package ah7.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class a	// class@0000cc
{
    public long a;
    public long b;
    public long c;
    public long d;
    public final String e;

    public void a(String p0){
       a.q(p0, "tag");
       super();
       this.e = p0;
       this.b = -1;
       this.d = -1;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof a && a.g(this.e, p0.e))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a te = this.e;
       int i = (te != null)? te.hashCode(): 0;
       return i;
    }
    public String toString(){
       return "AllocationTagInfo\(tag="+this.e+"\)";
    }
}
