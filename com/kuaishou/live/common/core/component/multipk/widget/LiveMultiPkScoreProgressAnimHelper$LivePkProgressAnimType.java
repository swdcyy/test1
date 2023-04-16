package com.kuaishou.live.common.core.component.multipk.widget.LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.multipk.widget.LiveMultiPkScoreProgressAnimHelper$a;

public final class LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType extends Enum	// class@0016a6
{
    public static final LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType[] $VALUES;
    public static final LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_BIG_LEFT;
    public static final LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_BIG_RIGHT;
    public static final LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_EMOJI_DRAW;
    public static final LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_EMOJI_FAIL;
    public static final LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_EMOJI_WIN;
    public static final LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_LIGHT;
    public static final LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_SMALL_LEFT;
    public static final LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_SMALL_RIGHT;

    static {
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre = new LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_LIGHT", 0);
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_LIGHT = livePkProgre;
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre1 = new LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_SMALL_LEFT", 1);
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_SMALL_LEFT = livePkProgre1;
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre2 = new LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_BIG_LEFT", 2);
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_BIG_LEFT = livePkProgre2;
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre3 = new LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_SMALL_RIGHT", 3);
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_SMALL_RIGHT = livePkProgre3;
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre4 = new LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_BIG_RIGHT", 4);
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_BIG_RIGHT = livePkProgre4;
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre5 = new LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_EMOJI_DRAW", 5);
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_DRAW = livePkProgre5;
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre6 = new LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_EMOJI_WIN", 6);
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_WIN = livePkProgre6;
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre7 = new LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_EMOJI_FAIL", 7);
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_FAIL = livePkProgre7;
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType[] livePkProgre8 = new LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType[]{livePkProgre,livePkProgre1,livePkProgre2,livePkProgre3,livePkProgre4,livePkProgre5,livePkProgre6,livePkProgre7};
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.$VALUES = livePkProgre8;
    }
    public void LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.class, p0);
    }
    public static LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.$VALUES.clone();
    }
    public boolean isFlameAnimation(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = LiveMultiPkScoreProgressAnimHelper$a.a[this.ordinal()];
       if (i != 1 && (i != 2 && (i != 3 && i != 4))) {
          return false;
       }
       return true;
    }
}
