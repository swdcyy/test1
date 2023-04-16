package com.kwai.library.widget.refresh.lottie.KwaiRefreshLottieManager$b;
import w4.j;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.library.widget.refresh.lottie.KwaiRefreshLottieManager;
import java.util.concurrent.ConcurrentHashMap;

public final class KwaiRefreshLottieManager$b implements j	// class@0009d8
{
    public final String a;

    public void KwaiRefreshLottieManager$b(String p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       KwaiRefreshLottieManager.c.b().remove(this.a);
    }
}
