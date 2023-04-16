package com.kwai.component.photo.detail.slide.cocreate.utils.CoCreateSelectUserInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.component.photo.detail.slide.cocreate.utils.CoCreateSelectUserInfo$$Parcelable$a;
import com.kwai.component.photo.detail.slide.cocreate.utils.CoCreateSelectUserInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;

public class CoCreateSelectUserInfo$$Parcelable implements Parcelable, d	// class@000a4a
{
    public CoCreateSelectUserInfo coCreateSelectUserInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoCreateSelectUserInfo$$Parcelable.CREATOR = new CoCreateSelectUserInfo$$Parcelable$a();
    }
    public void CoCreateSelectUserInfo$$Parcelable(CoCreateSelectUserInfo p0){
       super();
       this.coCreateSelectUserInfo$$0 = p0;
    }
    public static CoCreateSelectUserInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoCreateSelectUserInfo uCoCreateSel = new CoCreateSelectUserInfo();
          p1.f(p1.g(), uCoCreateSel);
          uCoCreateSel.mUser = User$$Parcelable.read(p0, p1);
          uCoCreateSel.roleType = p0.readInt();
          p1.f(i, uCoCreateSel);
          return uCoCreateSel;
       }
    }
    public static void write(CoCreateSelectUserInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          User$$Parcelable.write(p0.mUser, p1, p2, p3);
          p1.writeInt(p0.roleType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoCreateSelectUserInfo getParcel(){
       return this.coCreateSelectUserInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoCreateSelectUserInfo$$Parcelable.write(this.coCreateSelectUserInfo$$0, p0, p1, new a());
    }
}
