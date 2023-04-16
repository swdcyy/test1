package com.kwai.sdk.eve.proto.ImageType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.sdk.eve.proto.ImageType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.sdk.eve.proto.ImageType$ImageTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class ImageType extends Enum implements Internal$EnumLite	// class@0015f0
{
    public final int value;
    public static final ImageType[] $VALUES;
    public static final ImageType HORIZONTAL;
    public static final ImageType SINGLE;
    public static final ImageType UNKNOWN2;
    public static final ImageType UNRECOGNIZED;
    public static final ImageType VERTICAL;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       ImageType imageType = new ImageType("UNKNOWN2", 0, 0);
       ImageType.UNKNOWN2 = imageType;
       ImageType imageType1 = new ImageType("HORIZONTAL", 1, 1);
       ImageType.HORIZONTAL = imageType1;
       ImageType imageType2 = new ImageType("VERTICAL", 2, 2);
       ImageType.VERTICAL = imageType2;
       ImageType imageType3 = new ImageType("SINGLE", 3, 3);
       ImageType.SINGLE = imageType3;
       ImageType imageType4 = new ImageType("UNRECOGNIZED", 4, -1);
       ImageType.UNRECOGNIZED = imageType4;
       ImageType[] imageTypeArr = new ImageType[]{imageType,imageType1,imageType2,imageType3,imageType4};
       ImageType.$VALUES = imageTypeArr;
       ImageType.internalValueMap = new ImageType$1();
    }
    public void ImageType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ImageType forNumber(int p0){
       if (!p0) {
          return ImageType.UNKNOWN2;
       }
       if (p0 == 1) {
          return ImageType.HORIZONTAL;
       }
       if (p0 == 2) {
          return ImageType.VERTICAL;
       }
       if (p0 != 3) {
          return null;
       }
       return ImageType.SINGLE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return ImageType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return ImageType$ImageTypeVerifier.INSTANCE;
    }
    public static ImageType valueOf(int p0){
       return ImageType.forNumber(p0);
    }
    public static ImageType valueOf(String p0){
       return Enum.valueOf(ImageType.class, p0);
    }
    public static ImageType[] values(){
       return ImageType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != ImageType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
