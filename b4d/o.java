package b4d.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.widget.EditText;
import android.content.Context;
import com.yxcorp.utility.n;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;

public class o extends PresenterV2	// class@000384
{
    public EmojiEditText p;
    public TextView q;
    public TextView r;

    public void o(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       o tp = this.p;
       if (tp == null) {
          return;
       }
       tp.setMinHeight(a1.e(73.00f));
       tp = this.p;
       tp.setPadding(tp.getPaddingLeft(), (this.p.getPaddingTop() - n.c(this.p.getContext(), 2.00f)), n.c(this.p.getContext(), 16.00f), n.c(this.p.getContext(), 38.00f));
       tp = this.r;
       if (tp != null) {
          tp.setPadding(tp.getPaddingLeft(), this.p.getPaddingTop(), this.r.getPaddingRight(), this.r.getPaddingBottom());
       }
       tp = this.q;
       if (tp != null && tp.getLayoutParams() instanceof ConstraintLayout$LayoutParams) {
          ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-2, n.c(this.q.getContext(), 28.00f));
          layoutParams.d = 0;
          layoutParams.k = 0;
          layoutParams.leftMargin = this.p.getPaddingLeft();
          layoutParams.bottomMargin = n.c(this.q.getContext(), 5.00f);
          this.q.setLayoutParams(layoutParams);
          this.q.setGravity(16);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0ca8);
       this.q = m1.f(p0, 0x7f0a0cad);
       this.r = m1.f(p0, 0x7f0a1404);
       return;
    }
}
