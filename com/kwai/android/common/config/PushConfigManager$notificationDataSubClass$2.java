package com.kwai.android.common.config.PushConfigManager$notificationDataSubClass$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Class;
import com.kwai.android.common.config.PushConfigManager;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public final class PushConfigManager$notificationDataSubClass$2 extends Lambda implements a	// class@000984
{
    public static final PushConfigManager$notificationDataSubClass$2 INSTANCE;

    static {
       PushConfigManager$notificationDataSubClass$2.INSTANCE = new PushConfigManager$notificationDataSubClass$2();
    }
    public void PushConfigManager$notificationDataSubClass$2(){
       super(0);
    }
    public final Class invoke(){
       Object obj = PushConfigManager.INSTANCE.getDynamicConfig().get("notificationDataSubClass");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Class<out com.kwai.android.common.bean.PushData>");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
