package yp.q;
import com.kwai.framework.util.gson.GsonLifeCycleEnabler$a;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.n;
import fi5.u;
import com.kwai.feature.api.feed.growth.model.invite.InviteSlidePageFeedModel;
import pw5.h;
import qx5.a;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import com.yxcorp.gifshow.detail.article.model.ArticleFeed;
import com.yxcorp.gifshow.detail.model.meta.InterestLabelsFeed;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementFeed;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Feed;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardFeed;
import com.yxcorp.gifshow.follow.common.data.SurveyFeed;
import zga.a;
import i6b.f;
import java.util.Set;
import java.lang.reflect.Type;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.feed.ImageFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.TemplateFeed;
import com.kuaishou.android.model.feed.AggregateLiveStreamFeed;
import com.kuaishou.android.model.feed.AggregateTemplateFeed;
import com.kuaishou.android.model.feed.ActivityTemplateFeed;
import com.kuaishou.android.model.feed.TextBannerFeed;
import com.kuaishou.android.model.feed.InvalidFeed;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import com.kuaishou.android.model.feed.MerchantRecommendUserFeed;
import com.kuaishou.android.model.feed.LocationPermissionFeed;
import com.kuaishou.android.model.feed.AppletsFeed;

public class q implements GsonLifeCycleEnabler$a	// class@0028d4
{
    public boolean a;
    public static final GsonLifeCycleEnabler$a b;
    public static final Set c;

    static {
       q.b = new q();
       q.c = new HashSet();
    }
    public void q(){
       super();
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, q.class, "1")) {
          return;
       }
       n.e();
       u.b();
       InviteSlidePageFeedModel.registerFeedCheckerClass();
       h.b();
       a.b();
       CommonInsertCardFeed.registerFeedCheckerClass();
       CoronaBannerFeed.registerFeedCheckerClass();
       CoronaSubChannelFeed.registerFeedCheckerClass();
       ArticleFeed.registerFeedCheckerClass();
       InterestLabelsFeed.registerFeedCheckerClass();
       InterestManagementFeed.registerFeedCheckerClass();
       InterestManagementV3Feed.registerFeedCheckerClass();
       NasaRecommendUserFeed.registerFeedCheckerClass();
       SurveyBigCardFeed.registerFeedCheckerClass();
       SurveyFeed.registerFeedCheckerClass();
       a.b();
       f.c();
       return;
    }
    public static void d(Class p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, q.class, "3")) {
          return;
       }
       q.c.add(p0);
       return;
    }
    public boolean a(Type p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof Class) {
          return b;
       }
       if (!BaseFeed.class.isAssignableFrom(p0)) {
          return b;
       }
       if (p0 != BaseFeed.class && (p0 != VideoFeed.class && (p0 != ImageFeed.class && (p0 != LiveStreamFeed.class && (p0 != TemplateFeed.class && (p0 != AggregateLiveStreamFeed.class && (p0 != AggregateTemplateFeed.class && (p0 != ActivityTemplateFeed.class && (p0 != TextBannerFeed.class && (p0 != InvalidFeed.class && (p0 != ContentAggregateWeakFeed.class && (p0 != MerchantRecommendUserFeed.class && (p0 == LocationPermissionFeed.class || p0 == AppletsFeed.class))))))))))))) {
          b = true;
       }
       if (b) {
          return true;
       }else {
          this.c();
          return q.c.contains(p0);
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, q.class, "2")) {
          return;
       }
       if (this.a != null) {
          return;
       }
       this.a = true;
       q.b();
       return;
    }
}
