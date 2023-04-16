package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$init$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class EveFeatureCenter$init$1 implements Runnable	// class@0014ce
{
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$init$1(EveFeatureCenter p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveFeatureCenter$init$1.class, "1")) {
          return;
       }
       LifecycleOwner lifecycleOwn = ProcessLifecycleOwner.get();
       a.o(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
       lifecycleOwn.getLifecycle().addObserver(this.this$0);
       return;
    }
}
