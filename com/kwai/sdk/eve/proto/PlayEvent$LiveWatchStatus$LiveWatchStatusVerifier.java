package com.kwai.sdk.eve.proto.PlayEvent$LiveWatchStatus$LiveWatchStatusVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.sdk.eve.proto.PlayEvent$LiveWatchStatus;

public final class PlayEvent$LiveWatchStatus$LiveWatchStatusVerifier implements Internal$EnumVerifier	// class@0015fe
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       PlayEvent$LiveWatchStatus$LiveWatchStatusVerifier.INSTANCE = new PlayEvent$LiveWatchStatus$LiveWatchStatusVerifier();
    }
    public void PlayEvent$LiveWatchStatus$LiveWatchStatusVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (PlayEvent$LiveWatchStatus.forNumber(p0) != null)? true: false;
       return b;
    }
}
