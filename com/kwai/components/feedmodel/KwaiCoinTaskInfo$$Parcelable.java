package com.kwai.components.feedmodel.KwaiCoinTaskInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.KwaiCoinTaskInfo$$Parcelable$a;
import com.kwai.components.feedmodel.KwaiCoinTaskInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class KwaiCoinTaskInfo$$Parcelable implements Parcelable, d	// class@000c19
{
    public KwaiCoinTaskInfo kwaiCoinTaskInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       KwaiCoinTaskInfo$$Parcelable.CREATOR = new KwaiCoinTaskInfo$$Parcelable$a();
    }
    public void KwaiCoinTaskInfo$$Parcelable(KwaiCoinTaskInfo p0){
       super();
       this.kwaiCoinTaskInfo$$0 = p0;
    }
    public static KwaiCoinTaskInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          KwaiCoinTaskInfo kwaiCoinTask = new KwaiCoinTaskInfo();
          p1.f(p1.g(), kwaiCoinTask);
          kwaiCoinTask.mAmount = p0.readInt();
          kwaiCoinTask.mActionUrl = p0.readString();
          kwaiCoinTask.mDialogTitle = p0.readString();
          kwaiCoinTask.mLogoUrl = p0.readString();
          kwaiCoinTask.mDialogSubTitle = p0.readString();
          kwaiCoinTask.mTitle = p0.readString();
          kwaiCoinTask.mType = p0.readInt();
          p1.f(i, kwaiCoinTask);
          return kwaiCoinTask;
       }
    }
    public static void write(KwaiCoinTaskInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mAmount);
          p1.writeString(p0.mActionUrl);
          p1.writeString(p0.mDialogTitle);
          p1.writeString(p0.mLogoUrl);
          p1.writeString(p0.mDialogSubTitle);
          p1.writeString(p0.mTitle);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public KwaiCoinTaskInfo getParcel(){
       return this.kwaiCoinTaskInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       KwaiCoinTaskInfo$$Parcelable.write(this.kwaiCoinTaskInfo$$0, p0, p1, new a());
    }
}
