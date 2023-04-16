package com.kuaishou.android.model.mix.CaptionSearchInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CaptionSearchInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CaptionSearchInfo;

public class CaptionSearchInfo$$Parcelable$a implements Parcelable$Creator	// class@000bd3
{

    public void CaptionSearchInfo$$Parcelable$a(){
       super();
    }
    public CaptionSearchInfo$$Parcelable a(Parcel p0){
       return new CaptionSearchInfo$$Parcelable(CaptionSearchInfo$$Parcelable.read(p0, new a()));
    }
    public CaptionSearchInfo$$Parcelable[] b(int p0){
       CaptionSearchInfo$$Parcelable[] $ParcelableA = new CaptionSearchInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
