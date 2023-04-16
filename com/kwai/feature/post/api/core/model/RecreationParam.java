package com.kwai.feature.post.api.core.model.RecreationParam;
import java.io.Serializable;
import com.kwai.feature.post.api.core.model.RecreationParam$a;
import java.lang.Object;

public class RecreationParam implements Serializable	// class@001309
{
    public boolean mIsSoundTrack;
    public JsMerchantCommentParams mJsMerchantCommentParams;
    public int mRecreationBottomColor;
    public List mRecreationMediaPaths;
    public List mRecreationMediaSizes;
    public String mRecreationMusicCoverPath;
    public String mRecreationOriginPhotoId;
    public String mRecreationOriginUserName;
    public String mRecreationPictureType;
    public String mRecreationSoundWavePath;
    public int mRecreationTopColor;
    public String mRecreationVideoCaption;
    public String mVideoRecreationCommentText;
    public String mVideoRecreationPath;
    public static final long serialVersionUID = 0xe6c15a39785f90fd;

    public void RecreationParam(RecreationParam$a p0){
       super();
       this.mVideoRecreationPath = p0.a;
       this.mRecreationOriginUserName = p0.b;
       this.mRecreationVideoCaption = p0.c;
       this.mRecreationOriginPhotoId = p0.d;
       this.mVideoRecreationCommentText = p0.e;
       this.mRecreationTopColor = p0.f;
       this.mRecreationBottomColor = p0.g;
       this.mRecreationMusicCoverPath = p0.h;
       this.mRecreationSoundWavePath = p0.i;
       this.mIsSoundTrack = p0.j;
       this.mRecreationPictureType = p0.k;
       this.mRecreationMediaPaths = p0.l;
       this.mRecreationMediaSizes = p0.m;
       this.mJsMerchantCommentParams = p0.n;
    }
}
