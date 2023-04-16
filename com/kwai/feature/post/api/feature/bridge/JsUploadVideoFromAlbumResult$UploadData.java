package com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumResult$UploadData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class JsUploadVideoFromAlbumResult$UploadData implements Serializable	// class@001383
{
    public String mCoverUrl;
    public long mDuration;
    public String mFileSize;
    public String mFileType;
    public boolean mHasFail;
    public String mPhotoId;
    public String mProgress;
    public int mRemainingTime;
    public String mTaskId;
    public String mThumbnail;

    public void JsUploadVideoFromAlbumResult$UploadData(){
       super();
    }
    public void JsUploadVideoFromAlbumResult$UploadData(String p0,String p1,String p2){
       super();
       this.mTaskId = p0;
       this.mThumbnail = p1;
       this.mProgress = p2;
    }
    public void setFileSize(String p0){
       this.mFileSize = p0;
    }
    public void setFileType(String p0){
       this.mFileType = p0;
    }
    public void setUploadData(String p0,String p1,String p2,boolean p3,int p4){
       this.mTaskId = p0;
       this.mThumbnail = p1;
       this.mProgress = p2;
       this.mHasFail = p3;
       this.mRemainingTime = p4;
    }
    public void setUploadData(String p0,String p1,String p2,boolean p3,int p4,String p5,String p6){
       this.mTaskId = p0;
       this.mThumbnail = p1;
       this.mProgress = p2;
       this.mHasFail = p3;
       this.mRemainingTime = p4;
       this.mPhotoId = p5;
       this.mCoverUrl = p6;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsUploadVideoFromAlbumResult$UploadData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UploadData{mTaskId=\'"+this.mTaskId+'''+", mProgress=\'"+this.mProgress+'''+", mRemainingTime="+this.mRemainingTime+", mFileType=\'"+this.mFileType+'''+", mFileSize=\'"+this.mFileSize+'''+", mDuration="+this.mDuration+", mPhotoId=\'"+this.mPhotoId+'''+", mCoverUrl=\'"+this.mCoverUrl+'''+", mHasFail="+this.mHasFail+'}';
    }
}
