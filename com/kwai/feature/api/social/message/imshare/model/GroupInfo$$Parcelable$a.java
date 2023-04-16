package com.kwai.feature.api.social.message.imshare.model.GroupInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.message.imshare.model.GroupInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.message.imshare.model.GroupInfo;

public class GroupInfo$$Parcelable$a implements Parcelable$Creator	// class@00114c
{

    public void GroupInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new GroupInfo$$Parcelable(GroupInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       GroupInfo$$Parcelable[] $ParcelableA = new GroupInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
