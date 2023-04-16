package com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl$mFeatureConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureDetails;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import aj7.a;
import qj7.d;

public final class FeatureSourceImpl$mFeatureConfig$2 extends Lambda implements a	// class@000e75
{
    public final FeatureSourceImpl this$0;

    public void FeatureSourceImpl$mFeatureConfig$2(FeatureSourceImpl p0){
       this.this$0 = p0;
       super(0);
    }
    public final FeatureDetails invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       FeatureSourceImpl$mFeatureConfig$2 obj = PatchProxy.apply(objArray, this, FeatureSourceImpl$mFeatureConfig$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.apply(objArray, obj, FeatureSourceImpl.class, "8");
       if (objArray1 != patchProxyRe) {
       }else {
          FeatureSourceImpl c = obj.c;
          if (c != null) {
             objArray = c.a();
          }
          if (objArray != null) {
             d.c("readFeatureConfig\(\) updatedConfig != null.");
             objArray1 = objArray;
          }else {
             d.c("readFeatureConfig\(\) read config from asset.");
             objArray1 = obj.i();
          }
       }
       return objArray1;
    }
    public Object invoke(){
       return this.invoke();
    }
}
