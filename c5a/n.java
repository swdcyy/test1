package c5a.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sf6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c5a.m;
import uw9.l0;
import android.view.View;

public class n extends PresenterV2	// class@000557
{
    public l0 p;
    public final a q;

    public void n(a p0){
       super();
       this.q = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       this.p.M1 = new m(this);
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, n.class, "2");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.p = this.q8(l0.class);
       return;
    }
}
