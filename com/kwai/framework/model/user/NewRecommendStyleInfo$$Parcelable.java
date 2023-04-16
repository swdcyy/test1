package com.kwai.framework.model.user.NewRecommendStyleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.NewRecommendStyleInfo$$Parcelable$a;
import com.kwai.framework.model.user.NewRecommendStyleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class NewRecommendStyleInfo$$Parcelable implements Parcelable, d	// class@001705
{
    public NewRecommendStyleInfo newRecommendStyleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NewRecommendStyleInfo$$Parcelable.CREATOR = new NewRecommendStyleInfo$$Parcelable$a();
    }
    public void NewRecommendStyleInfo$$Parcelable(NewRecommendStyleInfo p0){
       super();
       this.newRecommendStyleInfo$$0 = p0;
    }
    public static NewRecommendStyleInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          NewRecommendStyleInfo newRecommend = new NewRecommendStyleInfo();
          p1.f(p1.g(), newRecommend);
          newRecommend.mAge = p0.readString();
          newRecommend.mCityName = p0.readString();
          newRecommend.mConstellation = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          newRecommend.mIsLiving = b;
          p1.f(i, newRecommend);
          return newRecommend;
       }
    }
    public static void write(NewRecommendStyleInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mAge);
          p1.writeString(p0.mCityName);
          p1.writeString(p0.mConstellation);
          p1.writeInt(p0.mIsLiving);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NewRecommendStyleInfo getParcel(){
       return this.newRecommendStyleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NewRecommendStyleInfo$$Parcelable.write(this.newRecommendStyleInfo$$0, p0, p1, new a());
    }
}
