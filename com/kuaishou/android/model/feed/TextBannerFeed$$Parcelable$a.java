package com.kuaishou.android.model.feed.TextBannerFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.TextBannerFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.TextBannerFeed;

public class TextBannerFeed$$Parcelable$a implements Parcelable$Creator	// class@000b72
{

    public void TextBannerFeed$$Parcelable$a(){
       super();
    }
    public TextBannerFeed$$Parcelable a(Parcel p0){
       return new TextBannerFeed$$Parcelable(TextBannerFeed$$Parcelable.read(p0, new a()));
    }
    public TextBannerFeed$$Parcelable[] b(int p0){
       TextBannerFeed$$Parcelable[] $ParcelableA = new TextBannerFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
