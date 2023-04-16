package com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import java.lang.Object;
import com.kwai.video.wayne.player.listeners.InnerPlayerLifeCycleListener;

public abstract class PlayerCommonBuildData	// class@000cbc
{
    public boolean mEnableMediaCodecDummySurface;
    public InnerPlayerLifeCycleListener mInnerPlayerLifeCycleListener;
    public boolean mIsSlideMode;
    public int mMaxBufferTimeMs;
    public int mMediaCodecPolicy;
    public int mStartPlayType;

    public void PlayerCommonBuildData(){
       super();
       this.mMaxBufferTimeMs = -1;
       this.mIsSlideMode = true;
       this.mEnableMediaCodecDummySurface = false;
       this.mMediaCodecPolicy = 0;
       this.mStartPlayType = 0;
    }
    public int getStartPlayType(){
       return this.mStartPlayType;
    }
    public PlayerCommonBuildData setEnableMediaCodecDummySurface(boolean p0){
       this.mEnableMediaCodecDummySurface = p0;
       return this;
    }
    public PlayerCommonBuildData setInnerPlayerLifeCycleListener(InnerPlayerLifeCycleListener p0){
       this.mInnerPlayerLifeCycleListener = p0;
       return this;
    }
    public PlayerCommonBuildData setIsSlideMode(boolean p0){
       this.mIsSlideMode = p0;
       return this;
    }
    public PlayerCommonBuildData setMaxBufferTimeMs(int p0){
       this.mMaxBufferTimeMs = p0;
       return this;
    }
    public PlayerCommonBuildData setMediaCodecPolicy(int p0){
       this.mMediaCodecPolicy = p0;
       return this;
    }
    public PlayerCommonBuildData setStartPlayType(int p0){
       this.mStartPlayType = p0;
       return this;
    }
}
