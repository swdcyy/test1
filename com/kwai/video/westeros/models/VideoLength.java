package com.kwai.video.westeros.models.VideoLength;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.VideoLength$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.VideoLength$VideoLengthVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class VideoLength extends Enum implements Internal$EnumLite	// class@001089
{
    public final int value;
    public static final VideoLength[] $VALUES;
    public static final VideoLength UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final VideoLength kVideoLengthDefault;
    public static final VideoLength kVideoLengthLong;
    public static final VideoLength kVideoLengthNormal;
    public static final VideoLength kVideolengthLongLong;

    static {
       VideoLength videoLength = new VideoLength("kVideoLengthDefault", 0, 0);
       VideoLength.kVideoLengthDefault = videoLength;
       VideoLength videoLength1 = new VideoLength("kVideoLengthNormal", 1, 1);
       VideoLength.kVideoLengthNormal = videoLength1;
       VideoLength videoLength2 = new VideoLength("kVideoLengthLong", 2, 2);
       VideoLength.kVideoLengthLong = videoLength2;
       VideoLength videoLength3 = new VideoLength("kVideolengthLongLong", 3, 3);
       VideoLength.kVideolengthLongLong = videoLength3;
       VideoLength videoLength4 = new VideoLength("UNRECOGNIZED", 4, -1);
       VideoLength.UNRECOGNIZED = videoLength4;
       VideoLength[] videoLengthA = new VideoLength[]{videoLength,videoLength1,videoLength2,videoLength3,videoLength4};
       VideoLength.$VALUES = videoLengthA;
       VideoLength.internalValueMap = new VideoLength$1();
    }
    public void VideoLength(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static VideoLength forNumber(int p0){
       if (!p0) {
          return VideoLength.kVideoLengthDefault;
       }
       if (p0 == 1) {
          return VideoLength.kVideoLengthNormal;
       }
       if (p0 == 2) {
          return VideoLength.kVideoLengthLong;
       }
       if (p0 != 3) {
          return null;
       }
       return VideoLength.kVideolengthLongLong;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return VideoLength.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return VideoLength$VideoLengthVerifier.INSTANCE;
    }
    public static VideoLength valueOf(int p0){
       return VideoLength.forNumber(p0);
    }
    public static VideoLength valueOf(String p0){
       return Enum.valueOf(VideoLength.class, p0);
    }
    public static VideoLength[] values(){
       return VideoLength.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != VideoLength.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
