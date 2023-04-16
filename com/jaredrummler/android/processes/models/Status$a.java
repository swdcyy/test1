package com.jaredrummler.android.processes.models.Status$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.jaredrummler.android.processes.models.Status;

public final class Status$a implements Parcelable$Creator	// class@0006e6
{

    public void Status$a(){
       super();
    }
    public Status a(Parcel p0){
       return new Status(p0, null);
    }
    public Status[] b(int p0){
       Status[] statusArray = new Status[p0];
       return statusArray;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
