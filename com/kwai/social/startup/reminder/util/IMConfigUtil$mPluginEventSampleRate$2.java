package com.kwai.social.startup.reminder.util.IMConfigUtil$mPluginEventSampleRate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.social.startup.reminder.model.IMPluginLoggerConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import nsd.u;

public final class IMConfigUtil$mPluginEventSampleRate$2 extends Lambda implements a	// class@0018dc
{
    public static final IMConfigUtil$mPluginEventSampleRate$2 INSTANCE;

    static {
       IMConfigUtil$mPluginEventSampleRate$2.INSTANCE = new IMConfigUtil$mPluginEventSampleRate$2();
    }
    public void IMConfigUtil$mPluginEventSampleRate$2(){
       super(0);
    }
    public final IMPluginLoggerConfig invoke(){
       IMConfigInfo obj = PatchProxy.apply(null, this, IMConfigUtil$mPluginEventSampleRate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          obj = obj.mIMPluginLoggerConfig;
          if (obj != null) {
          label_002a :
             return obj;
          }
       }
       IMPluginLoggerConfig iMPluginLogg = new IMPluginLoggerConfig(false, 0, 0, 7, null);
       goto label_002a ;
    }
    public Object invoke(){
       return this.invoke();
    }
}
