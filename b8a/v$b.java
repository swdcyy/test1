package b8a.v$b;
import d6a.a;
import b8a.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class v$b extends a	// class@00040a
{
    public final v b;

    public void v$b(v p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, v$b.class, "1")) {
          return;
       }
       v$b tb = this.b;
       tb.w = false;
       if (tb.v != null) {
          tb.v = false;
          tb.P8(false, "MorePanel");
       }
       return;
    }
    public void i2(){
       this.b.w = true;
    }
}
