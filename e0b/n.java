package e0b.n;
import android.view.View$OnClickListener;
import e0b.j;
import cgc.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b0b.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import com.yxcorp.gifshow.screencast.ScreencastStatus;
import e0b.h$a;

public final class n implements View$OnClickListener	// class@0025d7
{
    public final j b;
    public final a c;

    public void n(j p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       this.b.P.j().l();
       this.b.P.j().c(this.c.b(), "KS_TV", this.b.P.i());
       this.b.P.j().p(false);
       j l = this.b.L;
       if (l != null) {
          l.e(this.c);
       }
       return;
    }
}
