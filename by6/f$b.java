package by6.f$b;
import by6.f;
import java.util.List;
import by6.f$a;
import java.lang.Object;
import dy6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.NoSuchElementException;

public class f$b	// class@0004b6
{
    public final List a;
    public final int b;
    public int c;
    public final f d;

    public void f$b(f p0,List p1,f$a p2){
       this.d = p0;
       super();
       this.a = p1;
       this.b = p1.size();
    }
    public int a(){
       return (this.c - 1);
    }
    public boolean b(){
       boolean b = (this.c != this.b)? true: false;
       return b;
    }
    public b c(){
       f$b obj = PatchProxy.apply(null, this, f$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj >= this.b) {
          throw new NoSuchElementException();
       }
       this.c = obj + 1;
       return this.a.get(obj);
    }
}
