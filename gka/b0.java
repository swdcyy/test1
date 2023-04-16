package gka.b0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.fragment.f;
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

public final class b0 implements View$OnClickListener	// class@002b04
{
    public final f b;

    public void b0(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b0 tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.C(a.a().a())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       }else {
          tb.c.a();
       }
       return;
    }
}
