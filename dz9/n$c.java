package dz9.n$c;
import android.view.View$OnClickListener;
import dz9.n;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.ja;
import ez9.a;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Integer;
import v6a.m0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e17.i;
import kf5.g;
import mf5.w0;

public final class n$c implements View$OnClickListener	// class@00201b
{
    public final n b;

    public void n$c(n p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$c.class, "1")) {
          return;
       }
       ja.a();
       a a = a.a;
       n$c tb = this.b;
       n n = tb.N;
       n d = tb.D;
       a.o(d, "photo");
       n e = this.b.E;
       a.o(e, "fragment");
       n m = this.b.M;
       if (m == null) {
          a.S("increaseRecoTitle");
       }
       a.c(n, d, e, m.getText().toString(), Integer.valueOf(2));
       i.a(R.style.arg_RES_7f11066a, 0x7f1016ec);
       g og = this.b.q();
       if (og != null) {
          og.a();
       }
       return;
    }
}
