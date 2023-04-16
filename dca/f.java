package dca.f;
import erd.a;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import lq.i;
import lq.a;

public final class f implements a	// class@001ef2
{
    public final VideoSDKPlayerView b;

    public void f(VideoSDKPlayerView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AICutStyleLoadingViewBinder", "releasePlayer: release", objArray);
       this.b.release();
       i.m().p().c();
       return;
    }
}
