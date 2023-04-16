package com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AnimatedImageCompositor$FrameNeededResult extends Enum	// class@0010e8
{
    public static final AnimatedImageCompositor$FrameNeededResult[] $VALUES;
    public static final AnimatedImageCompositor$FrameNeededResult ABORT;
    public static final AnimatedImageCompositor$FrameNeededResult NOT_REQUIRED;
    public static final AnimatedImageCompositor$FrameNeededResult REQUIRED;
    public static final AnimatedImageCompositor$FrameNeededResult SKIP;

    static {
       AnimatedImageCompositor$FrameNeededResult uFrameNeeded = new AnimatedImageCompositor$FrameNeededResult("REQUIRED", 0);
       AnimatedImageCompositor$FrameNeededResult.REQUIRED = uFrameNeeded;
       AnimatedImageCompositor$FrameNeededResult uFrameNeeded1 = new AnimatedImageCompositor$FrameNeededResult("NOT_REQUIRED", 1);
       AnimatedImageCompositor$FrameNeededResult.NOT_REQUIRED = uFrameNeeded1;
       AnimatedImageCompositor$FrameNeededResult uFrameNeeded2 = new AnimatedImageCompositor$FrameNeededResult("SKIP", 2);
       AnimatedImageCompositor$FrameNeededResult.SKIP = uFrameNeeded2;
       AnimatedImageCompositor$FrameNeededResult uFrameNeeded3 = new AnimatedImageCompositor$FrameNeededResult("ABORT", 3);
       AnimatedImageCompositor$FrameNeededResult.ABORT = uFrameNeeded3;
       AnimatedImageCompositor$FrameNeededResult[] uFrameNeeded4 = new AnimatedImageCompositor$FrameNeededResult[]{uFrameNeeded,uFrameNeeded1,uFrameNeeded2,uFrameNeeded3};
       AnimatedImageCompositor$FrameNeededResult.$VALUES = uFrameNeeded4;
    }
    public void AnimatedImageCompositor$FrameNeededResult(String p0,int p1){
       super(p0, p1);
    }
    public static AnimatedImageCompositor$FrameNeededResult valueOf(String p0){
       return Enum.valueOf(AnimatedImageCompositor$FrameNeededResult.class, p0);
    }
    public static AnimatedImageCompositor$FrameNeededResult[] values(){
       return AnimatedImageCompositor$FrameNeededResult.$VALUES.clone();
    }
}
