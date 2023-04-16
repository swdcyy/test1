package com.kwai.video.clipkit.mv.EditorSdk2MvReplaceableAreaInfoImpl;
import com.kwai.video.clipkit.mv.EditorSdk2MvReplaceableAreaInfo;
import com.kwai.video.clipkit.mv.ReplaceableAreaInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RectF;

public class EditorSdk2MvReplaceableAreaInfoImpl implements EditorSdk2MvReplaceableAreaInfo	// class@001ac4
{
    public ReplaceableAreaInfo mInfo;

    public void EditorSdk2MvReplaceableAreaInfoImpl(ReplaceableAreaInfo p0){
       super();
       this.mInfo = p0;
    }
    public float getBottom(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2MvReplaceableAreaInfoImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mInfo.rect.bottom();
    }
    public int getLayerId(){
       return this.mInfo.layerId;
    }
    public float getLeft(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2MvReplaceableAreaInfoImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mInfo.rect.left();
    }
    public String getRefId(){
       return this.mInfo.refId;
    }
    public float getRight(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2MvReplaceableAreaInfoImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mInfo.rect.right();
    }
    public float getTop(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2MvReplaceableAreaInfoImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mInfo.rect.top();
    }
}
