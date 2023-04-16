package com.kuaishou.android.live.model.QLivePlayExtraInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.live.model.QLivePlayExtraInfo$$Parcelable$a;
import com.kuaishou.android.live.model.QLivePlayExtraInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class QLivePlayExtraInfo$$Parcelable implements Parcelable, d	// class@00082d
{
    public QLivePlayExtraInfo qLivePlayExtraInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       QLivePlayExtraInfo$$Parcelable.CREATOR = new QLivePlayExtraInfo$$Parcelable$a();
    }
    public void QLivePlayExtraInfo$$Parcelable(QLivePlayExtraInfo p0){
       super();
       this.qLivePlayExtraInfo$$0 = p0;
    }
    public static QLivePlayExtraInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          QLivePlayExtraInfo qLivePlayExt = new QLivePlayExtraInfo();
          p1.f(p1.g(), qLivePlayExt);
          qLivePlayExt.mLessonRank = p0.readInt();
          qLivePlayExt.mTrialSubTitle = p0.readString();
          p1.f(i, qLivePlayExt);
          return qLivePlayExt;
       }
    }
    public static void write(QLivePlayExtraInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mLessonRank);
          p1.writeString(p0.mTrialSubTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public QLivePlayExtraInfo getParcel(){
       return this.qLivePlayExtraInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       QLivePlayExtraInfo$$Parcelable.write(this.qLivePlayExtraInfo$$0, p0, p1, new a());
    }
}
