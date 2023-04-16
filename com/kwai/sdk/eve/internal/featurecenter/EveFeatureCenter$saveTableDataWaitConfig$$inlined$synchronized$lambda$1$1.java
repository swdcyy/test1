package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import kotlin.jvm.internal.a;
import java.util.List;
import com.google.common.collect.ArrayListMultimap;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.util.Iterator;
import java.lang.Iterable;
import qrd.l1;

public final class EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1$1 implements Runnable	// class@0014dc
{
    public final EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1 this$0;

    public void EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1$1(EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1 p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1$1.class, "1")) {
          return;
       }
       EveFeatureCenter tempCacheWai = this.this$0.this$0.tempCacheWaiting;
       a.o(tempCacheWai, "tempCacheWaiting");
       _monitor_enter(tempCacheWai);
       EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1$1 tthis$0 = this.this$0;
       List list = tthis$0.this$0.tempCacheWaiting.removeAll(tthis$0.$tableName$inlined);
       StringBuilder str = "EveFeatureCenter#afterConfig.Save ";
       Integer integer = (list != null)? Integer.valueOf(list.size()): null;
       EveLog.i$default(str+integer+" start, tableName:"+this.this$0.$tableName$inlined, false, 2, null);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().run();
          }
       }
       str = "EveFeatureCenter#afterConfig.Save ";
       Integer integer1 = (list != null)? Integer.valueOf(list.size()): null;
       EveLog.i$default(str+integer1+" finish, tableName:"+this.this$0.$tableName$inlined, false, 2, null);
       _monitor_exit(tempCacheWai);
       PatchProxy.onMethodExit(EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1$1.class, "1");
       return;
    }
}
