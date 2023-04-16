package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$onStop$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class EveFeatureCenter$onStop$1 implements Runnable	// class@0014d8
{
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$onStop$1(EveFeatureCenter p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveFeatureCenter$onStop$1.class, "1")) {
          return;
       }
       this.this$0.doRowLimitCheck();
       this.this$0.uploadSpaceLog();
       this.this$0.vacuum();
       return;
    }
}
