package com.yxcorp.gifshow.corona.common.model.CoronaTitleContent$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleContent$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleContent;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaTitleContent$$Parcelable implements Parcelable, d	// class@00121e
{
    public CoronaTitleContent coronaTitleContent$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaTitleContent$$Parcelable.CREATOR = new CoronaTitleContent$$Parcelable$a();
    }
    public void CoronaTitleContent$$Parcelable(CoronaTitleContent p0){
       super();
       this.coronaTitleContent$$0 = p0;
    }
    public static CoronaTitleContent read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaTitleContent uCoronaTitle = new CoronaTitleContent();
          p1.f(p1.g(), uCoronaTitle);
          uCoronaTitle.mId = p0.readString();
          uCoronaTitle.mTitle = p0.readString();
          p1.f(i, uCoronaTitle);
          return uCoronaTitle;
       }
    }
    public static void write(CoronaTitleContent p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mId);
          p1.writeString(p0.mTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaTitleContent getParcel(){
       return this.coronaTitleContent$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaTitleContent$$Parcelable.write(this.coronaTitleContent$$0, p0, p1, new a());
    }
}
