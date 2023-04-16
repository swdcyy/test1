package com.kwai.sdk.eve.internal.localguard.EveLocalGuardConfig$maxLimitPeriodSecs$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.localguard.EveLocalGuardConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import kn7.o;
import kn7.l;
import usd.q;
import kn7.a;
import kn7.n;
import kn7.p;
import java.lang.Long;

public final class EveLocalGuardConfig$maxLimitPeriodSecs$2 extends Lambda implements a	// class@001573
{
    public final EveLocalGuardConfig this$0;

    public void EveLocalGuardConfig$maxLimitPeriodSecs$2(EveLocalGuardConfig p0){
       this.this$0 = p0;
       super(0);
    }
    public final long invoke(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       EveLocalGuardConfig$maxLimitPeriodSecs$2 obj = PatchProxy.apply(objArray, this, EveLocalGuardConfig$maxLimitPeriodSecs$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, EveLocalGuardConfig.class, "2");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          long l1 = 0;
          Iterator iterator = obj.succRatioLimits.iterator();
          while (iterator.hasNext()) {
             l1 = q.o(l1, iterator.next().b());
          }
          iterator = obj.errorRatioLimits.iterator();
          while (iterator.hasNext()) {
             l1 = q.o(l1, iterator.next().b());
          }
          iterator = obj.startNotFinishCountLimits.iterator();
          while (iterator.hasNext()) {
             l1 = q.o(l1, iterator.next().b());
          }
          iterator = obj.totalCostLimits.iterator();
          while (iterator.hasNext()) {
             l1 = q.o(l1, iterator.next().b());
          }
          l = l1;
       }
       return l;
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
