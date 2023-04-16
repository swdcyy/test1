package hy8.c$b;
import com.yxcorp.gifshow.widget.m;
import hy8.c;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hy8.a;
import com.kwai.library.widget.popup.common.c;

public final class c$b extends m	// class@0025f1
{
    public final c c;
    public final ViewGroup d;

    public void c$b(c p0,ViewGroup p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$b.class, "1")) {
          return;
       }
       a.p(p0, "v");
       a b = this.c.b.b;
       if (b != null) {
          b.o();
       }
       b = this.c.b.a;
       if (b != null) {
          b.setVisibility(0);
       }
       this.c.b.e("pendant");
       PatchProxy.onMethodExit(c$b.class, "1");
       return;
    }
}
