package com.kuaishou.android.model.mix.PhotoCommonTags$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PhotoCommonTags$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PhotoCommonTags;

public class PhotoCommonTags$$Parcelable$a implements Parcelable$Creator	// class@000d3f
{

    public void PhotoCommonTags$$Parcelable$a(){
       super();
    }
    public PhotoCommonTags$$Parcelable a(Parcel p0){
       return new PhotoCommonTags$$Parcelable(PhotoCommonTags$$Parcelable.read(p0, new a()));
    }
    public PhotoCommonTags$$Parcelable[] b(int p0){
       PhotoCommonTags$$Parcelable[] $ParcelableA = new PhotoCommonTags$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
