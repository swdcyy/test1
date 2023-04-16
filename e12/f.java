package e12.f;
import com.kuaishou.live.basic.liveslide.datasource.b;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import wg3.b;
import e12.f$a;
import c51.b;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import o02.j;
import o02.i;
import cjd.e;
import erd.o;
import e12.e;
import t45.d;
import brd.z;
import com.kuaishou.live.core.basic.model.QLiveLaunchInfo;
import java.util.ArrayList;

public class f extends b	// class@0025fa
{
    public final LiveAudienceParam h;
    public final LiveBizParam i;
    public long j;

    public void f(LiveBizParam p0,LiveAudienceParam p1,LiveStreamFeed p2){
       super();
       this.h = p1;
       this.i = p0;
       if (p2 != null) {
          this.t(p2);
       }
       this.p(new f$a(this));
       return;
    }
    public t c(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b.S(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag("LiveNonSlideDetailPageModel"), "[createRequest]", "requestUrl", "n/live/infoForLive");
       f th = this.h;
       return i.a().a(th.mLiveStreamId, th.mServerExpTag, th.mRecommendReason).map(new e()).concatMap(new e(this, p0)).subscribeOn(d.b).observeOn(d.a);
    }
    public String f(){
       return "LiveNonSlideDetailPageModel";
    }
    public boolean h(Object p0){
       return false;
    }
    public List m(boolean p0,Object p1){
       ArrayList uArrayList;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          uArrayList = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uof, "2");
          if (uArrayList != PatchProxyResult.class) {
          label_0029 :
             return uArrayList;
          }
       }
       uArrayList = new ArrayList();
       p1 = p1.mLiveStream;
       this.h.mPhoto = p1;
       uArrayList.add(p1);
       goto label_0029 ;
    }
}
