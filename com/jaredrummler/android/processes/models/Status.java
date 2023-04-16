package com.jaredrummler.android.processes.models.Status;
import com.jaredrummler.android.processes.models.ProcFile;
import com.jaredrummler.android.processes.models.Status$a;
import android.os.Parcel;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.StringBuilder;

public final class Status extends ProcFile	// class@0006e7
{
    public static final Parcelable$Creator CREATOR;

    static {
       Status.CREATOR = new Status$a();
    }
    public void Status(Parcel p0){
       super(p0);
    }
    public void Status(Parcel p0,Status$a p1){
       super(p0);
    }
    public void Status(String p0){
       super(p0);
    }
    public static Status get(int p0){
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       return new Status(String.format("/proc/%d/status", objArray));
    }
    public int getGid(){
       try{
          return Integer.parseInt((this.getValue("Gid")).split("\\s+")[0]);
       }catch(java.lang.Exception e0){
          return -1;
       }
    }
    public int getUid(){
       try{
          return Integer.parseInt((this.getValue("Uid")).split("\\s+")[0]);
       }catch(java.lang.Exception e0){
          return -1;
       }
    }
    public String getValue(String p0){
       object oobject;
       String[] stringArray = (this.content).split("\n");
       int len = stringArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = stringArray[i];
          if (oobject.startsWith(p0+":")) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return (oobject.split(p0+":")[1]).trim();
    }
}
