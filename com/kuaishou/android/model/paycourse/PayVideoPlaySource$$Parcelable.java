package com.kuaishou.android.model.paycourse.PayVideoPlaySource$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.paycourse.PayVideoPlaySource$$Parcelable$a;
import com.kuaishou.android.model.paycourse.PayVideoPlaySource;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PayVideoPlaySource$$Parcelable implements Parcelable, d	// class@000e8c
{
    public PayVideoPlaySource payVideoPlaySource$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PayVideoPlaySource$$Parcelable.CREATOR = new PayVideoPlaySource$$Parcelable$a();
    }
    public void PayVideoPlaySource$$Parcelable(PayVideoPlaySource p0){
       super();
       this.payVideoPlaySource$$0 = p0;
    }
    public static PayVideoPlaySource read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PayVideoPlaySource payVideoPlay = new PayVideoPlaySource();
          p1.f(p1.g(), payVideoPlay);
          p1.f(i, payVideoPlay);
          return payVideoPlay;
       }
    }
    public static void write(PayVideoPlaySource p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PayVideoPlaySource getParcel(){
       return this.payVideoPlaySource$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PayVideoPlaySource$$Parcelable.write(this.payVideoPlaySource$$0, p0, p1, new a());
    }
}
