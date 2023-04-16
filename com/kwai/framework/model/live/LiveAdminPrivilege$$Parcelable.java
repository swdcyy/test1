package com.kwai.framework.model.live.LiveAdminPrivilege$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.live.LiveAdminPrivilege$$Parcelable$a;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class LiveAdminPrivilege$$Parcelable implements Parcelable, d	// class@0016bf
{
    public LiveAdminPrivilege liveAdminPrivilege$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveAdminPrivilege$$Parcelable.CREATOR = new LiveAdminPrivilege$$Parcelable$a();
    }
    public void LiveAdminPrivilege$$Parcelable(LiveAdminPrivilege p0){
       super();
       this.liveAdminPrivilege$$0 = p0;
    }
    public static LiveAdminPrivilege read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveAdminPrivilege liveAdminPri = new LiveAdminPrivilege();
          p1.f(p1.g(), liveAdminPri);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          liveAdminPri.mControl = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveAdminPri.mBlock = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveAdminPri.mKickUser = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          liveAdminPri.mForbidComment = b;
          p1.f(i, liveAdminPri);
          return liveAdminPri;
       }
    }
    public static void write(LiveAdminPrivilege p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mControl);
          p1.writeInt(p0.mBlock);
          p1.writeInt(p0.mKickUser);
          p1.writeInt(p0.mForbidComment);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveAdminPrivilege getParcel(){
       return this.liveAdminPrivilege$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveAdminPrivilege$$Parcelable.write(this.liveAdminPrivilege$$0, p0, p1, new a());
    }
}
