package com.kwai.video.westeros.models.CameraFacing$CameraFacingVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.CameraFacing;

public final class CameraFacing$CameraFacingVerifier implements Internal$EnumVerifier	// class@000ee9
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       CameraFacing$CameraFacingVerifier.INSTANCE = new CameraFacing$CameraFacingVerifier();
    }
    public void CameraFacing$CameraFacingVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (CameraFacing.forNumber(p0) != null)? true: false;
       return b;
    }
}
