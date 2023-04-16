package com.yxcorp.gifshow.widget.adv.Action$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Action$Type extends Enum	// class@0018ff
{
    public static final Action$Type[] $VALUES;
    public static final Action$Type DECORATION;
    public static final Action$Type FACE_MAGIC_EFFECT;
    public static final Action$Type FRAME_DELETE;
    public static final Action$Type HIGHLIGHT_TIME_EFFECT;
    public static final Action$Type MAGIC_EMOJI_EFFECT;
    public static final Action$Type MAGIC_FINGER;
    public static final Action$Type NONE;
    public static final Action$Type SUBTITLE;
    public static final Action$Type TEXT;
    public static final Action$Type TIME_EFFECT;
    public static final Action$Type VIDEO_OPENING;
    public static final Action$Type VISUAL_EFFECT;

    static {
       Action$Type type = new Action$Type("NONE", 0);
       Action$Type.NONE = type;
       Action$Type type1 = new Action$Type("TEXT", 1);
       Action$Type.TEXT = type1;
       Action$Type type2 = new Action$Type("SUBTITLE", 2);
       Action$Type.SUBTITLE = type2;
       Action$Type type3 = new Action$Type("DECORATION", 3);
       Action$Type.DECORATION = type3;
       Action$Type type4 = new Action$Type("FRAME_DELETE", 4);
       Action$Type.FRAME_DELETE = type4;
       Action$Type type5 = new Action$Type("VISUAL_EFFECT", 5);
       Action$Type.VISUAL_EFFECT = type5;
       Action$Type type6 = new Action$Type("TIME_EFFECT", 6);
       Action$Type.TIME_EFFECT = type6;
       Action$Type type7 = new Action$Type("FACE_MAGIC_EFFECT", 7);
       Action$Type.FACE_MAGIC_EFFECT = type7;
       Action$Type type8 = new Action$Type("MAGIC_FINGER", 8);
       Action$Type.MAGIC_FINGER = type8;
       Action$Type type9 = new Action$Type("MAGIC_EMOJI_EFFECT", 9);
       Action$Type.MAGIC_EMOJI_EFFECT = type9;
       Action$Type type10 = new Action$Type("HIGHLIGHT_TIME_EFFECT", 10);
       Action$Type.HIGHLIGHT_TIME_EFFECT = type10;
       Action$Type type11 = new Action$Type("VIDEO_OPENING", 11);
       Action$Type.VIDEO_OPENING = type11;
       Action$Type[] typeArray = new Action$Type[12];
       typeArray[0] = type;
       typeArray[1] = type1;
       typeArray[2] = type2;
       typeArray[3] = type3;
       typeArray[4] = type4;
       typeArray[5] = type5;
       typeArray[6] = type6;
       typeArray[7] = type7;
       typeArray[8] = type8;
       typeArray[9] = type9;
       typeArray[10] = type10;
       typeArray[11] = type11;
       Action$Type.$VALUES = typeArray;
    }
    public void Action$Type(String p0,int p1){
       super(p0, p1);
    }
    public static Action$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Action$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Action$Type.class, p0);
    }
    public static Action$Type[] values(){
       Object obj = PatchProxy.apply(null, null, Action$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Action$Type.$VALUES.clone();
    }
}
