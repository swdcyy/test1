package cp1.x$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class x$a	// class@001e25
{
    public final float x;
    public final float y;

    public void x$a(float p0,float p1){
       super();
       this.x = p0;
       this.y = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, x$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof x$a && (!Float.compare(this.x, p0.x) && !Float.compare(this.y, p0.y)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, x$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, x$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Point\(x="+this.x+", y="+this.y+"\)";
    }
}
