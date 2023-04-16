package com.kuaishou.android.model.mix.CoverSize$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CoverSize$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CoverSize;

public class CoverSize$$Parcelable$a implements Parcelable$Creator	// class@000c54
{

    public void CoverSize$$Parcelable$a(){
       super();
    }
    public CoverSize$$Parcelable a(Parcel p0){
       return new CoverSize$$Parcelable(CoverSize$$Parcelable.read(p0, new a()));
    }
    public CoverSize$$Parcelable[] b(int p0){
       CoverSize$$Parcelable[] $ParcelableA = new CoverSize$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
