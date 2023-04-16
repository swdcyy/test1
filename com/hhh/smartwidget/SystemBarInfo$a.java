package com.hhh.smartwidget.SystemBarInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.hhh.smartwidget.SystemBarInfo;

public final class SystemBarInfo$a implements Parcelable$Creator	// class@000574
{

    public void SystemBarInfo$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SystemBarInfo(p0);
    }
    public Object[] newArray(int p0){
       SystemBarInfo[] systemBarInf = new SystemBarInfo[p0];
       return systemBarInf;
    }
}
