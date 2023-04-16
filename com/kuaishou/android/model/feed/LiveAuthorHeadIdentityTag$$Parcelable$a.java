package com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag;

public class LiveAuthorHeadIdentityTag$$Parcelable$a implements Parcelable$Creator	// class@000af5
{

    public void LiveAuthorHeadIdentityTag$$Parcelable$a(){
       super();
    }
    public LiveAuthorHeadIdentityTag$$Parcelable a(Parcel p0){
       return new LiveAuthorHeadIdentityTag$$Parcelable(LiveAuthorHeadIdentityTag$$Parcelable.read(p0, new a()));
    }
    public LiveAuthorHeadIdentityTag$$Parcelable[] b(int p0){
       LiveAuthorHeadIdentityTag$$Parcelable[] $ParcelableA = new LiveAuthorHeadIdentityTag$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
