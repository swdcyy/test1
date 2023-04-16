package com.kwai.video.westeros.models.NeedPickMediaType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.NeedPickMediaType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.NeedPickMediaType$NeedPickMediaTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class NeedPickMediaType extends Enum implements Internal$EnumLite	// class@000fea
{
    public final int value;
    public static final NeedPickMediaType[] $VALUES;
    public static final NeedPickMediaType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final NeedPickMediaType kNeedNotPickMedia;
    public static final NeedPickMediaType kNeedPickImage;
    public static final NeedPickMediaType kNeedPickVideo;

    static {
       NeedPickMediaType needPickMedi = new NeedPickMediaType("kNeedNotPickMedia", 0, 0);
       NeedPickMediaType.kNeedNotPickMedia = needPickMedi;
       NeedPickMediaType needPickMedi1 = new NeedPickMediaType("kNeedPickImage", 1, 1);
       NeedPickMediaType.kNeedPickImage = needPickMedi1;
       NeedPickMediaType needPickMedi2 = new NeedPickMediaType("kNeedPickVideo", 2, 2);
       NeedPickMediaType.kNeedPickVideo = needPickMedi2;
       NeedPickMediaType needPickMedi3 = new NeedPickMediaType("UNRECOGNIZED", 3, -1);
       NeedPickMediaType.UNRECOGNIZED = needPickMedi3;
       NeedPickMediaType[] needPickMedi4 = new NeedPickMediaType[]{needPickMedi,needPickMedi1,needPickMedi2,needPickMedi3};
       NeedPickMediaType.$VALUES = needPickMedi4;
       NeedPickMediaType.internalValueMap = new NeedPickMediaType$1();
    }
    public void NeedPickMediaType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static NeedPickMediaType forNumber(int p0){
       if (!p0) {
          return NeedPickMediaType.kNeedNotPickMedia;
       }
       if (p0 == 1) {
          return NeedPickMediaType.kNeedPickImage;
       }
       if (p0 != 2) {
          return null;
       }
       return NeedPickMediaType.kNeedPickVideo;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return NeedPickMediaType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return NeedPickMediaType$NeedPickMediaTypeVerifier.INSTANCE;
    }
    public static NeedPickMediaType valueOf(int p0){
       return NeedPickMediaType.forNumber(p0);
    }
    public static NeedPickMediaType valueOf(String p0){
       return Enum.valueOf(NeedPickMediaType.class, p0);
    }
    public static NeedPickMediaType[] values(){
       return NeedPickMediaType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != NeedPickMediaType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
