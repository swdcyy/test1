package com.jaredrummler.android.processes.models.AndroidAppProcess$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.jaredrummler.android.processes.models.AndroidAppProcess;

public final class AndroidAppProcess$a implements Parcelable$Creator	// class@0006d8
{

    public void AndroidAppProcess$a(){
       super();
    }
    public AndroidAppProcess a(Parcel p0){
       return new AndroidAppProcess(p0);
    }
    public AndroidAppProcess[] b(int p0){
       AndroidAppProcess[] uAndroidAppP = new AndroidAppProcess[p0];
       return uAndroidAppP;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
