package com.yxcorp.gifshow.reminder.data.model.ReminderLongPressActionModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.reminder.data.model.ReminderLongPressActionModel$$Parcelable$a;
import com.yxcorp.gifshow.reminder.data.model.ReminderLongPressActionModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ReminderLongPressActionModel$$Parcelable implements Parcelable, d	// class@001a74
{
    public ReminderLongPressActionModel reminderLongPressActionModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ReminderLongPressActionModel$$Parcelable.CREATOR = new ReminderLongPressActionModel$$Parcelable$a();
    }
    public void ReminderLongPressActionModel$$Parcelable(ReminderLongPressActionModel p0){
       super();
       this.reminderLongPressActionModel$$0 = p0;
    }
    public static ReminderLongPressActionModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ReminderLongPressActionModel reminderLong = new ReminderLongPressActionModel();
          p1.f(p1.g(), reminderLong);
          reminderLong.mActionStatus = p0.readInt();
          reminderLong.mActionId = p0.readString();
          reminderLong.mActionType = p0.readInt();
          p1.f(i, reminderLong);
          return reminderLong;
       }
    }
    public static void write(ReminderLongPressActionModel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mActionStatus);
          p1.writeString(p0.mActionId);
          p1.writeInt(p0.mActionType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ReminderLongPressActionModel getParcel(){
       return this.reminderLongPressActionModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ReminderLongPressActionModel$$Parcelable.write(this.reminderLongPressActionModel$$0, p0, p1, new a());
    }
}
