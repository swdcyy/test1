package com.yxcorp.gifshow.notice.data.model.NoticeBadgeIcon$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.notice.data.model.NoticeBadgeIcon$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.notice.data.model.NoticeBadgeIcon;

public class NoticeBadgeIcon$$Parcelable$a implements Parcelable$Creator	// class@002186
{

    public void NoticeBadgeIcon$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NoticeBadgeIcon$$Parcelable(NoticeBadgeIcon$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NoticeBadgeIcon$$Parcelable[] $ParcelableA = new NoticeBadgeIcon$$Parcelable[p0];
       return $ParcelableA;
    }
}
