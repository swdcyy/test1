package com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneLiveCornerMarker$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneLiveCornerMarker$$Parcelable$a;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneLiveCornerMarker;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class GameZoneModels$GzoneLiveCornerMarker$$Parcelable implements Parcelable, d	// class@0012c5
{
    public GameZoneModels$GzoneLiveCornerMarker gzoneLiveCornerMarker$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       GameZoneModels$GzoneLiveCornerMarker$$Parcelable.CREATOR = new GameZoneModels$GzoneLiveCornerMarker$$Parcelable$a();
    }
    public void GameZoneModels$GzoneLiveCornerMarker$$Parcelable(GameZoneModels$GzoneLiveCornerMarker p0){
       super();
       this.gzoneLiveCornerMarker$$0 = p0;
    }
    public static GameZoneModels$GzoneLiveCornerMarker read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          GameZoneModels$GzoneLiveCornerMarker gzoneLiveCor = new GameZoneModels$GzoneLiveCornerMarker();
          p1.f(p1.g(), gzoneLiveCor);
          gzoneLiveCor.mHeight = p0.readInt();
          gzoneLiveCor.mWidth = p0.readInt();
          gzoneLiveCor.mTextColor = p0.readString();
          gzoneLiveCor.mDesc = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          gzoneLiveCor.mBgUrl = uCDNUrlArray;
          gzoneLiveCor.mType = p0.readString();
          p1.f(i, gzoneLiveCor);
          return gzoneLiveCor;
       }
    }
    public static void write(GameZoneModels$GzoneLiveCornerMarker p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHeight);
          p1.writeInt(p0.mWidth);
          p1.writeString(p0.mTextColor);
          p1.writeString(p0.mDesc);
          GameZoneModels$GzoneLiveCornerMarker mBgUrl = p0.mBgUrl;
          if (mBgUrl == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBgUrl.length);
             mBgUrl = p0.mBgUrl;
             i1 = mBgUrl.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mBgUrl[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public GameZoneModels$GzoneLiveCornerMarker getParcel(){
       return this.gzoneLiveCornerMarker$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       GameZoneModels$GzoneLiveCornerMarker$$Parcelable.write(this.gzoneLiveCornerMarker$$0, p0, p1, new a());
    }
}
