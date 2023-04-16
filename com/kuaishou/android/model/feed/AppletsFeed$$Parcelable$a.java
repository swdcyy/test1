package com.kuaishou.android.model.feed.AppletsFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.AppletsFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.AppletsFeed;

public class AppletsFeed$$Parcelable$a implements Parcelable$Creator	// class@000ad6
{

    public void AppletsFeed$$Parcelable$a(){
       super();
    }
    public AppletsFeed$$Parcelable a(Parcel p0){
       return new AppletsFeed$$Parcelable(AppletsFeed$$Parcelable.read(p0, new a()));
    }
    public AppletsFeed$$Parcelable[] b(int p0){
       AppletsFeed$$Parcelable[] $ParcelableA = new AppletsFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
