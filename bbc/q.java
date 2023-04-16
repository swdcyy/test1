package bbc.q;
import a17.b$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Object;
import a17.c;
import android.view.View;
import cbc.b;
import com.yxcorp.gifshow.relation.intimate.helper.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import erd.g;
import crd.b;

public final class q implements b$b	// class@000437
{
    public final boolean a;
    public final GifshowActivity b;
    public final String c;
    public final int d;

    public void q(boolean p0,GifshowActivity p1,String p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(c p0,View p1,int p2){
       q ta = this.a;
       q tb = this.b;
       q tc = this.c;
       q td = this.d;
       if (p2) {
          if (p2 == 1) {
             i.j(tb, tc, 1, td);
             if (!PatchProxy.applyVoidOneRefs(tb, null, b.class, "13")) {
                b.l("UNFRIEND", tb);
             }
          }
       }else if(ta != null){
          i.j(tb, tc, false, td);
          if (!PatchProxy.applyVoidOneRefs(tb, null, b.class, "12")) {
             b.l("NOT_SHOWN_IN_PUBLIC", tb);
          }
       }else {
          i.d(tc, 1, td, null, null);
          if (!PatchProxy.applyVoidOneRefs(tb, null, b.class, "11")) {
             b.l("SHOWN_IN_PUBLIC", tb);
          }
       }
       return;
    }
}
