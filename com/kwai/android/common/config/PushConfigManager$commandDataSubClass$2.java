package com.kwai.android.common.config.PushConfigManager$commandDataSubClass$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Class;
import com.kwai.android.common.config.PushConfigManager;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public final class PushConfigManager$commandDataSubClass$2 extends Lambda implements a	// class@000982
{
    public static final PushConfigManager$commandDataSubClass$2 INSTANCE;

    static {
       PushConfigManager$commandDataSubClass$2.INSTANCE = new PushConfigManager$commandDataSubClass$2();
    }
    public void PushConfigManager$commandDataSubClass$2(){
       super(0);
    }
    public final Class invoke(){
       Object obj = PushConfigManager.INSTANCE.getDynamicConfig().get("commandDataSubClass");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Class<out com.kwai.android.common.bean.CommandData>");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
