package com.kuaishou.live.core.voiceparty.playway.shared.util.ToIntType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ToIntType extends Enum	// class@001889
{
    public static final ToIntType[] $VALUES;
    public static final ToIntType Ceil;
    public static final ToIntType Floor;
    public static final ToIntType Round;

    static {
       ToIntType toIntType;
       ToIntType[] toIntTypeArr = new ToIntType[]{toIntType,toIntType,toIntType};
       toIntType = new ToIntType("Ceil", 0);
       ToIntType.Ceil = toIntType;
       toIntType = new ToIntType("Floor", 1);
       ToIntType.Floor = toIntType;
       toIntType = new ToIntType("Round", 2);
       ToIntType.Round = toIntType;
       ToIntType.$VALUES = toIntTypeArr;
    }
    public void ToIntType(String p0,int p1){
       super(p0, p1);
    }
    public static ToIntType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ToIntType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ToIntType.class, p0);
    }
    public static ToIntType[] values(){
       Object obj = PatchProxy.apply(null, null, ToIntType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ToIntType.$VALUES.clone();
    }
}
