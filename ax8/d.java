package ax8.d;
import android.view.View$OnClickListener;
import ax8.e$a;
import java.lang.Object;
import android.view.View;
import ax8.e;
import xw8.p0;
import com.kuaishou.android.model.mix.HotspotParams;
import lnc.d7;
import java.lang.String;
import lnc.e7;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class d implements View$OnClickListener	// class@00032c
{
    public final e$a b;
    public final View$OnClickListener c;

    public void d(e$a p0,View$OnClickListener p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       d tb = this.b;
       d tc = this.c;
       if (d7.k(tb.b.u.I) || tb.b.u.J != null) {
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103d92));
       }else {
          e7.c("author_service");
          tc.onClick(p0);
       }
       return;
    }
}
