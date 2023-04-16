package com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable$a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.feed.BaseFeed$$Parcelable;

public class QPhoto$$Parcelable implements Parcelable, d	// class@000d6b
{
    public QPhoto qPhoto$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       QPhoto$$Parcelable.CREATOR = new QPhoto$$Parcelable$a();
    }
    public void QPhoto$$Parcelable(QPhoto p0){
       super();
       this.qPhoto$$0 = p0;
    }
    public static QPhoto read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          QPhoto qPhoto = new QPhoto();
          p1.f(p1.g(), qPhoto);
          qPhoto.mEntity = BaseFeed$$Parcelable.read(p0, p1);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          qPhoto.isChecked = b;
          p1.f(i, qPhoto);
          return qPhoto;
       }
    }
    public static void write(QPhoto p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          BaseFeed$$Parcelable.write(p0.mEntity, p1, p2, p3);
          p1.writeInt(p0.isChecked);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public QPhoto getParcel(){
       return this.qPhoto$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       QPhoto$$Parcelable.write(this.qPhoto$$0, p0, p1, new a());
    }
}
