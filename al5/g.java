package al5.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ql8.a;
import yk5.c;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import jl5.w;

public class g extends PresenterV2	// class@0000d2
{
    public TextView p;
    public a q;

    public void g(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       g tq = this.q;
       if (tq != null) {
          a b = tq.b;
          if (b instanceof c) {
             this.p.setText(b.a);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = w.a(p0, 0x7f0a0d06);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       return;
    }
}
