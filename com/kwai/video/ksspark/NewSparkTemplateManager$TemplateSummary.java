package com.kwai.video.ksspark.NewSparkTemplateManager$TemplateSummary;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.ksspark.NewSparkTemplateManager;

public class NewSparkTemplateManager$TemplateSummary	// class@000931
{
    public boolean isNewSpark;
    public int templateVersion;

    public void NewSparkTemplateManager$TemplateSummary(){
       super();
       this.isNewSpark = false;
       this.templateVersion = 0;
    }
    public int getTemplateVersion(){
       return this.templateVersion;
    }
    public boolean isNeedRenderGraph(){
       Object obj = PatchProxy.apply(null, this, NewSparkTemplateManager$TemplateSummary.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.templateVersion > NewSparkTemplateManager.nativeFallbackTemplateVersion())? true: false;
       return b;
    }
    public boolean isNewSpark(){
       return this.isNewSpark;
    }
}
