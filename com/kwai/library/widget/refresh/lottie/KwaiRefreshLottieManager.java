package com.kwai.library.widget.refresh.lottie.KwaiRefreshLottieManager;
import com.kwai.library.widget.refresh.lottie.KwaiRefreshLottieManager$sResultCache$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.widget.refresh.lottie.KwaiRefreshLottieManager$sTaskCache$2;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.CharSequence;
import zsd.u;
import kotlin.Result;
import com.kwai.library.widget.refresh.lottie.KwaiRefreshLottieManager$a;
import com.kwai.library.widget.refresh.lottie.KwaiRefreshLottieManager$b;
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import w4.j;
import kotlin.Triple;
import java.lang.Throwable;
import qrd.j0;
import java.util.Map;
import w4.e;
import w4.m;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class KwaiRefreshLottieManager	// class@0009db
{
    public static final p a;
    public static final p b;
    public static final KwaiRefreshLottieManager c;

    static {
       KwaiRefreshLottieManager.c = new KwaiRefreshLottieManager();
       KwaiRefreshLottieManager.a = s.c(KwaiRefreshLottieManager$sResultCache$2.INSTANCE);
       KwaiRefreshLottieManager.b = s.c(KwaiRefreshLottieManager$sTaskCache$2.INSTANCE);
    }
    public void KwaiRefreshLottieManager(){
       super();
    }
    public final ConcurrentHashMap a(){
       return KwaiRefreshLottieManager.a.getValue();
    }
    public final ConcurrentHashMap b(){
       return KwaiRefreshLottieManager.b.getValue();
    }
    public final void c(String p0){
       ConcurrentHashMap uConcurrentH = (p0 == null || u.S1(p0))? 1: null;
       if (!uConcurrentH && !this.b().contains(p0)) {
          KwaiRefreshLottieManager$a uoa = new KwaiRefreshLottieManager$a(p0);
          KwaiRefreshLottieManager$b uob = new KwaiRefreshLottieManager$b(p0);
          Object obj = Result.constructor-impl(new Triple(a.d(new FileInputStream(new File(p0)), p0).addListener(uoa).addFailureListener(uob), uoa, uob));
          if (Result.isSuccess-impl(obj)) {
             KwaiRefreshLottieManager.c.b().put(p0, obj);
          }
       }
       return;
    }
    public final e d(String p0){
       ConcurrentHashMap uConcurrentH = (p0 == null || u.S1(p0))? 1: null;
       e uoe = null;
       if (uConcurrentH) {
          return uoe;
       }else {
          e uoe1 = this.a().get(p0);
          if (uoe1 != null) {
             return uoe1;
          }else {
             m om = a.e(new FileInputStream(new File(p0)), p0);
             a.o(om, "LottieCompositionFactory¡­StreamSync\(fis, filePath\)");
             e uoe2 = om.b();
             if (uoe2 != null) {
                KwaiRefreshLottieManager c = KwaiRefreshLottieManager.c;
                Triple triple = c.b().remove(p0);
                if (triple != null) {
                   LottieTask lottieTask = triple.component1();
                   lottieTask.removeListener(triple.component2());
                   lottieTask.removeFailureListener(triple.component3());
                }
                c.a().put(p0, uoe2);
                uoe1 = uoe2;
             }
             p0 = Result.constructor-impl(l1.a);
             if (Result.exceptionOrNull-impl(p0) == null) {
                uoe = uoe1;
             }
             return uoe;
          }
       }
    }
}
