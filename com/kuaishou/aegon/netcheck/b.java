package com.kuaishou.aegon.netcheck.b;
import io.b$a;
import java.lang.Object;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import java.lang.Integer;

public final class b implements b$a	// class@0007ba
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       return Integer.valueOf(NetworkQualityEstimator.nativeGetScore());
    }
}
