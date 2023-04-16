package com.airbnb.lottie.ex.model.content.ShapeTrimPath$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class ShapeTrimPath$Type extends Enum	// class@000db4
{
    public static final ShapeTrimPath$Type[] $VALUES;
    public static final ShapeTrimPath$Type INDIVIDUALLY;
    public static final ShapeTrimPath$Type SIMULTANEOUSLY;

    static {
       ShapeTrimPath$Type type = new ShapeTrimPath$Type("SIMULTANEOUSLY", 0);
       ShapeTrimPath$Type.SIMULTANEOUSLY = type;
       ShapeTrimPath$Type type1 = new ShapeTrimPath$Type("INDIVIDUALLY", 1);
       ShapeTrimPath$Type.INDIVIDUALLY = type1;
       ShapeTrimPath$Type[] typeArray = new ShapeTrimPath$Type[]{type,type1};
       ShapeTrimPath$Type.$VALUES = typeArray;
    }
    public void ShapeTrimPath$Type(String p0,int p1){
       super(p0, p1);
    }
    public static ShapeTrimPath$Type forId(int p0){
       if (p0 == 1) {
          return ShapeTrimPath$Type.SIMULTANEOUSLY;
       }
       if (p0 == 2) {
          return ShapeTrimPath$Type.INDIVIDUALLY;
       }
       throw new IllegalArgumentException("Unknown trim path type "+p0);
    }
    public static ShapeTrimPath$Type valueOf(String p0){
       return Enum.valueOf(ShapeTrimPath$Type.class, p0);
    }
    public static ShapeTrimPath$Type[] values(){
       return ShapeTrimPath$Type.$VALUES.clone();
    }
}
