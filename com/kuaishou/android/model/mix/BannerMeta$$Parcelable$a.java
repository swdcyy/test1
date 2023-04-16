package com.kuaishou.android.model.mix.BannerMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.BannerMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.BannerMeta;

public class BannerMeta$$Parcelable$a implements Parcelable$Creator	// class@000bcb
{

    public void BannerMeta$$Parcelable$a(){
       super();
    }
    public BannerMeta$$Parcelable a(Parcel p0){
       return new BannerMeta$$Parcelable(BannerMeta$$Parcelable.read(p0, new a()));
    }
    public BannerMeta$$Parcelable[] b(int p0){
       BannerMeta$$Parcelable[] $ParcelableA = new BannerMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
