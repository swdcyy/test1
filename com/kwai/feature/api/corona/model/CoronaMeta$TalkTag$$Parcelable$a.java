package com.kwai.feature.api.corona.model.CoronaMeta$TalkTag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.corona.model.CoronaMeta$TalkTag$$Parcelable;
import xwd.a;
import com.kwai.feature.api.corona.model.CoronaMeta$TalkTag;

public class CoronaMeta$TalkTag$$Parcelable$a implements Parcelable$Creator	// class@000df5
{

    public void CoronaMeta$TalkTag$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaMeta$TalkTag$$Parcelable(CoronaMeta$TalkTag$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaMeta$TalkTag$$Parcelable[] talkTag$$Par = new CoronaMeta$TalkTag$$Parcelable[p0];
       return talkTag$$Par;
    }
}
