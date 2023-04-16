package com.jaredrummler.android.processes.models.Cgroup$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.jaredrummler.android.processes.models.Cgroup;

public final class Cgroup$a implements Parcelable$Creator	// class@0006dc
{

    public void Cgroup$a(){
       super();
    }
    public Cgroup a(Parcel p0){
       return new Cgroup(p0, null);
    }
    public Cgroup[] b(int p0){
       Cgroup[] uCgroupArray = new Cgroup[p0];
       return uCgroupArray;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
