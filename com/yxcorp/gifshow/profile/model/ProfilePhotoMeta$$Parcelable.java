package com.yxcorp.gifshow.profile.model.ProfilePhotoMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.model.ProfilePhotoMeta$$Parcelable$a;
import com.yxcorp.gifshow.profile.model.ProfilePhotoMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.profile.model.ProfileRankIconInfo;

public class ProfilePhotoMeta$$Parcelable implements Parcelable, d	// class@0013aa
{
    public ProfilePhotoMeta profilePhotoMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ProfilePhotoMeta$$Parcelable.CREATOR = new ProfilePhotoMeta$$Parcelable$a();
    }
    public void ProfilePhotoMeta$$Parcelable(ProfilePhotoMeta p0){
       super();
       this.profilePhotoMeta$$0 = p0;
    }
    public static ProfilePhotoMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ProfilePhotoMeta profilePhoto = new ProfilePhotoMeta();
          p1.f(p1.g(), profilePhoto);
          profilePhoto.mProfileRankIconInfo = p0.readSerializable();
          p1.f(i, profilePhoto);
          return profilePhoto;
       }
    }
    public static void write(ProfilePhotoMeta p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mProfileRankIconInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ProfilePhotoMeta getParcel(){
       return this.profilePhotoMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ProfilePhotoMeta$$Parcelable.write(this.profilePhotoMeta$$0, p0, p1, new a());
    }
}
