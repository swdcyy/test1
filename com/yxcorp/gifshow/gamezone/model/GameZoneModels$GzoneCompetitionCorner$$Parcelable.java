package com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneCompetitionCorner$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneCompetitionCorner$$Parcelable$a;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneCompetitionCorner;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class GameZoneModels$GzoneCompetitionCorner$$Parcelable implements Parcelable, d	// class@0012c2
{
    public GameZoneModels$GzoneCompetitionCorner gzoneCompetitionCorner$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       GameZoneModels$GzoneCompetitionCorner$$Parcelable.CREATOR = new GameZoneModels$GzoneCompetitionCorner$$Parcelable$a();
    }
    public void GameZoneModels$GzoneCompetitionCorner$$Parcelable(GameZoneModels$GzoneCompetitionCorner p0){
       super();
       this.gzoneCompetitionCorner$$0 = p0;
    }
    public static GameZoneModels$GzoneCompetitionCorner read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          GameZoneModels$GzoneCompetitionCorner gzoneCompeti = new GameZoneModels$GzoneCompetitionCorner();
          p1.f(p1.g(), gzoneCompeti);
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
          gzoneCompeti.mIcon = uCDNUrlArray;
          gzoneCompeti.mServerCornerId = p0.readLong();
          gzoneCompeti.mId = p0.readString();
          p1.f(i, gzoneCompeti);
          return gzoneCompeti;
       }
    }
    public static void write(GameZoneModels$GzoneCompetitionCorner p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          GameZoneModels$GzoneCompetitionCorner mIcon = p0.mIcon;
          if (mIcon == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIcon.length);
             mIcon = p0.mIcon;
             i1 = mIcon.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mIcon[i2], p1, p2, p3);
             }
          }
          p1.writeLong(p0.mServerCornerId);
          p1.writeString(p0.mId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public GameZoneModels$GzoneCompetitionCorner getParcel(){
       return this.gzoneCompetitionCorner$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       GameZoneModels$GzoneCompetitionCorner$$Parcelable.write(this.gzoneCompetitionCorner$$0, p0, p1, new a());
    }
}
