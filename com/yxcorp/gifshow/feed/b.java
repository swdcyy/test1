package com.yxcorp.gifshow.feed.b;
import erd.o;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.yxcorp.gifshow.feed.response.PaidVideoAuthResponse;
import com.yxcorp.gifshow.feed.response.PaidVideoAuthResponse$PlayInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.feed.VideoFeed;
import vca.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.paycourse.PayVideoMeta;
import vca.a;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import tl8.d;
import ok.h;
import tl8.e;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.feed.PaidCourseAuthFailException;

public final class b implements o	// class@000fef
{
    public final QPhoto b;

    public void b(QPhoto p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       b tb = this.b;
       if (p0.mPlayInfo.mCode == 1) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          tb.setVideoUrls(uCDNUrlArray);
          QPhoto mEntity = tb.mEntity;
          PaidVideoAuthResponse mPlayInfo = p0.mPlayInfo;
          if (mPlayInfo != null) {
             PaidVideoAuthResponse$PlayInfo mMediaManife = mPlayInfo.mMediaManifest;
             if (!PatchProxy.applyVoidTwoRefs(tb, mMediaManife, null, i.class, "5")) {
                e.h(tb.mEntity, PayVideoMeta.class, new a(mMediaManife));
             }
             mMediaManife = p0.mPlayInfo.mMediaManifest;
             if (mMediaManife != null) {
                r1.c5(mEntity, mMediaManife);
             }
             mPlayInfo = p0.mPlayInfo;
             if (mPlayInfo.mTrialPlay != null) {
                mEntity.mPayVideoModel.mTrialPlayInfo = mPlayInfo.mTrialPlayInfo;
             }else {
                mEntity.mPayVideoModel.mTrialPlayInfo = null;
             }
          }
          VideoFeed mPayVideoMod = mEntity.mPayVideoModel;
          mPayVideoMod.mShowReport = p0.mDisplayReport;
          mPayVideoMod.mTag = p0.mTag;
          return tb;
       }else {
          PaidCourseAuthFailException paidCourseAu = new PaidCourseAuthFailException("Auth failed");
          paidCourseAu.mRedirectUrl = p0.mPlayInfo.mRedirectUrl;
          throw paidCourseAu;
       }
    }
}
