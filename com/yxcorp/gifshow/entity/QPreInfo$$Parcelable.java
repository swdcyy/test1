package com.yxcorp.gifshow.entity.QPreInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.entity.QPreInfo$$Parcelable$a;
import com.yxcorp.gifshow.entity.QPreInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class QPreInfo$$Parcelable implements Parcelable, d	// class@000d73
{
    public QPreInfo qPreInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       QPreInfo$$Parcelable.CREATOR = new QPreInfo$$Parcelable$a();
    }
    public void QPreInfo$$Parcelable(QPreInfo p0){
       super();
       this.qPreInfo$$0 = p0;
    }
    public static QPreInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          QPreInfo qPreInfo = new QPreInfo();
          p1.f(p1.g(), qPreInfo);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          qPreInfo.mLiveStream = b;
          qPreInfo.mPreExpTag = p0.readString();
          qPreInfo.mPrePhotoId = p0.readString();
          qPreInfo.mPrePhotoIndex = p0.readInt();
          qPreInfo.mPreLLSId = p0.readString();
          qPreInfo.mPreLiveStreamId = p0.readString();
          qPreInfo.mPreUserId = p0.readString();
          p1.f(i, qPreInfo);
          return qPreInfo;
       }
    }
    public static void write(QPreInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mLiveStream);
          p1.writeString(p0.mPreExpTag);
          p1.writeString(p0.mPrePhotoId);
          p1.writeInt(p0.mPrePhotoIndex);
          p1.writeString(p0.mPreLLSId);
          p1.writeString(p0.mPreLiveStreamId);
          p1.writeString(p0.mPreUserId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public QPreInfo getParcel(){
       return this.qPreInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       QPreInfo$$Parcelable.write(this.qPreInfo$$0, p0, p1, new a());
    }
}
