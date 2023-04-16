package com.yxcorp.gifshow.commercial.response.magnetic.PlayAwardVideoResponse$Data$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.commercial.response.magnetic.PlayAwardVideoResponse$Data$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.commercial.response.magnetic.PlayAwardVideoResponse$Data;

public class PlayAwardVideoResponse$Data$$Parcelable$a implements Parcelable$Creator	// class@001169
{

    public void PlayAwardVideoResponse$Data$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new PlayAwardVideoResponse$Data$$Parcelable(PlayAwardVideoResponse$Data$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       PlayAwardVideoResponse$Data$$Parcelable[] uData$$Parce = new PlayAwardVideoResponse$Data$$Parcelable[p0];
       return uData$$Parce;
    }
}
