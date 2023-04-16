package h69.i;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class i	// class@00255a
{
    public final String a;
    public final int b;
    public final String c;

    public void i(String p0,int p1,String p2){
       a.p(p0, "musicId");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final String a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof i && (a.g(this.a, p0.a) && (this.b == p0.b && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       i obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.b) * 31;
       i tc = this.c;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MusicTemplateLaunchParams: musicId = "+this.a+", musicType = "+this.b;
    }
}
