package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$2;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$2 implements Runnable	// class@0014de
{
    public final Map $data$inlined;
    public final String $tableName$inlined;
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$2(EveFeatureCenter p0,String p1,Map p2){
       this.this$0 = p0;
       this.$tableName$inlined = p1;
       this.$data$inlined = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$2.class, "1")) {
          return;
       }
       this.this$0.saveTableData(this.$tableName$inlined, this.$data$inlined);
       PatchProxy.onMethodExit(EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$2.class, "1");
       return;
    }
}
