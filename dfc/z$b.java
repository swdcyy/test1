package dfc.z$b;
import jta.a;
import dfc.z;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import sy6.a;

public class z$b extends a	// class@0021bf
{
    public final z a;

    public void z$b(z p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       z$b uob = z$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (!p0 - null) {
          z$b ta = this.a;
          ta.u = ta.r.getCurrentPhoto();
       }
       return;
    }
}
