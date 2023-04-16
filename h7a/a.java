package h7a.a;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wh5.c;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import e7a.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a	// class@0025d8
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final void a(PhotoDetailParam p0,NasaBizParam p1,MainThreadScatterPresenterGroup p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "1")) {
          return;
       }
       a.p(p0, "detailParam");
       a.p(p1, "nasaBizParam");
       a.p(p2, "presenterGroup");
       if (c.b()) {
          return;
       }
       if (DanmakuExperimentUtils.U.S()) {
          p2.a(new d());
       }
       return;
    }
}
