package gka.a0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.fragment.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import e17.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import hka.l;

public final class a0 implements View$OnClickListener	// class@002b02
{
    public final e b;

    public void a0(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.C(a.a().a())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
       }else if(tb.d != null){
          tb.d(false);
          tb.d.a();
       }else if(tb.g != null){
          tb.d(false);
          tb.g.a();
       }
       return;
    }
}
