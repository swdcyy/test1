package com.kuaishou.protobuf.livestream.stentor.StentorMMU$PKActionType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$PKActionType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$PKActionType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$PKActionType extends Enum implements Internal$EnumLite	// class@000d92
{
    public final int value;
    public static final StentorMMU$PKActionType[] $VALUES;
    public static final StentorMMU$PKActionType PK_ACTION_TYPE_UNKNOWN;
    public static final StentorMMU$PKActionType PK_FRIEND;
    public static final StentorMMU$PKActionType PK_RANDOM;
    public static final StentorMMU$PKActionType PK_SAME_CITY;
    public static final StentorMMU$PKActionType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$PKActionType pKActionType = new StentorMMU$PKActionType("PK_ACTION_TYPE_UNKNOWN", 0, 0);
       StentorMMU$PKActionType.PK_ACTION_TYPE_UNKNOWN = pKActionType;
       StentorMMU$PKActionType pKActionType1 = new StentorMMU$PKActionType("PK_SAME_CITY", 1, 1);
       StentorMMU$PKActionType.PK_SAME_CITY = pKActionType1;
       StentorMMU$PKActionType pKActionType2 = new StentorMMU$PKActionType("PK_RANDOM", 2, 2);
       StentorMMU$PKActionType.PK_RANDOM = pKActionType2;
       StentorMMU$PKActionType pKActionType3 = new StentorMMU$PKActionType("PK_FRIEND", 3, 3);
       StentorMMU$PKActionType.PK_FRIEND = pKActionType3;
       StentorMMU$PKActionType pKActionType4 = new StentorMMU$PKActionType("UNRECOGNIZED", 4, -1);
       StentorMMU$PKActionType.UNRECOGNIZED = pKActionType4;
       StentorMMU$PKActionType[] pKActionType5 = new StentorMMU$PKActionType[]{pKActionType,pKActionType1,pKActionType2,pKActionType3,pKActionType4};
       StentorMMU$PKActionType.$VALUES = pKActionType5;
       StentorMMU$PKActionType.internalValueMap = new StentorMMU$PKActionType$a();
    }
    public void StentorMMU$PKActionType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$PKActionType forNumber(int p0){
       if (!p0) {
          return StentorMMU$PKActionType.PK_ACTION_TYPE_UNKNOWN;
       }
       if (p0 == 1) {
          return StentorMMU$PKActionType.PK_SAME_CITY;
       }
       if (p0 == 2) {
          return StentorMMU$PKActionType.PK_RANDOM;
       }
       if (p0 != 3) {
          return null;
       }
       return StentorMMU$PKActionType.PK_FRIEND;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$PKActionType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$PKActionType$b.a;
    }
    public static StentorMMU$PKActionType valueOf(int p0){
       return StentorMMU$PKActionType.forNumber(p0);
    }
    public static StentorMMU$PKActionType valueOf(String p0){
       return Enum.valueOf(StentorMMU$PKActionType.class, p0);
    }
    public static StentorMMU$PKActionType[] values(){
       return StentorMMU$PKActionType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$PKActionType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
