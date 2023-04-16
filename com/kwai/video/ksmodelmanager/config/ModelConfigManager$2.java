package com.kwai.video.ksmodelmanager.config.ModelConfigManager$2;
import ca7.c;
import java.lang.Object;
import java.lang.Throwable;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;

public final class ModelConfigManager$2 implements c	// class@000919
{

    public void ModelConfigManager$2(){
       super();
    }
    public void onFailure(Throwable p0){
    }
    public void onSuccess(Object p0){
       this.onSuccess(p0);
    }
    public void onSuccess(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ModelConfigManager$2.class, "1")) {
          return;
       }
       p0.get("ksalgorithmmodelkit");
       return;
    }
}
