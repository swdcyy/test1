package com.kwai.framework.model.user.FansGroupV2Info$UserInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.FansGroupV2Info$UserInfo$$Parcelable$a;
import com.kwai.framework.model.user.FansGroupV2Info$UserInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class FansGroupV2Info$UserInfo$$Parcelable implements Parcelable, d	// class@0016f2
{
    public FansGroupV2Info$UserInfo userInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FansGroupV2Info$UserInfo$$Parcelable.CREATOR = new FansGroupV2Info$UserInfo$$Parcelable$a();
    }
    public void FansGroupV2Info$UserInfo$$Parcelable(FansGroupV2Info$UserInfo p0){
       super();
       this.userInfo$$0 = p0;
    }
    public static FansGroupV2Info$UserInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FansGroupV2Info$UserInfo userInfo = new FansGroupV2Info$UserInfo();
          p1.f(p1.g(), userInfo);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          userInfo.mHasJoined = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          userInfo.mShowGuidance = b;
          userInfo.mFansGroupLevel = p0.readInt();
          p1.f(i, userInfo);
          return userInfo;
       }
    }
    public static void write(FansGroupV2Info$UserInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHasJoined);
          p1.writeInt(p0.mShowGuidance);
          p1.writeInt(p0.mFansGroupLevel);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FansGroupV2Info$UserInfo getParcel(){
       return this.userInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FansGroupV2Info$UserInfo$$Parcelable.write(this.userInfo$$0, p0, p1, new a());
    }
}
