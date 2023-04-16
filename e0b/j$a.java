package e0b.j$a;
import android.view.View$OnClickListener;
import e0b.j;
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

public final class j$a implements View$OnClickListener	// class@0025cb
{
    public final j b;
    public final ImageView c;

    public void j$a(j p0,ImageView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       this.b.P.j().f("KS_TV", 1, (this.b.Q.isEmpty() ^ 1));
       this.c.setVisibility(8);
       this.b.i0();
       j l = this.b.L;
       if (l != null) {
          l.a();
       }
       this.b.P.j().n();
       return;
    }
}
