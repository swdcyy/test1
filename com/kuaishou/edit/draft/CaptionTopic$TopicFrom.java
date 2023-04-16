package com.kuaishou.edit.draft.CaptionTopic$TopicFrom;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.CaptionTopic$TopicFrom$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.CaptionTopic$TopicFrom$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class CaptionTopic$TopicFrom extends Enum implements Internal$EnumLite	// class@001744
{
    public final int value;
    public static final CaptionTopic$TopicFrom[] $VALUES;
    public static final CaptionTopic$TopicFrom Autotake;
    public static final CaptionTopic$TopicFrom FROM_UNKNOWN;
    public static final CaptionTopic$TopicFrom HISTORY;
    public static final CaptionTopic$TopicFrom IMPORT;
    public static final CaptionTopic$TopicFrom More;
    public static final CaptionTopic$TopicFrom RECOMMEND;
    public static final CaptionTopic$TopicFrom SEARCH;
    public static final CaptionTopic$TopicFrom UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       CaptionTopic$TopicFrom topicFrom = new CaptionTopic$TopicFrom("FROM_UNKNOWN", 0, 0);
       CaptionTopic$TopicFrom.FROM_UNKNOWN = topicFrom;
       CaptionTopic$TopicFrom topicFrom1 = new CaptionTopic$TopicFrom("IMPORT", 1, 1);
       CaptionTopic$TopicFrom.IMPORT = topicFrom1;
       CaptionTopic$TopicFrom topicFrom2 = new CaptionTopic$TopicFrom("SEARCH", 2, 2);
       CaptionTopic$TopicFrom.SEARCH = topicFrom2;
       CaptionTopic$TopicFrom topicFrom3 = new CaptionTopic$TopicFrom("RECOMMEND", 3, 3);
       CaptionTopic$TopicFrom.RECOMMEND = topicFrom3;
       CaptionTopic$TopicFrom topicFrom4 = new CaptionTopic$TopicFrom("HISTORY", 4, 4);
       CaptionTopic$TopicFrom.HISTORY = topicFrom4;
       CaptionTopic$TopicFrom topicFrom5 = new CaptionTopic$TopicFrom("Autotake", 5, 5);
       CaptionTopic$TopicFrom.Autotake = topicFrom5;
       CaptionTopic$TopicFrom topicFrom6 = new CaptionTopic$TopicFrom("More", 6, 6);
       CaptionTopic$TopicFrom.More = topicFrom6;
       CaptionTopic$TopicFrom topicFrom7 = new CaptionTopic$TopicFrom("UNRECOGNIZED", 7, -1);
       CaptionTopic$TopicFrom.UNRECOGNIZED = topicFrom7;
       CaptionTopic$TopicFrom[] topicFromArr = new CaptionTopic$TopicFrom[]{topicFrom,topicFrom1,topicFrom2,topicFrom3,topicFrom4,topicFrom5,topicFrom6,topicFrom7};
       CaptionTopic$TopicFrom.$VALUES = topicFromArr;
       CaptionTopic$TopicFrom.internalValueMap = new CaptionTopic$TopicFrom$a();
    }
    public void CaptionTopic$TopicFrom(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static CaptionTopic$TopicFrom forNumber(int p0){
       switch (p0){
           case 0:
             return CaptionTopic$TopicFrom.FROM_UNKNOWN;
           case 1:
             return CaptionTopic$TopicFrom.IMPORT;
           case 2:
             return CaptionTopic$TopicFrom.SEARCH;
           case 3:
             return CaptionTopic$TopicFrom.RECOMMEND;
           case 4:
             return CaptionTopic$TopicFrom.HISTORY;
           case 5:
             return CaptionTopic$TopicFrom.Autotake;
           case 6:
             return CaptionTopic$TopicFrom.More;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return CaptionTopic$TopicFrom.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return CaptionTopic$TopicFrom$b.a;
    }
    public static CaptionTopic$TopicFrom valueOf(int p0){
       return CaptionTopic$TopicFrom.forNumber(p0);
    }
    public static CaptionTopic$TopicFrom valueOf(String p0){
       return Enum.valueOf(CaptionTopic$TopicFrom.class, p0);
    }
    public static CaptionTopic$TopicFrom[] values(){
       return CaptionTopic$TopicFrom.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != CaptionTopic$TopicFrom.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
