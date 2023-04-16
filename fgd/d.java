package fgd.d;
import u07.u;
import fgd.k;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import lnc.i3;
import java.lang.String;

public final class d implements u	// class@000e23
{
    public final k b;
    public final Activity c;

    public void d(k p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       d tb = this.b;
       Objects.requireNonNull(tb);
       i3 oi3 = i3.f();
       oi3.d("btn_type", "CANCEL");
       tb.V8(this.c, "CACHE_CONFIRM_POPUP", oi3.e());
    }
}
