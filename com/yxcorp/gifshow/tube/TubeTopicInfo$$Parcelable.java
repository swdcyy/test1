package com.yxcorp.gifshow.tube.TubeTopicInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubeTopicInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubeTopicInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TubeTopicInfo$$Parcelable implements Parcelable, d	// class@001e25
{
    public TubeTopicInfo tubeTopicInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeTopicInfo$$Parcelable.CREATOR = new TubeTopicInfo$$Parcelable$a();
    }
    public void TubeTopicInfo$$Parcelable(TubeTopicInfo p0){
       super();
       this.tubeTopicInfo$$0 = p0;
    }
    public static TubeTopicInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          TubeTopicInfo tubeTopicInf = new TubeTopicInfo();
          p1.f(p1.g(), tubeTopicInf);
          tubeTopicInf.topicId = p0.readString();
          tubeTopicInf.topicName = p0.readString();
          p1.f(i, tubeTopicInf);
          return tubeTopicInf;
       }
    }
    public static void write(TubeTopicInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.topicId);
          p1.writeString(p0.topicName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeTopicInfo getParcel(){
       return this.tubeTopicInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeTopicInfo$$Parcelable.write(this.tubeTopicInfo$$0, p0, p1, new a());
    }
}
