package com.kwai.video.clipkit.mv.ClipMvUtils$4;
import com.kwai.video.ksspark.NewSparkTemplateManager$SparkTemplateDelegate;
import com.kwai.video.clipkit.mv.ExtraInterface;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ClipMvUtils$4 implements NewSparkTemplateManager$SparkTemplateDelegate	// class@001aa1
{
    public final ExtraInterface val$extraInterface;
    public final String val$projectPlaceHolderImagePath;

    public void ClipMvUtils$4(ExtraInterface p0,String p1){
       this.val$extraInterface = p0;
       this.val$projectPlaceHolderImagePath = p1;
       super();
    }
    public String aeBuiltinResPath(){
       Object obj = PatchProxy.apply(null, this, ClipMvUtils$4.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.val$extraInterface.getAeBuiltinResPath();
    }
    public String fontPath(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, ClipMvUtils$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(p0);
       return this.val$extraInterface.getFontPathsById(obj).get(p0);
    }
    public String getTrailerSubtitlePath(String p0){
       return "";
    }
    public String getTrailerTitlePath(String p0){
       return "";
    }
    public String projectPlaceHolderImagePath(){
       return this.val$projectPlaceHolderImagePath;
    }
}
