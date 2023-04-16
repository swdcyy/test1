package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$saveEvent$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import kotlin.Pair;
import qrd.r0;
import java.lang.CharSequence;
import vm7.a;
import bn7.c;
import java.util.Set;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import ml5.a;
import cn.vimfung.luascriptcore.LuaValue;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveFeatureCenter$saveEvent$1 implements Runnable	// class@0014da
{
    public final GeneratedMessageLite $event;
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$saveEvent$1(EveFeatureCenter p0,GeneratedMessageLite p1){
       this.this$0 = p0;
       this.$event = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveFeatureCenter$saveEvent$1.class, "1")) {
          return;
       }
       Pair pair = this.this$0.eventPrefixAndTableName.get(this.$event.getClass());
       if (pair == null) {
          pair = r0.a("", "");
       }
       String str = pair.component1();
       String str1 = pair.component2();
       String str2 = 1;
       int i = (!str.length())? 1: 0;
       if (!i) {
          if (str1.length()) {
             str2 = null;
          }
          if (!str2) {
             Set set = this.this$0.getContext().e().a(this.$event).entrySet();
             LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(set, 10)), 16));
             Iterator iterator = set.iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Pair pair1 = r0.a(str+uEntry.getKey(), new a(this.this$0.wrapValue(uEntry.getValue())).h());
                Object first = pair1.getFirst();
                linkedHashMa.put(first, pair1.getSecond());
             }
             EveLog.i$default("EveFeatureCenter#saveRawEvent tableName:"+str1+" event:"+this.$event.getClass().getSimpleName(), false, 2, objArray);
             this.this$0.saveTableDataWaitConfig(str1, linkedHashMa);
             return;
          }
       }
       EveLog.i$default("EveFeatureCenter#saveRawEvent error, event:"+this.$event.getClass().getSimpleName()+" columnPrefix:"+str+" or tableName:"+str1+" is empty, maybe not register", false, 2, objArray);
       return;
    }
}
