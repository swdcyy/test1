package elb.k;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class k	// class@002755
{
    public String a;
    public int b;

    public void k(String p0,int p1){
       a.p(p0, "text");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int a(){
       return this.b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "InputTextResult\(text=\'"+this.a+"\', index="+this.b+')';
    }
}
