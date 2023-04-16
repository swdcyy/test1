package com.kuaishou.android.model.feed.LiveCoverAnnex$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.LiveCoverAnnex$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.LiveCoverAnnex;

public class LiveCoverAnnex$$Parcelable$a implements Parcelable$Creator	// class@000aff
{

    public void LiveCoverAnnex$$Parcelable$a(){
       super();
    }
    public LiveCoverAnnex$$Parcelable a(Parcel p0){
       return new LiveCoverAnnex$$Parcelable(LiveCoverAnnex$$Parcelable.read(p0, new a()));
    }
    public LiveCoverAnnex$$Parcelable[] b(int p0){
       LiveCoverAnnex$$Parcelable[] $ParcelableA = new LiveCoverAnnex$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
