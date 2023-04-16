package gc9.a$b;
import com.yxcorp.gifshow.camera.record.base.b$a;
import gc9.a;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oh9.a;
import java.util.Objects;
import java.lang.Boolean;
import android.view.View;

public final class a$b implements b$a	// class@00246a
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public Object getData(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a uoa = PatchProxy.apply(objArray, this, a$b.class, "1");
       if (uoa != patchProxyRe) {
       }else {
          a$b ta = this.a;
          Objects.requireNonNull(ta);
          Object obj = PatchProxy.apply(objArray, ta, a.class, "16");
          boolean b = true;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(ta.g2()){
             a o = ta.o;
             if (o == null || o.isSelected() != b) {
                b = false;
             }
          }
          uoa = new a(false, b, this.a.h2(), this.a.g2());
       }
       return uoa;
    }
}
