package com.kwai.video.ksmemorykit.EditorMemoryParams;
import java.lang.String;
import java.util.List;
import com.kwai.video.ksmemorykit.EditorMemoryAsset;

public interface abstract EditorMemoryParams	// class@0008ec
{

    String getAnalyzeCachePath();
    List getAssetList();
    EditorMemoryAsset getCoverAsset();
    float getImageClipTime();
    int getMaxAnalysisImageNumber();
    int getMaxAnalysisVideoNumber();
    int getMaxPresentedVideoNumber();
    float getMaxTotalDuration();
    int getMemoryHeight();
    int getMemoryWidth();
    int getMinAssetNum();
    float getMinVideoDurationRequired();
    float getVideoClipTime();
}
