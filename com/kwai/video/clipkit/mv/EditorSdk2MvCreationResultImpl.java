package com.kwai.video.clipkit.mv.EditorSdk2MvCreationResultImpl;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.FaceMagic.AE2.AE2Project;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import com.kwai.video.clipkit.TextFilter$TextEffectConfig;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import java.util.List;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.ksspark.model.VideoProjectWrapper;
import java.util.ArrayList;
import com.kwai.video.clipkit.mv.AllMvReplaceableAreaDetail;
import java.util.Map;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult$TemplateType;
import java.lang.Boolean;

public class EditorSdk2MvCreationResultImpl implements EditorSdk2MvCreationResult	// class@001ac1
{
    public AE2Project mAe2Project;
    public AllMvReplaceableAreaDetail mAllDetail;
    public EditorSdk2$EditorSdkError mError;
    public int mGrade;
    public TextFilter$TextEffectConfig mLyricsConfig;
    public KwaiMvParam mMVParam;
    public List mMusicAssets;
    public String mMusicResourcePath;
    public List mMvAssets;
    public EditorSdk2V2$VideoEditorProject mProject;
    public VideoProjectWrapper mProjectWrapper;
    public List mRenderPosList;
    public Map mResMap;
    public EditorSdk2MvCreationResult$TemplateType mTemplateType;
    public int mVideoHeight;
    public int mVideoWidth;

    public void EditorSdk2MvCreationResultImpl(){
       super();
    }
    public void EditorSdk2MvCreationResultImpl(int p0,int p1,String p2){
       super();
       this.mError = EditorSdk2Utils.newError(p0, p1, p2);
    }
    public AE2Project getAE2Project(){
       return this.mAe2Project;
    }
    public int getErrorCode(){
       EditorSdk2MvCreationResultImpl obj = PatchProxy.apply(null, this, EditorSdk2MvCreationResultImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mError;
       int i = (obj != null)? obj.code(): 0;
       return i;
    }
    public String getErrorReason(){
       EditorSdk2MvCreationResultImpl obj = PatchProxy.apply(null, this, EditorSdk2MvCreationResultImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mError;
       String str = (obj != null)? obj.message(): "";
       return str;
    }
    public int getGrade(){
       return this.mGrade;
    }
    public String getGroupIdByRefId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorSdk2MvCreationResultImpl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdk2MvAsset mvAssetByRef = this.getMvAssetByRefId(p0);
       mvAssetByRef = (mvAssetByRef == null)? null: mvAssetByRef.getGroupId();
       return mvAssetByRef;
    }
    public TextFilter$TextEffectConfig getLyricsConfig(){
       return this.mLyricsConfig;
    }
    public KwaiMvParam getMVParam(){
       return this.mMVParam;
    }
    public List getMusicAssets(){
       return this.mMusicAssets;
    }
    public String getMusicResourcePath(){
       return this.mMusicResourcePath;
    }
    public final EditorSdk2MvAsset getMvAssetByRefId(String p0){
       EditorSdk2MvCreationResultImpl obj = PatchProxy.applyOneRefs(p0, this, EditorSdk2MvCreationResultImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMvAssets;
       if (obj == null || (!obj.isEmpty() && p0 != null)) {
          Iterator iterator = this.mMvAssets.iterator();
          while (iterator.hasNext()) {
             EditorSdk2MvAsset uEditorSdk2M = iterator.next();
             if (TextUtils.equals(uEditorSdk2M.getRefId(), p0)) {
                return uEditorSdk2M;
             }
          }
       }
       return null;
    }
    public List getMvAssets(){
       return this.mMvAssets;
    }
    public EditorSdk2V2$VideoEditorProject getProject(){
       EditorSdk2MvCreationResultImpl tmProject = this.mProject;
       if (tmProject != null) {
          return tmProject;
       }
       return null;
    }
    public VideoProjectWrapper getProjectWrapper(){
       return this.mProjectWrapper;
    }
    public List getReplaceableMvAssets(){
       ArrayList obj = PatchProxy.apply(null, this, EditorSdk2MvCreationResultImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       EditorSdk2MvCreationResultImpl tmMvAssets = this.mMvAssets;
       if (tmMvAssets != null && tmMvAssets.size() > 0) {
          Iterator iterator = this.mMvAssets.iterator();
          while (iterator.hasNext()) {
             EditorSdk2MvAsset uEditorSdk2M = iterator.next();
             if (uEditorSdk2M.isReplaceable()) {
                obj.add(uEditorSdk2M);
             }
          }
       }
       return obj;
    }
    public AllMvReplaceableAreaDetail getSparkAllDetail(){
       return this.mAllDetail;
    }
    public Map getSparkResMap(){
       return this.mResMap;
    }
    public EditorSdk2MvCreationResult$TemplateType getTemplateType(){
       return this.mTemplateType;
    }
    public List getThumbnailRenderPosMillis(){
       return this.mRenderPosList;
    }
    public int getVideoHeight(){
       return this.mVideoHeight;
    }
    public int getVideoWidth(){
       return this.mVideoWidth;
    }
    public boolean hasError(){
       EditorSdk2MvCreationResultImpl obj = PatchProxy.apply(null, this, EditorSdk2MvCreationResultImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mError;
       boolean b = (obj != null && obj.code())? true: false;
       return b;
    }
    public void setAe2Project(AE2Project p0){
       this.mAe2Project = p0;
    }
    public void setError(EditorSdk2$EditorSdkError p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2MvCreationResultImpl.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.mError = EditorSdk2Utils.newError(p0.type(), p0.code(), p0.message());
       }
       return;
    }
    public void setGrade(int p0){
       this.mGrade = p0;
    }
    public void setLyricsConfig(TextFilter$TextEffectConfig p0){
       this.mLyricsConfig = p0;
    }
    public void setMVParam(KwaiMvParam p0){
       this.mMVParam = p0;
    }
    public void setMusicAssets(List p0){
       this.mMusicAssets = p0;
    }
    public void setMusicResourcePath(String p0){
       this.mMusicResourcePath = p0;
    }
    public void setMvAssets(List p0){
       this.mMvAssets = p0;
    }
    public void setProject(EditorSdk2V2$VideoEditorProject p0){
       this.mProject = p0;
    }
    public void setProjectWrapper(VideoProjectWrapper p0){
       this.mProjectWrapper = p0;
    }
    public void setRenderPosList(List p0){
       this.mRenderPosList = p0;
    }
    public void setSparkAllDetail(AllMvReplaceableAreaDetail p0){
       this.mAllDetail = p0;
    }
    public void setSparkResMap(Map p0){
       this.mResMap = p0;
    }
    public void setTemplateType(EditorSdk2MvCreationResult$TemplateType p0){
       this.mTemplateType = p0;
    }
    public void setVideoHeight(int p0){
       this.mVideoHeight = p0;
    }
    public void setVideoWidth(int p0){
       this.mVideoWidth = p0;
    }
}
