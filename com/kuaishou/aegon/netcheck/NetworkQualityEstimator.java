package com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import java.lang.Object;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator$Metrics;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.aegon.Aegon;
import com.kuaishou.aegon.netcheck.a;
import io.b$a;
import io.b;
import java.lang.Number;
import com.kuaishou.aegon.netcheck.b;
import java.lang.Integer;

public class NetworkQualityEstimator	// class@0007b8
{

    public void NetworkQualityEstimator(){
       super();
    }
    public static NetworkQualityEstimator$Metrics a(){
       Object obj = PatchProxy.apply(null, null, NetworkQualityEstimator.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!Aegon.f()) {
          return new NetworkQualityEstimator$Metrics();
       }
       return b.b(a.a);
    }
    public static int b(){
       Object obj = PatchProxy.apply(null, null, NetworkQualityEstimator.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!Aegon.f()) {
          return -1;
       }
       return b.b(b.a).intValue();
    }
    public static native NetworkQualityEstimator$Metrics nativeGetMetrics();
    public static native int nativeGetScore();
}
