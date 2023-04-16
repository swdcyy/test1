package com.kuaishou.android.model.mix.PhotoMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PhotoMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PhotoMeta;

public class PhotoMeta$$Parcelable$a implements Parcelable$Creator	// class@000d54
{

    public void PhotoMeta$$Parcelable$a(){
       super();
    }
    public PhotoMeta$$Parcelable a(Parcel p0){
       return new PhotoMeta$$Parcelable(PhotoMeta$$Parcelable.read(p0, new a()));
    }
    public PhotoMeta$$Parcelable[] b(int p0){
       PhotoMeta$$Parcelable[] $ParcelableA = new PhotoMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
