package akd.k;
import android.view.View$OnClickListener;
import com.yxcorp.upgrade.impl.c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zjd.h$a;
import bkd.b;
import zjd.h$b;
import android.widget.TextView;
import android.widget.FrameLayout;

public final class k implements View$OnClickListener	// class@000056
{
    public final c b;

    public void k(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, c.class, "7")) {
       }else if(tb.s != null){
          if (tb.r == null) {
             tb.u.c();
             if (tb.p.b != null) {
                tb.u.d(tb);
                tb.h.setVisibility(4);
                tb.k.setVisibility(0);
             }
          }else {
             tb.u.e();
          }
       }
       return;
    }
}
