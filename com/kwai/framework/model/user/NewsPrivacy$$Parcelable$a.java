package com.kwai.framework.model.user.NewsPrivacy$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.NewsPrivacy$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.NewsPrivacy;

public class NewsPrivacy$$Parcelable$a implements Parcelable$Creator	// class@001708
{

    public void NewsPrivacy$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NewsPrivacy$$Parcelable(NewsPrivacy$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NewsPrivacy$$Parcelable[] $ParcelableA = new NewsPrivacy$$Parcelable[p0];
       return $ParcelableA;
    }
}
