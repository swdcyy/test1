package com.kuaishou.android.model.mix.PhotoCommonTagIconInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PhotoCommonTagIconInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PhotoCommonTagIconInfo;

public class PhotoCommonTagIconInfo$$Parcelable$a implements Parcelable$Creator	// class@000d37
{

    public void PhotoCommonTagIconInfo$$Parcelable$a(){
       super();
    }
    public PhotoCommonTagIconInfo$$Parcelable a(Parcel p0){
       return new PhotoCommonTagIconInfo$$Parcelable(PhotoCommonTagIconInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoCommonTagIconInfo$$Parcelable[] b(int p0){
       PhotoCommonTagIconInfo$$Parcelable[] $ParcelableA = new PhotoCommonTagIconInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
