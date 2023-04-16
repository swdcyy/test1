package com.kuaishou.edit.draft.CaptionTopic$TopicType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.CaptionTopic$TopicType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.CaptionTopic$TopicType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class CaptionTopic$TopicType extends Enum implements Internal$EnumLite	// class@001747
{
    public final int value;
    public static final CaptionTopic$TopicType[] $VALUES;
    public static final CaptionTopic$TopicType ADMIN;
    public static final CaptionTopic$TopicType FILM_CARD;
    public static final CaptionTopic$TopicType NORMAL;
    public static final CaptionTopic$TopicType UNRECOGNIZED;
    public static final CaptionTopic$TopicType WORTHLESS;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       CaptionTopic$TopicType topicType = new CaptionTopic$TopicType("NORMAL", 0, 0);
       CaptionTopic$TopicType.NORMAL = topicType;
       CaptionTopic$TopicType topicType1 = new CaptionTopic$TopicType("ADMIN", 1, 1);
       CaptionTopic$TopicType.ADMIN = topicType1;
       CaptionTopic$TopicType topicType2 = new CaptionTopic$TopicType("WORTHLESS", 2, 2);
       CaptionTopic$TopicType.WORTHLESS = topicType2;
       CaptionTopic$TopicType topicType3 = new CaptionTopic$TopicType("FILM_CARD", 3, 3);
       CaptionTopic$TopicType.FILM_CARD = topicType3;
       CaptionTopic$TopicType topicType4 = new CaptionTopic$TopicType("UNRECOGNIZED", 4, -1);
       CaptionTopic$TopicType.UNRECOGNIZED = topicType4;
       CaptionTopic$TopicType[] topicTypeArr = new CaptionTopic$TopicType[]{topicType,topicType1,topicType2,topicType3,topicType4};
       CaptionTopic$TopicType.$VALUES = topicTypeArr;
       CaptionTopic$TopicType.internalValueMap = new CaptionTopic$TopicType$a();
    }
    public void CaptionTopic$TopicType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static CaptionTopic$TopicType forNumber(int p0){
       if (!p0) {
          return CaptionTopic$TopicType.NORMAL;
       }
       if (p0 == 1) {
          return CaptionTopic$TopicType.ADMIN;
       }
       if (p0 == 2) {
          return CaptionTopic$TopicType.WORTHLESS;
       }
       if (p0 != 3) {
          return null;
       }
       return CaptionTopic$TopicType.FILM_CARD;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return CaptionTopic$TopicType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return CaptionTopic$TopicType$b.a;
    }
    public static CaptionTopic$TopicType valueOf(int p0){
       return CaptionTopic$TopicType.forNumber(p0);
    }
    public static CaptionTopic$TopicType valueOf(String p0){
       return Enum.valueOf(CaptionTopic$TopicType.class, p0);
    }
    public static CaptionTopic$TopicType[] values(){
       return CaptionTopic$TopicType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != CaptionTopic$TopicType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
