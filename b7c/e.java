package b7c.e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.pymk.element.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import e17.i;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.RecoUser;
import f7c.c;

public final class e implements View$OnClickListener	// class@0003c6
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "7")) {
       }else {
          b p = tb.p;
          if (p != null) {
             int i = p.P0(tb.r);
             if (i != -1) {
                tb.p.S0(i);
                tb.p.k0();
                i.a(R.style.arg_RES_7f11066a, 0x7f1039c8);
                b q = tb.q;
                tb.s.Ad(tb.r, q, q.mPosition);
             }
          }
       }
       return;
    }
}
