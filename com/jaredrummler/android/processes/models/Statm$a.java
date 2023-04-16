package com.jaredrummler.android.processes.models.Statm$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.jaredrummler.android.processes.models.Statm;

public final class Statm$a implements Parcelable$Creator	// class@0006e4
{

    public void Statm$a(){
       super();
    }
    public Statm a(Parcel p0){
       return new Statm(p0, null);
    }
    public Statm[] b(int p0){
       Statm[] statmArray = new Statm[p0];
       return statmArray;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
