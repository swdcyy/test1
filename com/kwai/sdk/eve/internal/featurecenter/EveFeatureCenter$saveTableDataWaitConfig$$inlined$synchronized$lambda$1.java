package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1;
import co7.a;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1$1;
import java.lang.Runnable;

public final class EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1 extends a	// class@0014dd
{
    public final Map $data$inlined;
    public final String $tableName$inlined;
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1(EveFeatureCenter p0,String p1,Map p2){
       this.this$0 = p0;
       this.$tableName$inlined = p1;
       this.$data$inlined = p2;
       super();
    }
    public void onNext(Object p0){
       this.onNext(p0.booleanValue());
    }
    public void onNext(boolean p0){
       if (PatchProxy.isSupport2(EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1.class, "1")) {
          return;
       }
       super.onNext(Boolean.valueOf(p0));
       this.this$0.scatter(new EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1$1(this));
       PatchProxy.onMethodExit(EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1.class, "1");
       return;
    }
}
