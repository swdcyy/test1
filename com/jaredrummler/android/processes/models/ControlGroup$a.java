package com.jaredrummler.android.processes.models.ControlGroup$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.jaredrummler.android.processes.models.ControlGroup;

public final class ControlGroup$a implements Parcelable$Creator	// class@0006de
{

    public void ControlGroup$a(){
       super();
    }
    public ControlGroup a(Parcel p0){
       return new ControlGroup(p0);
    }
    public ControlGroup[] b(int p0){
       ControlGroup[] uControlGrou = new ControlGroup[p0];
       return uControlGrou;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
