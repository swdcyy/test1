package nx0.q;
import ub.a;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hc.a;
import nx0.p;
import dc.a;

public final class q extends a	// class@0033f8
{

    public void q(){
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, q.class, "1")) {
       }else {
          a.p(p0, "id");
          if (p2 instanceof a) {
             a uoa = p2;
             uoa.k(new p(p2, uoa.f()));
          }
       }
       return;
    }
}
