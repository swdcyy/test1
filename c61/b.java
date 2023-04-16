package c61.b;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$UserLayer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@00047e
{
    public LiveUserLayerManager$UserLayer a;
    public long b;

    public void b(LiveUserLayerManager$UserLayer p0,long p1){
       a.p(p0, "userLayer");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final LiveUserLayerManager$UserLayer a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (a.g(this.a, p0.a) && !this.b - p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       b tb = this.b;
       return ((i * 31) + (int)(tb ^ (tb >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UserLayerPair\(userLayer="+this.a+", fetchTime="+this.b+"\)";
    }
}
