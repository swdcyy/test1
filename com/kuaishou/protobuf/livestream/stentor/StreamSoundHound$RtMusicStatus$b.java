package com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtMusicStatus$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtMusicStatus;

public final class StreamSoundHound$RtMusicStatus$b implements Internal$EnumVerifier	// class@000dcb
{
    public static final Internal$EnumVerifier a;

    static {
       StreamSoundHound$RtMusicStatus$b.a = new StreamSoundHound$RtMusicStatus$b();
    }
    public void StreamSoundHound$RtMusicStatus$b(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (StreamSoundHound$RtMusicStatus.forNumber(p0) != null)? true: false;
       return b;
    }
}
