package fua.b;
import erd.g;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;
import java.lang.Object;
import com.yxcorp.gifshow.model.FeedHotSurveyActionModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.d;
import fua.a;
import java.lang.Runnable;
import ekd.k1;

public final class b implements g	// class@0029f4
{
    public final HomeHotPhotoSurveyMaskBasePresenter b;

    public void b(HomeHotPhotoSurveyMaskBasePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else if(p0.getMDetailSurvey() != null){
          HotSurveyActionDetailSurvey hotSurveyAct = d.a(this.b.W8());
          if (hotSurveyAct != null) {
             HotSurveyActionDetailSurvey mDetailSurve = p0.getMDetailSurvey();
             String mSurveyId = (mDetailSurve != null)? mDetailSurve.getMSurveyId(): null;
             hotSurveyAct.setMSurveyId(mSurveyId);
          }
          this.b.x = p0.getMDetailSurvey();
          k1.r(new a(this), 100);
       }
       return;
    }
}
