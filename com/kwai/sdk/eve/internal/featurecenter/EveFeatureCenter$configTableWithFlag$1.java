package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$configTableWithFlag$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mrd.a;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveFeatureCenter$configTableWithFlag$1 implements Runnable	// class@0014cd
{
    public final List $columns;
    public final int $maxRows;
    public final List $relations;
    public final String $tableName;
    public final long $timeIntervalS;
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$configTableWithFlag$1(EveFeatureCenter p0,String p1,List p2,List p3,int p4,long p5){
       this.this$0 = p0;
       this.$tableName = p1;
       this.$columns = p2;
       this.$relations = p3;
       this.$maxRows = p4;
       this.$timeIntervalS = p5;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveFeatureCenter$configTableWithFlag$1.class, "1")) {
          return;
       }
       this.this$0.configTable(this.$tableName, this.$columns, this.$relations, this.$maxRows, this.$timeIntervalS);
       this.this$0.getOrCreateFlag(this.$tableName).onNext(Boolean.TRUE);
       EveLog.i$default("EveFeatureCenter#configTableWithFlag, tableName:"+this.$tableName, false, 2, null);
       return;
    }
}
