package com.jaredrummler.android.processes.models.ProcFile$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.jaredrummler.android.processes.models.ProcFile;

public final class ProcFile$a implements Parcelable$Creator	// class@0006e0
{

    public void ProcFile$a(){
       super();
    }
    public ProcFile a(Parcel p0){
       return new ProcFile(p0);
    }
    public ProcFile[] b(int p0){
       ProcFile[] procFileArra = new ProcFile[p0];
       return procFileArra;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
