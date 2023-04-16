package nfd.q;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class q	// class@001df9
{
    public int a;
    public int b;

    public void q(){
       super();
    }
    public int a(){
       return this.b;
    }
    public int b(){
       return this.a;
    }
    public void c(int p0){
       this.b = p0;
    }
    public void d(int p0){
       this.a = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ListScrollState{mLastPosition="+this.a+", mLastOffset="+this.b+'}';
    }
}
