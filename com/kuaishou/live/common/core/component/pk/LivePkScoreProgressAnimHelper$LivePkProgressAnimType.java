package com.kuaishou.live.common.core.component.pk.LivePkScoreProgressAnimHelper$LivePkProgressAnimType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.pk.LivePkScoreProgressAnimHelper$a;

public final class LivePkScoreProgressAnimHelper$LivePkProgressAnimType extends Enum	// class@00172d
{
    public static final LivePkScoreProgressAnimHelper$LivePkProgressAnimType[] $VALUES;
    public static final LivePkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_BIG_LEFT;
    public static final LivePkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_BIG_RIGHT;
    public static final LivePkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_EMOJI_DRAW;
    public static final LivePkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_EMOJI_FAIL;
    public static final LivePkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_EMOJI_WIN;
    public static final LivePkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_LIGHT;
    public static final LivePkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_SMALL_LEFT;
    public static final LivePkScoreProgressAnimHelper$LivePkProgressAnimType ANIM_TYPE_SMALL_RIGHT;

    static {
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre = new LivePkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_LIGHT", 0);
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_LIGHT = livePkProgre;
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre1 = new LivePkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_SMALL_LEFT", 1);
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_SMALL_LEFT = livePkProgre1;
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre2 = new LivePkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_BIG_LEFT", 2);
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_BIG_LEFT = livePkProgre2;
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre3 = new LivePkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_SMALL_RIGHT", 3);
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_SMALL_RIGHT = livePkProgre3;
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre4 = new LivePkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_BIG_RIGHT", 4);
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_BIG_RIGHT = livePkProgre4;
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre5 = new LivePkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_EMOJI_DRAW", 5);
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_DRAW = livePkProgre5;
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre6 = new LivePkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_EMOJI_WIN", 6);
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_WIN = livePkProgre6;
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre7 = new LivePkScoreProgressAnimHelper$LivePkProgressAnimType("ANIM_TYPE_EMOJI_FAIL", 7);
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_FAIL = livePkProgre7;
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType[] livePkProgre8 = new LivePkScoreProgressAnimHelper$LivePkProgressAnimType[]{livePkProgre,livePkProgre1,livePkProgre2,livePkProgre3,livePkProgre4,livePkProgre5,livePkProgre6,livePkProgre7};
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType.$VALUES = livePkProgre8;
    }
    public void LivePkScoreProgressAnimHelper$LivePkProgressAnimType(String p0,int p1){
       super(p0, p1);
    }
    public static LivePkScoreProgressAnimHelper$LivePkProgressAnimType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePkScoreProgressAnimHelper$LivePkProgressAnimType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePkScoreProgressAnimHelper$LivePkProgressAnimType.class, p0);
    }
    public static LivePkScoreProgressAnimHelper$LivePkProgressAnimType[] values(){
       Object obj = PatchProxy.apply(null, null, LivePkScoreProgressAnimHelper$LivePkProgressAnimType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePkScoreProgressAnimHelper$LivePkProgressAnimType.$VALUES.clone();
    }
    public boolean isFlameAnimation(){
       Object obj = PatchProxy.apply(null, this, LivePkScoreProgressAnimHelper$LivePkProgressAnimType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = LivePkScoreProgressAnimHelper$a.a[this.ordinal()];
       if (i != 1 && (i != 2 && (i != 3 && i != 4))) {
          return false;
       }
       return true;
    }
}
