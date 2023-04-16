package com.kwai.framework.model.user.NewsPrivacy$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.NewsPrivacy$$Parcelable$a;
import com.kwai.framework.model.user.NewsPrivacy;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class NewsPrivacy$$Parcelable implements Parcelable, d	// class@001709
{
    public NewsPrivacy newsPrivacy$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NewsPrivacy$$Parcelable.CREATOR = new NewsPrivacy$$Parcelable$a();
    }
    public void NewsPrivacy$$Parcelable(NewsPrivacy p0){
       super();
       this.newsPrivacy$$0 = p0;
    }
    public static NewsPrivacy read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NewsPrivacy newsPrivacy = new NewsPrivacy();
          p1.f(p1.g(), newsPrivacy);
          newsPrivacy.mNewsPrivacyType = p0.readInt();
          newsPrivacy.mBandedUserCount = p0.readInt();
          p1.f(i, newsPrivacy);
          return newsPrivacy;
       }
    }
    public static void write(NewsPrivacy p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mNewsPrivacyType);
          p1.writeInt(p0.mBandedUserCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NewsPrivacy getParcel(){
       return this.newsPrivacy$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NewsPrivacy$$Parcelable.write(this.newsPrivacy$$0, p0, p1, new a());
    }
}
