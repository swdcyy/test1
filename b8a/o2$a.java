package b8a.o2$a;
import d6a.a;
import b8a.o2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class o2$a extends a	// class@0003d1
{
    public final o2 b;

    public void o2$a(o2 p0){
       this.b = p0;
       super();
    }
    public void F1(){
       this.b.z = false;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, o2$a.class, "1")) {
          return;
       }
       o2$a tb = this.b;
       tb.z = true;
       tb.S8();
       o2 v = this.b.v;
       if (v != null) {
          a.m(v);
          if (v.r() && this.b.W8()) {
             this.b.V8(0x3f800000);
          label_0039 :
             return;
          }
       }
       this.b.V8(0);
       goto label_0039 ;
    }
}
