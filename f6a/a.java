package f6a.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import wh5.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import km5.i;

public final class a	// class@0022c6
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final boolean b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       boolean b = (!p0.isVideoType() && (!p0.isSinglePhoto() && (p0.isLongPhotos() || (p0.isAtlasPhotos() && (DanmakuSwitchUtil.b.a() > 0 && !c.b())))))? true: false;
       PatchProxy.onMethodExit(a.class, "1");
       return b;
    }
    public final boolean a(QPhoto p0,PhotoDetailParam p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       a.p(p1, "param");
       int i = 0;
       if (p0.isMine() && i.f(p1, i, 2, null)) {
          i = true;
       }
       PatchProxy.onMethodExit(a.class, "2");
       return i;
    }
}
