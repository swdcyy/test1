package com.jaredrummler.android.processes.models.Stat$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.jaredrummler.android.processes.models.Stat;

public final class Stat$a implements Parcelable$Creator	// class@0006e2
{

    public void Stat$a(){
       super();
    }
    public Stat a(Parcel p0){
       return new Stat(p0, null);
    }
    public Stat[] b(int p0){
       Stat[] statArray = new Stat[p0];
       return statArray;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
