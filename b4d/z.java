package b4d.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b4d.y;
import java.lang.Runnable;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;

public class z extends PresenterV2	// class@0003a3
{
    public RecyclerView p;
    public View q;
    public int r;
    public static final int s;
    public static final int t;

    static {
       z.s = a1.e(11.00f);
       z.t = a1.e(4.00f);
    }
    public void z(){
       super();
       this.r = 5;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, z.class, "2")) {
          return;
       }
       if (this.p != null) {
          z tq = this.q;
          if (tq != null) {
             tq.post(new y(this));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0ce1);
       this.q = m1.f(p0, 0x7f0a0c64);
       return;
    }
}
