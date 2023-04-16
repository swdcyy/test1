package fea.a;
import java.lang.Object;
import yqb.b;
import yqb.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.featured.detail.live.data.a;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import ekd.j;
import java.util.List;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import fea.a$a;
import wy6.d;
import yqb.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import tkd.b;
import tkd.d;
import vm5.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import android.content.Intent;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.feature.api.live.base.model.LiveStyleParams$a;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import qrd.l1;
import os5.l;
import java.util.Objects;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public final class a	// class@0028d6
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(b p0,k p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       QPhoto qPhoto = p0.e();
       String str = "entranceParam.photo";
       a.o(qPhoto, str);
       QPhoto qPhoto1 = p0.e();
       a.o(qPhoto1, str);
       int i = 1;
       QPhoto[] qPhotoArray = new QPhoto[i];
       qPhotoArray[0] = p0.e();
       a uoa = new a(qPhoto.getLiveStreamId(), qPhoto1.getLiveStreamId(), j.a(qPhotoArray), p1);
       b uob = b.g(j.b(uoa, f.b(p0.b()), SlideMediaType.LIVE));
       a.o(uob, "dataFetcherImp");
       uob.l4(new a$a(uoa));
       c uoc = p0.f();
       b = (uoc != null)? uoc.r(): false;
       PhotoDetailParam photoDetailP = new PhotoDetailParam(p0.e()).setBizType(10).setSlidePlayId(uob.id()).setPhotoIndex(p0.g());
       a.o(photoDetailP, "detailParam");
       photoDetailP.getDetailLogParam().addSlideSessionParams(photoDetailP.getBaseFeed());
       photoDetailP.getSlidePlayConfig().setEnablePullRefresh(0);
       if (b) {
          photoDetailP.mDetailCommonParam.mIsWindowTranslucent = i;
       }
       int i1 = -1818031860;
       Intent intent = d.a(i1).tF(p0.a(), photoDetailP, null);
       LiveBizParam liveBizParam = new LiveBizParam();
       liveBizParam.mLiveSourceType = p0.d();
       liveBizParam.mIsAutoEnter = p0.h();
       if (b) {
          LiveStyleParams$a uoa1 = new LiveStyleParams$a();
          uoa1.e(i);
          liveBizParam.mLiveStyleParams = uoa1.a();
          c uoc1 = p0.f();
          String str1 = (uoc1 != null)? uoc1.w(): null;
          liveBizParam.mPlayerReuseToken = str1;
       }
       LiveAudienceParam liveAudience = new LiveAudienceParam();
       liveAudience.mMerchantAudienceParams = p0.h;
       QPhoto qPhoto2 = p0.e();
       a.o(qPhoto2, str);
       liveAudience.mLiveStreamId = qPhoto2.getLiveStreamId();
       liveAudience.mInternalJumpSchema = p0.c();
       liveBizParam.mLiveAudienceParam = liveAudience;
       QPhoto qPhoto3 = p0.e();
       a.o(qPhoto3, str);
       liveBizParam.setInternalJumpUrl(qPhoto3.getUserId(), liveBizParam.mLiveAudienceParam.mInternalJumpSchema);
       if (p0.j != null) {
          qPhoto3 = p0.e();
          a.o(qPhoto3, str);
          if (qPhoto3.isLiveStream()) {
             qPhoto3 = p0.e().mEntity;
             Objects.requireNonNull(qPhoto3, "null cannot be cast to non-null type com.kuaishou.android.model.feed.LiveStreamFeed");
             d.a(-1492894991).Fv(liveBizParam, qPhoto3);
          }
       }
       liveBizParam.putParamIntoIntent(intent);
       if (b) {
          intent.putExtra("start_enter_page_animation", R.anim.arg_RES_7f010049);
       }
       d.a(i1).jB(p0.a(), 1029, intent, null);
       return;
    }
}
