package com.kuaishou.android.model.mix.QRecoTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.QRecoTag$$Parcelable$a;
import com.kuaishou.android.model.mix.QRecoTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class QRecoTag$$Parcelable implements Parcelable, d	// class@000dd2
{
    public QRecoTag qRecoTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       QRecoTag$$Parcelable.CREATOR = new QRecoTag$$Parcelable$a();
    }
    public void QRecoTag$$Parcelable(QRecoTag p0){
       super();
       this.qRecoTag$$0 = p0;
    }
    public static QRecoTag read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          QRecoTag qRecoTag = new QRecoTag();
          p1.f(p1.g(), qRecoTag);
          qRecoTag.mPos = p0.readInt();
          qRecoTag.mId = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          qRecoTag.mIsEditTag = b;
          qRecoTag.mName = p0.readString();
          p1.f(i, qRecoTag);
          return qRecoTag;
       }
    }
    public static void write(QRecoTag p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mPos);
          p1.writeString(p0.mId);
          p1.writeInt(p0.mIsEditTag);
          p1.writeString(p0.mName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public QRecoTag getParcel(){
       return this.qRecoTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       QRecoTag$$Parcelable.write(this.qRecoTag$$0, p0, p1, new a());
    }
}
