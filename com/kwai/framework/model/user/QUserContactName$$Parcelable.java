package com.kwai.framework.model.user.QUserContactName$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.QUserContactName$$Parcelable$a;
import com.kwai.framework.model.user.QUserContactName;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class QUserContactName$$Parcelable implements Parcelable, d	// class@00171d
{
    public QUserContactName qUserContactName$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       QUserContactName$$Parcelable.CREATOR = new QUserContactName$$Parcelable$a();
    }
    public void QUserContactName$$Parcelable(QUserContactName p0){
       super();
       this.qUserContactName$$0 = p0;
    }
    public static QUserContactName read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          QUserContactName qUserContact = new QUserContactName();
          p1.f(p1.g(), qUserContact);
          qUserContact.mIv = p0.readString();
          qUserContact.mName = p0.readString();
          qUserContact.mMobileHash = p0.readString();
          p1.f(i, qUserContact);
          return qUserContact;
       }
    }
    public static void write(QUserContactName p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mIv);
          p1.writeString(p0.mName);
          p1.writeString(p0.mMobileHash);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public QUserContactName getParcel(){
       return this.qUserContactName$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       QUserContactName$$Parcelable.write(this.qUserContactName$$0, p0, p1, new a());
    }
}
