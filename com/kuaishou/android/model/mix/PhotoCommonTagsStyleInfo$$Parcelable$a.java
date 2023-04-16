package com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo;

public class PhotoCommonTagsStyleInfo$$Parcelable$a implements Parcelable$Creator	// class@000d43
{

    public void PhotoCommonTagsStyleInfo$$Parcelable$a(){
       super();
    }
    public PhotoCommonTagsStyleInfo$$Parcelable a(Parcel p0){
       return new PhotoCommonTagsStyleInfo$$Parcelable(PhotoCommonTagsStyleInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoCommonTagsStyleInfo$$Parcelable[] b(int p0){
       PhotoCommonTagsStyleInfo$$Parcelable[] $ParcelableA = new PhotoCommonTagsStyleInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
