package com.kwai.video.clipkit.config.EditorEncodeConfigManager$2;
import java.util.Comparator;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager;
import java.lang.Object;
import com.kwai.video.clipkit.config.EditorEncodeConfig$SupportHighEncodeConfig;

public class EditorEncodeConfigManager$2 implements Comparator	// class@001a6e
{
    public final EditorEncodeConfigManager this$0;

    public void EditorEncodeConfigManager$2(EditorEncodeConfigManager p0){
       this.this$0 = p0;
       super();
    }
    public int compare(EditorEncodeConfig$SupportHighEncodeConfig p0,EditorEncodeConfig$SupportHighEncodeConfig p1){
       int i;
       p0 = p0.maxProcessCpuUsage;
       p1 = p1.maxProcessCpuUsage;
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
