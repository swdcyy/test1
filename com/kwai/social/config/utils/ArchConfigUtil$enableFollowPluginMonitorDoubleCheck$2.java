package com.kwai.social.config.utils.ArchConfigUtil$enableFollowPluginMonitorDoubleCheck$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class ArchConfigUtil$enableFollowPluginMonitorDoubleCheck$2 extends Lambda implements a	// class@00189c
{
    public static final ArchConfigUtil$enableFollowPluginMonitorDoubleCheck$2 INSTANCE;

    static {
       ArchConfigUtil$enableFollowPluginMonitorDoubleCheck$2.INSTANCE = new ArchConfigUtil$enableFollowPluginMonitorDoubleCheck$2();
    }
    public void ArchConfigUtil$enableFollowPluginMonitorDoubleCheck$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, ArchConfigUtil$enableFollowPluginMonitorDoubleCheck$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("follow_plugin_custom_double_check", false);
    }
}
