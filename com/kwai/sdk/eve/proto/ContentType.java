package com.kwai.sdk.eve.proto.ContentType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.sdk.eve.proto.ContentType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.sdk.eve.proto.ContentType$ContentTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class ContentType extends Enum implements Internal$EnumLite	// class@0015e4
{
    public final int value;
    public static final ContentType[] $VALUES;
    public static final ContentType LIVE;
    public static final ContentType PHOTO;
    public static final ContentType UNKNOWN1;
    public static final ContentType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       ContentType uContentType = new ContentType("UNKNOWN1", 0, 0);
       ContentType.UNKNOWN1 = uContentType;
       ContentType uContentType1 = new ContentType("PHOTO", 1, 1);
       ContentType.PHOTO = uContentType1;
       ContentType uContentType2 = new ContentType("LIVE", 2, 2);
       ContentType.LIVE = uContentType2;
       ContentType uContentType3 = new ContentType("UNRECOGNIZED", 3, -1);
       ContentType.UNRECOGNIZED = uContentType3;
       ContentType[] uContentType4 = new ContentType[]{uContentType,uContentType1,uContentType2,uContentType3};
       ContentType.$VALUES = uContentType4;
       ContentType.internalValueMap = new ContentType$1();
    }
    public void ContentType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ContentType forNumber(int p0){
       if (!p0) {
          return ContentType.UNKNOWN1;
       }
       if (p0 == 1) {
          return ContentType.PHOTO;
       }
       if (p0 != 2) {
          return null;
       }
       return ContentType.LIVE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return ContentType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return ContentType$ContentTypeVerifier.INSTANCE;
    }
    public static ContentType valueOf(int p0){
       return ContentType.forNumber(p0);
    }
    public static ContentType valueOf(String p0){
       return Enum.valueOf(ContentType.class, p0);
    }
    public static ContentType[] values(){
       return ContentType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != ContentType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
