package com.kuaishou.aegon.netcheck.a;
import io.b$a;
import java.lang.Object;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator$Metrics;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;

public final class a implements b$a	// class@0007b9
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return NetworkQualityEstimator.nativeGetMetrics();
    }
}
