package com.kuaishou.android.model.mix.InterestManageSnackBarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo$$Parcelable;

public class InterestManageSnackBarInfo$$Parcelable implements Parcelable, d	// class@000cee
{
    public InterestManageSnackBarInfo interestManageSnackBarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       InterestManageSnackBarInfo$$Parcelable.CREATOR = new InterestManageSnackBarInfo$$Parcelable$a();
    }
    public void InterestManageSnackBarInfo$$Parcelable(InterestManageSnackBarInfo p0){
       super();
       this.interestManageSnackBarInfo$$0 = p0;
    }
    public static InterestManageSnackBarInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          InterestManageSnackBarInfo interestMana = new InterestManageSnackBarInfo();
          p1.f(p1.g(), interestMana);
          interestMana.mShowAfterTimeInMilliseconds = p0.readLong();
          interestMana.mContent = p0.readString();
          interestMana.mIconUrl = p0.readString();
          interestMana.mActionInfo = InterestManageSnackBarInfo$ActionInfo$$Parcelable.read(p0, p1);
          p1.f(i, interestMana);
          return interestMana;
       }
    }
    public static void write(InterestManageSnackBarInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mShowAfterTimeInMilliseconds);
          p1.writeString(p0.mContent);
          p1.writeString(p0.mIconUrl);
          InterestManageSnackBarInfo$ActionInfo$$Parcelable.write(p0.mActionInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public InterestManageSnackBarInfo getParcel(){
       return this.interestManageSnackBarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       InterestManageSnackBarInfo$$Parcelable.write(this.interestManageSnackBarInfo$$0, p0, p1, new a());
    }
}
