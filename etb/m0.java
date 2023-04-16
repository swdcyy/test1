package etb.m0;
import ub.a;
import etb.l0;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;
import hc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class m0 extends a	// class@002803
{
    public final l0 b;

    public void m0(l0 p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, m0.class, "2");
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m0.class, "1")) {
       }else if(p2 instanceof a){
          m0 tb = this.b;
          p1 = tb.q;
          if (p1 != null) {
             tb.A = p2;
             tb.R8(p1.K0());
          }
       }
       return;
    }
}
