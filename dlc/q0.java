package dlc.q0;
import android.view.View$OnClickListener;
import dlc.r0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import e17.i;
import qvb.a;
import android.widget.FrameLayout;
import qvb.n0;

public final class q0 implements View$OnClickListener	// class@002266
{
    public final r0 b;

    public void q0(r0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       q0 tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.C(a.a().a())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
       }else if(tb.r.isEmpty()){
          tb.q.setVisibility(0);
          tb.p.setVisibility(8);
          tb.s.a();
       }
       return;
    }
}
