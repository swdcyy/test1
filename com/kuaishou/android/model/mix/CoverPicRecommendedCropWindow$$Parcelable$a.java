package com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow;

public class CoverPicRecommendedCropWindow$$Parcelable$a implements Parcelable$Creator	// class@000c50
{

    public void CoverPicRecommendedCropWindow$$Parcelable$a(){
       super();
    }
    public CoverPicRecommendedCropWindow$$Parcelable a(Parcel p0){
       return new CoverPicRecommendedCropWindow$$Parcelable(CoverPicRecommendedCropWindow$$Parcelable.read(p0, new a()));
    }
    public CoverPicRecommendedCropWindow$$Parcelable[] b(int p0){
       CoverPicRecommendedCropWindow$$Parcelable[] $ParcelableA = new CoverPicRecommendedCropWindow$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
