package com.kwai.feature.post.api.feature.encode.model.EncodeConfigResponse;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.media.model.CameraConfig;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import com.yxcorp.gifshow.media.model.ImageConfig;
import com.yxcorp.gifshow.media.model.PhotoMovieEncodeConfig;
import com.yxcorp.gifshow.media.model.PhotoMovieTransitionEncodeConfig;
import com.yxcorp.gifshow.media.model.KtvMvEncodeConfig;
import com.yxcorp.gifshow.media.model.EditorSdkDecodeConfig;
import com.kwai.framework.player.config.PlayerConfigModel;
import com.yxcorp.gifshow.media.model.MessageEncodeConfig;

public class EncodeConfigResponse implements Serializable	// class@001398
{
    public CameraConfig mCameraConfig;
    public EditorSdkDecodeConfig mDecodeConfig;
    public EncodeConfig mEncodeConfig;
    public ImageConfig mImageConfig;
    public KtvMvEncodeConfig mKtvMvEncodeConfig;
    public LiveCameraConfig mLiveCameraConfig;
    public EncodeConfig mLongEncodeConfig;
    public MessageEncodeConfig mMessageEncodeConfig;
    public PhotoMovieEncodeConfig mPhotoMovieEncodeConfig;
    public PhotoMovieTransitionEncodeConfig mPhotoMovieTransitionEncodeConfig;
    public PlayerConfigModel mPlayerConfig;
    public PreviewConfig mPreviewConfig;
    public WatermarkEncodeConfig mWatermarkEncodeConfig;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void EncodeConfigResponse(){
       super();
       this.mCameraConfig = new CameraConfig();
       this.mEncodeConfig = new EncodeConfig();
       this.mImageConfig = new ImageConfig();
       this.mPhotoMovieEncodeConfig = new PhotoMovieEncodeConfig();
       this.mPhotoMovieTransitionEncodeConfig = new PhotoMovieTransitionEncodeConfig();
       this.mKtvMvEncodeConfig = new KtvMvEncodeConfig();
       this.mDecodeConfig = new EditorSdkDecodeConfig();
       this.mPlayerConfig = new PlayerConfigModel();
       this.mMessageEncodeConfig = new MessageEncodeConfig();
    }
}
