package com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MagicEmoji$SeekBarType extends Enum	// class@001e4f
{
    public static final MagicEmoji$SeekBarType[] $VALUES;
    public static final MagicEmoji$SeekBarType LOOKUP;
    public static final MagicEmoji$SeekBarType MAKEUP;
    public static final MagicEmoji$SeekBarType MAKEUP_LOOKUP;
    public static final MagicEmoji$SeekBarType SLIMMING;
    public static final MagicEmoji$SeekBarType UNKNOWN;

    static {
       MagicEmoji$SeekBarType seekBarType = new MagicEmoji$SeekBarType("UNKNOWN", 0);
       MagicEmoji$SeekBarType.UNKNOWN = seekBarType;
       MagicEmoji$SeekBarType seekBarType1 = new MagicEmoji$SeekBarType("SLIMMING", 1);
       MagicEmoji$SeekBarType.SLIMMING = seekBarType1;
       MagicEmoji$SeekBarType seekBarType2 = new MagicEmoji$SeekBarType("MAKEUP", 2);
       MagicEmoji$SeekBarType.MAKEUP = seekBarType2;
       MagicEmoji$SeekBarType seekBarType3 = new MagicEmoji$SeekBarType("LOOKUP", 3);
       MagicEmoji$SeekBarType.LOOKUP = seekBarType3;
       MagicEmoji$SeekBarType seekBarType4 = new MagicEmoji$SeekBarType("MAKEUP_LOOKUP", 4);
       MagicEmoji$SeekBarType.MAKEUP_LOOKUP = seekBarType4;
       MagicEmoji$SeekBarType[] seekBarTypeA = new MagicEmoji$SeekBarType[]{seekBarType,seekBarType1,seekBarType2,seekBarType3,seekBarType4};
       MagicEmoji$SeekBarType.$VALUES = seekBarTypeA;
    }
    public void MagicEmoji$SeekBarType(String p0,int p1){
       super(p0, p1);
    }
    public static MagicEmoji$SeekBarType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicEmoji$SeekBarType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MagicEmoji$SeekBarType.class, p0);
    }
    public static MagicEmoji$SeekBarType[] values(){
       Object obj = PatchProxy.apply(null, null, MagicEmoji$SeekBarType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MagicEmoji$SeekBarType.$VALUES.clone();
    }
}
