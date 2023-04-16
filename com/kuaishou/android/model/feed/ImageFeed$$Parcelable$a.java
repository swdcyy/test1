package com.kuaishou.android.model.feed.ImageFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.ImageFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.ImageFeed;

public class ImageFeed$$Parcelable$a implements Parcelable$Creator	// class@000aef
{

    public void ImageFeed$$Parcelable$a(){
       super();
    }
    public ImageFeed$$Parcelable a(Parcel p0){
       return new ImageFeed$$Parcelable(ImageFeed$$Parcelable.read(p0, new a()));
    }
    public ImageFeed$$Parcelable[] b(int p0){
       ImageFeed$$Parcelable[] $ParcelableA = new ImageFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
