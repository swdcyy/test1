package jaa.d;
import java.lang.Comparable;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class d implements Comparable	// class@0029a0
{
    public int b;
    public int c;
    public int d;
    public static final Pattern e;

    static {
       d.e = Pattern.compile("\(\\d+\)\\.\(\\d+\)\\.\(\\d+\)");
    }
    public void d(){
       super();
    }
    public void d(int p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public int a(d p0){
       d tb = this.b;
       d b = p0.b;
       if (tb != b) {
          return (tb - b);
       }
       tb = this.c;
       b = p0.c;
       if (tb != b) {
          return (tb - b);
       }
       return (this.d - p0.d);
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b+"."+this.c+"."+this.d;
    }
}
