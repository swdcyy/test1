package com.yxcorp.gifshow.share.model.guide.ShareGuide$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.share.model.guide.ShareGuide$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.share.model.guide.ShareGuide;

public class ShareGuide$$Parcelable$a implements Parcelable$Creator	// class@001be6
{

    public void ShareGuide$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ShareGuide$$Parcelable(ShareGuide$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ShareGuide$$Parcelable[] $ParcelableA = new ShareGuide$$Parcelable[p0];
       return $ParcelableA;
    }
}
