package com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$PlayEndInfo$$Parcelable implements Parcelable, d	// class@0009c0
{
    public PhotoAdvertisement$PlayEndInfo playEndInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PlayEndInfo$$Parcelable.CREATOR = new PhotoAdvertisement$PlayEndInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$PlayEndInfo$$Parcelable(PhotoAdvertisement$PlayEndInfo p0){
       super();
       this.playEndInfo$$0 = p0;
    }
    public static PhotoAdvertisement$PlayEndInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$PlayEndInfo playEndInfo = new PhotoAdvertisement$PlayEndInfo();
          p1.f(p1.g(), playEndInfo);
          playEndInfo.mMixLottieData = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          playEndInfo.mShowEndOption = b;
          playEndInfo.mUserIconUrl = p0.readString();
          playEndInfo.mPlayEndStyle = p0.readInt();
          playEndInfo.mActionBarColor = p0.readString();
          playEndInfo.mTemplateId = p0.readString();
          playEndInfo.mUserName = p0.readString();
          playEndInfo.mPlayEndSubTitle = p0.readString();
          playEndInfo.mScoreBrightStarColor = p0.readString();
          playEndInfo.mTagColor = p0.readString();
          p1.f(i, playEndInfo);
          return playEndInfo;
       }
    }
    public static void write(PhotoAdvertisement$PlayEndInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mMixLottieData);
          p1.writeInt(p0.mShowEndOption);
          p1.writeString(p0.mUserIconUrl);
          p1.writeInt(p0.mPlayEndStyle);
          p1.writeString(p0.mActionBarColor);
          p1.writeString(p0.mTemplateId);
          p1.writeString(p0.mUserName);
          p1.writeString(p0.mPlayEndSubTitle);
          p1.writeString(p0.mScoreBrightStarColor);
          p1.writeString(p0.mTagColor);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PlayEndInfo getParcel(){
       return this.playEndInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PlayEndInfo$$Parcelable.write(this.playEndInfo$$0, p0, p1, new a());
    }
}
