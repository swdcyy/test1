package com.kuaishou.android.model.ads.SideWindowInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.SideWindowInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.SideWindowInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;

public class SideWindowInfo$$Parcelable implements Parcelable, d	// class@000a7b
{
    public SideWindowInfo sideWindowInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SideWindowInfo$$Parcelable.CREATOR = new SideWindowInfo$$Parcelable$a();
    }
    public void SideWindowInfo$$Parcelable(SideWindowInfo p0){
       super();
       this.sideWindowInfo$$0 = p0;
    }
    public static SideWindowInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SideWindowInfo sideWindowIn = new SideWindowInfo();
          p1.f(p1.g(), sideWindowIn);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          sideWindowIn.mEnableSmallWindow = b;
          sideWindowIn.mAdTag = p0.readString();
          sideWindowIn.mInsertType = p0.readInt();
          sideWindowIn.mTemplateId = p0.readString();
          sideWindowIn.mSidePhoto = QPhoto$$Parcelable.read(p0, p1);
          p1.f(i, sideWindowIn);
          return sideWindowIn;
       }
    }
    public static void write(SideWindowInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableSmallWindow);
          p1.writeString(p0.mAdTag);
          p1.writeInt(p0.mInsertType);
          p1.writeString(p0.mTemplateId);
          QPhoto$$Parcelable.write(p0.mSidePhoto, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SideWindowInfo getParcel(){
       return this.sideWindowInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SideWindowInfo$$Parcelable.write(this.sideWindowInfo$$0, p0, p1, new a());
    }
}
