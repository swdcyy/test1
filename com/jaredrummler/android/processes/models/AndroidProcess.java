package com.jaredrummler.android.processes.models.AndroidProcess;
import android.os.Parcelable;
import com.jaredrummler.android.processes.models.AndroidProcess$a;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import java.lang.Integer;
import com.jaredrummler.android.processes.models.ProcFile;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.jaredrummler.android.processes.models.Stat;
import com.jaredrummler.android.processes.models.Cgroup;
import com.jaredrummler.android.processes.models.Status;

public class AndroidProcess implements Parcelable	// class@0006db
{
    public final String b;
    public final int c;
    public static final Parcelable$Creator CREATOR;

    static {
       AndroidProcess.CREATOR = new AndroidProcess$a();
    }
    public void AndroidProcess(int p0){
       super();
       this.c = p0;
       this.b = AndroidProcess.b(p0);
    }
    public void AndroidProcess(Parcel p0){
       super();
       this.b = p0.readString();
       this.c = p0.readInt();
    }
    public static String b(int p0){
       String str;
       try{
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          str = (ProcFile.readFile(String.format("/proc/%d/cmdline", objArray))).trim();
       }catch(java.io.IOException e0){
          str = null;
       }
       if (TextUtils.isEmpty(str)) {
          return Stat.get(p0).getComm();
       }
       return str;
    }
    public Cgroup a(){
       return Cgroup.get(this.c);
    }
    public Stat c(){
       return Stat.get(this.c);
    }
    public Status d(){
       return Status.get(this.c);
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.b);
       p0.writeInt(this.c);
    }
}
