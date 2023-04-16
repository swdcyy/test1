package bs3.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class b	// class@000436
{
    public int a;
    public int b;
    public int c;
    public View d;
    public View e;
    public int f;

    public void b(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SlideShowPendant{mType="+this.a+", mView="+this.d+", mFissionContainer="+this.e+", mPriority="+this.f+'}';
    }
}
