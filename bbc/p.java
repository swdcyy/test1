package bbc.p;
import a17.b$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Object;
import a17.c;
import android.view.View;
import k2b.e0;
import cbc.b;
import com.yxcorp.gifshow.relation.intimate.helper.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import erd.g;
import crd.b;

public final class p implements b$b	// class@000436
{
    public final boolean a;
    public final GifshowActivity b;
    public final String c;
    public final int d;

    public void p(boolean p0,GifshowActivity p1,String p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(c p0,View p1,int p2){
       p ta = this.a;
       p tb = this.b;
       p tc = this.c;
       p td = this.d;
       if (!p2) {
          if (ta != null) {
             b.g(tb);
             i.g(tc, td);
          }else if(PatchProxy.applyVoidOneRefs(tb, null, b.class, "17")){
             b.f(1, 1, tb);
          }
          i.d(tc, false, td, null, null);
       }
       return;
    }
}
