package hk9.j;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.common.b;
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

public final class j implements View$OnClickListener	// class@0026a6
{
    public final b b;

    public void j(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.C(a.a().a())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
       }else {
          c3.c(tb.a.q(), a.a);
       }
       return;
    }
}
