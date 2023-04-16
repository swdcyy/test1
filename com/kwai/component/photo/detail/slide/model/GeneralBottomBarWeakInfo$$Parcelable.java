package com.kwai.component.photo.detail.slide.model.GeneralBottomBarWeakInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarWeakInfo$$Parcelable$a;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarWeakInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class GeneralBottomBarWeakInfo$$Parcelable implements Parcelable, d	// class@000a6c
{
    public GeneralBottomBarWeakInfo generalBottomBarWeakInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       GeneralBottomBarWeakInfo$$Parcelable.CREATOR = new GeneralBottomBarWeakInfo$$Parcelable$a();
    }
    public void GeneralBottomBarWeakInfo$$Parcelable(GeneralBottomBarWeakInfo p0){
       super();
       this.generalBottomBarWeakInfo$$0 = p0;
    }
    public static GeneralBottomBarWeakInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          GeneralBottomBarWeakInfo generalBotto = new GeneralBottomBarWeakInfo();
          p1.f(p1.g(), generalBotto);
          generalBotto.mIconWidth = p0.readInt();
          generalBotto.mTailIconUrl = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          generalBotto.mHaveRoundCorner = b1;
          b1 = (p0.readInt() == 1)? true: false;
          generalBotto.mShowArrow = b1;
          generalBotto.mActionUrl = p0.readString();
          generalBotto.mFontColor = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          generalBotto.mShowSeparator = b;
          generalBotto.mUnTruncatedTitle = p0.readString();
          generalBotto.mBackgroundAlpha = p0.readInt();
          generalBotto.mBottomBarItemId = p0.readString();
          generalBotto.mBackgroundColor = p0.readString();
          generalBotto.mIconUrl = p0.readString();
          generalBotto.mSubTitle = p0.readString();
          generalBotto.mPreTitle = p0.readString();
          generalBotto.mFontSize = p0.readInt();
          generalBotto.mIconHeight = p0.readInt();
          generalBotto.mIconTextSuffix = p0.readString();
          generalBotto.mTitle = p0.readString();
          generalBotto.mIconRightMargin = p0.readFloat();
          p1.f(i, generalBotto);
          return generalBotto;
       }
    }
    public static void write(GeneralBottomBarWeakInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIconWidth);
          p1.writeString(p0.mTailIconUrl);
          p1.writeInt(p0.mHaveRoundCorner);
          p1.writeInt(p0.mShowArrow);
          p1.writeString(p0.mActionUrl);
          p1.writeString(p0.mFontColor);
          p1.writeInt(p0.mShowSeparator);
          p1.writeString(p0.mUnTruncatedTitle);
          p1.writeInt(p0.mBackgroundAlpha);
          p1.writeString(p0.mBottomBarItemId);
          p1.writeString(p0.mBackgroundColor);
          p1.writeString(p0.mIconUrl);
          p1.writeString(p0.mSubTitle);
          p1.writeString(p0.mPreTitle);
          p1.writeInt(p0.mFontSize);
          p1.writeInt(p0.mIconHeight);
          p1.writeString(p0.mIconTextSuffix);
          p1.writeString(p0.mTitle);
          p1.writeFloat(p0.mIconRightMargin);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public GeneralBottomBarWeakInfo getParcel(){
       return this.generalBottomBarWeakInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       GeneralBottomBarWeakInfo$$Parcelable.write(this.generalBottomBarWeakInfo$$0, p0, p1, new a());
    }
}
