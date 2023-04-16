package com.kuaishou.android.model.mix.RankMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.RankMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.RankMeta;

public class RankMeta$$Parcelable$a implements Parcelable$Creator	// class@000ddd
{

    public void RankMeta$$Parcelable$a(){
       super();
    }
    public RankMeta$$Parcelable a(Parcel p0){
       return new RankMeta$$Parcelable(RankMeta$$Parcelable.read(p0, new a()));
    }
    public RankMeta$$Parcelable[] b(int p0){
       RankMeta$$Parcelable[] $ParcelableA = new RankMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
