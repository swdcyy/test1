package com.kwai.library.widget.refresh.lottie.KwaiRefreshLottieManager$a;
import w4.j;
import java.lang.String;
import java.lang.Object;
import w4.e;
import com.kwai.library.widget.refresh.lottie.KwaiRefreshLottieManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class KwaiRefreshLottieManager$a implements j	// class@0009d7
{
    public final String a;

    public void KwaiRefreshLottieManager$a(String p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       KwaiRefreshLottieManager c = KwaiRefreshLottieManager.c;
       c.b().remove(this.a);
       a.o(p0, "it");
       c.a().put(this.a, p0);
    }
}
