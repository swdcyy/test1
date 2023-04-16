package com.yxcorp.gifshow.follow.common.data.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.follow.common.data.d$a;
import java.lang.reflect.Type;
import el.a;
import com.yxcorp.gifshow.follow.common.data.c;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.follow.config.startup.FollowStartupPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kha.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import java.util.Map;
import java.util.HashMap;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import java.lang.StringBuilder;
import yga.c;

public class d extends ConfigAutoParseJsonConsumer	// class@001033
{
    public static final Type e;

    static {
       d.e = new d$a().getType();
    }
    public void d(){
       super(c.b);
    }
    public void b(Object p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "2")) {
       }else {
          SharedPreferences a = a.a;
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putInt("userRecommendSwitchCard", p0.mBigCardStyle);
          uEditor.putString("enableMyfollowSlide", b.e(p0.mEnableMyfollowSlide));
          uEditor.putBoolean("EnableNewFollowTab", p0.mEnableNewFollowTab);
          uEditor.putInt("FollowAggreLiveMinCount", p0.mFollowAggreLiveMinCount);
          uEditor.putString("selectionFollowConnectionSwitches", b.e(p0.mFollowFeatureGuideConfig));
          uEditor.putInt("followFeatureMaskShowCount", p0.mFollowFeatureMaskShowCount);
          uEditor.putInt("followFeatureSnackBarShowCount", p0.mFollowFeatureSnackBarShowCount);
          uEditor.putLong("FollowFeedsLikeGuideIntervalTime", p0.mFollowFeedsLikeGuideIntervalTime);
          uEditor.putLong("FollowFeedsLikeGuideShowTime", p0.mFollowFeedsLikeGuideShowTime);
          uEditor.putLong("FollowFeedsLiveCountDownDelayTime", p0.mFollowFeedsLiveCountDownDelayTime);
          uEditor.putLong("FollowFeedsLiveCountDownTime", p0.mFollowFeedsLiveCountDownTime);
          uEditor.putString("followFoldFreqCardConfig", b.e(p0.mFollowFoldFreqCardConfig));
          uEditor.putString("followHorizontalPhotosConfig", b.e(p0.mFollowHorizontalPhotosConfig));
          uEditor.putString("myFollowLiveGuide", b.e(p0.mFollowLiveTipsGuideConfig));
          uEditor.putString("myfollowNextToast", b.e(p0.mFollowNextToastConfig));
          uEditor.putBoolean("FollowPageAutoPlay", p0.mFollowPageAutoPlay);
          uEditor.putString("followLiveStreamConfig", b.e(p0.mLivePlayConfig));
          uEditor.putLong("NirvanaLiveAnchorEndCountDownTime", p0.mNirvanaLiveAnchorEndCountDownTime);
          uEditor.putString("followSnackBarGuideConfig", b.e(p0.mSnackBarGuideConfig));
          g.a(uEditor);
          p0 = p0.mFollowFilterBoxes;
          if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "3")) {
             Map map = a.b(d.e);
             if (map == null) {
                map = new HashMap();
             }
             String id = QCurrentUser.ME.getId();
             if (!q.f(p0)) {
                map.put(QCurrentUser.ME.getId(), p0);
                c.i(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowSelector"), id+" save configs");
             }else {
                map.remove(QCurrentUser.ME.getId());
                c.i(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowSelector"), id+" remove configs");
             }
             p0 = a.edit();
             p0.putString("follow_filter_boxes", b.e(map));
             g.a(p0);
             c.j(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowSelector"), "current all configs", "filter", map.toString());
          }
       }
       return;
    }
}
