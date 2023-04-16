package com.kuaishou.android.model.paycourse.TrialPlayInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.paycourse.TrialPlayInfo$$Parcelable$a;
import com.kuaishou.android.model.paycourse.TrialPlayInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TrialPlayInfo$$Parcelable implements Parcelable, d	// class@000e8f
{
    public TrialPlayInfo trialPlayInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TrialPlayInfo$$Parcelable.CREATOR = new TrialPlayInfo$$Parcelable$a();
    }
    public void TrialPlayInfo$$Parcelable(TrialPlayInfo p0){
       super();
       this.trialPlayInfo$$0 = p0;
    }
    public static TrialPlayInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          TrialPlayInfo trialPlayInf = new TrialPlayInfo();
          p1.f(p1.g(), trialPlayInf);
          trialPlayInf.mPreTitle = p0.readString();
          trialPlayInf.mPurchaseText = p0.readString();
          trialPlayInf.mTrialIconUrl = p0.readString();
          trialPlayInf.mFullVideoLength = p0.readLong();
          trialPlayInf.mTrialInfoText = p0.readString();
          trialPlayInf.mCourseId = p0.readString();
          trialPlayInf.mPlayFinPurchaseText = p0.readString();
          trialPlayInf.mPlayFinText = p0.readString();
          p1.f(i, trialPlayInf);
          return trialPlayInf;
       }
    }
    public static void write(TrialPlayInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mPreTitle);
          p1.writeString(p0.mPurchaseText);
          p1.writeString(p0.mTrialIconUrl);
          p1.writeLong(p0.mFullVideoLength);
          p1.writeString(p0.mTrialInfoText);
          p1.writeString(p0.mCourseId);
          p1.writeString(p0.mPlayFinPurchaseText);
          p1.writeString(p0.mPlayFinText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TrialPlayInfo getParcel(){
       return this.trialPlayInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TrialPlayInfo$$Parcelable.write(this.trialPlayInfo$$0, p0, p1, new a());
    }
}
