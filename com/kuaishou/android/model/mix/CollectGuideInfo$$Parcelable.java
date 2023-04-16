package com.kuaishou.android.model.mix.CollectGuideInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CollectGuideInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.CollectGuideInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CollectGuideInfo$$Parcelable implements Parcelable, d	// class@000bec
{
    public CollectGuideInfo collectGuideInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CollectGuideInfo$$Parcelable.CREATOR = new CollectGuideInfo$$Parcelable$a();
    }
    public void CollectGuideInfo$$Parcelable(CollectGuideInfo p0){
       super();
       this.collectGuideInfo$$0 = p0;
    }
    public static CollectGuideInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CollectGuideInfo uCollectGuid = new CollectGuideInfo();
          p1.f(p1.g(), uCollectGuid);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uCollectGuid.mEnableStrongGuide = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uCollectGuid.mEnableWeakGuide = b;
          uCollectGuid.mStrongGuidePopUpTime = p0.readLong();
          p1.f(i, uCollectGuid);
          return uCollectGuid;
       }
    }
    public static void write(CollectGuideInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableStrongGuide);
          p1.writeInt(p0.mEnableWeakGuide);
          p1.writeLong(p0.mStrongGuidePopUpTime);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CollectGuideInfo getParcel(){
       return this.collectGuideInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CollectGuideInfo$$Parcelable.write(this.collectGuideInfo$$0, p0, p1, new a());
    }
}
