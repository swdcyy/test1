package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a$d;
import erd.o;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import kotlin.jvm.internal.a;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.BaseHomePostBubbleV2;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.NewPublishGuideInfoGroup;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.NewPublishGuideInfo;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.HomeOperateIconInfo;
import java.util.List;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter;
import java.util.ArrayList;
import lnc.a1;

public final class HomeLocalNewUserBubblePresenter$a$d implements o	// class@001015
{
    public final HomeLocalNewUserBubblePresenter$a b;

    public void HomeLocalNewUserBubblePresenter$a$d(HomeLocalNewUserBubblePresenter$a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PublishGuideInfo publishGuide = PatchProxy.applyOneRefs(p0, this, HomeLocalNewUserBubblePresenter$a$d.class, "1");
       if (publishGuide != PatchProxyResult.class) {
       }else {
          a.p(p0, "iconDrawable");
          publishGuide = new PublishGuideInfo();
          publishGuide.mId = "3";
          int i = 3;
          publishGuide.mType = i;
          publishGuide.mCameraButtonLocation = this.b.G();
          publishGuide.mIconDrawable = p0;
          int i1 = HomePostEntranceExpUtil.h.e();
          publishGuide.mBubbleUiType = i1;
          NewPublishGuideInfoGroup mBubbleInfo = publishGuide.mPublishGuideInfoGroup.mBubbleInfo;
          if (i1 == i) {
             NewPublishGuideInfo topIconInfo = mBubbleInfo.topIconInfo;
             topIconInfo.mDrawable = p0;
             topIconInfo.mIconUrl = this.b.v.b9().get(0);
          }else {
             mBubbleInfo.mImage = this.b.v.b9().get(0);
          }
          mBubbleInfo.gradientColors = new ArrayList();
          if (!HomePostEntranceExpUtil.f()) {
             publishGuide.mTitle = a1.p(0x7f103d8c);
             mBubbleInfo.mTitleColor = "#FF8500";
             mBubbleInfo.gradientColors.add("#FFF5E8");
             mBubbleInfo.gradientColors.add("#FFFBEF");
          }else {
             publishGuide.mTitle = "来快手的第一天";
             publishGuide.mSubTitle = "发个作品记录一下";
             mBubbleInfo.mTitleColor = "#FF3353";
             mBubbleInfo.mSubTitleColor = "#FF3353";
             mBubbleInfo.gradientColors.add("#FFEEEE");
             mBubbleInfo.gradientColors.add("#FFF8EE");
          }
       }
       return publishGuide;
    }
}
