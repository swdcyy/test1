package com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams;

public class RealtimeMeta$LogParams$$Parcelable$a implements Parcelable$Creator	// class@001064
{

    public void RealtimeMeta$LogParams$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new RealtimeMeta$LogParams$$Parcelable(RealtimeMeta$LogParams$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       RealtimeMeta$LogParams$$Parcelable[] logParams$$P = new RealtimeMeta$LogParams$$Parcelable[p0];
       return logParams$$P;
    }
}
