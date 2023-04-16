package com.kuaishou.android.model.feed.AccompanyInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.AccompanyInfo$$Parcelable$a;
import com.kuaishou.android.model.feed.AccompanyInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class AccompanyInfo$$Parcelable implements Parcelable, d	// class@000acc
{
    public AccompanyInfo accompanyInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       AccompanyInfo$$Parcelable.CREATOR = new AccompanyInfo$$Parcelable$a();
    }
    public void AccompanyInfo$$Parcelable(AccompanyInfo p0){
       super();
       this.accompanyInfo$$0 = p0;
    }
    public static AccompanyInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          AccompanyInfo uAccompanyIn = new AccompanyInfo();
          p1.f(p1.g(), uAccompanyIn);
          uAccompanyIn.mSystemRequires = p0.readString();
          uAccompanyIn.mGameLevel = p0.readString();
          uAccompanyIn.mWaitingNum = p0.readInt();
          p1.f(i, uAccompanyIn);
          return uAccompanyIn;
       }
    }
    public static void write(AccompanyInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mSystemRequires);
          p1.writeString(p0.mGameLevel);
          p1.writeInt(p0.mWaitingNum);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public AccompanyInfo getParcel(){
       return this.accompanyInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       AccompanyInfo$$Parcelable.write(this.accompanyInfo$$0, p0, p1, new a());
    }
}
