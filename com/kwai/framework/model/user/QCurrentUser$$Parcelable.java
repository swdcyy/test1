package com.kwai.framework.model.user.QCurrentUser$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.QCurrentUser$$Parcelable$a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.user.UserOwnerCount;
import com.kwai.framework.model.user.UserOwnerCount$$Parcelable;

public class QCurrentUser$$Parcelable implements Parcelable, d	// class@00171a
{
    public QCurrentUser qCurrentUser$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       QCurrentUser$$Parcelable.CREATOR = new QCurrentUser$$Parcelable$a();
    }
    public void QCurrentUser$$Parcelable(QCurrentUser p0){
       super();
       this.qCurrentUser$$0 = p0;
    }
    public static QCurrentUser read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          int i1 = 0;
          Class[] uClassArray = new Class[i1];
          Object[] objArray = new Object[i1];
          QCurrentUser qCurrentUser = a.a(QCurrentUser.class, uClassArray, objArray);
          p1.f(p1.g(), qCurrentUser);
          qCurrentUser.setOwnerCount(UserOwnerCount$$Parcelable.read(p0, p1));
          if (p0.readInt() == 1) {
             i1 = true;
          }
          qCurrentUser.setEnableMoment(i1);
          p1.f(i, qCurrentUser);
          return qCurrentUser;
       }
    }
    public static void write(QCurrentUser p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          UserOwnerCount$$Parcelable.write(p0.getOwnerCount(), p1, p2, p3);
          p1.writeInt(p0.isEnableMoment());
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public QCurrentUser getParcel(){
       return this.qCurrentUser$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       QCurrentUser$$Parcelable.write(this.qCurrentUser$$0, p0, p1, new a());
    }
}
