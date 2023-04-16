package com.yxcorp.gifshow.loading.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.yxcorp.gifshow.loading.HolidayLoadingPreferenceConfig;
import zf6.k;
import p17.c;
import com.kwai.library.widget.refresh.config.KwaiRefreshManager;
import java.util.Objects;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.Log;
import p17.a;
import com.kwai.library.widget.refresh.lottie.KwaiRefreshLottieManager;
import p17.b;
import java.lang.Runnable;
import ekd.k1;
import o1b.a;
import com.yxcorp.gifshow.loading.HolidayLoadingPreferenceConfig$a;
import com.yxcorp.gifshow.util.cdnresource.j;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import com.yxcorp.gifshow.loading.PullDownActivityResourceConfig;
import java.lang.reflect.Type;
import m0b.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public final class a	// class@001a99
{

    public void a(){
       super();
    }
    public static boolean a(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (a.t().d("enableHolidayLoadingConfig", b) && (!b.a(-404437045).g() && !p0)) {
          b = true;
       }
    label_003d :
       return b;
    }
    public static void b(HolidayLoadingPreferenceConfig p0){
       c d;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "3")) {
          return;
       }
       if (p0 != null && p0.isValid()) {
          KwaiRefreshManager.b = true;
          KwaiRefreshManager.d = HolidayLoadingPreferenceConfig.newRefreshGlobalConfig(a.a(k.d()), p0);
          KwaiRefreshManager e = KwaiRefreshManager.e;
          Objects.requireNonNull(e);
          if (SystemUtil.K()) {
             Log.b(KwaiRefreshManager.a, String.valueOf(KwaiRefreshManager.d));
             d = KwaiRefreshManager.d;
             str = (d != null)? d.e(): null;
             e.f("pull", str);
             d = KwaiRefreshManager.d;
             str = (d != null)? d.f(): null;
             e.f("refresh", str);
             d = KwaiRefreshManager.d;
             str = (d != null)? d.a(): null;
             e.f("background", str);
          }
          if (KwaiRefreshManager.e(null, true, null)) {
             KwaiRefreshLottieManager c = KwaiRefreshLottieManager.c;
             d = KwaiRefreshManager.d;
             str = (d != null)? d.e(): null;
             c.c(str);
             d = KwaiRefreshManager.d;
             str = (d != null)? d.f(): null;
             c.c(str);
          }
          if (KwaiRefreshManager.e(null, true, null)) {
             k1.o(b.b);
          }
       }
    label_009a :
       return;
    }
    public static void c(a p0){
       HolidayLoadingPreferenceConfig obj = null;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, obj, a.class, str)) {
          return;
       }
       HolidayLoadingPreferenceConfig$a uoa = new HolidayLoadingPreferenceConfig$a();
       uoa.a = j.b().a(CdnResource$ResourceKey.loading_pull_lottie);
       uoa.b = j.b().a(CdnResource$ResourceKey.loading_refresh_lottie);
       uoa.h = j.b().a(CdnResource$ResourceKey.loading_background_image);
       if (p0 != null) {
          uoa.d = p0.c;
          uoa.e = p0.d;
          uoa.c = p0.e;
          uoa.i = p0.a;
          uoa.j = p0.b;
       }
       PullDownActivityResourceConfig pullDownActi = a.b(PullDownActivityResourceConfig.class);
       if (pullDownActi != null) {
          uoa.f = pullDownActi.mStartTimestamp;
          uoa.g = pullDownActi.mEndTimestamp;
       }
       HolidayLoadingPreferenceConfig holidayLoadi = PatchProxy.apply(obj, uoa, HolidayLoadingPreferenceConfig$a.class, str);
       if (holidayLoadi != PatchProxyResult.class) {
       }else {
          obj = new HolidayLoadingPreferenceConfig(null, null, false, 0, 0, 0, 0);
          holidayLoadi.mRefreshFilePath = uoa.b;
          holidayLoadi.mLoadingWidth = uoa.d;
          holidayLoadi.mLoadingBackgroundWidth = uoa.i;
          holidayLoadi.mPullFilePath = uoa.a;
          holidayLoadi.mLoadingHeight = uoa.e;
          holidayLoadi.mStartTimeStamp = uoa.f;
          holidayLoadi.mLoadingBackgroundHeight = uoa.j;
          holidayLoadi.mEndTimeStamp = uoa.g;
          holidayLoadi.mDisablePullProgress = uoa.c;
          holidayLoadi.mLoadingBackgroundFilePath = uoa.h;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("holiday_loading_preference_config_v2", b.e(holidayLoadi));
       g.a(uEditor);
       a.b(holidayLoadi);
       return;
    }
}
