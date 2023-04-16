package com.android.kwai.platform.notification.core.config.RemoteConfigManager$clientChannelList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager;
import java.util.Map;
import nsd.s0;

public final class RemoteConfigManager$clientChannelList$2 extends Lambda implements a	// class@000409
{
    public static final RemoteConfigManager$clientChannelList$2 INSTANCE;

    static {
       RemoteConfigManager$clientChannelList$2.INSTANCE = new RemoteConfigManager$clientChannelList$2();
    }
    public void RemoteConfigManager$clientChannelList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       List list = RemoteConfigManager.j.i().get("clientChannelList");
       if (!s0.F(list)) {
          list = null;
       }
       return list;
    }
}
