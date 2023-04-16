package com.android.kwai.platform.notification.core.config.RemoteConfigManager$forceSendRequest$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Boolean;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager;
import java.util.Map;
import java.lang.Object;

public final class RemoteConfigManager$forceSendRequest$2 extends Lambda implements a	// class@00040b
{
    public static final RemoteConfigManager$forceSendRequest$2 INSTANCE;

    static {
       RemoteConfigManager$forceSendRequest$2.INSTANCE = new RemoteConfigManager$forceSendRequest$2();
    }
    public void RemoteConfigManager$forceSendRequest$2(){
       super(0);
    }
    public final Boolean invoke(){
       Boolean uBoolean = RemoteConfigManager.j.i().get("forceRequest");
       if (!uBoolean instanceof Boolean) {
          uBoolean = null;
       }
       return uBoolean;
    }
    public Object invoke(){
       return this.invoke();
    }
}
