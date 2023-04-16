package com.yxcorp.gifshow.detail.model.meta.QuickShareInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.model.meta.QuickShareInfo$$Parcelable$a;
import com.yxcorp.gifshow.detail.model.meta.QuickShareInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class QuickShareInfo$$Parcelable implements Parcelable, d	// class@0015aa
{
    public QuickShareInfo quickShareInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       QuickShareInfo$$Parcelable.CREATOR = new QuickShareInfo$$Parcelable$a();
    }
    public void QuickShareInfo$$Parcelable(QuickShareInfo p0){
       super();
       this.quickShareInfo$$0 = p0;
    }
    public static QuickShareInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          QuickShareInfo quickShareIn = new QuickShareInfo();
          p1.f(p1.g(), quickShareIn);
          quickShareIn.mTitle = p0.readString();
          quickShareIn.mIconUrl = p0.readString();
          p1.f(i, quickShareIn);
          return quickShareIn;
       }
    }
    public static void write(QuickShareInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public QuickShareInfo getParcel(){
       return this.quickShareInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       QuickShareInfo$$Parcelable.write(this.quickShareInfo$$0, p0, p1, new a());
    }
}
