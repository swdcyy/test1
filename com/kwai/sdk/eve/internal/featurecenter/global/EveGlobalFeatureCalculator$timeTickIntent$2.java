package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickIntent$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.IntentFilter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveGlobalFeatureCalculator$timeTickIntent$2 extends Lambda implements a	// class@001503
{
    public static final EveGlobalFeatureCalculator$timeTickIntent$2 INSTANCE;

    static {
       EveGlobalFeatureCalculator$timeTickIntent$2.INSTANCE = new EveGlobalFeatureCalculator$timeTickIntent$2();
    }
    public void EveGlobalFeatureCalculator$timeTickIntent$2(){
       super(0);
    }
    public final IntentFilter invoke(){
       Object obj = PatchProxy.apply(null, this, EveGlobalFeatureCalculator$timeTickIntent$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IntentFilter("android.intent.action.TIME_TICK");
    }
    public Object invoke(){
       return this.invoke();
    }
}
