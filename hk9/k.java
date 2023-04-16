package hk9.k;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.common.b;
import java.lang.Object;
import android.view.View;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import al9.a;
import ek9.f;
import k2b.e0;
import yk9.d;

public final class k implements View$OnClickListener	// class@0026a7
{
    public final b b;

    public void k(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       k tb = this.b;
       if (tb.a.q() instanceof a) {
          a uoa = tb.a.q();
          uoa.h1();
          tb.b.f.r(uoa.j1(), tb.a);
       }
       return;
    }
}
