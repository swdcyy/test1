package com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$ExitDialogInfo$$Parcelable implements Parcelable, d	// class@000923
{
    public PhotoAdvertisement$ExitDialogInfo exitDialogInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ExitDialogInfo$$Parcelable.CREATOR = new PhotoAdvertisement$ExitDialogInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$ExitDialogInfo$$Parcelable(PhotoAdvertisement$ExitDialogInfo p0){
       super();
       this.exitDialogInfo$$0 = p0;
    }
    public static PhotoAdvertisement$ExitDialogInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$ExitDialogInfo uExitDialogI = new PhotoAdvertisement$ExitDialogInfo();
          p1.f(p1.g(), uExitDialogI);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uExitDialogI.mEnableShowChangeVideoButton = b;
          p1.f(i, uExitDialogI);
          return uExitDialogI;
       }
    }
    public static void write(PhotoAdvertisement$ExitDialogInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableShowChangeVideoButton);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ExitDialogInfo getParcel(){
       return this.exitDialogInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ExitDialogInfo$$Parcelable.write(this.exitDialogInfo$$0, p0, p1, new a());
    }
}
