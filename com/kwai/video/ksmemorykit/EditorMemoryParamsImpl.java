package com.kwai.video.ksmemorykit.EditorMemoryParamsImpl;
import com.kwai.video.ksmemorykit.EditorMemoryParams;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kwai.video.ksmemorykit.EditorMemoryAsset;

public class EditorMemoryParamsImpl implements EditorMemoryParams	// class@0008ee
{
    public String analyzeCachePath;
    public List mAssetList;
    public EditorMemoryAsset mCoverAsset;
    public float mImageClipTime;
    public int mMaxAnalysisImageNumber;
    public int mMaxAnalysisVideoNumber;
    public int mMaxPresentedVideoNumber;
    public float mMaxTotalDuration;
    public int mMemoryHeight;
    public int mMemoryWidth;
    public int mMinAssetNum;
    public float mMinVideoDurationRequired;
    public float mVideoClipTime;

    public void EditorMemoryParamsImpl(){
       super();
       this.mMaxTotalDuration = 0xbf800000;
       this.mMinAssetNum = -1;
       this.mMinVideoDurationRequired = 0xbf800000;
       this.mVideoClipTime = 0xbf800000;
       this.mImageClipTime = 0xbf800000;
       this.mMaxPresentedVideoNumber = -1;
       this.mMaxAnalysisVideoNumber = -1;
       this.mMaxAnalysisImageNumber = -1;
    }
    public String getAnalyzeCachePath(){
       return this.analyzeCachePath;
    }
    public List getAssetList(){
       return this.mAssetList;
    }
    public EditorMemoryAsset getCoverAsset(){
       return this.mCoverAsset;
    }
    public float getImageClipTime(){
       return this.mImageClipTime;
    }
    public int getMaxAnalysisImageNumber(){
       return this.mMaxAnalysisImageNumber;
    }
    public int getMaxAnalysisVideoNumber(){
       return this.mMaxAnalysisVideoNumber;
    }
    public int getMaxPresentedVideoNumber(){
       return this.mMaxPresentedVideoNumber;
    }
    public float getMaxTotalDuration(){
       return this.mMaxTotalDuration;
    }
    public int getMemoryHeight(){
       return this.mMemoryHeight;
    }
    public int getMemoryWidth(){
       return this.mMemoryWidth;
    }
    public int getMinAssetNum(){
       return this.mMinAssetNum;
    }
    public float getMinVideoDurationRequired(){
       return this.mMinVideoDurationRequired;
    }
    public float getVideoClipTime(){
       return this.mVideoClipTime;
    }
    public void setAnalyzeCachePath(String p0){
       this.analyzeCachePath = p0;
    }
    public void setAssetList(List p0){
       this.mAssetList = p0;
    }
    public void setCoverAsset(EditorMemoryAsset p0){
       this.mCoverAsset = p0;
    }
    public void setImageClipTime(float p0){
       this.mImageClipTime = p0;
    }
    public void setMaxAnalysisImageNumber(int p0){
       this.mMaxAnalysisImageNumber = p0;
    }
    public void setMaxAnalysisVideoNumber(int p0){
       this.mMaxAnalysisVideoNumber = p0;
    }
    public void setMaxPresentedVideoNumber(int p0){
       this.mMaxPresentedVideoNumber = p0;
    }
    public void setMaxTotalDuration(float p0){
       this.mMaxTotalDuration = p0;
    }
    public void setMemoryHeight(int p0){
       this.mMemoryHeight = p0;
    }
    public void setMemoryWidth(int p0){
       this.mMemoryWidth = p0;
    }
    public void setMinAssetNum(int p0){
       this.mMinAssetNum = p0;
    }
    public void setMinVideoDurationRequired(float p0){
       this.mMinVideoDurationRequired = p0;
    }
    public void setVideoClipTime(float p0){
       this.mVideoClipTime = p0;
    }
}
