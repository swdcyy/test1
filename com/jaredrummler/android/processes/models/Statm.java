package com.jaredrummler.android.processes.models.Statm;
import com.jaredrummler.android.processes.models.ProcFile;
import com.jaredrummler.android.processes.models.Statm$a;
import android.os.Parcel;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;

public final class Statm extends ProcFile	// class@0006e5
{
    public final String[] fields;
    public static final Parcelable$Creator CREATOR;

    static {
       Statm.CREATOR = new Statm$a();
    }
    public void Statm(Parcel p0){
       super(p0);
       this.fields = p0.createStringArray();
    }
    public void Statm(Parcel p0,Statm$a p1){
       super(p0);
    }
    public void Statm(String p0){
       super(p0);
       this.fields = (this.content).split("\\s+");
    }
    public static Statm get(int p0){
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       return new Statm(String.format("/proc/%d/statm", objArray));
    }
    public long getResidentSetSize(){
       return (Long.parseLong(this.fields[1]) * 1024);
    }
    public long getSize(){
       return (Long.parseLong(this.fields[0]) * 1024);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeStringArray(this.fields);
    }
}
