package com.kuaishou.android.model.mix.PhotoTextLocationInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo;

public class PhotoTextLocationInfo$$Parcelable$a implements Parcelable$Creator	// class@000d69
{

    public void PhotoTextLocationInfo$$Parcelable$a(){
       super();
    }
    public PhotoTextLocationInfo$$Parcelable a(Parcel p0){
       return new PhotoTextLocationInfo$$Parcelable(PhotoTextLocationInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoTextLocationInfo$$Parcelable[] b(int p0){
       PhotoTextLocationInfo$$Parcelable[] $ParcelableA = new PhotoTextLocationInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
