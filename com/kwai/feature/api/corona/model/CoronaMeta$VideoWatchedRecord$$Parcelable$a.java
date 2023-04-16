package com.kwai.feature.api.corona.model.CoronaMeta$VideoWatchedRecord$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.corona.model.CoronaMeta$VideoWatchedRecord$$Parcelable;
import xwd.a;
import com.kwai.feature.api.corona.model.CoronaMeta$VideoWatchedRecord;

public class CoronaMeta$VideoWatchedRecord$$Parcelable$a implements Parcelable$Creator	// class@000df8
{

    public void CoronaMeta$VideoWatchedRecord$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaMeta$VideoWatchedRecord$$Parcelable(CoronaMeta$VideoWatchedRecord$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaMeta$VideoWatchedRecord$$Parcelable[] videoWatched = new CoronaMeta$VideoWatchedRecord$$Parcelable[p0];
       return videoWatched;
    }
}
