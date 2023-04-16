package com.kwai.video.ksmodelmanager.config.ModelConfigManager$1;
import h97.j;
import com.kwai.video.ksmodelmanager.config.ModelConfigManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class ModelConfigManager$1 implements j	// class@000918
{
    public final ModelConfigManager this$0;

    public void ModelConfigManager$1(ModelConfigManager p0){
       this.this$0 = p0;
       super();
    }
    public void onConfigChanged(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ModelConfigManager$1.class, "1")) {
          return;
       }
       this.this$0.updateConfig();
       return;
    }
}
