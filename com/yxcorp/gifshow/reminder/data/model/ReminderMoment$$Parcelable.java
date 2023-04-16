package com.yxcorp.gifshow.reminder.data.model.ReminderMoment$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.reminder.data.model.ReminderMoment$$Parcelable$a;
import com.yxcorp.gifshow.reminder.data.model.ReminderMoment;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import lp.a;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.moment.model.MomentModel;
import com.kwai.feature.api.social.moment.model.MomentModel$$Parcelable;

public class ReminderMoment$$Parcelable implements Parcelable, d	// class@001a77
{
    public ReminderMoment reminderMoment$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ReminderMoment$$Parcelable.CREATOR = new ReminderMoment$$Parcelable$a();
    }
    public void ReminderMoment$$Parcelable(ReminderMoment p0){
       super();
       this.reminderMoment$$0 = p0;
    }
    public static ReminderMoment read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ReminderMoment reminderMome = new ReminderMoment();
          p1.f(p1.g(), reminderMome);
          reminderMome.mUser = new a().c(p0);
          reminderMome.mModel = MomentModel$$Parcelable.read(p0, p1);
          p1.f(i, reminderMome);
          return reminderMome;
       }
    }
    public static void write(ReminderMoment p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          new a().d(p0.mUser, p1);
          MomentModel$$Parcelable.write(p0.mModel, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ReminderMoment getParcel(){
       return this.reminderMoment$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ReminderMoment$$Parcelable.write(this.reminderMoment$$0, p0, p1, new a());
    }
}
