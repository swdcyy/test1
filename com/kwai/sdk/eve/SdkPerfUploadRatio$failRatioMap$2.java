package com.kwai.sdk.eve.SdkPerfUploadRatio$failRatioMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import sm7.r;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Iterator;
import sm7.d;
import java.lang.Float;
import kotlin.Pair;
import qrd.r0;

public final class SdkPerfUploadRatio$failRatioMap$2 extends Lambda implements a	// class@001447
{
    public final r this$0;

    public void SdkPerfUploadRatio$failRatioMap$2(r p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       List obj = PatchProxy.apply(null, this, SdkPerfUploadRatio$failRatioMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.a();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(obj, 10)), 16));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          String str = uod.c();
          Pair pair = r0.a(str, Float.valueOf(uod.a()));
          Object first = pair.getFirst();
          linkedHashMa.put(first, pair.getSecond());
       }
       return linkedHashMa;
    }
}
