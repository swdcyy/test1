package com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo;

public class InterestManageSnackBarInfo$ActionInfo$$Parcelable$a implements Parcelable$Creator	// class@000cef
{

    public void InterestManageSnackBarInfo$ActionInfo$$Parcelable$a(){
       super();
    }
    public InterestManageSnackBarInfo$ActionInfo$$Parcelable a(Parcel p0){
       return new InterestManageSnackBarInfo$ActionInfo$$Parcelable(InterestManageSnackBarInfo$ActionInfo$$Parcelable.read(p0, new a()));
    }
    public InterestManageSnackBarInfo$ActionInfo$$Parcelable[] b(int p0){
       InterestManageSnackBarInfo$ActionInfo$$Parcelable[] uActionInfo$ = new InterestManageSnackBarInfo$ActionInfo$$Parcelable[p0];
       return uActionInfo$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
