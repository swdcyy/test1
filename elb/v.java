package elb.v;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class v	// class@00276b
{
    public String a;
    public String b;
    public int c;

    public void v(String p0,String p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final String a(){
       return this.b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PickServerMediaResult\(path="+this.a+", key="+this.b+", resType="+this.c+')';
    }
}
