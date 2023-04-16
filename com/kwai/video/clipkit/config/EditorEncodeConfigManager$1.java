package com.kwai.video.clipkit.config.EditorEncodeConfigManager$1;
import java.util.Comparator;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager;
import java.lang.Object;
import com.kwai.video.clipkit.config.EditorEncodeConfig$SupportHighEncodeConfig;

public class EditorEncodeConfigManager$1 implements Comparator	// class@001a6d
{
    public final EditorEncodeConfigManager this$0;

    public void EditorEncodeConfigManager$1(EditorEncodeConfigManager p0){
       this.this$0 = p0;
       super();
    }
    public int compare(EditorEncodeConfig$SupportHighEncodeConfig p0,EditorEncodeConfig$SupportHighEncodeConfig p1){
       int i;
       p0 = p0.minAvgFps;
       p1 = p1.minAvgFps;
       if (p0 - p1 > 0) {
          i = 1;
       }else if(!p0 - p1){
          i = 0;
       }else {
          i = -1;
       }
       return i;
    }
    public int compare(Object p0,Object p1){
       return this.compare(p0, p1);
    }
}
