package com.kuaishou.android.model.mix.ShareToFollowModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.ShareToFollowModel$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.ShareToFollowModel;

public class ShareToFollowModel$$Parcelable$a implements Parcelable$Creator	// class@000df8
{

    public void ShareToFollowModel$$Parcelable$a(){
       super();
    }
    public ShareToFollowModel$$Parcelable a(Parcel p0){
       return new ShareToFollowModel$$Parcelable(ShareToFollowModel$$Parcelable.read(p0, new a()));
    }
    public ShareToFollowModel$$Parcelable[] b(int p0){
       ShareToFollowModel$$Parcelable[] $ParcelableA = new ShareToFollowModel$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
