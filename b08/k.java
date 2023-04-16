package b08.k;
import tu.h;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.util.Map;
import java.util.Collection;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import java.lang.String;
import f08.f;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import f08.f$a;
import java.lang.Throwable;

public final class k implements h	// class@0002f5
{
    public final PendantDataServer a;
    public final List b;
    public final Ref$ObjectRef c;

    public void k(PendantDataServer p0,List p1,Ref$ObjectRef p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void b(Map p0){
       SignalPendant action;
       Object obj;
       if (p0 != null) {
          MaterialMap materialMap = CollectionsKt___CollectionsKt.n2(p0.values());
          if (materialMap != null) {
             materialMap = materialMap.signalPendant;
             if (materialMap != null) {
                action = materialMap.action;
             label_0017 :
                Set set = (action > null)? 1: null;
                if (!set) {
                   Iterator iterator = p0.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      Iterator iterator1 = this.b.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            obj = iterator1.next();
                            Object obj1 = (!obj.pendantResourceId - uEntry.getKey().longValue())? 1: null;
                            if (!obj1) {
                               continue ;
                            }
                         }else {
                            obj = null;
                         }
                         if (obj != null) {
                            MaterialMap value = uEntry.getValue();
                            if (value != null) {
                               value.signalPendant = obj;
                            }else {
                               continue ;
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                }
                this.a.k(-1, p0, DataSource.MATERIAL);
             }
          }
          action = null;
          goto label_0017 ;
       }
       return;
    }
    public void onFailed(String p0){
       f$a a = f.a;
       PendantDataServer i = this.a.i;
       Pair[] pairArray = new Pair[2];
       pairArray[0] = r0.a("pendantCode", String.valueOf(this.c.element));
       if (p0 != null) {
       }else {
          p0 = "";
       }
       pairArray[1] = r0.a("errorMsg", p0);
       f$a.v(a, i, "requestMaterialFromSignal failed", null, false, t0.j0(pairArray), 8, null);
       return;
    }
}
