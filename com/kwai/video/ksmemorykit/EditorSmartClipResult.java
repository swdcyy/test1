package com.kwai.video.ksmemorykit.EditorSmartClipResult;
import java.lang.Object;
import java.util.Map;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;

public class EditorSmartClipResult	// class@0008f6
{
    public boolean mHasMusic;
    public Map mMediaAnalyzeResults;
    public EditorSdk2V2$VideoEditorProject mProject;
    public String[] mSceneDetectionJsonResults;
    public String mSelectedMusicId;
    public String mThemeId;
    public long mVideoAnalyzeCostTime;
    public long mVoiceDetectCostTime;

    public void EditorSmartClipResult(){
       super();
    }
    public boolean getHasMusic(){
       return this.mHasMusic;
    }
    public Map getMediaAnalyzeResults(){
       return this.mMediaAnalyzeResults;
    }
    public EditorSdk2V2$VideoEditorProject getProject(){
       return this.mProject;
    }
    public String[] getSceneDetectionJsonResults(){
       return this.mSceneDetectionJsonResults;
    }
    public String getSelectedMusicId(){
       return this.mSelectedMusicId;
    }
    public String getThemeId(){
       return this.mThemeId;
    }
    public long getVideoAnalyzeCostTime(){
       return this.mVideoAnalyzeCostTime;
    }
    public long getVoiceDetectCostTime(){
       return this.mVoiceDetectCostTime;
    }
    public void setHasMusic(boolean p0){
       this.mHasMusic = p0;
    }
    public void setMediaAnalyzeResults(Map p0){
       this.mMediaAnalyzeResults = p0;
    }
    public void setProject(EditorSdk2V2$VideoEditorProject p0){
       this.mProject = p0;
    }
    public void setSceneDetectionJsonResults(String[] p0){
       this.mSceneDetectionJsonResults = p0;
    }
    public void setSelectedMusicId(String p0){
       this.mSelectedMusicId = p0;
    }
    public void setThemeId(String p0){
       this.mThemeId = p0;
    }
    public void setVideoAnalyzeCostTime(long p0){
       this.mVideoAnalyzeCostTime = p0;
    }
    public void setVoiceDetectCostTime(long p0){
       this.mVoiceDetectCostTime = p0;
    }
}
