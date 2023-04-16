package fj2.l;
import erd.g;
import fj2.o;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import java.lang.Object;
import java.lang.Throwable;
import t02.a0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import pp.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.waynelive.LivePlayUrlInfo;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.p0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import wkd.b;
import com.kuaishou.screencast.c;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;

public final class l implements g	// class@002974
{
    public final o b;
    public final ScreencastDeviceInfo c;

    public void l(o p0,ScreencastDeviceInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       l tb = this.b;
       l tc = this.c;
       tb.r.H2.d(LiveLogTag.SCREEN_CAST, "get throwable", p0);
       p0 = o.class;
       if (PatchProxy.applyVoidOneRefs(tc, tb, p0, "18")) {
       }else {
          p0 = PatchProxy.apply(null, tb, p0, "19");
          if (p0 != PatchProxyResult.class) {
          }else {
             p0 = tb.s.getCurrentPlayUrlInfo().getUrl();
             String host = tb.s.getCurrentPlayUrlInfo().getHost();
             if (!TextUtils.x(p0) && !TextUtils.x(host)) {
                p0 = p0.replace(p0.n(p0), host);
             }
             if (TextUtils.x(p0)) {
                p0 = tb.r.e.mPlayUrls.get(0).mUrl;
             }
          }
          b.a(-1851168653).e(p0, tc);
          b.a(-1851168653).d(tb.q.getPhotoId());
       }
       return;
    }
}
