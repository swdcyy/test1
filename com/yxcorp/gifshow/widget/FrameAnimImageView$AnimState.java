package com.yxcorp.gifshow.widget.FrameAnimImageView$AnimState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FrameAnimImageView$AnimState extends Enum	// class@001850
{
    public static final FrameAnimImageView$AnimState[] $VALUES;
    public static final FrameAnimImageView$AnimState END;
    public static final FrameAnimImageView$AnimState LOOP_END;
    public static final FrameAnimImageView$AnimState PAUSE;
    public static final FrameAnimImageView$AnimState RESUME;
    public static final FrameAnimImageView$AnimState START;

    static {
       FrameAnimImageView$AnimState uAnimState = new FrameAnimImageView$AnimState("START", 0);
       FrameAnimImageView$AnimState.START = uAnimState;
       FrameAnimImageView$AnimState uAnimState1 = new FrameAnimImageView$AnimState("END", 1);
       FrameAnimImageView$AnimState.END = uAnimState1;
       FrameAnimImageView$AnimState uAnimState2 = new FrameAnimImageView$AnimState("PAUSE", 2);
       FrameAnimImageView$AnimState.PAUSE = uAnimState2;
       FrameAnimImageView$AnimState uAnimState3 = new FrameAnimImageView$AnimState("RESUME", 3);
       FrameAnimImageView$AnimState.RESUME = uAnimState3;
       FrameAnimImageView$AnimState uAnimState4 = new FrameAnimImageView$AnimState("LOOP_END", 4);
       FrameAnimImageView$AnimState.LOOP_END = uAnimState4;
       FrameAnimImageView$AnimState[] uAnimStateAr = new FrameAnimImageView$AnimState[]{uAnimState,uAnimState1,uAnimState2,uAnimState3,uAnimState4};
       FrameAnimImageView$AnimState.$VALUES = uAnimStateAr;
    }
    public void FrameAnimImageView$AnimState(String p0,int p1){
       super(p0, p1);
    }
    public static FrameAnimImageView$AnimState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrameAnimImageView$AnimState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FrameAnimImageView$AnimState.class, p0);
    }
    public static FrameAnimImageView$AnimState[] values(){
       Object obj = PatchProxy.apply(null, null, FrameAnimImageView$AnimState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FrameAnimImageView$AnimState.$VALUES.clone();
    }
}
