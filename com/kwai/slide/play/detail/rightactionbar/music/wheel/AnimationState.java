package com.kwai.slide.play.detail.rightactionbar.music.wheel.AnimationState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AnimationState extends Enum	// class@001868
{
    public static final AnimationState[] $VALUES;
    public static final AnimationState END;
    public static final AnimationState PAUSE;
    public static final AnimationState START;

    static {
       AnimationState uAnimationSt1;
       AnimationState[] uAnimationSt = new AnimationState[]{uAnimationSt1,uAnimationSt1,uAnimationSt1};
       uAnimationSt1 = new AnimationState("START", 0);
       AnimationState.START = uAnimationSt1;
       uAnimationSt1 = new AnimationState("PAUSE", 1);
       AnimationState.PAUSE = uAnimationSt1;
       uAnimationSt1 = new AnimationState("END", 2);
       AnimationState.END = uAnimationSt1;
       AnimationState.$VALUES = uAnimationSt;
    }
    public void AnimationState(String p0,int p1){
       super(p0, p1);
    }
    public static AnimationState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AnimationState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AnimationState.class, p0);
    }
    public static AnimationState[] values(){
       Object obj = PatchProxy.apply(null, null, AnimationState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AnimationState.$VALUES.clone();
    }
}
