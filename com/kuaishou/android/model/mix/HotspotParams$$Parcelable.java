package com.kuaishou.android.model.mix.HotspotParams$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.HotspotParams$$Parcelable$a;
import com.kuaishou.android.model.mix.HotspotParams;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class HotspotParams$$Parcelable implements Parcelable, d	// class@000ca7
{
    public HotspotParams hotspotParams$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HotspotParams$$Parcelable.CREATOR = new HotspotParams$$Parcelable$a();
    }
    public void HotspotParams$$Parcelable(HotspotParams p0){
       super();
       this.hotspotParams$$0 = p0;
    }
    public static HotspotParams read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          HotspotParams hotspotParam = new HotspotParams();
          p1.f(p1.g(), hotspotParam);
          hotspotParam.mConnectType = p0.readInt();
          hotspotParam.mId = p0.readString();
          hotspotParam.mName = p0.readString();
          p1.f(i, hotspotParam);
          return hotspotParam;
       }
    }
    public static void write(HotspotParams p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mConnectType);
          p1.writeString(p0.mId);
          p1.writeString(p0.mName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HotspotParams getParcel(){
       return this.hotspotParams$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HotspotParams$$Parcelable.write(this.hotspotParams$$0, p0, p1, new a());
    }
}
