package com.kuaishou.android.live.model.LiveRestartPlayerConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.live.model.LiveRestartPlayerConfig$$Parcelable$a;
import com.kuaishou.android.live.model.LiveRestartPlayerConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.live.model.LiveRestartPlayerConfig$LiveRestartPlayerConditional;

public class LiveRestartPlayerConfig$$Parcelable implements Parcelable, d	// class@0007f9
{
    public LiveRestartPlayerConfig liveRestartPlayerConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveRestartPlayerConfig$$Parcelable.CREATOR = new LiveRestartPlayerConfig$$Parcelable$a();
    }
    public void LiveRestartPlayerConfig$$Parcelable(LiveRestartPlayerConfig p0){
       super();
       this.liveRestartPlayerConfig$$0 = p0;
    }
    public static LiveRestartPlayerConfig read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveRestartPlayerConfig liveRestartP = new LiveRestartPlayerConfig();
          p1.f(p1.g(), liveRestartP);
          liveRestartP.mLiveRestartPlayerConditional = p0.readSerializable();
          liveRestartP.mRestartPlayerType = p0.readString();
          p1.f(i, liveRestartP);
          return liveRestartP;
       }
    }
    public static void write(LiveRestartPlayerConfig p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mLiveRestartPlayerConditional);
          p1.writeString(p0.mRestartPlayerType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveRestartPlayerConfig getParcel(){
       return this.liveRestartPlayerConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveRestartPlayerConfig$$Parcelable.write(this.liveRestartPlayerConfig$$0, p0, p1, new a());
    }
}
