package com.kuaishou.android.model.feed.LiveCoverAnnexWrapper$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.LiveCoverAnnexWrapper$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.LiveCoverAnnexWrapper;

public class LiveCoverAnnexWrapper$$Parcelable$a implements Parcelable$Creator	// class@000b04
{

    public void LiveCoverAnnexWrapper$$Parcelable$a(){
       super();
    }
    public LiveCoverAnnexWrapper$$Parcelable a(Parcel p0){
       return new LiveCoverAnnexWrapper$$Parcelable(LiveCoverAnnexWrapper$$Parcelable.read(p0, new a()));
    }
    public LiveCoverAnnexWrapper$$Parcelable[] b(int p0){
       LiveCoverAnnexWrapper$$Parcelable[] $ParcelableA = new LiveCoverAnnexWrapper$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
