package elb.i0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class i0	// class@002750
{
    public String a;
    public int b;
    public boolean c;
    public String d;
    public boolean e;

    public void i0(String p0,int p1,boolean p2){
       super();
       this.b = -1;
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void i0(String p0,int p1,boolean p2,boolean p3,String p4){
       super();
       this.b = -1;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
       this.d = p4;
    }
    public String a(){
       return this.a;
    }
    public int b(){
       return this.b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SwapFaceParam{mPath=\'"+this.a+'''+", mPickingMediaResType="+this.b+'}';
    }
}
