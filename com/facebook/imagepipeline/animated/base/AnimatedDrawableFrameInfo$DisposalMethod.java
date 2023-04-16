package com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AnimatedDrawableFrameInfo$DisposalMethod extends Enum	// class@0010e6
{
    public static final AnimatedDrawableFrameInfo$DisposalMethod[] $VALUES;
    public static final AnimatedDrawableFrameInfo$DisposalMethod DISPOSE_DO_NOT;
    public static final AnimatedDrawableFrameInfo$DisposalMethod DISPOSE_TO_BACKGROUND;
    public static final AnimatedDrawableFrameInfo$DisposalMethod DISPOSE_TO_PREVIOUS;

    static {
       AnimatedDrawableFrameInfo$DisposalMethod uDisposalMet = new AnimatedDrawableFrameInfo$DisposalMethod("DISPOSE_DO_NOT", 0);
       AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_DO_NOT = uDisposalMet;
       AnimatedDrawableFrameInfo$DisposalMethod uDisposalMet1 = new AnimatedDrawableFrameInfo$DisposalMethod("DISPOSE_TO_BACKGROUND", 1);
       AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_TO_BACKGROUND = uDisposalMet1;
       AnimatedDrawableFrameInfo$DisposalMethod uDisposalMet2 = new AnimatedDrawableFrameInfo$DisposalMethod("DISPOSE_TO_PREVIOUS", 2);
       AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_TO_PREVIOUS = uDisposalMet2;
       AnimatedDrawableFrameInfo$DisposalMethod[] uDisposalMet3 = new AnimatedDrawableFrameInfo$DisposalMethod[]{uDisposalMet,uDisposalMet1,uDisposalMet2};
       AnimatedDrawableFrameInfo$DisposalMethod.$VALUES = uDisposalMet3;
    }
    public void AnimatedDrawableFrameInfo$DisposalMethod(String p0,int p1){
       super(p0, p1);
    }
    public static AnimatedDrawableFrameInfo$DisposalMethod valueOf(String p0){
       return Enum.valueOf(AnimatedDrawableFrameInfo$DisposalMethod.class, p0);
    }
    public static AnimatedDrawableFrameInfo$DisposalMethod[] values(){
       return AnimatedDrawableFrameInfo$DisposalMethod.$VALUES.clone();
    }
}
