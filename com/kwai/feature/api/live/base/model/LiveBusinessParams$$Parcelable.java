package com.kwai.feature.api.live.base.model.LiveBusinessParams$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.live.base.model.LiveBusinessParams$$Parcelable$a;
import com.kwai.feature.api.live.base.model.LiveBusinessParams;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class LiveBusinessParams$$Parcelable implements Parcelable, d	// class@000f81
{
    public LiveBusinessParams liveBusinessParams$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveBusinessParams$$Parcelable.CREATOR = new LiveBusinessParams$$Parcelable$a();
    }
    public void LiveBusinessParams$$Parcelable(LiveBusinessParams p0){
       super();
       this.liveBusinessParams$$0 = p0;
    }
    public static LiveBusinessParams read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveBusinessParams liveBusiness = new LiveBusinessParams();
          p1.f(p1.g(), liveBusiness);
          liveBusiness.hotSpotId = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          liveBusiness.isAutoOpenCny23AllDayLeeDialog = b;
          p1.f(i, liveBusiness);
          return liveBusiness;
       }
    }
    public static void write(LiveBusinessParams p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.hotSpotId);
          p1.writeInt(p0.isAutoOpenCny23AllDayLeeDialog);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveBusinessParams getParcel(){
       return this.liveBusinessParams$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveBusinessParams$$Parcelable.write(this.liveBusinessParams$$0, p0, p1, new a());
    }
}
