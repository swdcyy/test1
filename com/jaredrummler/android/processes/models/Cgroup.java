package com.jaredrummler.android.processes.models.Cgroup;
import com.jaredrummler.android.processes.models.ProcFile;
import com.jaredrummler.android.processes.models.Cgroup$a;
import android.os.Parcel;
import com.jaredrummler.android.processes.models.ControlGroup;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.util.Iterator;
import java.util.List;

public final class Cgroup extends ProcFile	// class@0006dd
{
    public final ArrayList groups;
    public static final Parcelable$Creator CREATOR;

    static {
       Cgroup.CREATOR = new Cgroup$a();
    }
    public void Cgroup(Parcel p0){
       super(p0);
       this.groups = p0.createTypedArrayList(ControlGroup.CREATOR);
    }
    public void Cgroup(Parcel p0,Cgroup$a p1){
       super(p0);
    }
    public void Cgroup(String p0){
       super(p0);
       String[] stringArray = (this.content).split("\n");
       this.groups = new ArrayList();
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          try{
             this.groups.add(new ControlGroup(oobject));
             i = i + 1;
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public static Cgroup get(int p0){
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       return new Cgroup(String.format("/proc/%d/cgroup", objArray));
    }
    public ControlGroup getGroup(String p0){
       Iterator iterator = this.groups.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          ControlGroup uControlGrou = iterator.next();
          String[] stringArray = (uControlGrou.c).split(",");
          int len = stringArray.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if ((stringArray[i]).equals(p0)) {
                   break ;
                }else {
                   i = i + 1;
                }
             }else {
                continue ;
             }
          }
          return uControlGrou;
       }
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeTypedList(this.groups);
    }
}
