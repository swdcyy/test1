package com.kwai.feature.api.social.message.dva.init.IMInitTaskDelay$isAppVersionFirstLaunch$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.feature.api.social.message.dva.init.IMInitTaskDelay;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.content.SharedPreferences;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.StringBuilder;
import xv5.a;

public final class IMInitTaskDelay$isAppVersionFirstLaunch$2 extends Lambda implements a	// class@000af4
{
    public static final IMInitTaskDelay$isAppVersionFirstLaunch$2 INSTANCE;

    static {
       IMInitTaskDelay$isAppVersionFirstLaunch$2.INSTANCE = new IMInitTaskDelay$isAppVersionFirstLaunch$2();
    }
    public void IMInitTaskDelay$isAppVersionFirstLaunch$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       IMInitTaskDelay iMInitTaskDe = IMInitTaskDelay.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       IMInitTaskDelay obj = PatchProxy.apply(objArray, this, IMInitTaskDelay$isAppVersionFirstLaunch$2.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = IMInitTaskDelay.d;
       Objects.requireNonNull(obj);
       String str1 = PatchProxy.apply(objArray, obj, iMInitTaskDe, str);
       if (str1 != patchProxyRe) {
       }else {
          str1 = "";
          String str2 = IMInitTaskDelay.a.getString("IMInitTaskLastDelayVersion", str1);
          if (str2 != null) {
             str1 = str2;
          }
       }
       int i = a.g(str1, a.m) ^ 0x01;
       if (i) {
          String m = a.m;
          a.o(m, "AppEnv.VERSION");
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidOneRefs(m, obj, iMInitTaskDe, "2")) {
             g.a(IMInitTaskDelay.a.edit().putString("IMInitTaskLastDelayVersion", m));
          }
       }
       a.c("IM-INIT TASK DELAY needDelay="+i+" oldVersion="+str1+" newVersion="+a.m);
       return i;
    }
}
