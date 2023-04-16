package com.yxcorp.gifshow.corona.common.model.CoronaCaption$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaCaption$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaCaption;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.corona.common.model.TagCaption;
import com.yxcorp.gifshow.corona.common.model.TagCaption$$Parcelable;
import com.yxcorp.gifshow.corona.common.model.DetailCaption;
import com.yxcorp.gifshow.corona.common.model.DetailCaption$$Parcelable;

public class CoronaCaption$$Parcelable implements Parcelable, d	// class@001201
{
    public CoronaCaption coronaCaption$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaCaption$$Parcelable.CREATOR = new CoronaCaption$$Parcelable$a();
    }
    public void CoronaCaption$$Parcelable(CoronaCaption p0){
       super();
       this.coronaCaption$$0 = p0;
    }
    public static CoronaCaption read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaCaption uCoronaCapti = new CoronaCaption();
          p1.f(p1.g(), uCoronaCapti);
          uCoronaCapti.mTagCaption = TagCaption$$Parcelable.read(p0, p1);
          uCoronaCapti.mCaptionSource = p0.readInt();
          uCoronaCapti.mDetailCaption = DetailCaption$$Parcelable.read(p0, p1);
          uCoronaCapti.mTabCaption = p0.readString();
          p1.f(i, uCoronaCapti);
          return uCoronaCapti;
       }
    }
    public static void write(CoronaCaption p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          TagCaption$$Parcelable.write(p0.mTagCaption, p1, p2, p3);
          p1.writeInt(p0.mCaptionSource);
          DetailCaption$$Parcelable.write(p0.mDetailCaption, p1, p2, p3);
          p1.writeString(p0.mTabCaption);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaCaption getParcel(){
       return this.coronaCaption$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaCaption$$Parcelable.write(this.coronaCaption$$0, p0, p1, new a());
    }
}
