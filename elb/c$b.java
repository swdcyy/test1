package elb.c$b;
import java.util.Iterator;
import elb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import elb.c$a;
import java.lang.RuntimeException;

public class c$b implements Iterator	// class@00273e
{
    public int b;
    public final c c;

    public void c$b(c p0){
       this.c = p0;
       super();
       this.b = 0;
    }
    public boolean hasNext(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b < this.c.b.size())? true: false;
       return b;
    }
    public Object next(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, c$b.class, "2");
       if (objArray1 != PatchProxyResult.class) {
       }else if(this.b < this.c.b.size()){
          objArray = this.c.b.get(this.b);
       }
       this.b = this.b + 1;
       objArray1 = objArray;
       return objArray1;
    }
    public void remove(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "3")) {
          return;
       }
       throw new RuntimeException("not support");
    }
}
