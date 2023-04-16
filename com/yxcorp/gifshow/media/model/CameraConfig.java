package com.yxcorp.gifshow.media.model.CameraConfig;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.yxcorp.gifshow.media.model.CameraUnitConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Math;

public class CameraConfig implements Serializable	// class@001d02
{
    public boolean mABEnable;
    public int mCameraApiVersion;
    public int mCameraOutputDataType;
    public CameraUnitConfig mCameraUnitConfig;
    public int mDefaultPreviewHeight;
    public int mDefaultPreviewWidth;
    public boolean mDisableAdaptiveResolution;
    public boolean mDisableFaceDetectAutoExposure;
    public boolean mDisableFallbackSoftwareEncoder;
    public boolean mDisableSetAdaptedCameraFps;
    public boolean mEnableAudioVideoMuxerInterval;
    public boolean mEnableCameraKit;
    public boolean mEnableCameraVivoApi;
    public boolean mEnableDelayEncodeFrame;
    public boolean mEnableDenoise;
    public boolean mEnableHardwareEncoderColorSpaceSetting;
    public boolean mEnableHdr;
    public boolean mEnableMediaCodecBitrateModeCbr;
    public boolean mEnablePrepareMediaRecorder;
    public boolean mEnableRecordingHint;
    public boolean mEnableRenderThread2;
    public boolean mEnableStannis;
    public boolean mEnableTakePicture;
    public boolean mEnableTimeStampCorrect;
    public boolean mEnableUltraWideCamera;
    public boolean mEnableZeroShutterLagTakePicture;
    public int mHardwareEncoderAlignSize;
    public int mHardwareRecordFpsForHighFrameRate;
    public boolean mIsDefaultValue;
    public CameraPageConfig mPhotoPageConfig;
    public int mPictureHeight;
    public int mPictureWidth;
    public int mRecordMaxFaceDetectCount;
    public CameraPageConfig mRecordPageConfig;
    public int mRecordingHintCameraType;
    public int mSensorRate;
    public int mStartRecordDelayAfterStartPlayMusic;
    public CameraPageConfig mStoryPageConfig;
    public int mTargetMinFps;
    public boolean mUseEglimageTextureReader;
    public int mVideoBitrate;
    public String mVideoCodeConfig;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void CameraConfig(){
       super();
       this.mCameraApiVersion = 1;
       this.mCameraOutputDataType = 0;
       this.mDefaultPreviewWidth = 540;
       this.mDefaultPreviewHeight = 960;
       this.mEnablePrepareMediaRecorder = true;
       this.mHardwareEncoderAlignSize = 16;
       this.mHardwareRecordFpsForHighFrameRate = 60;
       this.mStartRecordDelayAfterStartPlayMusic = 250;
       this.mPhotoPageConfig = new CameraPageConfig(720, 1280, 1280);
       this.mEnableMediaCodecBitrateModeCbr = false;
       this.mSensorRate = 0;
       this.mEnableAudioVideoMuxerInterval = false;
       this.mIsDefaultValue = false;
       this.mABEnable = false;
    }
    public void CameraConfig(int p0,int p1){
       super();
       this.mCameraApiVersion = 1;
       this.mCameraOutputDataType = 0;
       this.mDefaultPreviewWidth = 540;
       this.mDefaultPreviewHeight = 960;
       this.mEnablePrepareMediaRecorder = true;
       this.mHardwareEncoderAlignSize = 16;
       this.mHardwareRecordFpsForHighFrameRate = 60;
       this.mStartRecordDelayAfterStartPlayMusic = 250;
       this.mPhotoPageConfig = new CameraPageConfig(720, 1280, 1280);
       this.mEnableMediaCodecBitrateModeCbr = false;
       this.mSensorRate = 0;
       this.mEnableAudioVideoMuxerInterval = false;
       this.mIsDefaultValue = false;
       this.mABEnable = false;
       this.mDefaultPreviewWidth = p0;
       this.mDefaultPreviewHeight = p1;
    }
    public boolean getEnableCameraUnit(){
       CameraConfig tmCameraUnit = this.mCameraUnitConfig;
       boolean b = (tmCameraUnit != null && tmCameraUnit.mEnable != null)? true: false;
       return b;
    }
    public CameraPageConfig getPhotoPageConfig(){
       return this.mPhotoPageConfig;
    }
    public CameraPageConfig getRecordPageConfig(){
       Object obj = PatchProxy.apply(null, this, CameraConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mRecordPageConfig == null) {
          CameraConfig tmDefaultPre = this.mDefaultPreviewWidth;
          CameraConfig tmDefaultPre1 = this.mDefaultPreviewHeight;
          this.mRecordPageConfig = new CameraPageConfig(tmDefaultPre, tmDefaultPre1, Math.max(tmDefaultPre, tmDefaultPre1));
       }
       return this.mRecordPageConfig;
    }
    public CameraPageConfig getStoryPageConfig(){
       Object obj = PatchProxy.apply(null, this, CameraConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mStoryPageConfig == null) {
          this.mStoryPageConfig = this.getRecordPageConfig().clone();
       }
       return this.mStoryPageConfig;
    }
}
