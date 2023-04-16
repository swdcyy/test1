package com.samsung.android.sdk.camera.SCaptureRequest$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.samsung.android.sdk.camera.SCaptureRequest;
import android.hardware.camera2.CaptureRequest;

public final class SCaptureRequest$a implements Parcelable$Creator	// class@000b76
{

    public void SCaptureRequest$a(){
       super();
    }
    public SCaptureRequest a(Parcel p0){
       return new SCaptureRequest(CaptureRequest.CREATOR.createFromParcel(p0));
    }
    public SCaptureRequest[] b(int p0){
       SCaptureRequest[] sCaptureRequ = new SCaptureRequest[p0];
       return sCaptureRequ;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
