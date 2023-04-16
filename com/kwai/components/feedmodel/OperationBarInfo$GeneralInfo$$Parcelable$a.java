package com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo;

public class OperationBarInfo$GeneralInfo$$Parcelable$a implements Parcelable$Creator	// class@000c1e
{

    public void OperationBarInfo$GeneralInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new OperationBarInfo$GeneralInfo$$Parcelable(OperationBarInfo$GeneralInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       OperationBarInfo$GeneralInfo$$Parcelable[] generalInfo$ = new OperationBarInfo$GeneralInfo$$Parcelable[p0];
       return generalInfo$;
    }
}
