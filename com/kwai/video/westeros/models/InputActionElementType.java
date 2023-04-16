package com.kwai.video.westeros.models.InputActionElementType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.InputActionElementType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.InputActionElementType$InputActionElementTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class InputActionElementType extends Enum implements Internal$EnumLite	// class@000f95
{
    public final int value;
    public static final InputActionElementType[] $VALUES;
    public static final InputActionElementType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final InputActionElementType kTypeDate;
    public static final InputActionElementType kTypeText;

    static {
       InputActionElementType inputActionE = new InputActionElementType("kTypeDate", 0, 0);
       InputActionElementType.kTypeDate = inputActionE;
       InputActionElementType inputActionE1 = new InputActionElementType("kTypeText", 1, 1);
       InputActionElementType.kTypeText = inputActionE1;
       InputActionElementType inputActionE2 = new InputActionElementType("UNRECOGNIZED", 2, -1);
       InputActionElementType.UNRECOGNIZED = inputActionE2;
       InputActionElementType[] inputActionE3 = new InputActionElementType[]{inputActionE,inputActionE1,inputActionE2};
       InputActionElementType.$VALUES = inputActionE3;
       InputActionElementType.internalValueMap = new InputActionElementType$1();
    }
    public void InputActionElementType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static InputActionElementType forNumber(int p0){
       if (!p0) {
          return InputActionElementType.kTypeDate;
       }
       if (p0 != 1) {
          return null;
       }
       return InputActionElementType.kTypeText;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return InputActionElementType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return InputActionElementType$InputActionElementTypeVerifier.INSTANCE;
    }
    public static InputActionElementType valueOf(int p0){
       return InputActionElementType.forNumber(p0);
    }
    public static InputActionElementType valueOf(String p0){
       return Enum.valueOf(InputActionElementType.class, p0);
    }
    public static InputActionElementType[] values(){
       return InputActionElementType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != InputActionElementType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
