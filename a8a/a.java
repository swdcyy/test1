package a8a.a;
import android.view.View$OnClickListener;
import a8a.c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import e17.i;
import mkc.b;
import mkc.c;
import qvb.i;

public final class a implements View$OnClickListener	// class@000074
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.C(a.a().a())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
       }else {
          b[] uobArray = new b[]{b.g};
          c.d(tb.s, uobArray);
          c r = tb.r;
          if (r != null) {
             r.a();
          }
       }
       return;
    }
}
