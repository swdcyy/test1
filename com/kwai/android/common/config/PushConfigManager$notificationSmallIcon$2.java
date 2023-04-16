package com.kwai.android.common.config.PushConfigManager$notificationSmallIcon$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.android.common.config.PushConfigManager;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kwai.android.common.bean.NotificationSmallIcon;
import java.lang.Integer;

public final class PushConfigManager$notificationSmallIcon$2 extends Lambda implements a	// class@000985
{
    public static final PushConfigManager$notificationSmallIcon$2 INSTANCE;

    static {
       PushConfigManager$notificationSmallIcon$2.INSTANCE = new PushConfigManager$notificationSmallIcon$2();
    }
    public void PushConfigManager$notificationSmallIcon$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PushConfigManager.INSTANCE.getDynamicConfig().get("notificationSmallIcon");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.android.common.bean.NotificationSmallIcon");
       return obj.getNotificationSmallIcon();
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
