package com.kwai.feature.api.corona.player.model.ShareLogPageInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.corona.player.model.ShareLogPageInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.corona.player.model.ShareLogPageInfo;

public class ShareLogPageInfo$$Parcelable$a implements Parcelable$Creator	// class@000e28
{

    public void ShareLogPageInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ShareLogPageInfo$$Parcelable(ShareLogPageInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ShareLogPageInfo$$Parcelable[] $ParcelableA = new ShareLogPageInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
