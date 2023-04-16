package o1a.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l1a.b;
import java.lang.CharSequence;
import android.widget.TextView;
import o1a.a;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import y8c.d;

public class f extends PresenterV2	// class@00326f
{
    public b p;
    public d q;
    public TextView r;
    public View s;
    public final RecyclerFragment t;

    public void f(RecyclerFragment p0){
       super();
       this.t = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.r.setText(this.p.mText);
       this.s.setOnClickListener(new a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0449);
       this.s = m1.f(p0, 0x7f0a0447);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(b.class);
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       return;
    }
}
