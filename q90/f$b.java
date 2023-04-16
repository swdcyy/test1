package q90.f$b;
import java.lang.Runnable;
import q90.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSPagerSlidingTabStrip;

public final class f$b implements Runnable	// class@002988
{
    public final f b;
    public final int c;

    public void f$b(f p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "1")) {
          return;
       }
       this.b.Z8().t(this.c, 0);
       return;
    }
}
