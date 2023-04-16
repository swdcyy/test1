package com.kuaishou.android.model.mix.HorizontalHolidayEggsInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsInfo;

public class HorizontalHolidayEggsInfo$$Parcelable$a implements Parcelable$Creator	// class@000c9b
{

    public void HorizontalHolidayEggsInfo$$Parcelable$a(){
       super();
    }
    public HorizontalHolidayEggsInfo$$Parcelable a(Parcel p0){
       return new HorizontalHolidayEggsInfo$$Parcelable(HorizontalHolidayEggsInfo$$Parcelable.read(p0, new a()));
    }
    public HorizontalHolidayEggsInfo$$Parcelable[] b(int p0){
       HorizontalHolidayEggsInfo$$Parcelable[] $ParcelableA = new HorizontalHolidayEggsInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
