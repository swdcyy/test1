package com.kwai.video.clipkit.post.ClipPostInfo$ClipWatermarkParam;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import java.lang.RuntimeException;

public class ClipPostInfo$ClipWatermarkParam	// class@001ae0
{
    public EditorSdk2V2$TimeRangeV2 clippedRangeForSingleImage;
    public String exportPath;
    public int exportShapeType;
    public boolean ignoreFailStatus;
    public List watermarkInfos;

    public void ClipPostInfo$ClipWatermarkParam(){
       super();
       this.exportShapeType = 1;
    }
    public static ClipPostInfo$ClipWatermarkParam buildWatermark(List p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipPostInfo$ClipWatermarkParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipPostInfo$ClipWatermarkParam.buildWatermark(p0, p1, null);
    }
    public static ClipPostInfo$ClipWatermarkParam buildWatermark(List p0,String p1,EditorSdk2V2$TimeRangeV2 p2){
       ClipPostInfo$ClipWatermarkParam obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ClipPostInfo$ClipWatermarkParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.size()) {
          throw new RuntimeException("the size of watermarkInfos should be bigger than 1");
       }
       obj = new ClipPostInfo$ClipWatermarkParam();
       obj.watermarkInfos = p0;
       obj.exportPath = p1;
       obj.ignoreFailStatus = true;
       obj.clippedRangeForSingleImage = p2;
       return obj;
    }
}
