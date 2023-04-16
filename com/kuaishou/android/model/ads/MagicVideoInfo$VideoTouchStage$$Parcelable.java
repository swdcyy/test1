package com.kuaishou.android.model.ads.MagicVideoInfo$VideoTouchStage$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoTouchStage$$Parcelable$a;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoTouchStage;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class MagicVideoInfo$VideoTouchStage$$Parcelable implements Parcelable, d	// class@000872
{
    public MagicVideoInfo$VideoTouchStage videoTouchStage$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MagicVideoInfo$VideoTouchStage$$Parcelable.CREATOR = new MagicVideoInfo$VideoTouchStage$$Parcelable$a();
    }
    public void MagicVideoInfo$VideoTouchStage$$Parcelable(MagicVideoInfo$VideoTouchStage p0){
       super();
       this.videoTouchStage$$0 = p0;
    }
    public static MagicVideoInfo$VideoTouchStage read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          MagicVideoInfo$VideoTouchStage videoTouchSt = new MagicVideoInfo$VideoTouchStage();
          p1.f(p1.g(), videoTouchSt);
          videoTouchSt.mEnd = p0.readInt();
          videoTouchSt.mStart = p0.readInt();
          p1.f(i, videoTouchSt);
          return videoTouchSt;
       }
    }
    public static void write(MagicVideoInfo$VideoTouchStage p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnd);
          p1.writeInt(p0.mStart);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MagicVideoInfo$VideoTouchStage getParcel(){
       return this.videoTouchStage$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MagicVideoInfo$VideoTouchStage$$Parcelable.write(this.videoTouchStage$$0, p0, p1, new a());
    }
}
