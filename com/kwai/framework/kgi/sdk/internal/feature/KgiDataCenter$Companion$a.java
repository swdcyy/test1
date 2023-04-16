package com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$Companion$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import r76.a;
import q76.a;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class KgiDataCenter$Companion$a implements Comparator	// class@001591
{

    public void KgiDataCenter$Companion$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KgiDataCenter$Companion$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Long.valueOf(p0.timeStamp), Long.valueOf(p1.timeStamp));
    }
}
