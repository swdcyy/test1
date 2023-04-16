package com.jaredrummler.android.processes.models.AndroidAppProcess;
import com.jaredrummler.android.processes.models.AndroidProcess;
import java.io.File;
import java.lang.String;
import com.jaredrummler.android.processes.models.AndroidAppProcess$a;
import com.jaredrummler.android.processes.models.Cgroup;
import com.jaredrummler.android.processes.models.ControlGroup;
import java.lang.CharSequence;
import java.lang.Integer;
import com.jaredrummler.android.processes.models.Status;
import java.lang.Object;
import java.lang.Boolean;
import en.a;
import com.jaredrummler.android.processes.models.AndroidAppProcess$NotAndroidAppProcessException;
import com.jaredrummler.android.processes.models.Stat;
import android.os.Parcel;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class AndroidAppProcess extends AndroidProcess	// class@0006d9
{
    public final boolean d;
    public final int e;
    public static final Parcelable$Creator CREATOR;
    public static final boolean f;

    static {
       AndroidAppProcess.f = new File("/dev/cpuctl/tasks").exists();
       AndroidAppProcess.CREATOR = new AndroidAppProcess$a();
    }
    public void AndroidAppProcess(int p0){
       boolean b;
       int i1;
       super(p0);
       AndroidProcess tb = this.b;
       if (tb == null || (!tb.matches("^\([\\p{L}]{1}[\\p{L}\\p{N}_]*[\\.:]\)*[\\p{L}][\\p{L}\\p{N}_]*$") || !new File("/data/data", this.f()).exists())) {
          throw new AndroidAppProcess$NotAndroidAppProcessException(p0);
       }
       int i = 4;
       if (AndroidAppProcess.f) {
          Cgroup uCgroup = this.a();
          ControlGroup group = uCgroup.getGroup("cpuacct");
          ControlGroup group1 = uCgroup.getGroup("cpu");
          if (group1 != null && (group != null && (group.d).contains("pid_"))) {
             b = (group1.d).contains("bg_non_interactive");
             try{
                b = b ^ 1;
                i1 = Integer.parseInt(((group.d).split("/")[1]).replace("uid_", ""));
             }catch(java.lang.Exception e0){
                i1 = this.d().getUid();
             }
             Object[] objArray = new Object[]{this.b,Integer.valueOf(p0),Integer.valueOf(i1),Boolean.valueOf(b),group.toString(),e0.toString()};
             a.b("name=%s, pid=%d, uid=%d, foreground=%b, cpuacct=%s, cpu=%s", objArray);
          }else {
             throw new AndroidAppProcess$NotAndroidAppProcessException(p0);
          }
       }else {
          Status status = this.d();
          b = (!this.c().policy())? true: false;
          i1 = status.getUid();
          Object[] objArray1 = new Object[i];
          objArray1[0] = this.b;
          objArray1[1] = Integer.valueOf(p0);
          objArray1[2] = Integer.valueOf(i1);
          objArray1[3] = Boolean.valueOf(b);
          a.b("name=%s, pid=%d, uid=%d foreground=%b", objArray1);
       }
       this.d = b;
       this.e = i1;
       return;
    }
    public void AndroidAppProcess(Parcel p0){
       super(p0);
       boolean b = (p0.readByte())? true: false;
       this.d = b;
       this.e = p0.readInt();
       return;
    }
    public PackageInfo e(Context p0,int p1){
       return p0.getPackageManager().getPackageInfo(this.f(), p1);
    }
    public String f(){
       return (this.b).split(":")[0];
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeByte((byte)this.d);
       p0.writeInt(this.e);
    }
}
