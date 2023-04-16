package com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$BlendOperation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AnimatedDrawableFrameInfo$BlendOperation extends Enum	// class@0010e5
{
    public static final AnimatedDrawableFrameInfo$BlendOperation[] $VALUES;
    public static final AnimatedDrawableFrameInfo$BlendOperation BLEND_WITH_PREVIOUS;
    public static final AnimatedDrawableFrameInfo$BlendOperation NO_BLEND;

    static {
       AnimatedDrawableFrameInfo$BlendOperation uBlendOperat = new AnimatedDrawableFrameInfo$BlendOperation("BLEND_WITH_PREVIOUS", 0);
       AnimatedDrawableFrameInfo$BlendOperation.BLEND_WITH_PREVIOUS = uBlendOperat;
       AnimatedDrawableFrameInfo$BlendOperation uBlendOperat1 = new AnimatedDrawableFrameInfo$BlendOperation("NO_BLEND", 1);
       AnimatedDrawableFrameInfo$BlendOperation.NO_BLEND = uBlendOperat1;
       AnimatedDrawableFrameInfo$BlendOperation[] uBlendOperat2 = new AnimatedDrawableFrameInfo$BlendOperation[]{uBlendOperat,uBlendOperat1};
       AnimatedDrawableFrameInfo$BlendOperation.$VALUES = uBlendOperat2;
    }
    public void AnimatedDrawableFrameInfo$BlendOperation(String p0,int p1){
       super(p0, p1);
    }
    public static AnimatedDrawableFrameInfo$BlendOperation valueOf(String p0){
       return Enum.valueOf(AnimatedDrawableFrameInfo$BlendOperation.class, p0);
    }
    public static AnimatedDrawableFrameInfo$BlendOperation[] values(){
       return AnimatedDrawableFrameInfo$BlendOperation.$VALUES.clone();
    }
}
