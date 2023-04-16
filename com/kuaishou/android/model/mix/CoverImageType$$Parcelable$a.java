package com.kuaishou.android.model.mix.CoverImageType$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CoverImageType$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CoverImageType;

public class CoverImageType$$Parcelable$a implements Parcelable$Creator	// class@000c37
{

    public void CoverImageType$$Parcelable$a(){
       super();
    }
    public CoverImageType$$Parcelable a(Parcel p0){
       return new CoverImageType$$Parcelable(CoverImageType$$Parcelable.read(p0, new a()));
    }
    public CoverImageType$$Parcelable[] b(int p0){
       CoverImageType$$Parcelable[] $ParcelableA = new CoverImageType$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
