package com.yxcorp.gifshow.profile.model.ProfileEmptyTabInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.model.ProfileEmptyTabInfo$$Parcelable$a;
import com.yxcorp.gifshow.profile.model.ProfileEmptyTabInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.profile.model.ProfileEmptyTabInfo$ProfilePhotoTabInfo;

public class ProfileEmptyTabInfo$$Parcelable implements Parcelable, d	// class@0013a4
{
    public ProfileEmptyTabInfo profileEmptyTabInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ProfileEmptyTabInfo$$Parcelable.CREATOR = new ProfileEmptyTabInfo$$Parcelable$a();
    }
    public void ProfileEmptyTabInfo$$Parcelable(ProfileEmptyTabInfo p0){
       super();
       this.profileEmptyTabInfo$$0 = p0;
    }
    public static ProfileEmptyTabInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ProfileEmptyTabInfo profileEmpty = new ProfileEmptyTabInfo();
          p1.f(p1.g(), profileEmpty);
          profileEmpty.mProfilePhotoTabInfo = p0.readSerializable();
          p1.f(i, profileEmpty);
          return profileEmpty;
       }
    }
    public static void write(ProfileEmptyTabInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mProfilePhotoTabInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ProfileEmptyTabInfo getParcel(){
       return this.profileEmptyTabInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ProfileEmptyTabInfo$$Parcelable.write(this.profileEmptyTabInfo$$0, p0, p1, new a());
    }
}
