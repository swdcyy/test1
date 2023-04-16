package fia.e$b;
import wy6.b;
import fia.e;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import org.greenrobot.eventbus.a;
import e6a.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import az6.a;
import d6a.f;

public final class e$b implements b	// class@0028f7
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public final void a(BaseFeed p0,int p1){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       a.p(p0, "baseFeed");
       if (this.a.S8()) {
          p1.y = new QPhoto(p0);
          a.d().k(new a(f.c(this.a.R8().mSlidePlayId), this.a.R8().mFeedPosition, p0));
          p0.z = true;
       }
       return;
    }
}
