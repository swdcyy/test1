package aq1.j$a;
import android.view.View$OnClickListener;
import aq1.j;
import zp1.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.widget.ImageView;
import java.util.Objects;
import android.app.Activity;
import aq1.j$a$a;
import u07.u;
import u07.t;
import u07.j;

public final class j$a implements View$OnClickListener	// class@00028a
{
    public final j b;
    public final a c;

    public void j$a(j p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       j v = this.b.V;
       if (v == null) {
          a.S("multiChatCellCloseImageView");
       }
       Context context = v.getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
       t$a uoa = new t$a(context);
       uoa.W0(R.string.arg_RES_7f101f17);
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new j$a$a(this));
       j.d(uoa);
       return;
    }
}
