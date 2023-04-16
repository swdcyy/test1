package com.jaredrummler.android.processes.models.AndroidProcess$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.jaredrummler.android.processes.models.AndroidProcess;

public final class AndroidProcess$a implements Parcelable$Creator	// class@0006da
{

    public void AndroidProcess$a(){
       super();
    }
    public AndroidProcess a(Parcel p0){
       return new AndroidProcess(p0);
    }
    public AndroidProcess[] b(int p0){
       AndroidProcess[] uAndroidProc = new AndroidProcess[p0];
       return uAndroidProc;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
