package d12.f;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import android.content.Intent;
import java.lang.Object;
import e12.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import tkd.b;
import tkd.d;
import rma.c;
import rma.a;
import rma.b;
import dq3.b;
import java.lang.IllegalArgumentException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d12.p;
import e12.n;
import e12.l;

public class f	// class@00241a
{
    public final e a;
    public final LiveBizParam b;

    public void f(LiveBizParam p0,Intent p1){
       super();
       this.b = p0;
       if (p0.mIsSoloLiveStream != null && p0.mLiveAudienceParam != null) {
          Object obj = null;
          f uof = PatchProxy.applyTwoRefs(p0, p1, obj, f.class, "3");
          if (uof != PatchProxyResult.class) {
          }else {
             LiveBizParam mLiveAudienc = p0.mLiveAudienceParam;
             if (mLiveAudienc != null) {
                LiveAudienceParam mPhoto = mLiveAudienc.mPhoto;
                if (mPhoto != null && mPhoto.mConfig == null) {
                   LiveStreamFeedWrapper liveStreamFe = new LiveStreamFeedWrapper(mPhoto);
                   LiveAudienceParam$a uoa = new LiveAudienceParam$a(mLiveAudienc);
                   uoa.i(liveStreamFe.getLiveStreamId());
                   uoa.n(liveStreamFe.getServerExpTag());
                   mLiveAudienc = uoa.a();
                   mPhoto = obj;
                }
                b uob = d.a(-1782425284).oL().e(p1, mLiveAudienc.mLiveSourceType, mLiveAudienc.mFormerH5PageSource);
                b b = (uob != null)? uob.b: obj;
                uob = (uob != null)? uob.a: obj;
                LiveAudienceParam$a uoa1 = new LiveAudienceParam$a(mLiveAudienc);
                uoa1.g(b.a(mLiveAudienc.mLiveSourceType, mLiveAudienc.mPhoto, obj, obj, obj));
                uoa1.b(b);
                uoa1.c(uob);
                LiveAudienceParam liveAudience = uoa1.a();
                p0.mLiveAudienceParam = liveAudience;
                uof = new f(p0, liveAudience, mPhoto);
             }else {
                throw new IllegalArgumentException("audience param cannot be null!");
             }
          }
          this.a = uof;
       }else if(!TextUtils.x(p0.mSlidePlayId) && p.c(p0.mSlidePlayId)){
          this.a = new n(p0);
       }else {
          this.a = new l(p0);
       }
       return;
    }
}
