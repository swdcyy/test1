package com.kuaishou.android.model.ads.MagicVideoInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.MagicVideoInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.MagicVideoInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoLayout;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoLayout$$Parcelable;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoInteractive;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoInteractive$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo$$Parcelable;

public class MagicVideoInfo$$Parcelable implements Parcelable, d	// class@00086a
{
    public MagicVideoInfo magicVideoInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MagicVideoInfo$$Parcelable.CREATOR = new MagicVideoInfo$$Parcelable$a();
    }
    public void MagicVideoInfo$$Parcelable(MagicVideoInfo p0){
       super();
       this.magicVideoInfo$$0 = p0;
    }
    public static MagicVideoInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          MagicVideoInfo magicVideoIn = new MagicVideoInfo();
          p1.f(p1.g(), magicVideoIn);
          magicVideoIn.mLayout = MagicVideoInfo$VideoLayout$$Parcelable.read(p0, p1);
          magicVideoIn.mInteractive = MagicVideoInfo$VideoInteractive$$Parcelable.read(p0, p1);
          magicVideoIn.mVideo = PhotoAdvertisement$PopShowVideoInfo$$Parcelable.read(p0, p1);
          p1.f(i, magicVideoIn);
          return magicVideoIn;
       }
    }
    public static void write(MagicVideoInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          MagicVideoInfo$VideoLayout$$Parcelable.write(p0.mLayout, p1, p2, p3);
          MagicVideoInfo$VideoInteractive$$Parcelable.write(p0.mInteractive, p1, p2, p3);
          PhotoAdvertisement$PopShowVideoInfo$$Parcelable.write(p0.mVideo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MagicVideoInfo getParcel(){
       return this.magicVideoInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MagicVideoInfo$$Parcelable.write(this.magicVideoInfo$$0, p0, p1, new a());
    }
}
