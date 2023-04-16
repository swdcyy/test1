package com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SplashInfo$ClickButtonInfo$$Parcelable implements Parcelable, d	// class@000a8c
{
    public SplashInfo$ClickButtonInfo clickButtonInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SplashInfo$ClickButtonInfo$$Parcelable.CREATOR = new SplashInfo$ClickButtonInfo$$Parcelable$a();
    }
    public void SplashInfo$ClickButtonInfo$$Parcelable(SplashInfo$ClickButtonInfo p0){
       super();
       this.clickButtonInfo$$0 = p0;
    }
    public static SplashInfo$ClickButtonInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SplashInfo$ClickButtonInfo uClickButton = new SplashInfo$ClickButtonInfo();
          p1.f(p1.g(), uClickButton);
          uClickButton.mButtonHeight = p0.readInt();
          uClickButton.mButtonColor = p0.readString();
          uClickButton.mButtonTitle = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uClickButton.mShowButton = b;
          uClickButton.mButtonStyle = p0.readInt();
          uClickButton.mButtonBottomMargin = p0.readInt();
          uClickButton.mLiveActionBarDescription = p0.readString();
          uClickButton.mButtonCornerRadius = p0.readInt();
          uClickButton.mButtonWidth = p0.readInt();
          p1.f(i, uClickButton);
          return uClickButton;
       }
    }
    public static void write(SplashInfo$ClickButtonInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mButtonHeight);
          p1.writeString(p0.mButtonColor);
          p1.writeString(p0.mButtonTitle);
          p1.writeInt(p0.mShowButton);
          p1.writeInt(p0.mButtonStyle);
          p1.writeInt(p0.mButtonBottomMargin);
          p1.writeString(p0.mLiveActionBarDescription);
          p1.writeInt(p0.mButtonCornerRadius);
          p1.writeInt(p0.mButtonWidth);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SplashInfo$ClickButtonInfo getParcel(){
       return this.clickButtonInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SplashInfo$ClickButtonInfo$$Parcelable.write(this.clickButtonInfo$$0, p0, p1, new a());
    }
}
