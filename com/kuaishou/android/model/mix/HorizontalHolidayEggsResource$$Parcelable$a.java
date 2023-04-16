package com.kuaishou.android.model.mix.HorizontalHolidayEggsResource$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsResource$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsResource;

public class HorizontalHolidayEggsResource$$Parcelable$a implements Parcelable$Creator	// class@000c9e
{

    public void HorizontalHolidayEggsResource$$Parcelable$a(){
       super();
    }
    public HorizontalHolidayEggsResource$$Parcelable a(Parcel p0){
       return new HorizontalHolidayEggsResource$$Parcelable(HorizontalHolidayEggsResource$$Parcelable.read(p0, new a()));
    }
    public HorizontalHolidayEggsResource$$Parcelable[] b(int p0){
       HorizontalHolidayEggsResource$$Parcelable[] $ParcelableA = new HorizontalHolidayEggsResource$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
