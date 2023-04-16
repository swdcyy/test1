package com.kuaishou.android.model.feed.ActivityTemplateFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.ActivityTemplateFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.ActivityTemplateFeed;

public class ActivityTemplateFeed$$Parcelable$a implements Parcelable$Creator	// class@000ace
{

    public void ActivityTemplateFeed$$Parcelable$a(){
       super();
    }
    public ActivityTemplateFeed$$Parcelable a(Parcel p0){
       return new ActivityTemplateFeed$$Parcelable(ActivityTemplateFeed$$Parcelable.read(p0, new a()));
    }
    public ActivityTemplateFeed$$Parcelable[] b(int p0){
       ActivityTemplateFeed$$Parcelable[] $ParcelableA = new ActivityTemplateFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
