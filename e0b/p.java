package e0b.p;
import android.view.View$OnClickListener;
import e0b.j;
import android.widget.Button;
import android.widget.ImageView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b0b.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.util.Collection;
import e0b.h$a;

public final class p implements View$OnClickListener	// class@0025d9
{
    public final j b;
    public final Button c;
    public final ImageView d;

    public void p(j p0,Button p1,ImageView p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       this.b.P.j().f("NORMAL", (this.b.R.isEmpty() ^ 0x01), (this.b.Q.isEmpty() ^ 0x01));
       this.c.setVisibility(8);
       p td = this.d;
       if (td != null) {
          td.setVisibility(8);
       }
       j l = this.b.L;
       if (l != null) {
          l.f();
       }
       this.b.j0();
       this.b.P.j().o();
       return;
    }
}
