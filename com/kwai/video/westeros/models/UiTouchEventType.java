package com.kwai.video.westeros.models.UiTouchEventType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.UiTouchEventType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.UiTouchEventType$UiTouchEventTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class UiTouchEventType extends Enum implements Internal$EnumLite	// class@00107b
{
    public final int value;
    public static final UiTouchEventType[] $VALUES;
    public static final UiTouchEventType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final UiTouchEventType kResponseNone;
    public static final UiTouchEventType kResponseTouchBegin;
    public static final UiTouchEventType kResponseTouchEnd;
    public static final UiTouchEventType kResponseTouchMoved;

    static {
       UiTouchEventType uiTouchEvent = new UiTouchEventType("kResponseNone", 0, 0);
       UiTouchEventType.kResponseNone = uiTouchEvent;
       UiTouchEventType uiTouchEvent1 = new UiTouchEventType("kResponseTouchBegin", 1, 1);
       UiTouchEventType.kResponseTouchBegin = uiTouchEvent1;
       UiTouchEventType uiTouchEvent2 = new UiTouchEventType("kResponseTouchMoved", 2, 2);
       UiTouchEventType.kResponseTouchMoved = uiTouchEvent2;
       UiTouchEventType uiTouchEvent3 = new UiTouchEventType("kResponseTouchEnd", 3, 3);
       UiTouchEventType.kResponseTouchEnd = uiTouchEvent3;
       UiTouchEventType uiTouchEvent4 = new UiTouchEventType("UNRECOGNIZED", 4, -1);
       UiTouchEventType.UNRECOGNIZED = uiTouchEvent4;
       UiTouchEventType[] uiTouchEvent5 = new UiTouchEventType[]{uiTouchEvent,uiTouchEvent1,uiTouchEvent2,uiTouchEvent3,uiTouchEvent4};
       UiTouchEventType.$VALUES = uiTouchEvent5;
       UiTouchEventType.internalValueMap = new UiTouchEventType$1();
    }
    public void UiTouchEventType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static UiTouchEventType forNumber(int p0){
       if (!p0) {
          return UiTouchEventType.kResponseNone;
       }
       if (p0 == 1) {
          return UiTouchEventType.kResponseTouchBegin;
       }
       if (p0 == 2) {
          return UiTouchEventType.kResponseTouchMoved;
       }
       if (p0 != 3) {
          return null;
       }
       return UiTouchEventType.kResponseTouchEnd;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return UiTouchEventType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return UiTouchEventType$UiTouchEventTypeVerifier.INSTANCE;
    }
    public static UiTouchEventType valueOf(int p0){
       return UiTouchEventType.forNumber(p0);
    }
    public static UiTouchEventType valueOf(String p0){
       return Enum.valueOf(UiTouchEventType.class, p0);
    }
    public static UiTouchEventType[] values(){
       return UiTouchEventType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != UiTouchEventType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
