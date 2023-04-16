package com.kwai.sdk.eve.proto.PlayEvent$LiveWatchStatus;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.sdk.eve.proto.PlayEvent$LiveWatchStatus$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.sdk.eve.proto.PlayEvent$LiveWatchStatus$LiveWatchStatusVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class PlayEvent$LiveWatchStatus extends Enum implements Internal$EnumLite	// class@0015ff
{
    public final int value;
    public static final PlayEvent$LiveWatchStatus[] $VALUES;
    public static final PlayEvent$LiveWatchStatus LIVE_NOT_WATCHED;
    public static final PlayEvent$LiveWatchStatus LIVE_WATCHED;
    public static final PlayEvent$LiveWatchStatus UNKNOWN;
    public static final PlayEvent$LiveWatchStatus UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       PlayEvent$LiveWatchStatus liveWatchSta = new PlayEvent$LiveWatchStatus("UNKNOWN", 0, 0);
       PlayEvent$LiveWatchStatus.UNKNOWN = liveWatchSta;
       PlayEvent$LiveWatchStatus liveWatchSta1 = new PlayEvent$LiveWatchStatus("LIVE_NOT_WATCHED", 1, 1);
       PlayEvent$LiveWatchStatus.LIVE_NOT_WATCHED = liveWatchSta1;
       PlayEvent$LiveWatchStatus liveWatchSta2 = new PlayEvent$LiveWatchStatus("LIVE_WATCHED", 2, 2);
       PlayEvent$LiveWatchStatus.LIVE_WATCHED = liveWatchSta2;
       PlayEvent$LiveWatchStatus liveWatchSta3 = new PlayEvent$LiveWatchStatus("UNRECOGNIZED", 3, -1);
       PlayEvent$LiveWatchStatus.UNRECOGNIZED = liveWatchSta3;
       PlayEvent$LiveWatchStatus[] liveWatchSta4 = new PlayEvent$LiveWatchStatus[]{liveWatchSta,liveWatchSta1,liveWatchSta2,liveWatchSta3};
       PlayEvent$LiveWatchStatus.$VALUES = liveWatchSta4;
       PlayEvent$LiveWatchStatus.internalValueMap = new PlayEvent$LiveWatchStatus$1();
    }
    public void PlayEvent$LiveWatchStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static PlayEvent$LiveWatchStatus forNumber(int p0){
       if (!p0) {
          return PlayEvent$LiveWatchStatus.UNKNOWN;
       }
       if (p0 == 1) {
          return PlayEvent$LiveWatchStatus.LIVE_NOT_WATCHED;
       }
       if (p0 != 2) {
          return null;
       }
       return PlayEvent$LiveWatchStatus.LIVE_WATCHED;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return PlayEvent$LiveWatchStatus.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return PlayEvent$LiveWatchStatus$LiveWatchStatusVerifier.INSTANCE;
    }
    public static PlayEvent$LiveWatchStatus valueOf(int p0){
       return PlayEvent$LiveWatchStatus.forNumber(p0);
    }
    public static PlayEvent$LiveWatchStatus valueOf(String p0){
       return Enum.valueOf(PlayEvent$LiveWatchStatus.class, p0);
    }
    public static PlayEvent$LiveWatchStatus[] values(){
       return PlayEvent$LiveWatchStatus.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != PlayEvent$LiveWatchStatus.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
