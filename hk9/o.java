package hk9.o;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.common.c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import e17.i;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.comment.common.a;
import lnc.c3$a;
import lnc.c3;

public final class o implements View$OnClickListener	// class@0026ab
{
    public final c b;

    public void o(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.C(a.a().a())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
       }else {
          c3.c(tb.a.q(), a.a);
       }
       return;
    }
}
