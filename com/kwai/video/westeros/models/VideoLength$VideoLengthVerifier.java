package com.kwai.video.westeros.models.VideoLength$VideoLengthVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.VideoLength;

public final class VideoLength$VideoLengthVerifier implements Internal$EnumVerifier	// class@001088
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       VideoLength$VideoLengthVerifier.INSTANCE = new VideoLength$VideoLengthVerifier();
    }
    public void VideoLength$VideoLengthVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (VideoLength.forNumber(p0) != null)? true: false;
       return b;
    }
}
