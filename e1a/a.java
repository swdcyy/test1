package e1a.a;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.survey.ActionSurveyType;
import java.lang.String;
import java.lang.Object;
import com.kwai.feature.api.feed.misc.retrofit.response.ActionSurveyResponse;
import java.lang.System;
import oe6.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.d;
import com.yxcorp.gifshow.like.LikePhotoReasonCollect;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.detail.helper.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import jsa.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.VideoQualityInfo;
import l66.c;
import m66.a;

public final class a implements g	// class@00203f
{
    public final QPhoto b;
    public final ActionSurveyType c;
    public final String d;

    public void a(QPhoto p0,ActionSurveyType p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       d uod = 3;
       if (p0.mDetailSurvey != null) {
          if ((tb.getWidth() / tb.getHeight()) <= uod) {
             e.V(System.currentTimeMillis());
             RxBus.f.b(new d(p0.mDetailSurvey, tc.getType(), td, tb.getPhotoId()));
          }
       }else if(p0.mCoverSurvey == null || (tb.getWidth() / tb.getHeight()) > 1){
          e.V(System.currentTimeMillis());
          if (TextUtils.n(tc.getType(), ActionSurveyType.PLAY.getType())) {
             Object obj = PatchProxy.applyOneRefs(td, null, a.class, "3");
             if (obj != PatchProxyResult.class) {
                uod = obj.intValue();
             }else if(td.startsWith("E")){
                uod = 1;
             }else if(td.startsWith("S")){
                uod = 2;
             }
             if (uod == 2) {
                a.a = new b(tb.mEntity, p0.mCoverSurvey);
             }
          }
          c.a().b(new b(tb.mEntity, p0.mCoverSurvey));
       }
       return;
    }
}
