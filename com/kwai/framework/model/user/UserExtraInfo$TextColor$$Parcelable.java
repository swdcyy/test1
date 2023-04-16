package com.kwai.framework.model.user.UserExtraInfo$TextColor$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserExtraInfo$TextColor$$Parcelable$a;
import com.kwai.framework.model.user.UserExtraInfo$TextColor;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class UserExtraInfo$TextColor$$Parcelable implements Parcelable, d	// class@001749
{
    public UserExtraInfo$TextColor textColor$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserExtraInfo$TextColor$$Parcelable.CREATOR = new UserExtraInfo$TextColor$$Parcelable$a();
    }
    public void UserExtraInfo$TextColor$$Parcelable(UserExtraInfo$TextColor p0){
       super();
       this.textColor$$0 = p0;
    }
    public static UserExtraInfo$TextColor read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UserExtraInfo$TextColor textColor = new UserExtraInfo$TextColor();
          p1.f(p1.g(), textColor);
          textColor.mUntruncableText = p0.readString();
          textColor.mTruncableText = p0.readString();
          textColor.mExtraText = p0.readString();
          p1.f(i, textColor);
          return textColor;
       }
    }
    public static void write(UserExtraInfo$TextColor p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUntruncableText);
          p1.writeString(p0.mTruncableText);
          p1.writeString(p0.mExtraText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserExtraInfo$TextColor getParcel(){
       return this.textColor$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserExtraInfo$TextColor$$Parcelable.write(this.textColor$$0, p0, p1, new a());
    }
}
