package com.kuaishou.android.model.ads.BrokenFrameInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.BrokenFrameInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.BrokenFrameInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.MagicVideoInfo;
import com.kuaishou.android.model.ads.MagicVideoInfo$$Parcelable;

public class BrokenFrameInfo$$Parcelable implements Parcelable, d	// class@000855
{
    public BrokenFrameInfo brokenFrameInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       BrokenFrameInfo$$Parcelable.CREATOR = new BrokenFrameInfo$$Parcelable$a();
    }
    public void BrokenFrameInfo$$Parcelable(BrokenFrameInfo p0){
       super();
       this.brokenFrameInfo$$0 = p0;
    }
    public static BrokenFrameInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          BrokenFrameInfo uBrokenFrame = new BrokenFrameInfo();
          p1.f(p1.g(), uBrokenFrame);
          uBrokenFrame.mMagicVideoInfo = MagicVideoInfo$$Parcelable.read(p0, p1);
          p1.f(i, uBrokenFrame);
          return uBrokenFrame;
       }
    }
    public static void write(BrokenFrameInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          MagicVideoInfo$$Parcelable.write(p0.mMagicVideoInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BrokenFrameInfo getParcel(){
       return this.brokenFrameInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       BrokenFrameInfo$$Parcelable.write(this.brokenFrameInfo$$0, p0, p1, new a());
    }
}
