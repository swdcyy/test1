package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$saveFeatureAccessory$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import zn7.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import msd.l;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenterKt;
import java.util.Map;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.util.LinkedHashMap;
import trd.s0;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import ml5.a;
import cn.vimfung.luascriptcore.LuaValue;

public final class EveFeatureCenter$saveFeatureAccessory$1 implements Runnable	// class@0014db
{
    public final GeneratedMessageLite $event;
    public final a $task;
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$saveFeatureAccessory$1(EveFeatureCenter p0,a p1,GeneratedMessageLite p2){
       this.this$0 = p0;
       this.$task = p1;
       this.$event = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveFeatureCenter$saveFeatureAccessory$1.class, "1")) {
          return;
       }
       l featureAcces = EveFeatureCenterKt.getFeatureAccessoryProvider(this.$task);
       Map map = (featureAcces != null)? featureAcces.invoke(this.$event): objArray;
       boolean b = false;
       StringBuilder str = (map == null || map.isEmpty())? 1: null;
       int i = 2;
       String str1 = "EveFeatureCenter#saveFeatureAccessory, taskId:";
       if (!str) {
          EveLog.i$default(str1+this.$task.n(), b, i, objArray);
          EveFeatureCenter$saveFeatureAccessory$1 tthis$0 = this.this$0;
          String str2 = this.$task.n();
          LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(map.size()));
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object key = uEntry.getKey();
             linkedHashMa.put(key, this.this$0.wrapValue(uEntry.getValue()).h());
          }
          tthis$0.saveTableDataWaitConfig(str2, linkedHashMa);
       }else {
          EveLog.i$default(str1+this.$task.n()+" data empty, do nothing", b, i, objArray);
       }
       return;
    }
}
