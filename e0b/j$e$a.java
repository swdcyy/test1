package e0b.j$e$a;
import android.view.View$OnClickListener;
import e0b.j$e;
import android.widget.ImageView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e0b.j;
import b0b.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.util.Collection;
import e0b.h$a;

public final class j$e$a implements View$OnClickListener	// class@0025cf
{
    public final j$e b;
    public final ImageView c;

    public void j$e$a(j$e p0,ImageView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$e$a.class, "1")) {
          return;
       }
       this.b.b.P.j().f("NORMAL", (this.b.b.R.isEmpty() ^ 0x01), (this.b.b.Q.isEmpty() ^ 0x01));
       this.c.setVisibility(8);
       this.b.b.j0();
       j l = this.b.b.L;
       if (l != null) {
          l.f();
       }
       this.b.b.P.j().o();
       return;
    }
}
