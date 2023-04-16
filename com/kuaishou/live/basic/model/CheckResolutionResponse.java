package com.kuaishou.live.basic.model.CheckResolutionResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.basic.model.CheckResolutionResponse$VideoConfig;

public class CheckResolutionResponse implements Serializable	// class@000cda
{
    public int mAudioBitrate;
    public String mEncoderComplexityOptions;
    public int mFps;
    public int mIFrameInterval;
    public boolean mLiveHardwareEncodeEnabled;
    public int mPreviewResolution;
    public int mPushResolution;
    public String mResolution;
    public CheckResolutionResponse$VideoConfig mVideoConfig;
    public double mVideoInitBitrate;
    public double mVideoMaxBitrate;
    public double mVideoMinBitrate;
    public static final long serialVersionUID = 0xacb13199b7b85913;

    public void CheckResolutionResponse(){
       super();
       this.mFps = 15;
       this.mVideoMaxBitrate = 550.00f;
       this.mVideoInitBitrate = 450.00f;
       this.mVideoMinBitrate = 200.00f;
       this.mAudioBitrate = 48;
       this.mIFrameInterval = 4;
       this.mEncoderComplexityOptions = "";
       this.mPushResolution = 1;
       this.mPreviewResolution = 1;
       this.mResolution = "640x368";
       this.mVideoConfig = new CheckResolutionResponse$VideoConfig();
    }
}
