package k2b.o1;
import m2b.e;
import com.yxcorp.gifshow.log.n;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.x1;
import w2b.a;

public final class o1 implements e	// class@001bb1
{
    public final n a;

    public void o1(n p0){
       this.a = p0;
    }
    public final void a(){
       try{
          o1 ta = this.a;
          Objects.requireNonNull(ta);
          if (PatchProxy.applyVoid(null, ta, n.class, "38")) {
          }else if(n.A1().D() && ta.j != null){
             ta.j.d();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
