package com.kuaishou.android.model.mix.PhotoCoverStyle$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PhotoCoverStyle$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PhotoCoverStyle;

public class PhotoCoverStyle$$Parcelable$a implements Parcelable$Creator	// class@000d47
{

    public void PhotoCoverStyle$$Parcelable$a(){
       super();
    }
    public PhotoCoverStyle$$Parcelable a(Parcel p0){
       return new PhotoCoverStyle$$Parcelable(PhotoCoverStyle$$Parcelable.read(p0, new a()));
    }
    public PhotoCoverStyle$$Parcelable[] b(int p0){
       PhotoCoverStyle$$Parcelable[] $ParcelableA = new PhotoCoverStyle$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
