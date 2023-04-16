package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter$c;
import android.view.View$OnAttachStateChangeListener;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import java.util.Map;
import java.lang.Double;
import kotlin.jvm.internal.a;
import android.view.ViewStub;
import ga5.d;
import com.yxcorp.gifshow.entity.QPhoto;
import aja.c;

public final class HomeFollowSummaryPresenter$c implements View$OnAttachStateChangeListener	// class@0011fe
{
    public final HomeFollowSummaryPresenter b;

    public void HomeFollowSummaryPresenter$c(HomeFollowSummaryPresenter p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       int i;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowSummaryPresenter$c.class, "1")) {
          return;
       }
       if (HomeFollowSummaryPresenter.P8(this.b).mInteractionTagShowed == null) {
          boolean b = true;
          p0.mInteractionTagShowed = b;
          try{
             i = 0;
             CommonMeta mCoverCommon = HomeFollowSummaryPresenter.P8(this.b).mCoverCommonTags;
             if (mCoverCommon != null) {
                CoverCommonTagsModel mAuthorRight = mCoverCommon.mAuthorRightSideTag;
                if (mAuthorRight != null) {
                   CoverCommonTagLabelModel extParams = mAuthorRight.extParams;
                   if (extParams != null) {
                      String obj = extParams.get("tag_show_type");
                      if (obj != null) {
                         obj = obj.toString();
                         if (obj != null) {
                            i1 = (int)Double.parseDouble(obj);
                         }
                      }
                   }
                }
             }
             i1 = 0;
          }catch(java.lang.Exception e0){
          }
          HomeFollowSummaryPresenter$c tb = this.b;
          if (tb.I == null) {
             HomeFollowSummaryPresenter d = tb.D;
             if (d == null) {
                a.S("mAvatarRightSideFeedGeneralCoverLabelViewStub");
             }
             View view = d.a(d);
             if (view != null && (!view.getVisibility() && i1 > 0)) {
                c.a(HomeFollowSummaryPresenter.R8(this.b), i, i1);
             }
          }else {
             c.a(HomeFollowSummaryPresenter.R8(tb), e0, i);
          }
       }
    label_0074 :
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
}
