package com.kwai.android.common.config.PushConfigManager$coroutineDispatcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kotlinx.coroutines.CoroutineDispatcher;
import com.kwai.android.common.config.PushConfigManager;
import java.util.Map;
import java.lang.String;
import java.util.Objects;

public final class PushConfigManager$coroutineDispatcher$2 extends Lambda implements a	// class@000983
{
    public static final PushConfigManager$coroutineDispatcher$2 INSTANCE;

    static {
       PushConfigManager$coroutineDispatcher$2.INSTANCE = new PushConfigManager$coroutineDispatcher$2();
    }
    public void PushConfigManager$coroutineDispatcher$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final CoroutineDispatcher invoke(){
       Object obj = PushConfigManager.INSTANCE.getDynamicConfig().get("coroutineDispatcher");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
       return obj;
    }
}
