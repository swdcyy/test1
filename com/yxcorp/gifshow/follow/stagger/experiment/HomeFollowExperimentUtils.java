package com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils;
import com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mFollowCoverAspectRatio$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mFollowV5StyleConfig$2;
import com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mEnableFollowLivePlayerResuse$2;
import com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mEnableFollowEve$2;
import com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mEnableClickEventInfer$2;
import com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mEnableExposedLiveAutoPlayWeight$2;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.feature.api.social.followStagger.model.FollowCoverAspectRatio;
import java.lang.Number;
import lga.a;
import com.kwai.component.feedstaggercard.model.CardStyle;
import ga5.e;
import com.kwai.feature.api.social.followStagger.model.FollowV5StyleConfig;
import kotlin.jvm.internal.a;

public final class HomeFollowExperimentUtils	// class@001183
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final HomeFollowExperimentUtils g;

    static {
       HomeFollowExperimentUtils.g = new HomeFollowExperimentUtils();
       HomeFollowExperimentUtils.a = s.c(HomeFollowExperimentUtils$mFollowCoverAspectRatio$2.INSTANCE);
       HomeFollowExperimentUtils.b = s.c(HomeFollowExperimentUtils$mFollowV5StyleConfig$2.INSTANCE);
       HomeFollowExperimentUtils.c = s.c(HomeFollowExperimentUtils$mEnableFollowLivePlayerResuse$2.INSTANCE);
       HomeFollowExperimentUtils.d = s.c(HomeFollowExperimentUtils$mEnableFollowEve$2.INSTANCE);
       HomeFollowExperimentUtils.e = s.c(HomeFollowExperimentUtils$mEnableClickEventInfer$2.INSTANCE);
       HomeFollowExperimentUtils.f = s.c(HomeFollowExperimentUtils$mEnableExposedLiveAutoPlayWeight$2.INSTANCE);
    }
    public void HomeFollowExperimentUtils(){
       super();
    }
    public static final boolean a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeFollowExperimentUtils homeFollowEx = HomeFollowExperimentUtils.class;
       HomeFollowExperimentUtils obj = PatchProxy.apply(null, null, homeFollowEx, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = HomeFollowExperimentUtils.g;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, homeFollowEx, "6");
       if (uBoolean == patchProxyRe) {
          uBoolean = HomeFollowExperimentUtils.f.getValue();
       }
       return uBoolean.booleanValue();
    }
    public static final boolean b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeFollowExperimentUtils homeFollowEx = HomeFollowExperimentUtils.class;
       HomeFollowExperimentUtils obj = PatchProxy.apply(null, null, homeFollowEx, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = HomeFollowExperimentUtils.g;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, homeFollowEx, "4");
       if (uBoolean == patchProxyRe) {
          uBoolean = HomeFollowExperimentUtils.d.getValue();
       }
       return uBoolean.booleanValue();
    }
    public static final FollowCoverAspectRatio c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeFollowExperimentUtils homeFollowEx = HomeFollowExperimentUtils.class;
       HomeFollowExperimentUtils obj = PatchProxy.apply(null, null, homeFollowEx, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = HomeFollowExperimentUtils.g;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, homeFollowEx, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = HomeFollowExperimentUtils.a.getValue();
       }
       return obj1;
    }
    public static final int d(){
       Object obj = PatchProxy.apply(null, null, HomeFollowExperimentUtils.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (a.a()) {
          return Integer.MAX_VALUE;
       }
       int i = (e.a("f") != CardStyle.NORMAL_CARD_NORMAL_BOTTOM)? 0: 1;
       return i;
    }
    public static final FollowV5StyleConfig e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeFollowExperimentUtils homeFollowEx = HomeFollowExperimentUtils.class;
       HomeFollowExperimentUtils obj = PatchProxy.apply(null, null, homeFollowEx, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = HomeFollowExperimentUtils.g;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, homeFollowEx, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = HomeFollowExperimentUtils.b.getValue();
       }
       return obj1;
    }
    public static final CardStyle f(){
       CardStyle obj = PatchProxy.apply(null, null, HomeFollowExperimentUtils.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = HomeFollowExperimentUtils.d();
       if (i) {
          obj = (i != 1)? CardStyle.NORMAL_CARD_NORMAL_BOTTOM: CardStyle.FOLLOW_CARD_V5;
       }else {
          obj = e.a("f");
          a.o(obj, "FeedCardStyleUtil.buildC¡­Util.RedesignPage.FOLLOW\)");
       }
       return obj;
    }
}
