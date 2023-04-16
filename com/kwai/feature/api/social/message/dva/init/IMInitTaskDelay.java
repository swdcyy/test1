package com.kwai.feature.api.social.message.dva.init.IMInitTaskDelay;
import java.lang.String;
import java.lang.Object;
import km8.b;
import java.util.Objects;
import android.content.SharedPreferences;
import com.kwai.feature.api.social.message.dva.init.IMInitTaskDelay$isAppVersionFirstLaunch$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import android.os.SystemClock;
import java.lang.Math;
import java.lang.StringBuilder;
import xv5.a;

public final class IMInitTaskDelay	// class@000af5
{
    public static final SharedPreferences a;
    public static long b;
    public static final p c;
    public static final IMInitTaskDelay d;

    static {
       IMInitTaskDelay.d = new IMInitTaskDelay();
       Object obj = b.b("DefaultPreferenceHelper");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.content.SharedPreferences");
       IMInitTaskDelay.a = obj;
       IMInitTaskDelay.c = s.c(IMInitTaskDelay$isAppVersionFirstLaunch$2.INSTANCE);
    }
    public void IMInitTaskDelay(){
       super();
    }
    public final long a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IMInitTaskDelay iMInitTaskDe = IMInitTaskDelay.class;
       Object[] objArray = null;
       QCurrentUser obj = PatchProxy.apply(objArray, this, iMInitTaskDe, "5");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = QCurrentUser.ME;
       a.o(obj, "QCurrentUser.ME");
       long l = 0;
       if (!obj.isLogined()) {
          Boolean uBoolean = PatchProxy.apply(objArray, this, iMInitTaskDe, "3");
          if (uBoolean == patchProxyRe) {
             uBoolean = IMInitTaskDelay.c.getValue();
          }
          if (uBoolean.booleanValue()) {
             l = Math.max(((IMInitTaskDelay.b + 0x2710) - SystemClock.elapsedRealtime()), l);
          }
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       a.c("IM-INIT TASK DELAY delayTime="+l+" isLogin:"+mE.isLogined());
       return l;
    }
}
