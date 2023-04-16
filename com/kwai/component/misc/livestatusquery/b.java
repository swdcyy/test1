package com.kwai.component.misc.livestatusquery.b;
import ok.x;
import java.lang.Object;
import sc5.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.misc.livestatusquery.v2.LiveEndStatusCheckV3Config;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;

public final class b implements x	// class@0009ce
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       String str = a.t().u("SOURCE_LIVE").c("liveEndStatusCheckV3Config", "");
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(str, obj, d.class, "3");
       if (obj1 != PatchProxyResult.class) {
          obj = obj1;
       }else if(TextUtils.x(str)){
          try{
             LiveEndStatusCheckV3Config liveEndStatu = a.a.h(str, LiveEndStatusCheckV3Config.class);
             if (liveEndStatu != null && (liveEndStatu.mActiveAndBackgroundIntervalMs > 0 && (liveEndStatu.mInactiveAndBackgroundIntervalMs > 0 && liveEndStatu.mInactiveAndForegroundIntervalMs > 0))) {
                obj = liveEndStatu;
             }
          }catch(com.google.gson.JsonSyntaxException e0){
          }
       }
       return obj;
    }
}
