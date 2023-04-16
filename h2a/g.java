package h2a.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h2a.d;
import android.view.View$OnClickListener;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.View;
import ekd.m1;
import androidx.fragment.app.c;

public class g extends PresenterV2	// class@002547
{
    public TextView p;
    public TextView q;
    public View r;
    public c s;

    public void g(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.q.setOnClickListener(new d(this));
       this.p.setText("0/100");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0e3f);
       this.q = m1.f(p0, 0x7f0a0e3c);
       this.r = m1.f(p0, 0x7f0a03a9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.s = this.q8(c.class);
       return;
    }
}
