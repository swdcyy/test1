package com.kuaishou.android.model.paycourse.PayVideoMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.paycourse.PayVideoMeta$$Parcelable$a;
import com.kuaishou.android.model.paycourse.PayVideoMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.paycourse.TrialPlayInfo;
import com.kuaishou.android.model.paycourse.TrialPlayInfo$$Parcelable;
import java.io.Serializable;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;

public class PayVideoMeta$$Parcelable implements Parcelable, d	// class@000e89
{
    public PayVideoMeta payVideoMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PayVideoMeta$$Parcelable.CREATOR = new PayVideoMeta$$Parcelable$a();
    }
    public void PayVideoMeta$$Parcelable(PayVideoMeta p0){
       super();
       this.payVideoMeta$$0 = p0;
    }
    public static PayVideoMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PayVideoMeta payVideoMeta = new PayVideoMeta();
          p1.f(p1.g(), payVideoMeta);
          payVideoMeta.mTrialPlayInfo = TrialPlayInfo$$Parcelable.read(p0, p1);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          payVideoMeta.mShowReport = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          payVideoMeta.mIsPayCourse = b;
          payVideoMeta.mKwaiManifest = p0.readSerializable();
          payVideoMeta.mTag = p0.readString();
          p1.f(i, payVideoMeta);
          return payVideoMeta;
       }
    }
    public static void write(PayVideoMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          TrialPlayInfo$$Parcelable.write(p0.mTrialPlayInfo, p1, p2, p3);
          p1.writeInt(p0.mShowReport);
          p1.writeInt(p0.mIsPayCourse);
          p1.writeSerializable(p0.mKwaiManifest);
          p1.writeString(p0.mTag);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PayVideoMeta getParcel(){
       return this.payVideoMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PayVideoMeta$$Parcelable.write(this.payVideoMeta$$0, p0, p1, new a());
    }
}
