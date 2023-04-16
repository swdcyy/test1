package com.hhh.smartwidget.SystemBarInfo;
import android.os.Parcelable;
import com.hhh.smartwidget.SystemBarInfo$a;
import java.lang.Object;
import android.os.Parcel;

public class SystemBarInfo implements Parcelable	// class@000575
{
    public boolean b;
    public int c;
    public static final Parcelable$Creator CREATOR;

    static {
       SystemBarInfo.CREATOR = new SystemBarInfo$a();
    }
    public void SystemBarInfo(){
       super();
    }
    public void SystemBarInfo(Parcel p0){
       super();
       boolean b = (p0.readByte())? true: false;
       this.b = b;
       this.c = p0.readInt();
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeByte(this.b);
       p0.writeInt(this.c);
    }
}
