package h71.x$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class x$b	// class@00264f
{
    public final long duration;

    public void x$b(){
       super(0);
    }
    public void x$b(long p0){
       super();
       this.duration = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof x$b && !this.duration - p0.duration)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       x$b obj = PatchProxy.apply(null, this, x$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.duration;
       return (int)(obj ^ (obj >> 32));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, x$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(duration="+this.duration+"\)";
    }
}
