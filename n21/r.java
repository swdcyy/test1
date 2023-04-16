package n21.r;
import ub.a;
import n21.p;
import n21.p$c;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.graphics.drawable.Animatable;
import bd.f;
import hc.a;
import n21.q;
import dc.a;

public class r extends a	// class@00329d
{
    public final p$c b;
    public final p c;

    public void r(p p0,p$c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "2")) {
          return;
       }
       r tb = this.b;
       if (tb != null) {
          tb.a();
       }
       this.c.a.setVisibility(8);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, r.class, "1")) {
       }else if(p2 instanceof a){
          p0.g = p2;
          p2.k(new q(this, p2.f()));
       }
       return;
    }
}
