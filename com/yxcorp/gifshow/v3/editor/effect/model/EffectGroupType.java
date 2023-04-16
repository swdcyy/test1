package com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import java.lang.Enum;
import java.lang.String;
import lnc.a1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EffectGroupType extends Enum	// class@000f20
{
    public final String mName;
    public final int mPositionIndex;
    public final int mType;
    public static final EffectGroupType[] $VALUES;
    public static final EffectGroupType FACE_MAGIC_EFFECT;
    public static final EffectGroupType HIGHLIGHT_TIME_EFFECT;
    public static final EffectGroupType MAGIC_EMOJI_EFFECT;
    public static final EffectGroupType TimeEffect;
    public static final EffectGroupType VisualEffect;

    static {
       EffectGroupType uEffectGroup = new EffectGroupType("HIGHLIGHT_TIME_EFFECT", 0, 4, 0, a1.p(0x7f1014f3));
       EffectGroupType.HIGHLIGHT_TIME_EFFECT = v6;
       EffectGroupType uEffectGroup1 = new EffectGroupType("VisualEffect", 1, 0, 2, a1.p(0x7f100ce6));
       EffectGroupType.VisualEffect = uEffectGroup;
       EffectGroupType uEffectGroup2 = new EffectGroupType("FACE_MAGIC_EFFECT", 2, 1, 3, a1.p(0x7f100ce4));
       EffectGroupType.FACE_MAGIC_EFFECT = v1;
       uEffectGroup1 = new EffectGroupType("TimeEffect", 3, 2, 4, a1.p(0x7f100ce5));
       EffectGroupType.TimeEffect = v2;
       int i = (PostExperimentUtils.p())? 0x7f104a51: 0x7f103103;
       uEffectGroup2 = new EffectGroupType("MAGIC_EMOJI_EFFECT", 4, 3, 1, a1.p(i));
       EffectGroupType.MAGIC_EMOJI_EFFECT = v3;
       EffectGroupType[] uEffectGroup3 = new EffectGroupType[]{v6,uEffectGroup,v1,v2,v3};
       EffectGroupType.$VALUES = uEffectGroup3;
    }
    public void EffectGroupType(String p0,int p1,int p2,int p3,String p4){
       super(p0, p1);
       this.mType = p2;
       this.mPositionIndex = p3;
       this.mName = p4;
    }
    public static EffectGroupType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EffectGroupType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EffectGroupType.class, p0);
    }
    public static EffectGroupType[] values(){
       Object obj = PatchProxy.apply(null, null, EffectGroupType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EffectGroupType.$VALUES.clone();
    }
    public String getName(){
       return this.mName;
    }
    public int getPositionIndex(){
       return this.mPositionIndex;
    }
    public int getType(){
       return this.mType;
    }
}
