package bq1.h$b;
import android.view.View$OnClickListener;
import bq1.h;
import zp1.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import android.widget.ImageView;
import android.content.Context;
import java.util.Objects;
import android.app.Activity;
import bq1.h$b$a;
import u07.u;
import u07.t;
import u07.j;

public final class h$b implements View$OnClickListener	// class@0003e7
{
    public final h b;
    public final b c;

    public void h$b(h p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
          return;
       }
       Context context = h.Q3(this.b).getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
       t$a uoa = new t$a(context);
       uoa.W0(R.string.arg_RES_7f101f17);
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new h$b$a(this));
       j.d(uoa);
       return;
    }
}