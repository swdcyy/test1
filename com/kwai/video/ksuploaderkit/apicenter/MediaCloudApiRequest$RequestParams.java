package com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiRequest$RequestParams;
import java.io.Serializable;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiRequest;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiRequest$1;
import java.lang.String;

public class MediaCloudApiRequest$RequestParams implements Serializable	// class@000999
{
    public String mClientMeta;
    public String mCoverName;
    public String mImageName;
    public String mSignature;
    public String mUploadToken;
    public String mVideoName;
    public final MediaCloudApiRequest this$0;

    public void MediaCloudApiRequest$RequestParams(MediaCloudApiRequest p0){
       this.this$0 = p0;
       super();
    }
    public void MediaCloudApiRequest$RequestParams(MediaCloudApiRequest p0,MediaCloudApiRequest$1 p1){
       super(p0);
    }
    public void setClientMeta(String p0){
       this.mClientMeta = p0;
    }
    public void setCoverName(String p0){
       this.mCoverName = p0;
    }
    public void setImageName(String p0){
       this.mImageName = p0;
    }
    public void setSignature(String p0){
       this.mSignature = p0;
    }
    public void setUploadToken(String p0){
       this.mUploadToken = p0;
    }
    public void setVideoName(String p0){
       this.mVideoName = p0;
    }
}
