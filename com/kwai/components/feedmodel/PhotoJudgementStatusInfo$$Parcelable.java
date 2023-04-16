package com.kwai.components.feedmodel.PhotoJudgementStatusInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.PhotoJudgementStatusInfo$$Parcelable$a;
import com.kwai.components.feedmodel.PhotoJudgementStatusInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoJudgementStatusInfo$$Parcelable implements Parcelable, d	// class@000c2e
{
    public PhotoJudgementStatusInfo photoJudgementStatusInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoJudgementStatusInfo$$Parcelable.CREATOR = new PhotoJudgementStatusInfo$$Parcelable$a();
    }
    public void PhotoJudgementStatusInfo$$Parcelable(PhotoJudgementStatusInfo p0){
       super();
       this.photoJudgementStatusInfo$$0 = p0;
    }
    public static PhotoJudgementStatusInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoJudgementStatusInfo photoJudgeme = new PhotoJudgementStatusInfo();
          p1.f(p1.g(), photoJudgeme);
          photoJudgeme.mPreTitle = p0.readString();
          photoJudgeme.mActionUrl = p0.readString();
          photoJudgeme.mId = p0.readInt();
          photoJudgeme.mTitle = p0.readString();
          photoJudgeme.mIconUrl = p0.readString();
          p1.f(i, photoJudgeme);
          return photoJudgeme;
       }
    }
    public static void write(PhotoJudgementStatusInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mPreTitle);
          p1.writeString(p0.mActionUrl);
          p1.writeInt(p0.mId);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoJudgementStatusInfo getParcel(){
       return this.photoJudgementStatusInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoJudgementStatusInfo$$Parcelable.write(this.photoJudgementStatusInfo$$0, p0, p1, new a());
    }
}
