package k3a.k;
import com.yxcorp.gifshow.widget.m;
import k3a.j;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.l;
import qrd.l1;

public final class k extends m	// class@002bcd
{
    public final j c;

    public void k(j p0,boolean p1,long p2){
       this.c = p0;
       super(p1, p2);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       a.p(p0, "view");
       j g = this.c.g;
       if (g != null) {
          g.invoke(p0);
       }
       return;
    }
}
