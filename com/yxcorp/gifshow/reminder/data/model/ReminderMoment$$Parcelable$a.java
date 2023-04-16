package com.yxcorp.gifshow.reminder.data.model.ReminderMoment$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.reminder.data.model.ReminderMoment$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.reminder.data.model.ReminderMoment;

public class ReminderMoment$$Parcelable$a implements Parcelable$Creator	// class@001a76
{

    public void ReminderMoment$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ReminderMoment$$Parcelable(ReminderMoment$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ReminderMoment$$Parcelable[] $ParcelableA = new ReminderMoment$$Parcelable[p0];
       return $ParcelableA;
    }
}
