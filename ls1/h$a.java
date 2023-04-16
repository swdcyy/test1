package ls1.h$a;
import ub.a;
import hc.b;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hc.a;
import pu1.o;
import dc.a;

public final class h$a extends a	// class@003017
{
    public final b b;

    public void h$a(b p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h$a.class, "1")) {
       }else if(p2 instanceof a){
          p2.k(new o(p2.f()));
          h$a tb = this.b;
          if (tb != null) {
             p2.l(tb);
          }
       }
       return;
    }
}
