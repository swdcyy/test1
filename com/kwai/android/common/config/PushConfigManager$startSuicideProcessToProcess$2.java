package com.kwai.android.common.config.PushConfigManager$startSuicideProcessToProcess$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.android.common.config.PushConfigManager;
import java.util.Map;
import java.lang.String;
import java.util.Objects;

public final class PushConfigManager$startSuicideProcessToProcess$2 extends Lambda implements a	// class@000986
{
    public static final PushConfigManager$startSuicideProcessToProcess$2 INSTANCE;

    static {
       PushConfigManager$startSuicideProcessToProcess$2.INSTANCE = new PushConfigManager$startSuicideProcessToProcess$2();
    }
    public void PushConfigManager$startSuicideProcessToProcess$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PushConfigManager.INSTANCE.getDynamicConfig().get("startSuicideProcessToProcess");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
       return obj.booleanValue();
    }
}
