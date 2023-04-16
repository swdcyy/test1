package com.kwai.video.westeros.models.FaceDetectMode$FaceDetectModeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.FaceDetectMode;

public final class FaceDetectMode$FaceDetectModeVerifier implements Internal$EnumVerifier	// class@000f61
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       FaceDetectMode$FaceDetectModeVerifier.INSTANCE = new FaceDetectMode$FaceDetectModeVerifier();
    }
    public void FaceDetectMode$FaceDetectModeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (FaceDetectMode.forNumber(p0) != null)? true: false;
       return b;
    }
}
