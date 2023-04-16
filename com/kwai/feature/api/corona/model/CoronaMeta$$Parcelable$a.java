package com.kwai.feature.api.corona.model.CoronaMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.corona.model.CoronaMeta$$Parcelable;
import xwd.a;
import com.kwai.feature.api.corona.model.CoronaMeta;

public class CoronaMeta$$Parcelable$a implements Parcelable$Creator	// class@000df0
{

    public void CoronaMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaMeta$$Parcelable(CoronaMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaMeta$$Parcelable[] $ParcelableA = new CoronaMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}
