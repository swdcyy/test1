package com.kwai.framework.model.user.FriendClap$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.FriendClap$$Parcelable$a;
import com.kwai.framework.model.user.FriendClap;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class FriendClap$$Parcelable implements Parcelable, d	// class@0016f9
{
    public FriendClap friendClap$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FriendClap$$Parcelable.CREATOR = new FriendClap$$Parcelable$a();
    }
    public void FriendClap$$Parcelable(FriendClap p0){
       super();
       this.friendClap$$0 = p0;
    }
    public static FriendClap read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FriendClap uFriendClap = new FriendClap();
          p1.f(p1.g(), uFriendClap);
          uFriendClap.mClapText = p0.readString();
          uFriendClap.mRepeatText = p0.readString();
          uFriendClap.mUserGuideText = p0.readString();
          uFriendClap.mAnimationText = p0.readString();
          uFriendClap.mClapSubText = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uFriendClap.mCanClap = b;
          uFriendClap.mOtherAnimationText = p0.readString();
          p1.f(i, uFriendClap);
          return uFriendClap;
       }
    }
    public static void write(FriendClap p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mClapText);
          p1.writeString(p0.mRepeatText);
          p1.writeString(p0.mUserGuideText);
          p1.writeString(p0.mAnimationText);
          p1.writeString(p0.mClapSubText);
          p1.writeInt(p0.mCanClap);
          p1.writeString(p0.mOtherAnimationText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FriendClap getParcel(){
       return this.friendClap$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FriendClap$$Parcelable.write(this.friendClap$$0, p0, p1, new a());
    }
}
