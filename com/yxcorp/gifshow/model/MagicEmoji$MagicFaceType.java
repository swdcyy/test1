package com.yxcorp.gifshow.model.MagicEmoji$MagicFaceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MagicEmoji$MagicFaceType extends Enum	// class@001e4e
{
    public static final MagicEmoji$MagicFaceType[] $VALUES;
    public static final MagicEmoji$MagicFaceType Gift;
    public static final MagicEmoji$MagicFaceType Normal;

    static {
       MagicEmoji$MagicFaceType magicFaceTyp = new MagicEmoji$MagicFaceType("Normal", 0);
       MagicEmoji$MagicFaceType.Normal = magicFaceTyp;
       MagicEmoji$MagicFaceType magicFaceTyp1 = new MagicEmoji$MagicFaceType("Gift", 1);
       MagicEmoji$MagicFaceType.Gift = magicFaceTyp1;
       MagicEmoji$MagicFaceType[] magicFaceTyp2 = new MagicEmoji$MagicFaceType[]{magicFaceTyp,magicFaceTyp1};
       MagicEmoji$MagicFaceType.$VALUES = magicFaceTyp2;
    }
    public void MagicEmoji$MagicFaceType(String p0,int p1){
       super(p0, p1);
    }
    public static MagicEmoji$MagicFaceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicEmoji$MagicFaceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MagicEmoji$MagicFaceType.class, p0);
    }
    public static MagicEmoji$MagicFaceType[] values(){
       Object obj = PatchProxy.apply(null, null, MagicEmoji$MagicFaceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MagicEmoji$MagicFaceType.$VALUES.clone();
    }
}
