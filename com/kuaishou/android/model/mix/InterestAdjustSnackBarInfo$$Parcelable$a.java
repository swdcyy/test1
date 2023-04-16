package com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo;

public class InterestAdjustSnackBarInfo$$Parcelable$a implements Parcelable$Creator	// class@000ce9
{

    public void InterestAdjustSnackBarInfo$$Parcelable$a(){
       super();
    }
    public InterestAdjustSnackBarInfo$$Parcelable a(Parcel p0){
       return new InterestAdjustSnackBarInfo$$Parcelable(InterestAdjustSnackBarInfo$$Parcelable.read(p0, new a()));
    }
    public InterestAdjustSnackBarInfo$$Parcelable[] b(int p0){
       InterestAdjustSnackBarInfo$$Parcelable[] $ParcelableA = new InterestAdjustSnackBarInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
