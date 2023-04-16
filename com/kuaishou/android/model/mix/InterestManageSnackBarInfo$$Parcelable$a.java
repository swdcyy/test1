package com.kuaishou.android.model.mix.InterestManageSnackBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo;

public class InterestManageSnackBarInfo$$Parcelable$a implements Parcelable$Creator	// class@000ced
{

    public void InterestManageSnackBarInfo$$Parcelable$a(){
       super();
    }
    public InterestManageSnackBarInfo$$Parcelable a(Parcel p0){
       return new InterestManageSnackBarInfo$$Parcelable(InterestManageSnackBarInfo$$Parcelable.read(p0, new a()));
    }
    public InterestManageSnackBarInfo$$Parcelable[] b(int p0){
       InterestManageSnackBarInfo$$Parcelable[] $ParcelableA = new InterestManageSnackBarInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
