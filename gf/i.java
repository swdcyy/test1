package gf.i;
import gf.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class i implements a	// class@0020aa
{
    public int a;
    public int b;
    public int c;
    public int d;

    public void i(){
       super();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UIHierarchy"+","+this.a+","+this.b+","+this.d+","+this.c;
    }
    public boolean hasValue(){
       boolean b = (this.b != null && this.a != null)? true: false;
       return b;
    }
}
