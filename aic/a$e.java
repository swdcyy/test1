package aic.a$e;
import erd.g;
import aic.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public final class a$e implements g	// class@000125
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          p0 = this.b;
          p0.d(p0.a(), this.b.c());
       }
       return;
    }
}
