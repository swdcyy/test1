package com.kuaishou.android.model.mix.PosterSpecialEffect$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PosterSpecialEffect$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PosterSpecialEffect;

public class PosterSpecialEffect$$Parcelable$a implements Parcelable$Creator	// class@000dbf
{

    public void PosterSpecialEffect$$Parcelable$a(){
       super();
    }
    public PosterSpecialEffect$$Parcelable a(Parcel p0){
       return new PosterSpecialEffect$$Parcelable(PosterSpecialEffect$$Parcelable.read(p0, new a()));
    }
    public PosterSpecialEffect$$Parcelable[] b(int p0){
       PosterSpecialEffect$$Parcelable[] $ParcelableA = new PosterSpecialEffect$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
