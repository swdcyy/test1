package com.kwai.feature.post.api.feature.story.model.PostStoryParams;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.story.model.PostStoryParams$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.post.api.feature.story.model.PostStoryParams$StoryCameraCallSource;

public class PostStoryParams implements Serializable	// class@0013ca
{
    public String mAudioProfile;
    public String mEditPageName;
    public int mExportHeight;
    public int mExportWidth;
    public int mFinishAction;
    public String mFinishBtnText;
    public String mMessageTargetName;
    public boolean mNeedExportImageInQueueing;
    public boolean mNeedHideAlbumEntrance;
    public boolean mNeedHideDownLoadButton;
    public String mRecordPageName;
    public PostStoryParams$StoryCameraCallSource mSource;
    public long mTakePictureLimitTime;
    public int mVideoBitrate;
    public int mVideoGopSize;
    public long mVideoMaxLength;
    public String mX264Params;
    public String mX264Preset;
    public static final long serialVersionUID = 0xd09ef7711bd854ef;

    public void PostStoryParams(PostStoryParams$a p0){
       super();
       this.mRecordPageName = p0.a;
       this.mEditPageName = p0.b;
       this.mNeedHideAlbumEntrance = p0.c;
       this.mNeedHideDownLoadButton = p0.d;
       this.mFinishBtnText = p0.e;
       this.mFinishAction = p0.f;
       this.mVideoMaxLength = p0.g;
       this.mTakePictureLimitTime = p0.h;
       this.mAudioProfile = p0.m;
       this.mX264Params = p0.l;
       this.mX264Preset = p0.k;
       this.mVideoBitrate = p0.i;
       this.mVideoGopSize = p0.j;
       this.mNeedExportImageInQueueing = p0.n;
       this.mExportWidth = p0.o;
       this.mExportHeight = p0.p;
       this.mSource = p0.q;
       this.mMessageTargetName = p0.r;
    }
    public String getAudioProfile(){
       return this.mAudioProfile;
    }
    public PostStoryParams$StoryCameraCallSource getCameraCallSource(){
       return this.mSource;
    }
    public String getEditPageName(){
       return this.mEditPageName;
    }
    public int getExportHeight(){
       return this.mExportHeight;
    }
    public int getExportWidth(){
       return this.mExportWidth;
    }
    public int getFinishAction(){
       return this.mFinishAction;
    }
    public String getFinishBtnText(){
       return this.mFinishBtnText;
    }
    public String getMessageTargetName(){
       return this.mMessageTargetName;
    }
    public String getRecordPageName(){
       return this.mRecordPageName;
    }
    public long getTakePictureLimitTime(){
       return this.mTakePictureLimitTime;
    }
    public int getVideoBitrate(){
       return this.mVideoBitrate;
    }
    public int getVideoGopSiz(){
       return this.mVideoGopSize;
    }
    public long getVideoMaxLength(){
       return this.mVideoMaxLength;
    }
    public String getX264Params(){
       return this.mX264Params;
    }
    public String getX264Preset(){
       return this.mX264Preset;
    }
    public boolean isNeedHideAlbumEntrance(){
       return this.mNeedHideAlbumEntrance;
    }
    public boolean isNeedHideDownLoadButton(){
       return this.mNeedHideDownLoadButton;
    }
    public boolean ismNeedExportImageInQueueing(){
       return this.mNeedExportImageInQueueing;
    }
}
