package h2a.m$a$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h2a.m$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f2a.b;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import h2a.m;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.view.View;
import h2a.n;
import android.view.View$OnClickListener;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;

public class m$a$b extends PresenterV2	// class@00254e
{
    public b p;
    public PublishSubject q;
    public TextView r;
    public final m$a s;

    public void m$a$b(m$a p0){
       this.s = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m$a$b.class, "4")) {
          return;
       }
       this.r.setText(this.p.mDesc);
       this.r.setSelected(this.p.a);
       return;
    }
    public void F8(){
       RecyclerView$LayoutParams layoutParams;
       if (PatchProxy.applyVoid(null, this, m$a$b.class, "2")) {
          return;
       }
       if (this.r.getLayoutParams() != null) {
          layoutParams = this.r.getLayoutParams();
          layoutParams.width = this.s.x.u;
       }else {
          layoutParams = new RecyclerView$LayoutParams(this.s.x.u, a1.e(32.00f));
       }
       layoutParams.bottomMargin = a1.e(6.00f);
       layoutParams.topMargin = a1.e(6.00f);
       int v = m.v;
       layoutParams.leftMargin = v / 2;
       layoutParams.rightMargin = v / 2;
       this.r.setLayoutParams(layoutParams);
       this.m8().setOnClickListener(new n(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a$b.class, "3")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a2d97);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m$a$b.class, "1")) {
          return;
       }
       this.p = this.q8(b.class);
       this.q = this.r8("REASON_SELECT_STATUS_CHANGE_OBSERVER");
       return;
    }
}
