package com.yxcorp.gifshow.detail.slideplay.presenter.comment.c;
import uz5.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentCreatorPresenter;
import tz5.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.component.photofeatures.startup.response.CommentTopBarBizTypeResponse;
import s85.a;
import com.kwai.component.commenttopbar.CommentTopBarBizType;
import java.util.Objects;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import com.kwai.feature.component.photofeatures.startup.response.CommentPhotoInfoResponse;
import java.util.List;
import java.lang.Throwable;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentCreatorPresenter$b;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentCreatorPresenter$CommentTopBarControl;

public class c extends a	// class@001857
{
    public final NasaCommentCreatorPresenter b;

    public void c(NasaCommentCreatorPresenter p0){
       this.b = p0;
       super();
    }
    public void b(a p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       if (p0.mBarBizTypeResponse != null) {
          this.b.p.setCommentPhotoInfoSucceed(true);
          a mBarBizTypeR = p0.mBarBizTypeResponse;
          this.b.G.a(mBarBizTypeR.biz, mBarBizTypeR.subBiz);
          c tb = this.b;
          a mBarBizTypeR1 = p0.mBarBizTypeResponse;
          CommentTopBarBizType uCommentTopB = new CommentTopBarBizType(mBarBizTypeR1.biz, mBarBizTypeR1.subBiz);
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(uCommentTopB, tb, NasaCommentCreatorPresenter.class, "22")) {
             w.t1(tb.p.mEntity, a.a.q(uCommentTopB));
          }
       }
       if (p0.mCommentPhotoInfoResponse != null) {
          this.b.p.setCommentPhotoInfoSucceed(true);
          this.b.p.setCommentPanelDynamicTabsInfo(p0.mCommentPhotoInfoResponse.mDynamicTabInfoList);
       }
       return;
    }
    public void c(Throwable p0,String p1){
    }
    public Map d(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       HashMap hashMap = new HashMap();
       List list = this.b.G.b();
       if (list != null && list.size() > 0) {
          this.b.p.setEnableCommentPhotoInfoRequest(true);
          NasaCommentCreatorPresenter$b uob = new NasaCommentCreatorPresenter$b();
          NasaCommentCreatorPresenter$CommentTopBarControl uCommentTopB = new NasaCommentCreatorPresenter$CommentTopBarControl();
          uCommentTopB.currentIndex = NasaCommentCreatorPresenter.I;
          uCommentTopB.mBizTypeList = this.b.G.b();
          uob.mCommentTopBarControl = uCommentTopB;
          hashMap.put("commentPhotoInfoParams", a.a.q(uob));
       }
       NasaCommentCreatorPresenter.I = NasaCommentCreatorPresenter.I + true;
       return hashMap;
    }
}
