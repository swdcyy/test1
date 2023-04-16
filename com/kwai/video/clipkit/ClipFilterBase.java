package com.kwai.video.clipkit.ClipFilterBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExternalFilterRequest;
import com.kwai.video.clipkit.FboManager;
import com.kwai.video.clipkit.mv.EditorSdk2MvReplaceableDetail;
import com.kwai.video.editorsdk2.ExternalFilterInitParams;
import com.kwai.video.editorsdk2.ExternalFilterReleaseParams;
import com.kwai.video.clipkit.ClipFilterBase$UpdateProjectCallBack;
import com.kwai.video.editorsdk2.ExternalFilterFrameInfo;
import com.kwai.video.editorsdk2.ExternalFilterDataFormatConfig;

public abstract class ClipFilterBase	// class@001a1d
{
    public int initCount;

    public void ClipFilterBase(){
       super();
       this.initCount = 0;
    }
    public boolean filterOriginalFrame(ExternalFilterRequest p0,FboManager p1){
       return false;
    }
    public boolean filterProcessedFrame(ExternalFilterRequest p0,FboManager p1){
       return false;
    }
    public EditorSdk2MvReplaceableDetail getMvReplaceableAreaDetail(int p0){
       return null;
    }
    public void init(ExternalFilterInitParams p0){
    }
    public abstract boolean isAvailable();
    public void releaseFilter(ExternalFilterReleaseParams p0){
    }
    public void setUpdateProjectCallBack(ClipFilterBase$UpdateProjectCallBack p0){
    }
    public ExternalFilterDataFormatConfig willFilterOriginalFrame(ExternalFilterFrameInfo p0){
       return null;
    }
    public ExternalFilterDataFormatConfig willFilterProcessedFrame(ExternalFilterFrameInfo p0){
       return null;
    }
}
