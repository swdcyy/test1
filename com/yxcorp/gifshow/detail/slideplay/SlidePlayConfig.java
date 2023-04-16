package com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;

public class SlidePlayConfig implements Serializable, Cloneable	// class@001713
{
    public boolean mEnableLazyLoad;
    public boolean mEnablePositionReferFragment;
    public boolean mEnablePullRefresh;
    public boolean mEnableShowMarque;
    public boolean mEnableSlidePositionChangeEvent;
    public boolean mIsCanLoop;
    public boolean mIsDisableSwipeToProfile;
    public static final long serialVersionUID = 0x640ab86c11b8fd1e;

    public void SlidePlayConfig(){
       super();
       this.mEnableLazyLoad = true;
       this.mEnablePullRefresh = true;
       this.mEnablePositionReferFragment = true;
       this.mEnableShowMarque = false;
       this.mIsDisableSwipeToProfile = false;
    }
    public boolean canLoop(){
       return this.mIsCanLoop;
    }
    public boolean enableLazyLoad(){
       return this.mEnableLazyLoad;
    }
    public boolean enablePositionReferFragment(){
       return this.mEnablePositionReferFragment;
    }
    public boolean enablePullRefresh(){
       return this.mEnablePullRefresh;
    }
    public boolean enableSlidePositionChangeEvent(){
       return this.mEnableSlidePositionChangeEvent;
    }
    public boolean isDisableSwipeToProfile(){
       return this.mIsDisableSwipeToProfile;
    }
    public void setCanLoop(boolean p0){
       this.mIsCanLoop = p0;
    }
    public void setDisableSwipeToProfile(boolean p0){
       this.mIsDisableSwipeToProfile = p0;
    }
    public void setEnableLazyLoad(boolean p0){
       this.mEnableLazyLoad = p0;
    }
    public void setEnablePositionReferFragment(boolean p0){
       this.mEnablePositionReferFragment = p0;
    }
    public void setEnablePullRefresh(boolean p0){
       this.mEnablePullRefresh = p0;
    }
    public void setEnableSlidePositionChangeEvent(boolean p0){
       this.mEnableSlidePositionChangeEvent = p0;
    }
}
