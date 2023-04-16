package com.kwai.video.ksmemorykit.EditorMemoryParamsBuilder;
import java.lang.Object;
import com.kwai.video.ksmemorykit.EditorMemoryParamsImpl;
import com.kwai.video.ksmemorykit.EditorMemoryParams;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kwai.video.ksmemorykit.EditorMemoryAsset;
import java.lang.Float;
import java.lang.Integer;

public class EditorMemoryParamsBuilder	// class@0008ed
{
    public EditorMemoryParamsImpl mParams;

    public void EditorMemoryParamsBuilder(){
       super();
       this.mParams = new EditorMemoryParamsImpl();
    }
    public EditorMemoryParams build(){
       return this.mParams;
    }
    public EditorMemoryParamsBuilder setAnalyzeCachePath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorMemoryParamsBuilder.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mParams.setAnalyzeCachePath(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setAssetList(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorMemoryParamsBuilder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mParams.setAssetList(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setCoverAsset(EditorMemoryAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorMemoryParamsBuilder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mParams.setCoverAsset(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setImageClipTime(float p0){
       EditorMemoryParamsBuilder uEditorMemor = EditorMemoryParamsBuilder.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uEditorMemor, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mParams.setImageClipTime(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setMaxAnalysisImageNumber(int p0){
       EditorMemoryParamsBuilder uEditorMemor = EditorMemoryParamsBuilder.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uEditorMemor, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mParams.setMaxAnalysisImageNumber(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setMaxAnalysisVideoNumber(int p0){
       EditorMemoryParamsBuilder uEditorMemor = EditorMemoryParamsBuilder.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uEditorMemor, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mParams.setMaxAnalysisVideoNumber(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setMaxPresentedVideoNumber(int p0){
       EditorMemoryParamsBuilder uEditorMemor = EditorMemoryParamsBuilder.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uEditorMemor, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mParams.setMaxPresentedVideoNumber(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setMaxTotalDuration(float p0){
       EditorMemoryParamsBuilder uEditorMemor = EditorMemoryParamsBuilder.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uEditorMemor, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mParams.setMaxTotalDuration(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setMemoryHeight(int p0){
       EditorMemoryParamsBuilder uEditorMemor = EditorMemoryParamsBuilder.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uEditorMemor, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mParams.setMemoryHeight(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setMemoryWidth(int p0){
       EditorMemoryParamsBuilder uEditorMemor = EditorMemoryParamsBuilder.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uEditorMemor, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mParams.setMemoryWidth(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setMinAssetNum(int p0){
       EditorMemoryParamsBuilder uEditorMemor = EditorMemoryParamsBuilder.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uEditorMemor, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mParams.setMinAssetNum(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setMinVideoDurationRequired(float p0){
       EditorMemoryParamsBuilder uEditorMemor = EditorMemoryParamsBuilder.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uEditorMemor, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mParams.setMinVideoDurationRequired(p0);
       return this;
    }
    public EditorMemoryParamsBuilder setVideoClipTime(float p0){
       EditorMemoryParamsBuilder uEditorMemor = EditorMemoryParamsBuilder.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uEditorMemor, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mParams.setVideoClipTime(p0);
       return this;
    }
}
