package e0b.o;
import android.view.View$OnClickListener;
import e0b.j;
import xza.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b0b.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.screencast.ScreencastStatus;
import e0b.h$a;

public final class o implements View$OnClickListener	// class@0025d8
{
    public final j b;
    public final a c;

    public void o(j p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.b.P.j().l();
       String name = this.c.a().getName();
       a.o(name, "name");
       this.b.P.j().c(name, "NORMAL", this.b.P.i());
       this.b.P.j().p(false);
       j l = this.b.L;
       if (l != null) {
          l.g(this.c);
       }
       return;
    }
}
