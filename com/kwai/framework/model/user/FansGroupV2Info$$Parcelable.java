package com.kwai.framework.model.user.FansGroupV2Info$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.FansGroupV2Info$$Parcelable$a;
import com.kwai.framework.model.user.FansGroupV2Info;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.FansGroupV2Info$UserInfo;
import com.kwai.framework.model.user.FansGroupV2Info$UserInfo$$Parcelable;

public class FansGroupV2Info$$Parcelable implements Parcelable, d	// class@0016f0
{
    public FansGroupV2Info fansGroupV2Info$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FansGroupV2Info$$Parcelable.CREATOR = new FansGroupV2Info$$Parcelable$a();
    }
    public void FansGroupV2Info$$Parcelable(FansGroupV2Info p0){
       super();
       this.fansGroupV2Info$$0 = p0;
    }
    public static FansGroupV2Info read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FansGroupV2Info uFansGroupV2 = new FansGroupV2Info();
          p1.f(p1.g(), uFansGroupV2);
          uFansGroupV2.mUserInfo = FansGroupV2Info$UserInfo$$Parcelable.read(p0, p1);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uFansGroupV2.mEnableFansGroupV2 = b;
          p1.f(i, uFansGroupV2);
          return uFansGroupV2;
       }
    }
    public static void write(FansGroupV2Info p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          FansGroupV2Info$UserInfo$$Parcelable.write(p0.mUserInfo, p1, p2, p3);
          p1.writeInt(p0.mEnableFansGroupV2);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FansGroupV2Info getParcel(){
       return this.fansGroupV2Info$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FansGroupV2Info$$Parcelable.write(this.fansGroupV2Info$$0, p0, p1, new a());
    }
}
