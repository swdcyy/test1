package com.kwai.video.westeros.models.PickingMediaResType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.PickingMediaResType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.PickingMediaResType$PickingMediaResTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class PickingMediaResType extends Enum implements Internal$EnumLite	// class@001001
{
    public final int value;
    public static final PickingMediaResType[] $VALUES;
    public static final PickingMediaResType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final PickingMediaResType kPickingImage;
    public static final PickingMediaResType kPickingImageOrVideo;
    public static final PickingMediaResType kPickingVideo;

    static {
       PickingMediaResType pickingMedia = new PickingMediaResType("kPickingImage", 0, 0);
       PickingMediaResType.kPickingImage = pickingMedia;
       PickingMediaResType pickingMedia1 = new PickingMediaResType("kPickingVideo", 1, 1);
       PickingMediaResType.kPickingVideo = pickingMedia1;
       PickingMediaResType pickingMedia2 = new PickingMediaResType("kPickingImageOrVideo", 2, 2);
       PickingMediaResType.kPickingImageOrVideo = pickingMedia2;
       PickingMediaResType pickingMedia3 = new PickingMediaResType("UNRECOGNIZED", 3, -1);
       PickingMediaResType.UNRECOGNIZED = pickingMedia3;
       PickingMediaResType[] pickingMedia4 = new PickingMediaResType[]{pickingMedia,pickingMedia1,pickingMedia2,pickingMedia3};
       PickingMediaResType.$VALUES = pickingMedia4;
       PickingMediaResType.internalValueMap = new PickingMediaResType$1();
    }
    public void PickingMediaResType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static PickingMediaResType forNumber(int p0){
       if (!p0) {
          return PickingMediaResType.kPickingImage;
       }
       if (p0 == 1) {
          return PickingMediaResType.kPickingVideo;
       }
       if (p0 != 2) {
          return null;
       }
       return PickingMediaResType.kPickingImageOrVideo;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return PickingMediaResType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return PickingMediaResType$PickingMediaResTypeVerifier.INSTANCE;
    }
    public static PickingMediaResType valueOf(int p0){
       return PickingMediaResType.forNumber(p0);
    }
    public static PickingMediaResType valueOf(String p0){
       return Enum.valueOf(PickingMediaResType.class, p0);
    }
    public static PickingMediaResType[] values(){
       return PickingMediaResType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != PickingMediaResType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
