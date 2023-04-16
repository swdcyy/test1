package com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtMusicStatus;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtMusicStatus$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtMusicStatus$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StreamSoundHound$RtMusicStatus extends Enum implements Internal$EnumLite	// class@000dcc
{
    public final int value;
    public static final StreamSoundHound$RtMusicStatus[] $VALUES;
    public static final StreamSoundHound$RtMusicStatus MUSIC_RUNNUNG;
    public static final StreamSoundHound$RtMusicStatus MUSIC_STOPPED;
    public static final StreamSoundHound$RtMusicStatus MUSIC_UNKNOWN;
    public static final StreamSoundHound$RtMusicStatus UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StreamSoundHound$RtMusicStatus rtMusicStatu = new StreamSoundHound$RtMusicStatus("MUSIC_UNKNOWN", 0, 0);
       StreamSoundHound$RtMusicStatus.MUSIC_UNKNOWN = rtMusicStatu;
       StreamSoundHound$RtMusicStatus rtMusicStatu1 = new StreamSoundHound$RtMusicStatus("MUSIC_RUNNUNG", 1, 1);
       StreamSoundHound$RtMusicStatus.MUSIC_RUNNUNG = rtMusicStatu1;
       StreamSoundHound$RtMusicStatus rtMusicStatu2 = new StreamSoundHound$RtMusicStatus("MUSIC_STOPPED", 2, 2);
       StreamSoundHound$RtMusicStatus.MUSIC_STOPPED = rtMusicStatu2;
       StreamSoundHound$RtMusicStatus rtMusicStatu3 = new StreamSoundHound$RtMusicStatus("UNRECOGNIZED", 3, -1);
       StreamSoundHound$RtMusicStatus.UNRECOGNIZED = rtMusicStatu3;
       StreamSoundHound$RtMusicStatus[] rtMusicStatu4 = new StreamSoundHound$RtMusicStatus[]{rtMusicStatu,rtMusicStatu1,rtMusicStatu2,rtMusicStatu3};
       StreamSoundHound$RtMusicStatus.$VALUES = rtMusicStatu4;
       StreamSoundHound$RtMusicStatus.internalValueMap = new StreamSoundHound$RtMusicStatus$a();
    }
    public void StreamSoundHound$RtMusicStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StreamSoundHound$RtMusicStatus forNumber(int p0){
       if (!p0) {
          return StreamSoundHound$RtMusicStatus.MUSIC_UNKNOWN;
       }
       if (p0 == 1) {
          return StreamSoundHound$RtMusicStatus.MUSIC_RUNNUNG;
       }
       if (p0 != 2) {
          return null;
       }
       return StreamSoundHound$RtMusicStatus.MUSIC_STOPPED;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StreamSoundHound$RtMusicStatus.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StreamSoundHound$RtMusicStatus$b.a;
    }
    public static StreamSoundHound$RtMusicStatus valueOf(int p0){
       return StreamSoundHound$RtMusicStatus.forNumber(p0);
    }
    public static StreamSoundHound$RtMusicStatus valueOf(String p0){
       return Enum.valueOf(StreamSoundHound$RtMusicStatus.class, p0);
    }
    public static StreamSoundHound$RtMusicStatus[] values(){
       return StreamSoundHound$RtMusicStatus.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StreamSoundHound$RtMusicStatus.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
