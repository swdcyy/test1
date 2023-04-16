package com.kuaishou.live.core.basic.config.LiveCommonConfigFetcher;
import java.lang.Object;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o02.f;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import com.kuaishou.live.core.basic.config.a;
import erd.g;
import com.kuaishou.live.core.basic.config.c;
import com.kuaishou.live.core.basic.config.b;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse;
import s81.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import fg6.a;
import com.google.gson.Gson;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;
import d61.g;
import s02.f;

public class LiveCommonConfigFetcher	// class@000829
{

    public void LiveCommonConfigFetcher(){
       super();
    }
    public static void fetch(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveCommonConfigFetcher.class, "1")) {
          return;
       }
       e.a().Q(p0).map(new e()).observeOn(d.c).doOnNext(a.b).doOnError(c.b).observeOn(d.a).subscribe(b.b, Functions.d());
       return;
    }
    public static void lambda$fetch$0(LiveCommonConfigResponse p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("assistantConfig", b.e(p0.mAssistantConfig));
       uEditor.putString("bottomItemConfig", b.e(p0.mBottomItemConfig));
       uEditor.putBoolean("DisableAuthorGiftDisplayExtend", p0.mDisableAuthorGiftDisplayExtend);
       uEditor.putString("fansTop", b.e(p0.mFansTop));
       uEditor.putString("followAuthorFeedConfig", b.e(p0.mFollowAutorFeedConfig));
       uEditor.putString("giftConfig", b.e(p0.mGiftConfig));
       uEditor.putString("liveAdaptiveConfig", p0.mLiveAdaptiveConfig);
       uEditor.putString("arrowRedPackConfig", b.e(p0.mLiveArrowRedPacketConfig));
       uEditor.putString("magicFaceConfig", b.e(p0.mMagicFaceConfig));
       uEditor.putString("pkCommonConfig", b.e(p0.mPkCommonConfig));
       uEditor.putString("livePushOriginConfig", b.e(p0.mPushOriginConfig));
       uEditor.putString("shop", b.e(p0.mShopConfig));
       uEditor.putString("wishList", b.e(p0.mWishListConfig));
       g.a(uEditor);
       b.c0(LiveCommonLogTag.NETWORK_REQUEST, "live/config/common", "result", a.a.q(p0));
    }
    public static void lambda$fetch$1(Throwable p0){
       b.c0(LiveCommonLogTag.NETWORK_REQUEST, "live/config/common", "result error: ", g.e(p0));
    }
    public static void lambda$fetch$2(LiveCommonConfigResponse p0){
       f.b = p0.mBottomItemConfig;
    }
}
