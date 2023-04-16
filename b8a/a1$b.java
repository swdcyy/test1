package b8a.a1$b;
import java.lang.Runnable;
import b8a.a1;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import b8a.a1$a;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;

public final class a1$b implements Runnable	// class@00038c
{
    public final a1 b;
    public final RelaxTimeFeed c;
    public final int d;

    public void a1$b(a1 p0,RelaxTimeFeed p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a1$b.class, "1")) {
          return;
       }
       a1 r = this.b.r;
       if (r == null) {
          a.S("mSlidePlayViewModel");
       }
       r.j1(new QPhoto(this.c), true, "NasaTimeManagementPresenter");
       a1.w.a(true);
       Object[] objArray = new Object[0];
       o.C().w("NasaTimeManagementPresenter", "≤Â»Î ”∆µ"+this.d, objArray);
       return;
    }
}
