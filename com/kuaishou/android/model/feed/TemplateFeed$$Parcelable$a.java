package com.kuaishou.android.model.feed.TemplateFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.TemplateFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.TemplateFeed;

public class TemplateFeed$$Parcelable$a implements Parcelable$Creator	// class@000b6f
{

    public void TemplateFeed$$Parcelable$a(){
       super();
    }
    public TemplateFeed$$Parcelable a(Parcel p0){
       return new TemplateFeed$$Parcelable(TemplateFeed$$Parcelable.read(p0, new a()));
    }
    public TemplateFeed$$Parcelable[] b(int p0){
       TemplateFeed$$Parcelable[] $ParcelableA = new TemplateFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
