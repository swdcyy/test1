package com.yxcorp.gifshow.model.EditInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.EditInfo$$Parcelable$a;
import com.yxcorp.gifshow.model.EditInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Long;

public class EditInfo$$Parcelable implements Parcelable, d	// class@001e04
{
    public EditInfo editInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       EditInfo$$Parcelable.CREATOR = new EditInfo$$Parcelable$a();
    }
    public void EditInfo$$Parcelable(EditInfo p0){
       super();
       this.editInfo$$0 = p0;
    }
    public static EditInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          EditInfo uEditInfo = new EditInfo();
          p1.f(p1.g(), uEditInfo);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uEditInfo.mEnable = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uEditInfo.mAllowMusicReedit = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uEditInfo.mMusicTort = b;
          uEditInfo.mEspStatus = p0.readInt();
          Long longx = (p0.readInt() < 0)? null: Long.valueOf(p0.readLong());
          uEditInfo.mEditTime = longx;
          p1.f(i, uEditInfo);
          return uEditInfo;
       }
    }
    public static void write(EditInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnable);
          p1.writeInt(p0.mAllowMusicReedit);
          p1.writeInt(p0.mMusicTort);
          p1.writeInt(p0.mEspStatus);
          if (p0.mEditTime == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeLong(p0.mEditTime.longValue());
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public EditInfo getParcel(){
       return this.editInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       EditInfo$$Parcelable.write(this.editInfo$$0, p0, p1, new a());
    }
}
