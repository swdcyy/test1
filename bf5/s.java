package bf5.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class s	// class@000488
{
    public final int a;
    public final boolean b;

    public void s(int p0){
       super();
       this.a = p0;
       this.b = false;
    }
    public void s(int p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NasaSlideRefreshEvent{causeBy="+this.a+", force="+this.b+'}';
    }
}
