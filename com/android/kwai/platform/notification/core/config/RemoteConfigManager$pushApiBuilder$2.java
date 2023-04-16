package com.android.kwai.platform.notification.core.config.RemoteConfigManager$pushApiBuilder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import gv6.c;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public final class RemoteConfigManager$pushApiBuilder$2 extends Lambda implements a	// class@00040c
{
    public static final RemoteConfigManager$pushApiBuilder$2 INSTANCE;

    static {
       RemoteConfigManager$pushApiBuilder$2.INSTANCE = new RemoteConfigManager$pushApiBuilder$2();
    }
    public void RemoteConfigManager$pushApiBuilder$2(){
       super(0);
    }
    public final c invoke(){
       Object obj = RemoteConfigManager.j.i().get("apiBuilder");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.lib.interfacies.IPushApiBuilder");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
