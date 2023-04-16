package com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil$requestConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import xf6.i;
import com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil$SearchConfig;
import nsd.u;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.lang.StringBuilder;
import v2c.e;
import v2c.g;

public final class ProfileLastSeenUtil$requestConfig$2 extends Lambda implements a	// class@0015c8
{
    public static final ProfileLastSeenUtil$requestConfig$2 INSTANCE;

    static {
       ProfileLastSeenUtil$requestConfig$2.INSTANCE = new ProfileLastSeenUtil$requestConfig$2();
    }
    public void ProfileLastSeenUtil$requestConfig$2(){
       super(0);
    }
    public final ProfileLastSeenUtil$a invoke(){
       ProfileLastSeenUtil$a uoa1;
       ProfileLastSeenUtil$a uoa = ProfileLastSeenUtil$a.class;
       c obj = PatchProxy.apply(null, this, ProfileLastSeenUtil$requestConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       String str = "profileLastSeenRequestConfig";
       if (obj.c()) {
          int i = i.g(str);
          if (i) {
             if (i != 1) {
                if (i == 2) {
                   uoa1 = new ProfileLastSeenUtil$a(0, 0, 3, null, 8, null);
                   return uoa;
                }
             }else {
                ProfileLastSeenUtil$a uoa2 = new ProfileLastSeenUtil$a(50, 0, 4, null, 8, null);
                return uoa;
             }
          }else {
             uoa1 = new ProfileLastSeenUtil$a(0, 0, 0, null, 8, null);
             Object value = a.t().getValue(str, uoa, v3);
             a.o(value, "SwitchConfigManager.getI¡­  RequestConfig\(0, 0, 0\)\)");
             return value;
          }
       }
       uoa1 = new ProfileLastSeenUtil$a(0, 0, 0, null, 8, null);
       uoa = a.t().getValue(str, uoa, v3);
       g.h(KsLogProfileTag.PHOTO_LAST_SEEN, "requestConfig: percent: "+uoa.b()+", interval: "+uoa.a()+", time: "+uoa.d());
       a.o(uoa, "requestConfig");
       return uoa;
    }
    public Object invoke(){
       return this.invoke();
    }
}
