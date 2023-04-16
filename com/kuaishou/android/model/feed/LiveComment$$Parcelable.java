package com.kuaishou.android.model.feed.LiveComment$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.LiveComment$$Parcelable$a;
import com.kuaishou.android.model.feed.LiveComment;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserInfo$$Parcelable;

public class LiveComment$$Parcelable implements Parcelable, d	// class@000afc
{
    public LiveComment liveComment$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveComment$$Parcelable.CREATOR = new LiveComment$$Parcelable$a();
    }
    public void LiveComment$$Parcelable(LiveComment p0){
       super();
       this.liveComment$$0 = p0;
    }
    public static LiveComment read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveComment liveComment = new LiveComment();
          p1.f(p1.g(), liveComment);
          liveComment.mUserInfo = UserInfo$$Parcelable.read(p0, p1);
          liveComment.mContent = p0.readString();
          p1.f(i, liveComment);
          return liveComment;
       }
    }
    public static void write(LiveComment p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          UserInfo$$Parcelable.write(p0.mUserInfo, p1, p2, p3);
          p1.writeString(p0.mContent);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveComment getParcel(){
       return this.liveComment$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveComment$$Parcelable.write(this.liveComment$$0, p0, p1, new a());
    }
}
