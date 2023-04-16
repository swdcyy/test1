package com.kwai.video.westeros.models.UIInteractionResponseType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.UIInteractionResponseType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.UIInteractionResponseType$UIInteractionResponseTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class UIInteractionResponseType extends Enum implements Internal$EnumLite	// class@001074
{
    public final int value;
    public static final UIInteractionResponseType[] $VALUES;
    public static final UIInteractionResponseType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final UIInteractionResponseType kResponseNone;
    public static final UIInteractionResponseType kResponseTouchBegin;
    public static final UIInteractionResponseType kResponseTouchEnd;
    public static final UIInteractionResponseType kResponseTouchMoved;

    static {
       UIInteractionResponseType uIInteractio = new UIInteractionResponseType("kResponseNone", 0, 0);
       UIInteractionResponseType.kResponseNone = uIInteractio;
       UIInteractionResponseType uIInteractio1 = new UIInteractionResponseType("kResponseTouchBegin", 1, 1);
       UIInteractionResponseType.kResponseTouchBegin = uIInteractio1;
       UIInteractionResponseType uIInteractio2 = new UIInteractionResponseType("kResponseTouchMoved", 2, 2);
       UIInteractionResponseType.kResponseTouchMoved = uIInteractio2;
       UIInteractionResponseType uIInteractio3 = new UIInteractionResponseType("kResponseTouchEnd", 3, 3);
       UIInteractionResponseType.kResponseTouchEnd = uIInteractio3;
       UIInteractionResponseType uIInteractio4 = new UIInteractionResponseType("UNRECOGNIZED", 4, -1);
       UIInteractionResponseType.UNRECOGNIZED = uIInteractio4;
       UIInteractionResponseType[] uIInteractio5 = new UIInteractionResponseType[]{uIInteractio,uIInteractio1,uIInteractio2,uIInteractio3,uIInteractio4};
       UIInteractionResponseType.$VALUES = uIInteractio5;
       UIInteractionResponseType.internalValueMap = new UIInteractionResponseType$1();
    }
    public void UIInteractionResponseType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static UIInteractionResponseType forNumber(int p0){
       if (!p0) {
          return UIInteractionResponseType.kResponseNone;
       }
       if (p0 == 1) {
          return UIInteractionResponseType.kResponseTouchBegin;
       }
       if (p0 == 2) {
          return UIInteractionResponseType.kResponseTouchMoved;
       }
       if (p0 != 3) {
          return null;
       }
       return UIInteractionResponseType.kResponseTouchEnd;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return UIInteractionResponseType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return UIInteractionResponseType$UIInteractionResponseTypeVerifier.INSTANCE;
    }
    public static UIInteractionResponseType valueOf(int p0){
       return UIInteractionResponseType.forNumber(p0);
    }
    public static UIInteractionResponseType valueOf(String p0){
       return Enum.valueOf(UIInteractionResponseType.class, p0);
    }
    public static UIInteractionResponseType[] values(){
       return UIInteractionResponseType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != UIInteractionResponseType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
