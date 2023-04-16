package com.kuaishou.live.common.core.component.comments.util.LiveCommentLogger$LongClickMessageType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveCommentLogger$LongClickMessageType extends Enum	// class@0010cf
{
    public static final LiveCommentLogger$LongClickMessageType[] $VALUES;
    public static final LiveCommentLogger$LongClickMessageType BARRAGE;
    public static final LiveCommentLogger$LongClickMessageType BATTER;
    public static final LiveCommentLogger$LongClickMessageType GIFT;
    public static final LiveCommentLogger$LongClickMessageType LIKE;
    public static final LiveCommentLogger$LongClickMessageType NORMAL;

    static {
       LiveCommentLogger$LongClickMessageType longClickMes = new LiveCommentLogger$LongClickMessageType("NORMAL", 0);
       LiveCommentLogger$LongClickMessageType.NORMAL = longClickMes;
       LiveCommentLogger$LongClickMessageType longClickMes1 = new LiveCommentLogger$LongClickMessageType("GIFT", 1);
       LiveCommentLogger$LongClickMessageType.GIFT = longClickMes1;
       LiveCommentLogger$LongClickMessageType longClickMes2 = new LiveCommentLogger$LongClickMessageType("LIKE", 2);
       LiveCommentLogger$LongClickMessageType.LIKE = longClickMes2;
       LiveCommentLogger$LongClickMessageType longClickMes3 = new LiveCommentLogger$LongClickMessageType("BARRAGE", 3);
       LiveCommentLogger$LongClickMessageType.BARRAGE = longClickMes3;
       LiveCommentLogger$LongClickMessageType longClickMes4 = new LiveCommentLogger$LongClickMessageType("BATTER", 4);
       LiveCommentLogger$LongClickMessageType.BATTER = longClickMes4;
       LiveCommentLogger$LongClickMessageType[] longClickMes5 = new LiveCommentLogger$LongClickMessageType[]{longClickMes,longClickMes1,longClickMes2,longClickMes3,longClickMes4};
       LiveCommentLogger$LongClickMessageType.$VALUES = longClickMes5;
    }
    public void LiveCommentLogger$LongClickMessageType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveCommentLogger$LongClickMessageType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCommentLogger$LongClickMessageType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCommentLogger$LongClickMessageType.class, p0);
    }
    public static LiveCommentLogger$LongClickMessageType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCommentLogger$LongClickMessageType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommentLogger$LongClickMessageType.$VALUES.clone();
    }
}
