package com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendAnimationInformation;
import dc.d;
import oc.a;
import java.lang.Object;

public class AnimatedDrawableBackendAnimationInformation implements d	// class@0010d8
{
    public final a mAnimatedDrawableBackend;

    public void AnimatedDrawableBackendAnimationInformation(a p0){
       super();
       this.mAnimatedDrawableBackend = p0;
    }
    public int getFrameCount(){
       return this.mAnimatedDrawableBackend.getFrameCount();
    }
    public int getFrameDurationMs(int p0){
       return this.mAnimatedDrawableBackend.c(p0);
    }
    public int getLoopCount(){
       return this.mAnimatedDrawableBackend.getLoopCount();
    }
}
