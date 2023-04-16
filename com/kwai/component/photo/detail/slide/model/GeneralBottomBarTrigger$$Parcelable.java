package com.kwai.component.photo.detail.slide.model.GeneralBottomBarTrigger$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarTrigger$$Parcelable$a;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarTrigger;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class GeneralBottomBarTrigger$$Parcelable implements Parcelable, d	// class@000a69
{
    public GeneralBottomBarTrigger generalBottomBarTrigger$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       GeneralBottomBarTrigger$$Parcelable.CREATOR = new GeneralBottomBarTrigger$$Parcelable$a();
    }
    public void GeneralBottomBarTrigger$$Parcelable(GeneralBottomBarTrigger p0){
       super();
       this.generalBottomBarTrigger$$0 = p0;
    }
    public static GeneralBottomBarTrigger read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          GeneralBottomBarTrigger generalBotto = new GeneralBottomBarTrigger();
          p1.f(p1.g(), generalBotto);
          generalBotto.mPlayVideoMillis = p0.readLong();
          generalBotto.mPlayVideoEndAfterMills = p0.readLong();
          generalBotto.mTargetStyle = p0.readString();
          generalBotto.mAction = p0.readString();
          generalBotto.mCurrentStyle = p0.readString();
          p1.f(i, generalBotto);
          return generalBotto;
       }
    }
    public static void write(GeneralBottomBarTrigger p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mPlayVideoMillis);
          p1.writeLong(p0.mPlayVideoEndAfterMills);
          p1.writeString(p0.mTargetStyle);
          p1.writeString(p0.mAction);
          p1.writeString(p0.mCurrentStyle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public GeneralBottomBarTrigger getParcel(){
       return this.generalBottomBarTrigger$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       GeneralBottomBarTrigger$$Parcelable.write(this.generalBottomBarTrigger$$0, p0, p1, new a());
    }
}
