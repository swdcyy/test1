package k99.c;
import java.lang.Runnable;
import k99.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import com.kwai.framework.model.feed.BaseFeed;
import exb.b;
import zic.p0;

public final class c implements Runnable	// class@002b6d
{
    public final f b;
    public final GifshowActivity c;

    public void c(f p0,GifshowActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       c tc = this.c;
       f p = this.b.p;
       if (p == null) {
          a.S("mPhoto");
       }
       p0.c(tc, p.mEntity, new StatModel("COVER"), null, this.b.t);
       return;
    }
}
