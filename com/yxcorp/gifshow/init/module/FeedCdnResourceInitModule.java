package com.yxcorp.gifshow.init.module.FeedCdnResourceInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import com.yxcorp.gifshow.init.module.a0;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import android.app.Activity;
import android.os.Bundle;
import com.yxcorp.gifshow.loading.a;
import com.yxcorp.gifshow.loading.HolidayLoadingPreferenceConfig;
import m0b.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public class FeedCdnResourceInitModule extends TTIInitModule	// class@001980
{
    public static final int q;

    public void FeedCdnResourceInitModule(){
       super();
    }
    public int f0(){
       return 14;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, FeedCdnResourceInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(FeedCdnResourceInitModule.class, "2");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, FeedCdnResourceInitModule.class, "1")) {
          return;
       }
       e.d(a0.b, "FeedCdnResourceInitModule");
       PatchProxy.onMethodExit(FeedCdnResourceInitModule.class, "1");
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, FeedCdnResourceInitModule.class, "3")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, a.class, "1")) {
          HolidayLoadingPreferenceConfig holidayLoadi = HolidayLoadingPreferenceConfig.class;
          String str = a.a.getString("holiday_loading_preference_config_v2", "null");
          if (str != null && str != "") {
             objArray = b.a(str, holidayLoadi);
          }
          a.b(objArray);
       }
       PatchProxy.onMethodExit(FeedCdnResourceInitModule.class, "3");
       return;
    }
}
