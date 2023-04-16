package com.kwai.android.common.config.PushConfigManager$apiBuilder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import gv6.c;
import com.kwai.android.common.config.PushConfigManager;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public final class PushConfigManager$apiBuilder$2 extends Lambda implements a	// class@000981
{
    public static final PushConfigManager$apiBuilder$2 INSTANCE;

    static {
       PushConfigManager$apiBuilder$2.INSTANCE = new PushConfigManager$apiBuilder$2();
    }
    public void PushConfigManager$apiBuilder$2(){
       super(0);
    }
    public final c invoke(){
       Object obj = PushConfigManager.INSTANCE.getDynamicConfig().get("apiBuilder");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.lib.interfacies.IPushApiBuilder");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
