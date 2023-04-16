package com.kwai.video.ksmemorykit.EditorSmartClipTask$Builder;
import java.lang.Object;
import com.kwai.video.ksmemorykit.EditorSmartClipTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$1;
import com.kwai.kve.AlbumType;
import java.util.List;
import com.kwai.video.ksmemorykit.EditorMemoryParams;

public class EditorSmartClipTask$Builder	// class@0008fa
{
    public AlbumType mAlbumType;
    public float mAnalysisDurationLimit;
    public float mImageClipTime;
    public int mMaxAnalysisVideoNumber;
    public float mMaxTotalDuration;
    public List mMediaAssets;
    public EditorMemoryParams mMemoryParams;
    public float mMotionIntervalValue;
    public boolean mOnlyAnalysisMusic;
    public String mSceneName;
    public String mSelectedMusicId;
    public String mSelectedThemeId;
    public String mTempPath;
    public String mThemesMetaJSON;
    public boolean mUseMotionInterval;
    public float mVideoClipTime;
    public String mVoiceDetectModePath;

    public void EditorSmartClipTask$Builder(){
       super();
       this.mUseMotionInterval = false;
    }
    public EditorSmartClipTask build(){
       Object obj = PatchProxy.apply(null, this, EditorSmartClipTask$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.initDefaultValue(this);
       return new EditorSmartClipTask(this, null);
    }
    public final void initDefaultValue(EditorSmartClipTask$Builder p0){
    }
    public EditorSmartClipTask$Builder setAlbumType(AlbumType p0){
       this.mAlbumType = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setAnalysisDurationLimit(float p0){
       this.mAnalysisDurationLimit = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setImageClipTime(float p0){
       this.mImageClipTime = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setMaxAnalysisVideoNumber(int p0){
       this.mMaxAnalysisVideoNumber = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setMaxTotalDuration(float p0){
       this.mMaxTotalDuration = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setMediaAssets(List p0){
       this.mMediaAssets = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setMemoryParams(EditorMemoryParams p0){
       this.mMemoryParams = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setMotionInterval(float p0){
       this.mUseMotionInterval = true;
       this.mMotionIntervalValue = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setOnlyAnalysisMusic(boolean p0){
       this.mOnlyAnalysisMusic = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setSceneName(String p0){
       this.mSceneName = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setSelectedMusicId(String p0){
       this.mSelectedMusicId = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setSelectedThemeId(String p0){
       this.mSelectedThemeId = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setTempPath(String p0){
       this.mTempPath = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setThemesMetaJSON(String p0){
       this.mThemesMetaJSON = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setVideoClipTime(float p0){
       this.mVideoClipTime = p0;
       return this;
    }
    public EditorSmartClipTask$Builder setVoiceDetectModePath(String p0){
       this.mVoiceDetectModePath = p0;
       return this;
    }
}
