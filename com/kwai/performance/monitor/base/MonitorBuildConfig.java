package com.kwai.performance.monitor.base.MonitorBuildConfig;
import com.kwai.performance.monitor.base.MonitorBuildConfig$DEBUG$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.performance.monitor.base.MonitorBuildConfig$VERSION_NAME$2;
import com.kwai.performance.monitor.base.MonitorBuildConfig$PRODUCT_NAME$2;
import com.kwai.performance.monitor.base.MonitorBuildConfig$SERVICE_ID$2;
import com.kwai.performance.monitor.base.MonitorBuildConfig$CHANNEL$2;
import com.kwai.performance.monitor.base.MonitorBuildConfig$DEVICE_ID$2;
import com.kwai.performance.monitor.base.MonitorBuildConfig$ROM$2;
import com.kwai.performance.monitor.base.MonitorBuildConfig$ROM_VERSION$2;
import com.kwai.performance.monitor.base.MonitorBuildConfig$FINGER_PRINT$2;
import com.kwai.performance.monitor.base.MonitorBuildConfig$CPU_PLATFORM$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public final class MonitorBuildConfig	// class@000dbc
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final p i;
    public static final p j;
    public static final MonitorBuildConfig k;

    static {
       MonitorBuildConfig.k = new MonitorBuildConfig();
       MonitorBuildConfig.a = s.c(MonitorBuildConfig$DEBUG$2.INSTANCE);
       MonitorBuildConfig.b = s.c(MonitorBuildConfig$VERSION_NAME$2.INSTANCE);
       MonitorBuildConfig.c = s.c(MonitorBuildConfig$PRODUCT_NAME$2.INSTANCE);
       MonitorBuildConfig.d = s.c(MonitorBuildConfig$SERVICE_ID$2.INSTANCE);
       MonitorBuildConfig.e = s.c(MonitorBuildConfig$CHANNEL$2.INSTANCE);
       MonitorBuildConfig.f = s.c(MonitorBuildConfig$DEVICE_ID$2.INSTANCE);
       MonitorBuildConfig.g = s.c(MonitorBuildConfig$ROM$2.INSTANCE);
       MonitorBuildConfig.h = s.c(MonitorBuildConfig$ROM_VERSION$2.INSTANCE);
       MonitorBuildConfig.i = s.c(MonitorBuildConfig$FINGER_PRINT$2.INSTANCE);
       MonitorBuildConfig.j = s.c(MonitorBuildConfig$CPU_PLATFORM$2.INSTANCE);
    }
    public void MonitorBuildConfig(){
       super();
    }
    public static final String a(){
       return MonitorBuildConfig.j.getValue();
    }
    public static final boolean b(){
       return MonitorBuildConfig.a.getValue().booleanValue();
    }
    public static final String c(){
       return MonitorBuildConfig.f.getValue();
    }
    public static final String d(){
       return MonitorBuildConfig.i.getValue();
    }
    public static final String e(){
       return MonitorBuildConfig.g.getValue();
    }
    public static final String f(){
       return MonitorBuildConfig.h.getValue();
    }
    public static final String g(){
       return MonitorBuildConfig.d.getValue();
    }
    public static final String h(){
       return MonitorBuildConfig.b.getValue();
    }
}
