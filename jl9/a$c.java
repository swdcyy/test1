package jl9.a$c;
import java.lang.Object;
import jl9.b;
import jl9.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class a$c	// class@002b06
{
    public final b a;
    public int b;
    public int c;

    public void a$c(){
       super();
       this.a = new b();
    }
    public void a$c(a$a p0){
       super();
       this.a = new b();
    }
    public void a(int p0,int p1,long p2){
       if (PatchProxy.isSupport(a$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, a$c.class, "1")) {
          return;
       }
       this.b = p0;
       this.c = p1;
       this.a.d(p2);
       return;
    }
    public int b(long p0){
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.a.c(p0);
       if (this.a.b()) {
          return this.c;
       }else {
          a$c tb = this.b;
          float f = (float)tb;
          return (int)(f + ((float)(this.c - tb) * this.a.a()));
       }
    }
}
