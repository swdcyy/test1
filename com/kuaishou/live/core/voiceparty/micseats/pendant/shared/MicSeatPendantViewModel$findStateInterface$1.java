package com.kuaishou.live.core.voiceparty.micseats.pendant.shared.MicSeatPendantViewModel$findStateInterface$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Integer;
import trd.i0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import ts2.d;

public final class MicSeatPendantViewModel$findStateInterface$1 extends Lambda implements p	// class@001773
{
    public static final MicSeatPendantViewModel$findStateInterface$1 INSTANCE;

    static {
       MicSeatPendantViewModel$findStateInterface$1.INSTANCE = new MicSeatPendantViewModel$findStateInterface$1();
    }
    public void MicSeatPendantViewModel$findStateInterface$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final i0 invoke(List p0,Integer p1){
       i0 obj = PatchProxy.applyTwoRefs(p0, p1, this, MicSeatPendantViewModel$findStateInterface$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stateInterfaceList");
       Iterator iterator = CollectionsKt___CollectionsKt.S5(p0).iterator();
       do {
          if (iterator.hasNext()) {
             obj = iterator.next();
             int id = obj.f().getId();
             Object obj1 = (p1 != null && id == p1.intValue())? 1: null;
          }else {
             obj = null;
             break ;
          }
       } while (obj1);
       return obj;
    }
}
