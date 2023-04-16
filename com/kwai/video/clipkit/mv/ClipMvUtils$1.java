package com.kwai.video.clipkit.mv.ClipMvUtils$1;
import com.kwai.video.ksspark.NewSparkConstructListener;
import com.kwai.video.clipkit.mv.ClipSparkConstructListener;
import com.kwai.video.ksspark.model.TemplateInfo;
import com.kwai.video.ksspark.NewSparkTemplateManager;
import com.kwai.video.clipkit.mv.ConstructSparkParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.KSClipLog;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Float;
import com.kwai.video.ksspark.model.VideoProjectWrapper;
import java.util.Map;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResultImpl;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;

public final class ClipMvUtils$1 implements NewSparkConstructListener	// class@001a9e
{
    public final ConstructSparkParam val$constructParam;
    public final NewSparkTemplateManager val$newSparkTemplateManager;
    public final ClipSparkConstructListener val$sparkConstructListener;
    public final TemplateInfo val$sparkTemplateInfo;

    public void ClipMvUtils$1(ClipSparkConstructListener p0,TemplateInfo p1,NewSparkTemplateManager p2,ConstructSparkParam p3){
       this.val$sparkConstructListener = p0;
       this.val$sparkTemplateInfo = p1;
       this.val$newSparkTemplateManager = p2;
       this.val$constructParam = p3;
       super();
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, ClipMvUtils$1.class, "3")) {
          return;
       }
       KSClipLog.i("ClipSparkRecovery", "constructSparkAsync onCancel");
       this.val$sparkConstructListener.onCancel();
       return;
    }
    public void onFail(int p0,String p1){
       ClipMvUtils$1 u1 = ClipMvUtils$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, u1, "4")) {
          return;
       }
       KSClipLog.e("ClipSparkRecovery", "constructSparkAsync onFail errorCode "+p0+" msg: "+p1);
       this.val$sparkConstructListener.onFail(p0, p1);
       return;
    }
    public void onProgress(float p0){
       ClipMvUtils$1 u1 = ClipMvUtils$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, u1, "2")) {
          return;
       }
       KSClipLog.d("ClipSparkRecovery", "constructSparkAsync onProgress  "+p0);
       this.val$sparkConstructListener.onProgress(p0);
       return;
    }
    public void onStart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipMvUtils$1.class, "1")) {
          return;
       }
       KSClipLog.i("ClipSparkRecovery", "constructSparkAsync onStart id "+p0);
       this.val$sparkConstructListener.onStart(p0);
       return;
    }
    public void onSuccess(VideoProjectWrapper p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipMvUtils$1.class, "5")) {
          return;
       }
       KSClipLog.i("ClipSparkRecovery", "constructSparkAsync onSuccess resMap: "+p1);
       EditorSdk2MvCreationResultImpl uEditorSdk2M = ClipMvUtils.createNewSparkProjectByInfoSync(this.val$sparkTemplateInfo, p0, this.val$newSparkTemplateManager, this.val$constructParam.templateGrade);
       uEditorSdk2M.setSparkResMap(p1);
       this.val$sparkConstructListener.onSuccess(uEditorSdk2M);
       return;
    }
}
