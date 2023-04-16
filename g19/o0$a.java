package g19.o0$a;
import d6a.a;
import g19.o0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jz8.n;
import jf5.a;
import rf5.u;

public class o0$a extends a	// class@0023ce
{
    public final o0 b;

    public void o0$a(o0 p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, o0$a.class, "2")) {
          return;
       }
       o0$a tb = this.b;
       if (tb.r != null || !c.g(tb.p)) {
          this.b.P8(true);
       }
       return;
    }
    public void i2(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o0$a.class, "1")) {
          return;
       }
       o0$a tb = this.b;
       if (tb.r != null) {
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.apply(objArray, tb, o0.class, "2");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(tb.r != null && (tb.R8() && tb.q.L.R.w())){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             this.b.P8(false);
          }
          return;
       }else if(!c.g(tb.p)){
          this.b.P8(false);
       }
       return;
    }
}
