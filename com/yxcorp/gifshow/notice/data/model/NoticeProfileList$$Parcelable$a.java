package com.yxcorp.gifshow.notice.data.model.NoticeProfileList$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.notice.data.model.NoticeProfileList$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.notice.data.model.NoticeProfileList;

public class NoticeProfileList$$Parcelable$a implements Parcelable$Creator	// class@002189
{

    public void NoticeProfileList$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NoticeProfileList$$Parcelable(NoticeProfileList$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NoticeProfileList$$Parcelable[] $ParcelableA = new NoticeProfileList$$Parcelable[p0];
       return $ParcelableA;
    }
}
